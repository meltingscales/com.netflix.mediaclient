package com.netflix.mediaclient.ui.mdx;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CastState {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ CastState[] e;
    public static final CastState c = new CastState("AVAILABLE_DEVICES", 0);
    public static final CastState d = new CastState("NO_DEVICES", 1);
    public static final CastState b = new CastState("CONNECTED", 2);

    private static final /* synthetic */ CastState[] d() {
        return new CastState[]{c, d, b};
    }

    public static CastState valueOf(String str) {
        return (CastState) Enum.valueOf(CastState.class, str);
    }

    public static CastState[] values() {
        return (CastState[]) e.clone();
    }

    private CastState(String str, int i) {
    }

    static {
        CastState[] d2 = d();
        e = d2;
        a = C8600drp.e(d2);
    }
}
