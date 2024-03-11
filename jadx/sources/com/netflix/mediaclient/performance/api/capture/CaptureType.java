package com.netflix.mediaclient.performance.api.capture;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CaptureType {
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final /* synthetic */ CaptureType[] j;
    public static final CaptureType d = new CaptureType("FPS", 0);
    public static final CaptureType c = new CaptureType("CPU", 1);
    public static final CaptureType b = new CaptureType("Battery", 2);
    public static final CaptureType i = new CaptureType("SystemMemory", 3);
    public static final CaptureType e = new CaptureType("RuntimeMemory", 4);
    public static final CaptureType a = new CaptureType("ProcessMemory", 5);

    private static final /* synthetic */ CaptureType[] e() {
        return new CaptureType[]{d, c, b, i, e, a};
    }

    public static CaptureType valueOf(String str) {
        return (CaptureType) Enum.valueOf(CaptureType.class, str);
    }

    public static CaptureType[] values() {
        return (CaptureType[]) j.clone();
    }

    private CaptureType(String str, int i2) {
    }

    static {
        CaptureType[] e2 = e();
        j = e2;
        h = C8600drp.e(e2);
    }
}
