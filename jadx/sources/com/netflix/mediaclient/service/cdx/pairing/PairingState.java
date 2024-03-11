package com.netflix.mediaclient.service.cdx.pairing;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairingState {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ PairingState[] c;
    public static final PairingState b = new PairingState("REQUESTED", 0);
    public static final PairingState e = new PairingState("PAIRED", 1);
    public static final PairingState d = new PairingState("NOT_PAIRED", 2);

    private static final /* synthetic */ PairingState[] c() {
        return new PairingState[]{b, e, d};
    }

    public static PairingState valueOf(String str) {
        return (PairingState) Enum.valueOf(PairingState.class, str);
    }

    public static PairingState[] values() {
        return (PairingState[]) c.clone();
    }

    private PairingState(String str, int i) {
    }

    static {
        PairingState[] c2 = c();
        c = c2;
        a = C8600drp.e(c2);
    }
}
