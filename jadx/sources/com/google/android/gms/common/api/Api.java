package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Api<O extends ApiOptions> {
    private final AbstractClientBuilder zaa;
    private final ClientKey zab;
    private final String zac;

    /* loaded from: classes2.dex */
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, ClientSettings clientSettings, O o2, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return buildClient(context, looper, clientSettings, (ClientSettings) o2, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
        }

        public T buildClient(Context context, Looper looper, ClientSettings clientSettings, O o2, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes2.dex */
    public interface AnyClient {
    }

    /* loaded from: classes2.dex */
    public static class AnyClientKey<C extends AnyClient> {
    }

    /* loaded from: classes2.dex */
    public interface ApiOptions {
        public static final NoOptions NO_OPTIONS = new NoOptions(null);

        /* loaded from: classes2.dex */
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            Account getAccount();
        }

        /* loaded from: classes2.dex */
        public interface HasGoogleSignInAccountOptions extends HasOptions {
            GoogleSignInAccount getGoogleSignInAccount();
        }

        /* loaded from: classes2.dex */
        public interface HasOptions extends ApiOptions {
        }

        /* loaded from: classes2.dex */
        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }

            /* synthetic */ NoOptions(zaa zaaVar) {
            }
        }

        /* loaded from: classes2.dex */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* loaded from: classes2.dex */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
    }

    /* loaded from: classes2.dex */
    public interface Client extends AnyClient {
        void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        void disconnect();

        void disconnect(String str);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* loaded from: classes2.dex */
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    public <C extends Client> Api(String str, AbstractClientBuilder<C, O> abstractClientBuilder, ClientKey<C> clientKey) {
        Preconditions.checkNotNull(abstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.checkNotNull(clientKey, "Cannot construct an Api with a null ClientKey");
        this.zac = str;
        this.zaa = abstractClientBuilder;
        this.zab = clientKey;
    }

    public final AbstractClientBuilder zaa() {
        return this.zaa;
    }

    public final AnyClientKey zab() {
        return this.zab;
    }

    public final String zad() {
        return this.zac;
    }
}
