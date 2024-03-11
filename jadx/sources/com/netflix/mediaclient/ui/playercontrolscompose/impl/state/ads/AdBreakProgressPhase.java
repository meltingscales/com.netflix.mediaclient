package com.netflix.mediaclient.ui.playercontrolscompose.impl.state.ads;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AdBreakProgressPhase {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ AdBreakProgressPhase[] h;
    public static final AdBreakProgressPhase a = new AdBreakProgressPhase("PRE_AD_BREAK", 0);
    public static final AdBreakProgressPhase e = new AdBreakProgressPhase("AD_BREAK_CONTENT", 1);
    public static final AdBreakProgressPhase d = new AdBreakProgressPhase("POST_AD_BREAK", 2);
    public static final AdBreakProgressPhase b = new AdBreakProgressPhase("UNINITIALIZED", 3);

    private static final /* synthetic */ AdBreakProgressPhase[] a() {
        return new AdBreakProgressPhase[]{a, e, d, b};
    }

    public static AdBreakProgressPhase valueOf(String str) {
        return (AdBreakProgressPhase) Enum.valueOf(AdBreakProgressPhase.class, str);
    }

    public static AdBreakProgressPhase[] values() {
        return (AdBreakProgressPhase[]) h.clone();
    }

    private AdBreakProgressPhase(String str, int i) {
    }

    static {
        AdBreakProgressPhase[] a2 = a();
        h = a2;
        c = C8600drp.e(a2);
    }
}
