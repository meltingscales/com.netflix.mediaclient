package com.netflix.mediaclient.ui.commander.impl.ui.menu;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PlaybackMenuType {
    private static final /* synthetic */ PlaybackMenuType[] b;
    private static final /* synthetic */ InterfaceC8598drn c;
    public static final PlaybackMenuType a = new PlaybackMenuType("Playing", 0);
    public static final PlaybackMenuType d = new PlaybackMenuType("Paused", 1);
    public static final PlaybackMenuType e = new PlaybackMenuType("Both", 2);

    private static final /* synthetic */ PlaybackMenuType[] d() {
        return new PlaybackMenuType[]{a, d, e};
    }

    public static PlaybackMenuType valueOf(String str) {
        return (PlaybackMenuType) Enum.valueOf(PlaybackMenuType.class, str);
    }

    public static PlaybackMenuType[] values() {
        return (PlaybackMenuType[]) b.clone();
    }

    private PlaybackMenuType(String str, int i) {
    }

    static {
        PlaybackMenuType[] d2 = d();
        b = d2;
        c = C8600drp.e(d2);
    }
}
