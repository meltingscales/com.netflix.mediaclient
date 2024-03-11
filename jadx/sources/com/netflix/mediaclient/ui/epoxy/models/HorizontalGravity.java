package com.netflix.mediaclient.ui.epoxy.models;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HorizontalGravity {
    private static final /* synthetic */ HorizontalGravity[] f;
    private static final /* synthetic */ InterfaceC8598drn i;
    private final int h;
    public static final HorizontalGravity c = new HorizontalGravity("START", 0, 8388611);
    public static final HorizontalGravity d = new HorizontalGravity("END", 1, 8388613);
    public static final HorizontalGravity e = new HorizontalGravity("LEFT", 2, 3);
    public static final HorizontalGravity b = new HorizontalGravity("RIGHT", 3, 5);
    public static final HorizontalGravity a = new HorizontalGravity("CENTER_HORIZONTAL", 4, 1);

    private static final /* synthetic */ HorizontalGravity[] c() {
        return new HorizontalGravity[]{c, d, e, b, a};
    }

    public static HorizontalGravity valueOf(String str) {
        return (HorizontalGravity) Enum.valueOf(HorizontalGravity.class, str);
    }

    public static HorizontalGravity[] values() {
        return (HorizontalGravity[]) f.clone();
    }

    public final int b() {
        return this.h;
    }

    private HorizontalGravity(String str, int i2, int i3) {
        this.h = i3;
    }

    static {
        HorizontalGravity[] c2 = c();
        f = c2;
        i = C8600drp.e(c2);
    }
}
