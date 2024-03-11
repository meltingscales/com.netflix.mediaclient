package com.netflix.mediaclient.cdx.api.event.type;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlaybackSubStateType {
    private static final /* synthetic */ PlaybackSubStateType[] k;
    private static final /* synthetic */ InterfaceC8598drn n;
    public static final PlaybackSubStateType j = new PlaybackSubStateType("PREBUFFERING", 0);
    public static final PlaybackSubStateType b = new PlaybackSubStateType("BUFFERING", 1);
    public static final PlaybackSubStateType a = new PlaybackSubStateType("PLAYING", 2);
    public static final PlaybackSubStateType e = new PlaybackSubStateType("PAUSED", 3);
    public static final PlaybackSubStateType c = new PlaybackSubStateType("PAUSING", 4);
    public static final PlaybackSubStateType g = new PlaybackSubStateType("RESUMING", 5);
    public static final PlaybackSubStateType i = new PlaybackSubStateType("STOPPING", 6);
    public static final PlaybackSubStateType d = new PlaybackSubStateType("AUDIOSAFE", 7);
    public static final PlaybackSubStateType f = new PlaybackSubStateType("SWIMMING", 8);
    public static final PlaybackSubStateType h = new PlaybackSubStateType("UNKNOWN", 9);

    private static final /* synthetic */ PlaybackSubStateType[] d() {
        return new PlaybackSubStateType[]{j, b, a, e, c, g, i, d, f, h};
    }

    public static PlaybackSubStateType valueOf(String str) {
        return (PlaybackSubStateType) Enum.valueOf(PlaybackSubStateType.class, str);
    }

    public static PlaybackSubStateType[] values() {
        return (PlaybackSubStateType[]) k.clone();
    }

    private PlaybackSubStateType(String str, int i2) {
    }

    static {
        PlaybackSubStateType[] d2 = d();
        k = d2;
        n = C8600drp.e(d2);
    }
}
