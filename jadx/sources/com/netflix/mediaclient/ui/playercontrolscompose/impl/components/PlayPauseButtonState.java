package com.netflix.mediaclient.ui.playercontrolscompose.impl.components;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PlayPauseButtonState {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ PlayPauseButtonState[] e;
    public static final PlayPauseButtonState d = new PlayPauseButtonState("Playing", 0);
    public static final PlayPauseButtonState a = new PlayPauseButtonState("Paused", 1);
    public static final PlayPauseButtonState b = new PlayPauseButtonState("Loading", 2);

    private static final /* synthetic */ PlayPauseButtonState[] c() {
        return new PlayPauseButtonState[]{d, a, b};
    }

    public static PlayPauseButtonState valueOf(String str) {
        return (PlayPauseButtonState) Enum.valueOf(PlayPauseButtonState.class, str);
    }

    public static PlayPauseButtonState[] values() {
        return (PlayPauseButtonState[]) e.clone();
    }

    private PlayPauseButtonState(String str, int i) {
    }

    static {
        PlayPauseButtonState[] c2 = c();
        e = c2;
        c = C8600drp.e(c2);
    }
}
