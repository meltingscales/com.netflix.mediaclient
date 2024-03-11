package com.netflix.mediaclient.ui.commander.impl.ui.menu;

import androidx.compose.ui.unit.Dp;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import o.C8600drp;
import o.InterfaceC8598drn;
import o.bBM;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PlaybackControlMenuAction {
    public static final PlaybackControlMenuAction a;
    private static final /* synthetic */ InterfaceC8598drn b;
    public static final PlaybackControlMenuAction c;
    public static final PlaybackControlMenuAction d;
    public static final PlaybackControlMenuAction e;
    private static final /* synthetic */ PlaybackControlMenuAction[] g;
    private final int f;
    private final HawkinsIcon h;
    private final float i;
    private final PlaybackMenuType j;

    public static InterfaceC8598drn<PlaybackControlMenuAction> a() {
        return b;
    }

    private static final /* synthetic */ PlaybackControlMenuAction[] g() {
        return new PlaybackControlMenuAction[]{e, a, d, c};
    }

    public static PlaybackControlMenuAction valueOf(String str) {
        return (PlaybackControlMenuAction) Enum.valueOf(PlaybackControlMenuAction.class, str);
    }

    public static PlaybackControlMenuAction[] values() {
        return (PlaybackControlMenuAction[]) g.clone();
    }

    public final PlaybackMenuType b() {
        return this.j;
    }

    public final float c() {
        return this.i;
    }

    public final HawkinsIcon d() {
        return this.h;
    }

    public final int e() {
        return this.f;
    }

    private PlaybackControlMenuAction(String str, int i, int i2, HawkinsIcon hawkinsIcon, float f, PlaybackMenuType playbackMenuType) {
        this.f = i2;
        this.h = hawkinsIcon;
        this.i = f;
        this.j = playbackMenuType;
    }

    static {
        int i = bBM.c.ai;
        HawkinsIcon.R r = HawkinsIcon.R.b;
        float f = 36;
        float m2492constructorimpl = Dp.m2492constructorimpl(f);
        PlaybackMenuType playbackMenuType = PlaybackMenuType.e;
        e = new PlaybackControlMenuAction("Rewind", 0, i, r, m2492constructorimpl, playbackMenuType);
        float f2 = 58;
        a = new PlaybackControlMenuAction("Play", 1, bBM.c.Y, HawkinsIcon.gG.e, Dp.m2492constructorimpl(f2), PlaybackMenuType.d);
        d = new PlaybackControlMenuAction("Pause", 2, bBM.c.V, HawkinsIcon.C0312gw.c, Dp.m2492constructorimpl(f2), PlaybackMenuType.a);
        c = new PlaybackControlMenuAction("Forward", 3, bBM.c.u, HawkinsIcon.dK.e, Dp.m2492constructorimpl(f), playbackMenuType);
        PlaybackControlMenuAction[] g2 = g();
        g = g2;
        b = C8600drp.e(g2);
    }
}
