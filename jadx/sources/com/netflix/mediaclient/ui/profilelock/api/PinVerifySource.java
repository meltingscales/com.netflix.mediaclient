package com.netflix.mediaclient.ui.profilelock.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PinVerifySource {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ PinVerifySource[] c;
    public static final PinVerifySource e = new PinVerifySource("EDIT", 0);
    public static final PinVerifySource a = new PinVerifySource("DELETE", 1);

    private static final /* synthetic */ PinVerifySource[] a() {
        return new PinVerifySource[]{e, a};
    }

    public static PinVerifySource valueOf(String str) {
        return (PinVerifySource) Enum.valueOf(PinVerifySource.class, str);
    }

    public static PinVerifySource[] values() {
        return (PinVerifySource[]) c.clone();
    }

    private PinVerifySource(String str, int i) {
    }

    static {
        PinVerifySource[] a2 = a();
        c = a2;
        b = C8600drp.e(a2);
    }
}
