package com.netflix.mediaclient.cdx.api.event.type;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlaybackSourceType {
    private static final /* synthetic */ PlaybackSourceType[] b;
    private static final /* synthetic */ InterfaceC8598drn e;
    private final int j;
    public static final PlaybackSourceType d = new PlaybackSourceType("STANDARD_PLAYBACK_SOURCE", 0, 1);
    public static final PlaybackSourceType c = new PlaybackSourceType("BROWSE_PLAYBACK_SOURCE", 1, 2);
    public static final PlaybackSourceType a = new PlaybackSourceType("UNKNOWN", 2, 3);

    private static final /* synthetic */ PlaybackSourceType[] b() {
        return new PlaybackSourceType[]{d, c, a};
    }

    public static PlaybackSourceType valueOf(String str) {
        return (PlaybackSourceType) Enum.valueOf(PlaybackSourceType.class, str);
    }

    public static PlaybackSourceType[] values() {
        return (PlaybackSourceType[]) b.clone();
    }

    public final int c() {
        return this.j;
    }

    private PlaybackSourceType(String str, int i, int i2) {
        this.j = i2;
    }

    static {
        PlaybackSourceType[] b2 = b();
        b = b2;
        e = C8600drp.e(b2);
    }
}
