package com.netflix.mediaclient.service.cdx.pairing;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class UnpairingState {
    private static final /* synthetic */ UnpairingState[] a;
    private static final /* synthetic */ InterfaceC8598drn c;
    public static final UnpairingState d = new UnpairingState("REQUESTED", 0);
    public static final UnpairingState e = new UnpairingState("UNPAIRED", 1);

    private static final /* synthetic */ UnpairingState[] c() {
        return new UnpairingState[]{d, e};
    }

    public static UnpairingState valueOf(String str) {
        return (UnpairingState) Enum.valueOf(UnpairingState.class, str);
    }

    public static UnpairingState[] values() {
        return (UnpairingState[]) a.clone();
    }

    private UnpairingState(String str, int i) {
    }

    static {
        UnpairingState[] c2 = c();
        a = c2;
        c = C8600drp.e(c2);
    }
}
