package com.netflix.hawkins.consumer.component.input;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsPhoneInputSize {
    private static final /* synthetic */ HawkinsPhoneInputSize[] b;
    private static final /* synthetic */ InterfaceC8598drn c;
    public static final HawkinsPhoneInputSize d = new HawkinsPhoneInputSize("Compact", 0);
    public static final HawkinsPhoneInputSize e = new HawkinsPhoneInputSize("Standard", 1);
    public static final HawkinsPhoneInputSize a = new HawkinsPhoneInputSize("Large", 2);

    private static final /* synthetic */ HawkinsPhoneInputSize[] a() {
        return new HawkinsPhoneInputSize[]{d, e, a};
    }

    public static HawkinsPhoneInputSize valueOf(String str) {
        return (HawkinsPhoneInputSize) Enum.valueOf(HawkinsPhoneInputSize.class, str);
    }

    public static HawkinsPhoneInputSize[] values() {
        return (HawkinsPhoneInputSize[]) b.clone();
    }

    private HawkinsPhoneInputSize(String str, int i) {
    }

    static {
        HawkinsPhoneInputSize[] a2 = a();
        b = a2;
        c = C8600drp.e(a2);
    }
}
