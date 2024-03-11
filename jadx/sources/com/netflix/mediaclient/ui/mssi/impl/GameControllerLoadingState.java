package com.netflix.mediaclient.ui.mssi.impl;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GameControllerLoadingState {
    private static final /* synthetic */ GameControllerLoadingState[] c;
    private static final /* synthetic */ InterfaceC8598drn d;
    public static final GameControllerLoadingState b = new GameControllerLoadingState("LOADING", 0);
    public static final GameControllerLoadingState a = new GameControllerLoadingState("ERROR", 1);
    public static final GameControllerLoadingState e = new GameControllerLoadingState("FINISHED", 2);

    private static final /* synthetic */ GameControllerLoadingState[] e() {
        return new GameControllerLoadingState[]{b, a, e};
    }

    public static GameControllerLoadingState valueOf(String str) {
        return (GameControllerLoadingState) Enum.valueOf(GameControllerLoadingState.class, str);
    }

    public static GameControllerLoadingState[] values() {
        return (GameControllerLoadingState[]) c.clone();
    }

    private GameControllerLoadingState(String str, int i) {
    }

    static {
        GameControllerLoadingState[] e2 = e();
        c = e2;
        d = C8600drp.e(e2);
    }
}
