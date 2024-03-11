package com.netflix.mediaclient.ui.commander.impl.ui.menu;

import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import o.C8600drp;
import o.InterfaceC8598drn;
import o.bBM;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class FeatureEducationTip {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ FeatureEducationTip[] e;
    private final int g;
    private final HawkinsIcon j;
    public static final FeatureEducationTip d = new FeatureEducationTip("First", 0, bBM.c.s, HawkinsIcon.C0393jx.c);
    public static final FeatureEducationTip b = new FeatureEducationTip("Second", 1, bBM.c.t, HawkinsIcon.bS.c);
    public static final FeatureEducationTip a = new FeatureEducationTip("Third", 2, bBM.c.v, HawkinsIcon.C0391jv.e);

    public static InterfaceC8598drn<FeatureEducationTip> b() {
        return c;
    }

    private static final /* synthetic */ FeatureEducationTip[] c() {
        return new FeatureEducationTip[]{d, b, a};
    }

    public static FeatureEducationTip valueOf(String str) {
        return (FeatureEducationTip) Enum.valueOf(FeatureEducationTip.class, str);
    }

    public static FeatureEducationTip[] values() {
        return (FeatureEducationTip[]) e.clone();
    }

    public final int a() {
        return this.g;
    }

    public final HawkinsIcon d() {
        return this.j;
    }

    private FeatureEducationTip(String str, int i, int i2, HawkinsIcon hawkinsIcon) {
        this.g = i2;
        this.j = hawkinsIcon;
    }

    static {
        FeatureEducationTip[] c2 = c();
        e = c2;
        c = C8600drp.e(c2);
    }
}
