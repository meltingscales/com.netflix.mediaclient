package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.compat.ApiHelperForM;

/* loaded from: classes6.dex */
public class RadioUtils {
    private static Boolean sHaveAccessNetworkState;
    private static Boolean sHaveAccessWifiState;

    private RadioUtils() {
    }

    @CalledByNative
    private static boolean isSupported() {
        return Build.VERSION.SDK_INT >= 28 && haveAccessNetworkState() && haveAccessWifiState();
    }

    private static boolean haveAccessNetworkState() {
        if (sHaveAccessNetworkState == null) {
            sHaveAccessNetworkState = Boolean.valueOf(ApiCompatibilityUtils.checkPermission(ContextUtils.getApplicationContext(), "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0);
        }
        return sHaveAccessNetworkState.booleanValue();
    }

    private static boolean haveAccessWifiState() {
        if (sHaveAccessWifiState == null) {
            sHaveAccessWifiState = Boolean.valueOf(ApiCompatibilityUtils.checkPermission(ContextUtils.getApplicationContext(), "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0);
        }
        return sHaveAccessWifiState.booleanValue();
    }

    @CalledByNative
    private static boolean isWifiConnected() {
        TraceEvent scoped = TraceEvent.scoped("RadioUtils::isWifiConnected");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
            Network activeNetwork = ApiHelperForM.getActiveNetwork(connectivityManager);
            if (activeNetwork == null) {
                if (scoped != null) {
                    scoped.close();
                }
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                if (scoped != null) {
                    scoped.close();
                }
                return false;
            }
            boolean hasTransport = networkCapabilities.hasTransport(1);
            if (scoped != null) {
                scoped.close();
            }
            return hasTransport;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    @org.chromium.base.annotations.CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int getCellSignalLevel() {
        /*
            java.lang.String r0 = "RadioUtils::getCellSignalLevel"
            org.chromium.base.TraceEvent r0 = org.chromium.base.TraceEvent.scoped(r0)
            android.content.Context r1 = org.chromium.base.ContextUtils.getApplicationContext()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L24
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L24
            android.telephony.SignalStrength r1 = org.chromium.base.compat.ApiHelperForP.getSignalStrength(r1)     // Catch: java.lang.SecurityException -> L1d java.lang.Throwable -> L24
            if (r1 == 0) goto L1d
            int r1 = r1.getLevel()     // Catch: java.lang.SecurityException -> L1d java.lang.Throwable -> L24
            goto L1e
        L1d:
            r1 = -1
        L1e:
            if (r0 == 0) goto L23
            r0.close()
        L23:
            return r1
        L24:
            r1 = move-exception
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L2f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.RadioUtils.getCellSignalLevel():int");
    }

    @CalledByNative
    private static int getCellDataActivity() {
        TraceEvent scoped = TraceEvent.scoped("RadioUtils::getCellDataActivity");
        try {
            try {
                int dataActivity = ((TelephonyManager) ContextUtils.getApplicationContext().getSystemService("phone")).getDataActivity();
                if (scoped != null) {
                    scoped.close();
                }
                return dataActivity;
            } catch (SecurityException unused) {
                if (scoped != null) {
                    scoped.close();
                    return -1;
                }
                return -1;
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
}
