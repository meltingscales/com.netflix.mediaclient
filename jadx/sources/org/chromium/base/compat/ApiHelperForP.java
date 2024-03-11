package org.chromium.base.compat;

import android.content.pm.PackageInfo;
import android.net.LinkProperties;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;

/* loaded from: classes5.dex */
public final class ApiHelperForP {
    public static boolean isPrivateDnsActive(LinkProperties linkProperties) {
        boolean isPrivateDnsActive;
        isPrivateDnsActive = linkProperties.isPrivateDnsActive();
        return isPrivateDnsActive;
    }

    public static String getPrivateDnsServerName(LinkProperties linkProperties) {
        String privateDnsServerName;
        privateDnsServerName = linkProperties.getPrivateDnsServerName();
        return privateDnsServerName;
    }

    public static long getLongVersionCode(PackageInfo packageInfo) {
        long longVersionCode;
        longVersionCode = packageInfo.getLongVersionCode();
        return longVersionCode;
    }

    public static SignalStrength getSignalStrength(TelephonyManager telephonyManager) {
        SignalStrength signalStrength;
        signalStrength = telephonyManager.getSignalStrength();
        return signalStrength;
    }
}
