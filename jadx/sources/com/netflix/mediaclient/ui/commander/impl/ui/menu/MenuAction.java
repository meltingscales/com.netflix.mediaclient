package com.netflix.mediaclient.ui.commander.impl.ui.menu;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import o.C8600drp;
import o.C8627dsp;
import o.InterfaceC8598drn;
import o.bBM;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MenuAction {
    public static final MenuAction a;
    public static final MenuAction b;
    public static final MenuAction c;
    public static final MenuAction d;
    public static final MenuAction e;
    public static final MenuAction f;
    public static final MenuAction g;
    public static final MenuAction h;
    public static final MenuAction i;
    public static final MenuAction j;
    public static final MenuAction k;
    public static final MenuAction l;
    public static final MenuAction m;
    public static final MenuAction n;

    /* renamed from: o  reason: collision with root package name */
    public static final MenuAction f13263o;
    private static final /* synthetic */ MenuAction[] p;
    public static final MenuAction q;
    private static final /* synthetic */ InterfaceC8598drn t;
    private final MenuType A;
    private final ApplicablePlaybackType r;
    private final int s;
    private final int u;
    private final SubtitlesType v;
    private final HawkinsIcon w;
    private final int x;
    private final boolean y;
    private final boolean z;

    public static InterfaceC8598drn<MenuAction> c() {
        return t;
    }

    private static final /* synthetic */ MenuAction[] o() {
        return new MenuAction[]{q, e, h, a, f, g, b, i, m, n, c, j, f13263o, l, d, k};
    }

    public static MenuAction valueOf(String str) {
        return (MenuAction) Enum.valueOf(MenuAction.class, str);
    }

    public static MenuAction[] values() {
        return (MenuAction[]) p.clone();
    }

    public final ApplicablePlaybackType a() {
        return this.r;
    }

    public final int b() {
        return this.s;
    }

    public final int d() {
        return this.u;
    }

    public final HawkinsIcon e() {
        return this.w;
    }

    public final boolean f() {
        return this.z;
    }

    public final boolean g() {
        return this.y;
    }

    public final MenuType h() {
        return this.A;
    }

    public final SubtitlesType i() {
        return this.v;
    }

    public final int j() {
        return this.x;
    }

    private MenuAction(String str, int i2, int i3, HawkinsIcon hawkinsIcon, boolean z, ApplicablePlaybackType applicablePlaybackType, MenuType menuType, int i4, SubtitlesType subtitlesType, boolean z2, int i5) {
        this.x = i3;
        this.w = hawkinsIcon;
        this.y = z;
        this.r = applicablePlaybackType;
        this.A = menuType;
        this.u = i4;
        this.v = subtitlesType;
        this.z = z2;
        this.s = i5;
    }

    /* synthetic */ MenuAction(String str, int i2, int i3, HawkinsIcon hawkinsIcon, boolean z, ApplicablePlaybackType applicablePlaybackType, MenuType menuType, int i4, SubtitlesType subtitlesType, boolean z2, int i5, int i6, C8627dsp c8627dsp) {
        this(str, i2, i3, hawkinsIcon, (i6 & 4) != 0 ? true : z, (i6 & 8) != 0 ? ApplicablePlaybackType.b : applicablePlaybackType, menuType, (i6 & 32) != 0 ? 2 : i4, (i6 & 64) != 0 ? SubtitlesType.a : subtitlesType, (i6 & 128) != 0 ? false : z2, (i6 & JSONzip.end) != 0 ? -1 : i5);
    }

    static {
        int i2 = bBM.c.ay;
        HawkinsIcon.C0385jp c0385jp = HawkinsIcon.C0385jp.e;
        MenuType menuType = MenuType.c;
        q = new MenuAction("TvShows", 0, i2, c0385jp, false, null, menuType, 0, null, false, 0, 492, null);
        e = new MenuAction("Movies", 1, bBM.c.f13494J, HawkinsIcon.C0337hu.b, false, null, menuType, 0, null, false, 0, 492, null);
        h = new MenuAction("NewAndPopular", 2, bBM.c.K, HawkinsIcon.A.c, false, null, menuType, 0, null, false, 0, 492, null);
        a = new MenuAction("MyList", 3, bBM.c.M, HawkinsIcon.gO.b, false, null, menuType, 0, null, false, 0, 492, null);
        f = new MenuAction("Play", 4, bBM.c.Y, HawkinsIcon.gG.e, false, null, MenuType.b, 0, null, false, 0, 492, null);
        int i3 = bBM.c.al;
        HawkinsIcon.gH gHVar = HawkinsIcon.gH.c;
        ApplicablePlaybackType applicablePlaybackType = ApplicablePlaybackType.d;
        MenuType menuType2 = MenuType.d;
        g = new MenuAction("RestartSeries", 5, i3, gHVar, false, applicablePlaybackType, menuType2, 0, null, false, 0, 484, null);
        b = new MenuAction("EpisodesSeries", 6, bBM.c.m, HawkinsIcon.C0212dc.c, false, applicablePlaybackType, menuType2, 0, null, false, 0, 484, null);
        i = new MenuAction("NextEpisodeSeries", 7, bBM.c.S, HawkinsIcon.C0305gp.e, false, applicablePlaybackType, menuType2, 0, null, false, bBM.c.N, 228, null);
        int i4 = bBM.c.aA;
        HawkinsIcon.iI iIVar = HawkinsIcon.iI.c;
        SubtitlesType subtitlesType = SubtitlesType.b;
        m = new MenuAction("ToggleSubtitlesSeriesOn", 8, i4, iIVar, false, applicablePlaybackType, menuType2, 3, subtitlesType, false, 0, 388, null);
        int i5 = bBM.c.av;
        SubtitlesType subtitlesType2 = SubtitlesType.d;
        n = new MenuAction("ToggleSubtitlesSeriesOff", 9, i5, iIVar, false, applicablePlaybackType, menuType2, 3, subtitlesType2, false, 0, 388, null);
        int i6 = bBM.c.I;
        HawkinsIcon.C0267fe c0267fe = HawkinsIcon.C0267fe.e;
        c = new MenuAction("AudioSubtitlesSeries", 10, i6, c0267fe, false, applicablePlaybackType, menuType2, 3, null, false, 0, 452, null);
        int i7 = bBM.c.al;
        ApplicablePlaybackType applicablePlaybackType2 = ApplicablePlaybackType.a;
        j = new MenuAction("RestartStandalone", 11, i7, gHVar, false, applicablePlaybackType2, menuType2, 2, null, false, 0, 452, null);
        f13263o = new MenuAction("ToggleSubtitlesStandaloneOn", 12, bBM.c.aA, iIVar, false, applicablePlaybackType2, menuType2, 2, subtitlesType, false, 0, 388, null);
        l = new MenuAction("ToggleSubtitlesStandaloneOff", 13, bBM.c.av, iIVar, false, applicablePlaybackType2, menuType2, 2, subtitlesType2, false, 0, 388, null);
        d = new MenuAction("AudioSubtitlesStandalone", 14, bBM.c.I, c0267fe, false, applicablePlaybackType2, menuType2, 2, null, false, 0, 452, null);
        k = new MenuAction("Skip", 15, bBM.c.at, HawkinsIcon.hW.c, false, ApplicablePlaybackType.b, menuType2, 0, null, true, 0, 356, null);
        MenuAction[] o2 = o();
        p = o2;
        t = C8600drp.e(o2);
    }
}
