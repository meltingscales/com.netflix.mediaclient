package com.netflix.mediaclient.features.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FeatureProfileType {
    private static final /* synthetic */ InterfaceC8598drn a;
    public static final FeatureProfileType b = new FeatureProfileType("REGULAR", 0);
    public static final FeatureProfileType c = new FeatureProfileType("KIDS", 1);
    public static final FeatureProfileType d = new FeatureProfileType("NO_PROFILE", 2);
    private static final /* synthetic */ FeatureProfileType[] e;

    private static final /* synthetic */ FeatureProfileType[] e() {
        return new FeatureProfileType[]{b, c, d};
    }

    public static FeatureProfileType valueOf(String str) {
        return (FeatureProfileType) Enum.valueOf(FeatureProfileType.class, str);
    }

    public static FeatureProfileType[] values() {
        return (FeatureProfileType[]) e.clone();
    }

    private FeatureProfileType(String str, int i) {
    }

    static {
        FeatureProfileType[] e2 = e();
        e = e2;
        a = C8600drp.e(e2);
    }
}
