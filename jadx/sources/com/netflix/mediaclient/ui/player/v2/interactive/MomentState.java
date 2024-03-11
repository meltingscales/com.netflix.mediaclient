package com.netflix.mediaclient.ui.player.v2.interactive;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MomentState {
    private static final /* synthetic */ InterfaceC8598drn d;
    private static final /* synthetic */ MomentState[] h;
    public static final MomentState c = new MomentState("START", 0);
    public static final MomentState b = new MomentState("END", 1);
    public static final MomentState a = new MomentState("SHOW", 2);
    public static final MomentState e = new MomentState("HIDE", 3);

    private static final /* synthetic */ MomentState[] a() {
        return new MomentState[]{c, b, a, e};
    }

    public static MomentState valueOf(String str) {
        return (MomentState) Enum.valueOf(MomentState.class, str);
    }

    public static MomentState[] values() {
        return (MomentState[]) h.clone();
    }

    private MomentState(String str, int i) {
    }

    static {
        MomentState[] a2 = a();
        h = a2;
        d = C8600drp.e(a2);
    }
}
