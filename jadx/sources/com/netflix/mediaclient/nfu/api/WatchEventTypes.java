package com.netflix.mediaclient.nfu.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class WatchEventTypes {
    public static final WatchEventTypes b = new WatchEventTypes("EndPlay", 0, 1);
    private static final /* synthetic */ InterfaceC8598drn d;
    private static final /* synthetic */ WatchEventTypes[] e;
    private final int a;

    private static final /* synthetic */ WatchEventTypes[] c() {
        return new WatchEventTypes[]{b};
    }

    public static WatchEventTypes valueOf(String str) {
        return (WatchEventTypes) Enum.valueOf(WatchEventTypes.class, str);
    }

    public static WatchEventTypes[] values() {
        return (WatchEventTypes[]) e.clone();
    }

    public final int e() {
        return this.a;
    }

    private WatchEventTypes(String str, int i, int i2) {
        this.a = i2;
    }

    static {
        WatchEventTypes[] c = c();
        e = c;
        d = C8600drp.e(c);
    }
}
