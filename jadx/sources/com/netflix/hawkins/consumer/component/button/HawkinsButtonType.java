package com.netflix.hawkins.consumer.component.button;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsButtonType {
    private static final /* synthetic */ HawkinsButtonType[] g;
    private static final /* synthetic */ InterfaceC8598drn h;
    public static final HawkinsButtonType b = new HawkinsButtonType("Primary", 0);
    public static final HawkinsButtonType c = new HawkinsButtonType("Secondary", 1);
    public static final HawkinsButtonType d = new HawkinsButtonType("Tertiary", 2);
    public static final HawkinsButtonType a = new HawkinsButtonType("Supplemental", 3);
    public static final HawkinsButtonType e = new HawkinsButtonType("Brand", 4);

    private static final /* synthetic */ HawkinsButtonType[] e() {
        return new HawkinsButtonType[]{b, c, d, a, e};
    }

    public static HawkinsButtonType valueOf(String str) {
        return (HawkinsButtonType) Enum.valueOf(HawkinsButtonType.class, str);
    }

    public static HawkinsButtonType[] values() {
        return (HawkinsButtonType[]) g.clone();
    }

    private HawkinsButtonType(String str, int i) {
    }

    static {
        HawkinsButtonType[] e2 = e();
        g = e2;
        h = C8600drp.e(e2);
    }
}
