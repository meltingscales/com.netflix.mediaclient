package com.netflix.mediaclient.servicemgr.interface_.player.playlist;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AdInterstitialType {
    private static final /* synthetic */ AdInterstitialType[] a;
    private static final /* synthetic */ InterfaceC8598drn b;
    public static final AdInterstitialType d = new AdInterstitialType("AdInterstitialBefore", 0);
    public static final AdInterstitialType c = new AdInterstitialType("AdInterstitialAfter", 1);

    private static final /* synthetic */ AdInterstitialType[] b() {
        return new AdInterstitialType[]{d, c};
    }

    public static AdInterstitialType valueOf(String str) {
        return (AdInterstitialType) Enum.valueOf(AdInterstitialType.class, str);
    }

    public static AdInterstitialType[] values() {
        return (AdInterstitialType[]) a.clone();
    }

    private AdInterstitialType(String str, int i) {
    }

    static {
        AdInterstitialType[] b2 = b();
        a = b2;
        b = C8600drp.e(b2);
    }
}
