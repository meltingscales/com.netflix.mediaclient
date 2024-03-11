package com.netflix.mediaclient.cdx.api.event.type;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlaybackStateType {
    private static final /* synthetic */ PlaybackStateType[] i;
    private static final /* synthetic */ InterfaceC8598drn j;
    public static final PlaybackStateType c = new PlaybackStateType("IDLE", 0);
    public static final PlaybackStateType e = new PlaybackStateType("LOADING", 1);
    public static final PlaybackStateType d = new PlaybackStateType("PLAYING", 2);
    public static final PlaybackStateType b = new PlaybackStateType("ENDING", 3);
    public static final PlaybackStateType a = new PlaybackStateType("UNKNOWN", 4);

    private static final /* synthetic */ PlaybackStateType[] e() {
        return new PlaybackStateType[]{c, e, d, b, a};
    }

    public static PlaybackStateType valueOf(String str) {
        return (PlaybackStateType) Enum.valueOf(PlaybackStateType.class, str);
    }

    public static PlaybackStateType[] values() {
        return (PlaybackStateType[]) i.clone();
    }

    private PlaybackStateType(String str, int i2) {
    }

    static {
        PlaybackStateType[] e2 = e();
        i = e2;
        j = C8600drp.e(e2);
    }
}
