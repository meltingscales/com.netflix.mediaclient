package com.netflix.mediaclient.features.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FeatureExperience {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ FeatureExperience[] g;
    public static final FeatureExperience d = new FeatureExperience("DEFAULT", 0);
    public static final FeatureExperience e = new FeatureExperience("AD_SUPPORTED", 1);
    public static final FeatureExperience a = new FeatureExperience("ADD_ON", 2);
    public static final FeatureExperience b = new FeatureExperience("UNRECOGNIZED", 3);

    private static final /* synthetic */ FeatureExperience[] b() {
        return new FeatureExperience[]{d, e, a, b};
    }

    public static FeatureExperience valueOf(String str) {
        return (FeatureExperience) Enum.valueOf(FeatureExperience.class, str);
    }

    public static FeatureExperience[] values() {
        return (FeatureExperience[]) g.clone();
    }

    private FeatureExperience(String str, int i) {
    }

    static {
        FeatureExperience[] b2 = b();
        g = b2;
        c = C8600drp.e(b2);
    }
}
