package com.netflix.hawkins.consumer.component.input;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsInputPinCodeSize {
    private static final /* synthetic */ HawkinsInputPinCodeSize[] a;
    private static final /* synthetic */ InterfaceC8598drn b;
    public static final HawkinsInputPinCodeSize d = new HawkinsInputPinCodeSize("Small", 0);
    public static final HawkinsInputPinCodeSize e = new HawkinsInputPinCodeSize("Standard", 1);

    private static final /* synthetic */ HawkinsInputPinCodeSize[] a() {
        return new HawkinsInputPinCodeSize[]{d, e};
    }

    public static HawkinsInputPinCodeSize valueOf(String str) {
        return (HawkinsInputPinCodeSize) Enum.valueOf(HawkinsInputPinCodeSize.class, str);
    }

    public static HawkinsInputPinCodeSize[] values() {
        return (HawkinsInputPinCodeSize[]) a.clone();
    }

    private HawkinsInputPinCodeSize(String str, int i) {
    }

    static {
        HawkinsInputPinCodeSize[] a2 = a();
        a = a2;
        b = C8600drp.e(a2);
    }
}
