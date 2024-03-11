package com.netflix.clcs.models;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RdidDeviceConsent {
    private static final /* synthetic */ InterfaceC8598drn e;
    private static final /* synthetic */ RdidDeviceConsent[] i;
    public static final RdidDeviceConsent d = new RdidDeviceConsent("APPROVED", 0);
    public static final RdidDeviceConsent b = new RdidDeviceConsent("DENIED", 1);
    public static final RdidDeviceConsent a = new RdidDeviceConsent("UNDETERMINED", 2);
    public static final RdidDeviceConsent c = new RdidDeviceConsent("RESTRICTED", 3);

    private static final /* synthetic */ RdidDeviceConsent[] c() {
        return new RdidDeviceConsent[]{d, b, a, c};
    }

    public static RdidDeviceConsent valueOf(String str) {
        return (RdidDeviceConsent) Enum.valueOf(RdidDeviceConsent.class, str);
    }

    public static RdidDeviceConsent[] values() {
        return (RdidDeviceConsent[]) i.clone();
    }

    private RdidDeviceConsent(String str, int i2) {
    }

    static {
        RdidDeviceConsent[] c2 = c();
        i = c2;
        e = C8600drp.e(c2);
    }
}
