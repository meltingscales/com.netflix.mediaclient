package com.netflix.mediaclient.commanderinfra.api.util;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlaybackControlKey {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ PlaybackControlKey[] d;
    public static final PlaybackControlKey b = new PlaybackControlKey("Play", 0);
    public static final PlaybackControlKey a = new PlaybackControlKey("Pause", 1);

    private static final /* synthetic */ PlaybackControlKey[] c() {
        return new PlaybackControlKey[]{b, a};
    }

    public static PlaybackControlKey valueOf(String str) {
        return (PlaybackControlKey) Enum.valueOf(PlaybackControlKey.class, str);
    }

    public static PlaybackControlKey[] values() {
        return (PlaybackControlKey[]) d.clone();
    }

    private PlaybackControlKey(String str, int i) {
    }

    static {
        PlaybackControlKey[] c2 = c();
        d = c2;
        c = C8600drp.e(c2);
    }
}
