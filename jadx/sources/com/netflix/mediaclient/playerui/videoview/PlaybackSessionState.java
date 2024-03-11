package com.netflix.mediaclient.playerui.videoview;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlaybackSessionState {
    private static final /* synthetic */ PlaybackSessionState[] c;
    private static final /* synthetic */ InterfaceC8598drn d;
    private final String h;
    private final int j;
    public static final PlaybackSessionState e = new PlaybackSessionState("NOTREADY", 0, 0, "NOTREADY");
    public static final PlaybackSessionState b = new PlaybackSessionState("VIDEO_LOADED", 1, 1, "VIDEO_LOADED");
    public static final PlaybackSessionState a = new PlaybackSessionState("READY", 2, 2, "PLAYER_READY");

    private static final /* synthetic */ PlaybackSessionState[] b() {
        return new PlaybackSessionState[]{e, b, a};
    }

    public static PlaybackSessionState valueOf(String str) {
        return (PlaybackSessionState) Enum.valueOf(PlaybackSessionState.class, str);
    }

    public static PlaybackSessionState[] values() {
        return (PlaybackSessionState[]) c.clone();
    }

    public final boolean d() {
        return this == b || this == a;
    }

    private PlaybackSessionState(String str, int i, int i2, String str2) {
        this.j = i2;
        this.h = str2;
    }

    static {
        PlaybackSessionState[] b2 = b();
        c = b2;
        d = C8600drp.e(b2);
    }
}
