package org.chromium.base.compat;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.security.NetworkSecurityPolicy;

/* loaded from: classes5.dex */
public final class ApiHelperForM {
    public static long getNetworkHandle(Network network) {
        return network.getNetworkHandle();
    }

    public static Network getActiveNetwork(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }

    public static boolean isCleartextTrafficPermitted() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public static void reportNetworkConnectivity(ConnectivityManager connectivityManager, Network network, boolean z) {
        connectivityManager.reportNetworkConnectivity(network, z);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }
}
