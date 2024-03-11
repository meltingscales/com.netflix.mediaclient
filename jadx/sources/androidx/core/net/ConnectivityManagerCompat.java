package androidx.core.net;

import android.net.ConnectivityManager;

/* loaded from: classes2.dex */
public final class ConnectivityManagerCompat {
    public static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager) {
        return Api16Impl.isActiveNetworkMetered(connectivityManager);
    }

    /* loaded from: classes2.dex */
    static class Api16Impl {
        static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }
}
