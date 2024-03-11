package com.netflix.mediaclient.ui.playercontrolscompose.impl.state.live;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LiveMode {
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final /* synthetic */ LiveMode[] j;
    public static final LiveMode b = new LiveMode("WAITING_ROOM", 0);
    public static final LiveMode a = new LiveMode("LIVE_EVENT", 1);
    public static final LiveMode d = new LiveMode("POST_LIVE_CONTENT", 2);
    public static final LiveMode c = new LiveMode("DVR", 3);
    public static final LiveMode e = new LiveMode("UNKNOWN", 4);

    private static final /* synthetic */ LiveMode[] b() {
        return new LiveMode[]{b, a, d, c, e};
    }

    public static LiveMode valueOf(String str) {
        return (LiveMode) Enum.valueOf(LiveMode.class, str);
    }

    public static LiveMode[] values() {
        return (LiveMode[]) j.clone();
    }

    private LiveMode(String str, int i) {
    }

    static {
        LiveMode[] b2 = b();
        j = b2;
        g = C8600drp.e(b2);
    }
}
