package com.netflix.mediaclient.cdx.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairingType {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ PairingType[] i;
    public static final PairingType b = new PairingType("implicit", 0);
    public static final PairingType a = new PairingType("manual", 1);
    public static final PairingType e = new PairingType("prompted", 2);
    public static final PairingType d = new PairingType("reconnect", 3);

    private static final /* synthetic */ PairingType[] e() {
        return new PairingType[]{b, a, e, d};
    }

    public static PairingType valueOf(String str) {
        return (PairingType) Enum.valueOf(PairingType.class, str);
    }

    public static PairingType[] values() {
        return (PairingType[]) i.clone();
    }

    private PairingType(String str, int i2) {
    }

    static {
        PairingType[] e2 = e();
        i = e2;
        c = C8600drp.e(e2);
    }
}
