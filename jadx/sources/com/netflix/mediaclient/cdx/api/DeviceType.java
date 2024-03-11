package com.netflix.mediaclient.cdx.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DeviceType {
    private static final /* synthetic */ InterfaceC8598drn i;
    private static final /* synthetic */ DeviceType[] j;
    public static final DeviceType e = new DeviceType("android", 0);
    public static final DeviceType a = new DeviceType("nrdp", 1);
    public static final DeviceType b = new DeviceType("ios", 2);
    public static final DeviceType c = new DeviceType("web", 3);
    public static final DeviceType d = new DeviceType("unknown", 4);

    private static final /* synthetic */ DeviceType[] a() {
        return new DeviceType[]{e, a, b, c, d};
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) Enum.valueOf(DeviceType.class, str);
    }

    public static DeviceType[] values() {
        return (DeviceType[]) j.clone();
    }

    private DeviceType(String str, int i2) {
    }

    static {
        DeviceType[] a2 = a();
        j = a2;
        i = C8600drp.e(a2);
    }
}
