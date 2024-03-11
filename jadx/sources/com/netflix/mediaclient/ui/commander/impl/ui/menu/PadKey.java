package com.netflix.mediaclient.ui.commander.impl.ui.menu;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PadKey {
    private static final /* synthetic */ PadKey[] f;
    private static final /* synthetic */ InterfaceC8598drn h;
    public static final PadKey e = new PadKey("Left", 0);
    public static final PadKey c = new PadKey("Right", 1);
    public static final PadKey j = new PadKey("Up", 2);
    public static final PadKey a = new PadKey("Down", 3);
    public static final PadKey d = new PadKey("Select", 4);
    public static final PadKey b = new PadKey("None", 5);

    private static final /* synthetic */ PadKey[] b() {
        return new PadKey[]{e, c, j, a, d, b};
    }

    public static PadKey valueOf(String str) {
        return (PadKey) Enum.valueOf(PadKey.class, str);
    }

    public static PadKey[] values() {
        return (PadKey[]) f.clone();
    }

    private PadKey(String str, int i) {
    }

    static {
        PadKey[] b2 = b();
        f = b2;
        h = C8600drp.e(b2);
    }
}
