package com.netflix.mediaclient.ui.player.v2.interactive;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Interactivity {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ Interactivity[] d;
    public static final Interactivity e = new Interactivity("INTERACTIVE_BRANCHING_NARRATIVE", 0);
    public static final Interactivity b = new Interactivity("INTERACTIVE", 1);

    private static final /* synthetic */ Interactivity[] a() {
        return new Interactivity[]{e, b};
    }

    public static Interactivity valueOf(String str) {
        return (Interactivity) Enum.valueOf(Interactivity.class, str);
    }

    public static Interactivity[] values() {
        return (Interactivity[]) d.clone();
    }

    private Interactivity(String str, int i) {
    }

    static {
        Interactivity[] a2 = a();
        d = a2;
        a = C8600drp.e(a2);
    }
}
