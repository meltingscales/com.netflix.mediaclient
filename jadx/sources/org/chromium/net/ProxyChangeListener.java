package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Locale;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.TraceEvent;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.build.BuildConfig;
import org.chromium.build.annotations.UsedByReflection;
import org.chromium.net.ProxyChangeListener;

@UsedByReflection
/* loaded from: classes6.dex */
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ProxyChangeListener";
    private static boolean sEnabled = true;
    private Delegate mDelegate;
    private final Handler mHandler;
    private final Looper mLooper;
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;
    private BroadcastReceiver mRealProxyReceiver;

    /* loaded from: classes6.dex */
    public interface Delegate {
        void proxySettingsChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface Natives {
        void proxySettingsChanged(long j, ProxyChangeListener proxyChangeListener);

        void proxySettingsChangedTo(long j, ProxyChangeListener proxyChangeListener, String str, int i, String str2, String[] strArr);
    }

    public static void setEnabled(boolean z) {
        sEnabled = z;
    }

    public void setDelegateForTesting(Delegate delegate) {
        this.mDelegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class ProxyConfig {
        public static final ProxyConfig DIRECT = new ProxyConfig("", 0, "", new String[0]);
        public final String[] mExclusionList;
        public final String mHost;
        public final String mPacUrl;
        public final int mPort;

        public ProxyConfig(String str, int i, String str2, String[] strArr) {
            this.mHost = str;
            this.mPort = i;
            this.mPacUrl = str2;
            this.mExclusionList = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ProxyConfig fromProxyInfo(ProxyInfo proxyInfo) {
            if (proxyInfo == null) {
                return null;
            }
            String host = proxyInfo.getHost();
            Uri pacFileUrl = proxyInfo.getPacFileUrl();
            if (host == null) {
                host = "";
            }
            return new ProxyConfig(host, proxyInfo.getPort(), Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
        }

        public String toString() {
            String str = (this.mHost.equals("localhost") || this.mHost.isEmpty()) ? this.mHost : "<redacted>";
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(this.mPort);
            objArr[2] = this.mPacUrl == null ? "null" : "\"<redacted>\"";
            return String.format(locale, "ProxyConfig [mHost=\"%s\", mPort=%d, mPacUrl=%s]", objArr);
        }
    }

    private ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
    }

    @CalledByNative
    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    @CalledByNative
    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    @CalledByNative
    public void start(long j) {
        TraceEvent scoped = TraceEvent.scoped("ProxyChangeListener.start");
        try {
            assertOnThread();
            this.mNativePtr = j;
            registerBroadcastReceiver();
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public void stop() {
        assertOnThread();
        this.mNativePtr = 0L;
        unregisterBroadcastReceiver();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UsedByReflection
    /* loaded from: classes6.dex */
    public class ProxyReceiver extends BroadcastReceiver {
        private ProxyReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        @UsedByReflection
        public void onReceive(Context context, final Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$ProxyReceiver$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProxyChangeListener.ProxyReceiver.this.lambda$onReceive$0(intent);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0(Intent intent) {
            ProxyChangeListener.this.proxySettingsChanged(ProxyChangeListener.extractNewProxy(intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProxyConfig extractNewProxy(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return ProxyConfig.fromProxyInfo((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proxySettingsChanged(ProxyConfig proxyConfig) {
        assertOnThread();
        if (sEnabled) {
            Delegate delegate = this.mDelegate;
            if (delegate != null) {
                delegate.proxySettingsChanged();
            }
            if (this.mNativePtr == 0) {
                return;
            }
            if (proxyConfig != null) {
                ProxyChangeListenerJni.get().proxySettingsChangedTo(this.mNativePtr, this, proxyConfig.mHost, proxyConfig.mPort, proxyConfig.mPacUrl, proxyConfig.mExclusionList);
            } else {
                ProxyChangeListenerJni.get().proxySettingsChanged(this.mNativePtr, this);
            }
        }
    }

    private ProxyConfig getProxyConfig(Intent intent) {
        ProxyConfig fromProxyInfo = ProxyConfig.fromProxyInfo(((ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity")).getDefaultProxy());
        if (fromProxyInfo == null) {
            return ProxyConfig.DIRECT;
        }
        if (Build.VERSION.SDK_INT >= 29 && fromProxyInfo.mHost.equals("localhost") && fromProxyInfo.mPort == -1) {
            ProxyConfig extractNewProxy = extractNewProxy(intent);
            Log.i(TAG, "configFromConnectivityManager = %s, configFromIntent = %s", fromProxyInfo, extractNewProxy);
            if (extractNewProxy == null) {
                return null;
            }
            return new ProxyConfig(extractNewProxy.mHost, extractNewProxy.mPort, fromProxyInfo.mPacUrl, fromProxyInfo.mExclusionList);
        }
        return fromProxyInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProxyConfigFromConnectivityManager$0(Intent intent) {
        proxySettingsChanged(getProxyConfig(intent));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateProxyConfigFromConnectivityManager(final Intent intent) {
        runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ProxyChangeListener.this.lambda$updateProxyConfigFromConnectivityManager$0(intent);
            }
        });
    }

    private void registerBroadcastReceiver() {
        assertOnThread();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.mProxyReceiver = new ProxyReceiver();
        if (!ContextUtils.isSdkSandboxProcess()) {
            ContextUtils.registerNonExportedBroadcastReceiver(ContextUtils.getApplicationContext(), this.mProxyReceiver, new IntentFilter());
        }
        this.mRealProxyReceiver = new ProxyBroadcastReceiver(this);
        ContextUtils.registerProtectedBroadcastReceiver(ContextUtils.getApplicationContext(), this.mRealProxyReceiver, intentFilter);
    }

    private void unregisterBroadcastReceiver() {
        assertOnThread();
        ContextUtils.getApplicationContext().unregisterReceiver(this.mProxyReceiver);
        if (this.mRealProxyReceiver != null) {
            ContextUtils.getApplicationContext().unregisterReceiver(this.mRealProxyReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    private void assertOnThread() {
        if (BuildConfig.ENABLE_ASSERTS && !onThread()) {
            throw new IllegalStateException("Must be called on ProxyChangeListener thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }
}
