package com.netflix.mediaclient.service.net;

import android.net.NetworkInfo;

/* loaded from: classes.dex */
public enum LogMobileType {
    _2G("2g"),
    _3G("3g"),
    _4G("4g"),
    WIFI("wifi"),
    Ethernet("ethernet"),
    MOBILE("mobile"),
    UKNOWN("uknown");
    
    private String h;

    LogMobileType(String str) {
        this.h = str;
    }

    private static LogMobileType e(NetworkType networkType) {
        return networkType == null ? UKNOWN : NetworkType.b(networkType) ? _2G : NetworkType.d(networkType) ? _3G : NetworkType.a(networkType) ? _4G : NetworkType.UNKNOWN.equals(networkType) ? MOBILE : UKNOWN;
    }

    public static LogMobileType d(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        return networkInfo.getType() == 6 ? _4G : networkInfo.getType() == 1 ? WIFI : networkInfo.getType() == 9 ? Ethernet : e(NetworkType.b(networkInfo.getSubtype()));
    }
}
