package com.netflix.mediaclient.ui.playercontrolscompose.impl.state;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PlaybackState {
    private static final /* synthetic */ InterfaceC8598drn e;
    private static final /* synthetic */ PlaybackState[] g;
    public static final PlaybackState c = new PlaybackState("UNINITIALIZED", 0);
    public static final PlaybackState a = new PlaybackState("BUFFERING", 1);
    public static final PlaybackState d = new PlaybackState("PLAYING", 2);
    public static final PlaybackState b = new PlaybackState("PAUSED", 3);

    private static final /* synthetic */ PlaybackState[] a() {
        return new PlaybackState[]{c, a, d, b};
    }

    public static PlaybackState valueOf(String str) {
        return (PlaybackState) Enum.valueOf(PlaybackState.class, str);
    }

    public static PlaybackState[] values() {
        return (PlaybackState[]) g.clone();
    }

    private PlaybackState(String str, int i) {
    }

    static {
        PlaybackState[] a2 = a();
        g = a2;
        e = C8600drp.e(a2);
    }
}
