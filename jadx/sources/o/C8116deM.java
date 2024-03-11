package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* renamed from: o.deM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8116deM {
    private static final String c = "IntentUtils";

    public static boolean c(Context context, BroadcastReceiver broadcastReceiver, String str, String... strArr) {
        return c(context, broadcastReceiver, str, 999, strArr);
    }

    public static boolean c(Context context, BroadcastReceiver broadcastReceiver, String str, int i, String... strArr) {
        if (strArr == null || strArr.length < 1) {
            throw new IllegalArgumentException("No actions!");
        }
        IntentFilter intentFilter = new IntentFilter();
        if (str != null) {
            intentFilter.addCategory(str);
        }
        for (String str2 : strArr) {
            if (C8168dfL.h(str2)) {
                intentFilter.addAction(str2);
            }
        }
        return a(context, broadcastReceiver, intentFilter);
    }

    public static boolean a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (context != null) {
            if (broadcastReceiver != null) {
                if (intentFilter == null) {
                    throw new IllegalArgumentException("No filter!");
                }
                try {
                    LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
                    return true;
                } catch (Throwable th) {
                    C1044Mm.e(c, "Failed to register ", th);
                    return false;
                }
            }
            throw new IllegalArgumentException("Receiver is null");
        }
        throw new IllegalArgumentException("Context is null");
    }

    public static boolean a(Context context, BroadcastReceiver broadcastReceiver) {
        if (context == null) {
            C1044Mm.d(c, "Context is null");
            return false;
        } else if (broadcastReceiver == null) {
            C1044Mm.d(c, "Receiver is null");
            return false;
        } else {
            try {
                LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
                return true;
            } catch (Throwable th) {
                C1044Mm.e(c, "Failed to unregister ", th);
                return false;
            }
        }
    }

    public static String b(Intent intent) {
        if (intent != null) {
            return intent.getAction();
        }
        return null;
    }

    public static IntentFilter d(String... strArr) {
        IntentFilter intentFilter = new IntentFilter();
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
        return intentFilter;
    }
}
