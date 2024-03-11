package com.netflix.mediaclient.ui.ums;

import com.netflix.mediaclient.ui.R;
import o.C8600drp;
import o.C9834xU;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ThemeAsset {
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final /* synthetic */ ThemeAsset[] i;
    private final int f;
    private final String g;
    private final Integer j;
    public static final ThemeAsset b = new ThemeAsset("AZURE", 0, R.e.ba, "referral_modal_background_azure.webp", Integer.valueOf(R.e.aU));
    public static final ThemeAsset e = new ThemeAsset("LIME", 1, R.e.aY, "referral_modal_background_lime.webp", Integer.valueOf(R.e.aZ));
    public static final ThemeAsset c = new ThemeAsset("VIOLET", 2, R.e.bf, "referral_modal_background_violet.webp", Integer.valueOf(R.e.be));
    public static final ThemeAsset a = new ThemeAsset("WHITE", 3, C9834xU.c.I, null, null);
    public static final ThemeAsset d = new ThemeAsset("MAGENTA", 4, R.e.bb, "referral_modal_background_magenta.webp", Integer.valueOf(R.e.aX));

    private static final /* synthetic */ ThemeAsset[] e() {
        return new ThemeAsset[]{b, e, c, a, d};
    }

    public static ThemeAsset valueOf(String str) {
        return (ThemeAsset) Enum.valueOf(ThemeAsset.class, str);
    }

    public static ThemeAsset[] values() {
        return (ThemeAsset[]) i.clone();
    }

    public final int a() {
        return this.f;
    }

    public final Integer c() {
        return this.j;
    }

    public final String d() {
        return this.g;
    }

    private ThemeAsset(String str, int i2, int i3, String str2, Integer num) {
        this.f = i3;
        this.g = str2;
        this.j = num;
    }

    static {
        ThemeAsset[] e2 = e();
        i = e2;
        h = C8600drp.e(e2);
    }
}
