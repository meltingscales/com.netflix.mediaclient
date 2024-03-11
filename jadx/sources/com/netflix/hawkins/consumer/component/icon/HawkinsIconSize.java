package com.netflix.hawkins.consumer.component.icon;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsIconSize {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ HawkinsIconSize[] f;
    public static final HawkinsIconSize e = new HawkinsIconSize("Small", 0);
    public static final HawkinsIconSize d = new HawkinsIconSize("Standard", 1);
    public static final HawkinsIconSize a = new HawkinsIconSize("Large", 2);
    public static final HawkinsIconSize c = new HawkinsIconSize("Jumbo", 3);

    private static final /* synthetic */ HawkinsIconSize[] e() {
        return new HawkinsIconSize[]{e, d, a, c};
    }

    public static HawkinsIconSize valueOf(String str) {
        return (HawkinsIconSize) Enum.valueOf(HawkinsIconSize.class, str);
    }

    public static HawkinsIconSize[] values() {
        return (HawkinsIconSize[]) f.clone();
    }

    private HawkinsIconSize(String str, int i) {
    }

    static {
        HawkinsIconSize[] e2 = e();
        f = e2;
        b = C8600drp.e(e2);
    }
}
