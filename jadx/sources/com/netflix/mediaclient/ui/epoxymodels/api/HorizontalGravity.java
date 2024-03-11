package com.netflix.mediaclient.ui.epoxymodels.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HorizontalGravity {
    private static final /* synthetic */ HorizontalGravity[] i;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final int f;
    public static final HorizontalGravity c = new HorizontalGravity("START", 0, 8388611);
    public static final HorizontalGravity e = new HorizontalGravity("END", 1, 8388613);
    public static final HorizontalGravity d = new HorizontalGravity("LEFT", 2, 3);
    public static final HorizontalGravity b = new HorizontalGravity("RIGHT", 3, 5);
    public static final HorizontalGravity a = new HorizontalGravity("CENTER_HORIZONTAL", 4, 1);

    private static final /* synthetic */ HorizontalGravity[] d() {
        return new HorizontalGravity[]{c, e, d, b, a};
    }

    public static HorizontalGravity valueOf(String str) {
        return (HorizontalGravity) Enum.valueOf(HorizontalGravity.class, str);
    }

    public static HorizontalGravity[] values() {
        return (HorizontalGravity[]) i.clone();
    }

    public final int c() {
        return this.f;
    }

    private HorizontalGravity(String str, int i2, int i3) {
        this.f = i3;
    }

    static {
        HorizontalGravity[] d2 = d();
        i = d2;
        j = C8600drp.e(d2);
    }
}
