package org.chromium.base.compat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Handler;
import org.chromium.base.StrictModeContext;

/* loaded from: classes5.dex */
public final class ApiHelperForO {
    public static Context createContextForSplit(Context context, String str) {
        Context createContextForSplit;
        StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
        try {
            createContextForSplit = context.createContextForSplit(str);
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return createContextForSplit;
        } catch (Throwable th) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void registerNetworkCallback(ConnectivityManager connectivityManager, NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        connectivityManager.registerNetworkCallback(networkRequest, networkCallback, handler);
    }

    public static void registerDefaultNetworkCallback(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback, handler);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        Intent registerReceiver;
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        return registerReceiver;
    }
}
