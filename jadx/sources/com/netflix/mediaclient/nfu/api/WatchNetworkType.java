package com.netflix.mediaclient.nfu.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class WatchNetworkType {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ WatchNetworkType[] e;
    private final int h;
    public static final WatchNetworkType d = new WatchNetworkType("WiFiOrWired", 0, 1);
    public static final WatchNetworkType c = new WatchNetworkType("Mobile", 1, 2);
    public static final WatchNetworkType a = new WatchNetworkType("Other", 2, 3);

    private static final /* synthetic */ WatchNetworkType[] d() {
        return new WatchNetworkType[]{d, c, a};
    }

    public static WatchNetworkType valueOf(String str) {
        return (WatchNetworkType) Enum.valueOf(WatchNetworkType.class, str);
    }

    public static WatchNetworkType[] values() {
        return (WatchNetworkType[]) e.clone();
    }

    public final int c() {
        return this.h;
    }

    private WatchNetworkType(String str, int i, int i2) {
        this.h = i2;
    }

    static {
        WatchNetworkType[] d2 = d();
        e = d2;
        b = C8600drp.e(d2);
    }
}
