package com.netflix.hawkins.internal.material3;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class InputPhase {
    private static final /* synthetic */ InputPhase[] d;
    private static final /* synthetic */ InterfaceC8598drn e;
    public static final InputPhase b = new InputPhase("Focused", 0);
    public static final InputPhase c = new InputPhase("UnfocusedEmpty", 1);
    public static final InputPhase a = new InputPhase("UnfocusedNotEmpty", 2);

    private static final /* synthetic */ InputPhase[] c() {
        return new InputPhase[]{b, c, a};
    }

    public static InputPhase valueOf(String str) {
        return (InputPhase) Enum.valueOf(InputPhase.class, str);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) d.clone();
    }

    private InputPhase(String str, int i) {
    }

    static {
        InputPhase[] c2 = c();
        d = c2;
        e = C8600drp.e(c2);
    }
}
