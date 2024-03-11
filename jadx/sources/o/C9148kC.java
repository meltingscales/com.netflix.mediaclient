package o;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.RemoteException;
import android.os.storage.StorageManager;

/* renamed from: o.kC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9148kC {
    public static final Intent e(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, InterfaceC9200lB interfaceC9200lB) {
        Intent registerReceiver;
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, 2);
                return registerReceiver;
            }
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (RemoteException e) {
            if (interfaceC9200lB == null) {
                return null;
            }
            interfaceC9200lB.e("Failed to register receiver", e);
            return null;
        } catch (IllegalArgumentException e2) {
            if (interfaceC9200lB == null) {
                return null;
            }
            interfaceC9200lB.e("Failed to register receiver", e2);
            return null;
        } catch (SecurityException e3) {
            if (interfaceC9200lB == null) {
                return null;
            }
            interfaceC9200lB.e("Failed to register receiver", e3);
            return null;
        }
    }

    public static final void d(Context context, BroadcastReceiver broadcastReceiver, InterfaceC9200lB interfaceC9200lB) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (RemoteException e) {
            if (interfaceC9200lB == null) {
                return;
            }
            interfaceC9200lB.e("Failed to register receiver", e);
        } catch (IllegalArgumentException e2) {
            if (interfaceC9200lB == null) {
                return;
            }
            interfaceC9200lB.e("Failed to register receiver", e2);
        } catch (SecurityException e3) {
            if (interfaceC9200lB == null) {
                return;
            }
            interfaceC9200lB.e("Failed to register receiver", e3);
        }
    }

    public static final ActivityManager d(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            return (ActivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final ConnectivityManager b(Context context) {
        try {
            Object systemService = context.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                systemService = null;
            }
            return (ConnectivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final StorageManager c(Context context) {
        try {
            Object systemService = context.getSystemService("storage");
            if (!(systemService instanceof StorageManager)) {
                systemService = null;
            }
            return (StorageManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final LocationManager e(Context context) {
        try {
            Object systemService = context.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            return (LocationManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
