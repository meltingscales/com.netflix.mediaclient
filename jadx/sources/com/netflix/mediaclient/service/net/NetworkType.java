package com.netflix.mediaclient.service.net;

/* loaded from: classes3.dex */
public enum NetworkType {
    NONE(Integer.MIN_VALUE, "NONE"),
    UNKNOWN(0, "UNKNOWN"),
    EDGE(2, "EDGE"),
    UMTS(3, "UMTS"),
    CDMA(4, "CDMA"),
    EVDO_0(5, "EVDO_0"),
    EVDO_A(6, "EVDO_A"),
    _1xRTT(7, "1xRTT"),
    HSDPA(8, "HSDPA"),
    HSUPA(9, "HSUPA"),
    HSPA(10, "HSPA"),
    IDEN(11, "IDEN"),
    EVDO_B(12, "EVDO_B"),
    LTE(13, "LTE"),
    EHRPD(14, "EHRPD"),
    GPRS(1, "GPRS"),
    HSPAP(15, "HSPAP"),
    NR(20, "NR");
    
    private String t;
    private int v;

    NetworkType(int i, String str) {
        this.v = i;
        this.t = str;
    }

    public static NetworkType b(int i) {
        for (int i2 = 0; i2 < values().length; i2++) {
            if (values()[i2].v == i) {
                return values()[i2];
            }
        }
        return NONE;
    }

    public static boolean d(NetworkType networkType) {
        return UMTS.equals(networkType) || HSDPA.equals(networkType) || HSPA.equals(networkType) || EVDO_0.equals(networkType) || EVDO_A.equals(networkType) || EVDO_B.equals(networkType) || _1xRTT.equals(networkType) || HSUPA.equals(networkType) || EHRPD.equals(networkType) || HSPAP.equals(networkType);
    }

    public static boolean b(NetworkType networkType) {
        return EDGE.equals(networkType) || IDEN.equals(networkType) || CDMA.equals(networkType) || GPRS.equals(networkType);
    }

    public static boolean a(NetworkType networkType) {
        return LTE.equals(networkType);
    }

    public static boolean e(NetworkType networkType) {
        return NR.equals(networkType);
    }
}
