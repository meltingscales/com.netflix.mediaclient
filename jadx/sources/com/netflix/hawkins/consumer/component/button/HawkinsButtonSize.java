package com.netflix.hawkins.consumer.component.button;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsButtonSize {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ HawkinsButtonSize[] d;
    public static final HawkinsButtonSize c = new HawkinsButtonSize("Small", 0);
    public static final HawkinsButtonSize e = new HawkinsButtonSize("Standard", 1);
    public static final HawkinsButtonSize b = new HawkinsButtonSize("Large", 2);

    private static final /* synthetic */ HawkinsButtonSize[] d() {
        return new HawkinsButtonSize[]{c, e, b};
    }

    public static HawkinsButtonSize valueOf(String str) {
        return (HawkinsButtonSize) Enum.valueOf(HawkinsButtonSize.class, str);
    }

    public static HawkinsButtonSize[] values() {
        return (HawkinsButtonSize[]) d.clone();
    }

    private HawkinsButtonSize(String str, int i) {
    }

    static {
        HawkinsButtonSize[] d2 = d();
        d = d2;
        a = C8600drp.e(d2);
    }
}
