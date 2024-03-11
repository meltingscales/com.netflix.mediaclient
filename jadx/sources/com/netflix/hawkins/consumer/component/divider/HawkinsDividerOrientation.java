package com.netflix.hawkins.consumer.component.divider;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsDividerOrientation {
    private static final /* synthetic */ HawkinsDividerOrientation[] a;
    public static final HawkinsDividerOrientation b = new HawkinsDividerOrientation("Vertical", 0);
    public static final HawkinsDividerOrientation c = new HawkinsDividerOrientation("Horizontal", 1);
    private static final /* synthetic */ InterfaceC8598drn e;

    private static final /* synthetic */ HawkinsDividerOrientation[] e() {
        return new HawkinsDividerOrientation[]{b, c};
    }

    public static HawkinsDividerOrientation valueOf(String str) {
        return (HawkinsDividerOrientation) Enum.valueOf(HawkinsDividerOrientation.class, str);
    }

    public static HawkinsDividerOrientation[] values() {
        return (HawkinsDividerOrientation[]) a.clone();
    }

    private HawkinsDividerOrientation(String str, int i) {
    }

    static {
        HawkinsDividerOrientation[] e2 = e();
        a = e2;
        e = C8600drp.e(e2);
    }
}
