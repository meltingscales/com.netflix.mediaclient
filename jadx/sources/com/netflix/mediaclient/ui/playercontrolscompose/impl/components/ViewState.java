package com.netflix.mediaclient.ui.playercontrolscompose.impl.components;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ViewState {
    private static final /* synthetic */ ViewState[] a;
    private static final /* synthetic */ InterfaceC8598drn c;
    public static final ViewState b = new ViewState("Pressed", 0);
    public static final ViewState d = new ViewState("Idle", 1);

    private static final /* synthetic */ ViewState[] e() {
        return new ViewState[]{b, d};
    }

    public static ViewState valueOf(String str) {
        return (ViewState) Enum.valueOf(ViewState.class, str);
    }

    public static ViewState[] values() {
        return (ViewState[]) a.clone();
    }

    static {
        ViewState[] e = e();
        a = e;
        c = C8600drp.e(e);
    }

    private ViewState(String str, int i) {
    }
}
