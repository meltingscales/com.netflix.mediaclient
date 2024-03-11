package com.netflix.hawkins.consumer.component.divider;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsDividerEmphasis {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ HawkinsDividerEmphasis[] d;
    public static final HawkinsDividerEmphasis b = new HawkinsDividerEmphasis("High", 0);
    public static final HawkinsDividerEmphasis e = new HawkinsDividerEmphasis("Low", 1);

    private static final /* synthetic */ HawkinsDividerEmphasis[] a() {
        return new HawkinsDividerEmphasis[]{b, e};
    }

    public static HawkinsDividerEmphasis valueOf(String str) {
        return (HawkinsDividerEmphasis) Enum.valueOf(HawkinsDividerEmphasis.class, str);
    }

    public static HawkinsDividerEmphasis[] values() {
        return (HawkinsDividerEmphasis[]) d.clone();
    }

    private HawkinsDividerEmphasis(String str, int i) {
    }

    static {
        HawkinsDividerEmphasis[] a2 = a();
        d = a2;
        a = C8600drp.e(a2);
    }
}
