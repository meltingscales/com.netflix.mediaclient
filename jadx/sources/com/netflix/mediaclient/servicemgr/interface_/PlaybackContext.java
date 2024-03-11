package com.netflix.mediaclient.servicemgr.interface_;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PlaybackContext {
    private static final /* synthetic */ PlaybackContext[] c;
    private static final /* synthetic */ InterfaceC8598drn e;
    public static final PlaybackContext d = new PlaybackContext("SVOD", 0);
    public static final PlaybackContext b = new PlaybackContext("DVR", 1);
    public static final PlaybackContext a = new PlaybackContext("LIVE", 2);

    private static final /* synthetic */ PlaybackContext[] c() {
        return new PlaybackContext[]{d, b, a};
    }

    public static PlaybackContext valueOf(String str) {
        return (PlaybackContext) Enum.valueOf(PlaybackContext.class, str);
    }

    public static PlaybackContext[] values() {
        return (PlaybackContext[]) c.clone();
    }

    private PlaybackContext(String str, int i) {
    }

    static {
        PlaybackContext[] c2 = c();
        c = c2;
        e = C8600drp.e(c2);
    }
}
