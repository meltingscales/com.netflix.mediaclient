package com.netflix.mediaclient.ui.player.v2;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SkipCreditsType {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ SkipCreditsType[] e;
    public static final SkipCreditsType c = new SkipCreditsType("INTRO", 0);
    public static final SkipCreditsType a = new SkipCreditsType("RECAP", 1);
    public static final SkipCreditsType d = new SkipCreditsType("CONTENT", 2);

    private static final /* synthetic */ SkipCreditsType[] a() {
        return new SkipCreditsType[]{c, a, d};
    }

    public static SkipCreditsType valueOf(String str) {
        return (SkipCreditsType) Enum.valueOf(SkipCreditsType.class, str);
    }

    public static SkipCreditsType[] values() {
        return (SkipCreditsType[]) e.clone();
    }

    private SkipCreditsType(String str, int i) {
    }

    static {
        SkipCreditsType[] a2 = a();
        e = a2;
        b = C8600drp.e(a2);
    }
}
