package com.netflix.mediaclient.commanderinfra.api.util;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlaybackKey {
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final /* synthetic */ PlaybackKey[] j;
    public static final PlaybackKey d = new PlaybackKey("Episodes", 0);
    public static final PlaybackKey a = new PlaybackKey("NextEpisode", 1);
    public static final PlaybackKey b = new PlaybackKey("Restart", 2);
    public static final PlaybackKey e = new PlaybackKey("AudioSubtitle", 3);
    public static final PlaybackKey f = new PlaybackKey("Rewind", 4);
    public static final PlaybackKey c = new PlaybackKey("Forward", 5);
    public static final PlaybackKey g = new PlaybackKey("SkipIntro", 6);

    private static final /* synthetic */ PlaybackKey[] b() {
        return new PlaybackKey[]{d, a, b, e, f, c, g};
    }

    public static PlaybackKey valueOf(String str) {
        return (PlaybackKey) Enum.valueOf(PlaybackKey.class, str);
    }

    public static PlaybackKey[] values() {
        return (PlaybackKey[]) j.clone();
    }

    private PlaybackKey(String str, int i) {
    }

    static {
        PlaybackKey[] b2 = b();
        j = b2;
        h = C8600drp.e(b2);
    }
}
