package com.netflix.mediaclient.ui.collecttaste.impl.rating;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class RefreshState {
    private static final /* synthetic */ RefreshState[] a;
    public static final RefreshState b = new RefreshState("SUCCESS", 0);
    public static final RefreshState c = new RefreshState("FAIL", 1);
    private static final /* synthetic */ InterfaceC8598drn d;

    private static final /* synthetic */ RefreshState[] a() {
        return new RefreshState[]{b, c};
    }

    public static RefreshState valueOf(String str) {
        return (RefreshState) Enum.valueOf(RefreshState.class, str);
    }

    public static RefreshState[] values() {
        return (RefreshState[]) a.clone();
    }

    static {
        RefreshState[] a2 = a();
        a = a2;
        d = C8600drp.e(a2);
    }

    private RefreshState(String str, int i) {
    }
}
