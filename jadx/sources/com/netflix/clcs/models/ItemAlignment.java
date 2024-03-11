package com.netflix.clcs.models;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ItemAlignment {
    private static final /* synthetic */ ItemAlignment[] g;
    private static final /* synthetic */ InterfaceC8598drn h;
    public static final ItemAlignment c = new ItemAlignment("START", 0);
    public static final ItemAlignment e = new ItemAlignment("CENTER", 1);
    public static final ItemAlignment a = new ItemAlignment("END", 2);
    public static final ItemAlignment b = new ItemAlignment("STRETCH", 3);
    public static final ItemAlignment d = new ItemAlignment("BASELINE", 4);

    private static final /* synthetic */ ItemAlignment[] b() {
        return new ItemAlignment[]{c, e, a, b, d};
    }

    public static ItemAlignment valueOf(String str) {
        return (ItemAlignment) Enum.valueOf(ItemAlignment.class, str);
    }

    public static ItemAlignment[] values() {
        return (ItemAlignment[]) g.clone();
    }

    private ItemAlignment(String str, int i) {
    }

    static {
        ItemAlignment[] b2 = b();
        g = b2;
        h = C8600drp.e(b2);
    }
}
