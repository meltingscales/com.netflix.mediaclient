package org.chromium.net;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import java.io.IOException;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
public class HttpNegotiateAuthenticator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "net_auth";
    private final String mAccountType;
    private Bundle mSpnegoContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface Natives {
        void setResult(long j, HttpNegotiateAuthenticator httpNegotiateAuthenticator, int i, String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class RequestData {
        public Account account;
        public AccountManager accountManager;
        public String authTokenType;
        public long nativeResultObject;
        public Bundle options;

        RequestData() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class GetAccountsCallback implements AccountManagerCallback<Account[]> {
        private final RequestData mRequestData;

        public GetAccountsCallback(RequestData requestData) {
            this.mRequestData = requestData;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Account[]> accountManagerFuture) {
            try {
                Account[] result = accountManagerFuture.getResult();
                if (result.length == 0) {
                    Log.w(HttpNegotiateAuthenticator.TAG, "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ");
                    HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, HttpNegotiateAuthenticator.this, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                } else if (result.length > 1) {
                    Log.w(HttpNegotiateAuthenticator.TAG, "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(result.length));
                    HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, HttpNegotiateAuthenticator.this, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                } else if (HttpNegotiateAuthenticator.this.lacksPermission(ContextUtils.getApplicationContext(), "android.permission.USE_CREDENTIALS", true)) {
                    Log.e(HttpNegotiateAuthenticator.TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.");
                    HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, HttpNegotiateAuthenticator.this, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
                } else {
                    RequestData requestData = this.mRequestData;
                    Account account = result[0];
                    requestData.account = account;
                    requestData.accountManager.getAuthToken(account, requestData.authTokenType, requestData.options, true, (AccountManagerCallback<Bundle>) new GetTokenCallback(requestData), new Handler(ThreadUtils.getUiThreadLooper()));
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                Log.w(HttpNegotiateAuthenticator.TAG, "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
                HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, HttpNegotiateAuthenticator.this, -9, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class GetTokenCallback implements AccountManagerCallback<Bundle> {
        private final RequestData mRequestData;

        public GetTokenCallback(RequestData requestData) {
            this.mRequestData = requestData;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            try {
                Bundle result = accountManagerFuture.getResult();
                if (result.containsKey("intent")) {
                    final Context applicationContext = ContextUtils.getApplicationContext();
                    ContextUtils.registerProtectedBroadcastReceiver(applicationContext, new BroadcastReceiver() { // from class: org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback.1
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            applicationContext.unregisterReceiver(this);
                            AccountManager accountManager = GetTokenCallback.this.mRequestData.accountManager;
                            Account account = GetTokenCallback.this.mRequestData.account;
                            String str = GetTokenCallback.this.mRequestData.authTokenType;
                            Bundle bundle = GetTokenCallback.this.mRequestData.options;
                            GetTokenCallback getTokenCallback = GetTokenCallback.this;
                            accountManager.getAuthToken(account, str, bundle, true, (AccountManagerCallback<Bundle>) new GetTokenCallback(getTokenCallback.mRequestData), (Handler) null);
                        }
                    }, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                    return;
                }
                HttpNegotiateAuthenticator.this.processResult(result, this.mRequestData);
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                Log.w(HttpNegotiateAuthenticator.TAG, "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
                HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, HttpNegotiateAuthenticator.this, -9, null);
            }
        }
    }

    protected HttpNegotiateAuthenticator(String str) {
        this.mAccountType = str;
    }

    @CalledByNative
    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    @CalledByNative
    void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context applicationContext = ContextUtils.getApplicationContext();
        RequestData requestData = new RequestData();
        requestData.authTokenType = HttpNegotiateConstants.SPNEGO_TOKEN_TYPE_BASE + str;
        requestData.accountManager = AccountManager.get(applicationContext);
        requestData.nativeResultObject = j;
        String[] strArr = {HttpNegotiateConstants.SPNEGO_FEATURE};
        Bundle bundle = new Bundle();
        requestData.options = bundle;
        if (str2 != null) {
            bundle.putString(HttpNegotiateConstants.KEY_INCOMING_AUTH_TOKEN, str2);
        }
        Bundle bundle2 = this.mSpnegoContext;
        if (bundle2 != null) {
            requestData.options.putBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT, bundle2);
        }
        requestData.options.putBoolean(HttpNegotiateConstants.KEY_CAN_DELEGATE, z);
        Activity lastTrackedFocusedActivity = ApplicationStatus.getLastTrackedFocusedActivity();
        if (lastTrackedFocusedActivity == null) {
            requestTokenWithoutActivity(applicationContext, requestData, strArr);
        } else {
            requestTokenWithActivity(applicationContext, lastTrackedFocusedActivity, requestData, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResult(Bundle bundle, RequestData requestData) {
        int i;
        this.mSpnegoContext = bundle.getBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT);
        int i2 = bundle.getInt(HttpNegotiateConstants.KEY_SPNEGO_RESULT, 1);
        if (i2 != 0) {
            switch (i2) {
                case 2:
                    i = -3;
                    break;
                case 3:
                    i = NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS;
                    break;
                case 4:
                    i = NetError.ERR_INVALID_RESPONSE;
                    break;
                case 5:
                    i = NetError.ERR_INVALID_AUTH_CREDENTIALS;
                    break;
                case 6:
                    i = NetError.ERR_UNSUPPORTED_AUTH_SCHEME;
                    break;
                case 7:
                    i = NetError.ERR_MISSING_AUTH_CREDENTIALS;
                    break;
                case 8:
                    i = NetError.ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS;
                    break;
                case 9:
                    i = NetError.ERR_MALFORMED_IDENTITY;
                    break;
                default:
                    i = -9;
                    break;
            }
        } else {
            i = 0;
        }
        HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, this, i, bundle.getString("authtoken"));
    }

    private void requestTokenWithoutActivity(Context context, RequestData requestData, String[] strArr) {
        if (lacksPermission(context, "android.permission.GET_ACCOUNTS", true)) {
            Log.e(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.");
            HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, this, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
            return;
        }
        requestData.accountManager.getAccountsByTypeAndFeatures(this.mAccountType, strArr, new GetAccountsCallback(requestData), new Handler(ThreadUtils.getUiThreadLooper()));
    }

    private void requestTokenWithActivity(Context context, Activity activity, RequestData requestData, String[] strArr) {
        if (lacksPermission(context, "android.permission.GET_ACCOUNTS", false)) {
            Log.e(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", "android.permission.GET_ACCOUNTS");
            HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, this, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
            return;
        }
        requestData.accountManager.getAuthTokenByFeatures(this.mAccountType, requestData.authTokenType, strArr, activity, null, requestData.options, new GetTokenCallback(requestData), new Handler(ThreadUtils.getUiThreadLooper()));
    }

    boolean lacksPermission(Context context, String str, boolean z) {
        return (z || context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) ? false : true;
    }
}
