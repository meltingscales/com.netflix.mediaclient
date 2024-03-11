package com.netflix.clcs.models;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class StackContentJustification {
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ StackContentJustification[] g;
    public static final StackContentJustification c = new StackContentJustification("START", 0);
    public static final StackContentJustification d = new StackContentJustification("CENTER", 1);
    public static final StackContentJustification a = new StackContentJustification("END", 2);
    public static final StackContentJustification b = new StackContentJustification("SPACE_BETWEEN", 3);
    public static final StackContentJustification e = new StackContentJustification("SPACE_EVENLY", 4);

    private static final /* synthetic */ StackContentJustification[] b() {
        return new StackContentJustification[]{c, d, a, b, e};
    }

    public static StackContentJustification valueOf(String str) {
        return (StackContentJustification) Enum.valueOf(StackContentJustification.class, str);
    }

    public static StackContentJustification[] values() {
        return (StackContentJustification[]) g.clone();
    }

    private StackContentJustification(String str, int i) {
    }

    static {
        StackContentJustification[] b2 = b();
        g = b2;
        f = C8600drp.e(b2);
    }
}
