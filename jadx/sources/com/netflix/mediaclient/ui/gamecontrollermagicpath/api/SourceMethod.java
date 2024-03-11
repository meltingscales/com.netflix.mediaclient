package com.netflix.mediaclient.ui.gamecontrollermagicpath.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SourceMethod {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ SourceMethod[] d;
    private final String h;
    public static final SourceMethod a = new SourceMethod("BEACON_CREATE", 0, "beacon.create");
    public static final SourceMethod c = new SourceMethod("BEACON_CLOSE", 1, "beacon.close");
    public static final SourceMethod e = new SourceMethod("BEACON_EXTEND", 2, "beacon.extend");

    private static final /* synthetic */ SourceMethod[] c() {
        return new SourceMethod[]{a, c, e};
    }

    public static SourceMethod valueOf(String str) {
        return (SourceMethod) Enum.valueOf(SourceMethod.class, str);
    }

    public static SourceMethod[] values() {
        return (SourceMethod[]) d.clone();
    }

    public final String a() {
        return this.h;
    }

    private SourceMethod(String str, int i, String str2) {
        this.h = str2;
    }

    static {
        SourceMethod[] c2 = c();
        d = c2;
        b = C8600drp.e(c2);
    }
}
