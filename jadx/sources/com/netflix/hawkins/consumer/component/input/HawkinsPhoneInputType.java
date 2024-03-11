package com.netflix.hawkins.consumer.component.input;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsPhoneInputType {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ HawkinsPhoneInputType[] c;
    public static final HawkinsPhoneInputType e = new HawkinsPhoneInputType("Border", 0);
    public static final HawkinsPhoneInputType a = new HawkinsPhoneInputType("Borderless", 1);

    private static final /* synthetic */ HawkinsPhoneInputType[] e() {
        return new HawkinsPhoneInputType[]{e, a};
    }

    public static HawkinsPhoneInputType valueOf(String str) {
        return (HawkinsPhoneInputType) Enum.valueOf(HawkinsPhoneInputType.class, str);
    }

    public static HawkinsPhoneInputType[] values() {
        return (HawkinsPhoneInputType[]) c.clone();
    }

    private HawkinsPhoneInputType(String str, int i) {
    }

    static {
        HawkinsPhoneInputType[] e2 = e();
        c = e2;
        b = C8600drp.e(e2);
    }
}
