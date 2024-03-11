package com.netflix.hawkins.consumer.component.input;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsInputSize {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ HawkinsInputSize[] d;
    public static final HawkinsInputSize e = new HawkinsInputSize("Standard", 0);
    public static final HawkinsInputSize b = new HawkinsInputSize("Small", 1);

    private static final /* synthetic */ HawkinsInputSize[] b() {
        return new HawkinsInputSize[]{e, b};
    }

    public static HawkinsInputSize valueOf(String str) {
        return (HawkinsInputSize) Enum.valueOf(HawkinsInputSize.class, str);
    }

    public static HawkinsInputSize[] values() {
        return (HawkinsInputSize[]) d.clone();
    }

    private HawkinsInputSize(String str, int i) {
    }

    static {
        HawkinsInputSize[] b2 = b();
        d = b2;
        c = C8600drp.e(b2);
    }
}
