package com.netflix.mediaclient.commanderinfra.api.util;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DpadKey {
    public static final DpadKey a = new DpadKey("Up", 0);
    public static final DpadKey b = new DpadKey("Down", 1);
    public static final DpadKey c = new DpadKey("Left", 2);
    public static final DpadKey d = new DpadKey("Right", 3);
    public static final DpadKey e = new DpadKey("Select", 4);
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final /* synthetic */ DpadKey[] i;

    private static final /* synthetic */ DpadKey[] d() {
        return new DpadKey[]{a, b, c, d, e};
    }

    public static DpadKey valueOf(String str) {
        return (DpadKey) Enum.valueOf(DpadKey.class, str);
    }

    public static DpadKey[] values() {
        return (DpadKey[]) i.clone();
    }

    private DpadKey(String str, int i2) {
    }

    static {
        DpadKey[] d2 = d();
        i = d2;
        g = C8600drp.e(d2);
    }
}
