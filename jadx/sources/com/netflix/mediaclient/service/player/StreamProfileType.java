package com.netflix.mediaclient.service.player;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class StreamProfileType {
    private static final /* synthetic */ StreamProfileType[] h;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String g;
    public static final StreamProfileType c = new StreamProfileType("CE3", 0, "CE3");
    public static final StreamProfileType d = new StreamProfileType("AL1", 1, "AL1");
    public static final StreamProfileType e = new StreamProfileType("AV1", 2, "AV1");
    public static final StreamProfileType b = new StreamProfileType("CMAF", 3, "CMAF");
    public static final StreamProfileType a = new StreamProfileType("CE4", 4, "CE4");
    public static final StreamProfileType f = new StreamProfileType("LIVE", 5, "LIVE");
    public static final StreamProfileType i = new StreamProfileType("UNKNOWN", 6, "UNKNOWN");

    private static final /* synthetic */ StreamProfileType[] d() {
        return new StreamProfileType[]{c, d, e, b, a, f, i};
    }

    public static StreamProfileType valueOf(String str) {
        return (StreamProfileType) Enum.valueOf(StreamProfileType.class, str);
    }

    public static StreamProfileType[] values() {
        return (StreamProfileType[]) h.clone();
    }

    public final String e() {
        return this.g;
    }

    private StreamProfileType(String str, int i2, String str2) {
        this.g = str2;
    }

    static {
        StreamProfileType[] d2 = d();
        h = d2;
        j = C8600drp.e(d2);
    }
}
