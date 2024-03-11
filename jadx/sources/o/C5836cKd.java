package o;

import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayPauseButtonState;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.PlaybackState;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.PlayerUIExperience;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.live.LiveMode;
import kotlin.NoWhenBranchMatchedException;
import o.InterfaceC5816cJk;
import o.cJY;

/* renamed from: o.cKd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5836cKd implements InterfaceC8888fH {
    private final Long A;
    private final InterfaceC5835cKc B;
    private final float C;
    private final boolean D;
    private final cJW E;
    private final cJX F;
    private final InterfaceC5816cJk G;
    private final Watermark H;
    private final cJV I;
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final C5834cKb d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final PlayerUIExperience h;
    private final C5817cJl i;
    private final boolean j;
    private final PlayerUIExperience k;
    private final boolean l;
    private final C5596cBg m;
    private final cJZ n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13673o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final C5817cJl s;
    private final boolean t;
    private final float u;
    private final PlayPauseButtonState v;
    private final PlaybackState w;
    private final C5837cKe x;
    private final cJY y;
    private final Long z;

    /* renamed from: o.cKd$c */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[PlayerUIExperience.values().length];
            try {
                iArr[PlayerUIExperience.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerUIExperience.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerUIExperience.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerUIExperience.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayerUIExperience.b.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            c = iArr;
            int[] iArr2 = new int[PlaybackState.values().length];
            try {
                iArr2[PlaybackState.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PlaybackState.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PlaybackState.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PlaybackState.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            a = iArr2;
            int[] iArr3 = new int[LiveMode.values().length];
            try {
                iArr3[LiveMode.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[LiveMode.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[LiveMode.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[LiveMode.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[LiveMode.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            d = iArr3;
        }
    }

    public final cJV A() {
        return this.I;
    }

    public final boolean B() {
        return this.r;
    }

    public final Watermark C() {
        return this.H;
    }

    public final boolean I() {
        return this.q;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return !this.p;
    }

    public final C5834cKb c() {
        return this.d;
    }

    public final C5836cKd c(cJV cjv, boolean z, boolean z2, boolean z3, boolean z4, PlaybackState playbackState, float f, boolean z5, C5834cKb c5834cKb, boolean z6, float f2, boolean z7, Watermark watermark, cJZ cjz, cJX cjx, cJW cjw, C5837cKe c5837cKe, C5596cBg c5596cBg, InterfaceC5835cKc interfaceC5835cKc, PlayerUIExperience playerUIExperience, PlayerUIExperience playerUIExperience2, Long l, Long l2) {
        C8632dsu.c((Object) cjv, "");
        C8632dsu.c((Object) playbackState, "");
        C8632dsu.c((Object) c5834cKb, "");
        C8632dsu.c((Object) cjz, "");
        C8632dsu.c((Object) cjx, "");
        C8632dsu.c((Object) cjw, "");
        C8632dsu.c((Object) c5837cKe, "");
        C8632dsu.c((Object) c5596cBg, "");
        C8632dsu.c((Object) playerUIExperience, "");
        return new C5836cKd(cjv, z, z2, z3, z4, playbackState, f, z5, c5834cKb, z6, f2, z7, watermark, cjz, cjx, cjw, c5837cKe, c5596cBg, interfaceC5835cKc, playerUIExperience, playerUIExperience2, l, l2);
    }

    public final cJV component1() {
        return this.I;
    }

    public final boolean component10() {
        return this.p;
    }

    public final boolean component12() {
        return this.a;
    }

    public final Watermark component13() {
        return this.H;
    }

    public final cJZ component14() {
        return this.n;
    }

    public final cJX component15() {
        return this.F;
    }

    public final cJW component16() {
        return this.E;
    }

    public final C5837cKe component17() {
        return this.x;
    }

    public final C5596cBg component18() {
        return this.m;
    }

    public final InterfaceC5835cKc component19() {
        return this.B;
    }

    public final boolean component2() {
        return this.l;
    }

    public final PlayerUIExperience component20() {
        return this.k;
    }

    public final PlayerUIExperience component21() {
        return this.h;
    }

    public final Long component22() {
        return this.A;
    }

    public final Long component23() {
        return this.z;
    }

    public final boolean component3() {
        return this.f13673o;
    }

    public final boolean component4() {
        return this.e;
    }

    public final boolean component5() {
        return this.b;
    }

    public final PlaybackState component6() {
        return this.w;
    }

    public final float component7() {
        return this.u;
    }

    public final boolean component8() {
        return this.r;
    }

    public final C5834cKb component9() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5836cKd) {
            C5836cKd c5836cKd = (C5836cKd) obj;
            return C8632dsu.c(this.I, c5836cKd.I) && this.l == c5836cKd.l && this.f13673o == c5836cKd.f13673o && this.e == c5836cKd.e && this.b == c5836cKd.b && this.w == c5836cKd.w && Float.compare(this.u, c5836cKd.u) == 0 && this.r == c5836cKd.r && C8632dsu.c(this.d, c5836cKd.d) && this.p == c5836cKd.p && Float.compare(this.C, c5836cKd.C) == 0 && this.a == c5836cKd.a && C8632dsu.c(this.H, c5836cKd.H) && C8632dsu.c(this.n, c5836cKd.n) && C8632dsu.c(this.F, c5836cKd.F) && C8632dsu.c(this.E, c5836cKd.E) && C8632dsu.c(this.x, c5836cKd.x) && C8632dsu.c(this.m, c5836cKd.m) && C8632dsu.c(this.B, c5836cKd.B) && this.k == c5836cKd.k && this.h == c5836cKd.h && C8632dsu.c(this.A, c5836cKd.A) && C8632dsu.c(this.z, c5836cKd.z);
        }
        return false;
    }

    public final boolean f() {
        return this.j;
    }

    public final boolean g() {
        return this.c;
    }

    public final PlayerUIExperience h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.I.hashCode();
        int hashCode2 = Boolean.hashCode(this.l);
        int hashCode3 = Boolean.hashCode(this.f13673o);
        int hashCode4 = Boolean.hashCode(this.e);
        int hashCode5 = Boolean.hashCode(this.b);
        int hashCode6 = this.w.hashCode();
        int hashCode7 = Float.hashCode(this.u);
        int hashCode8 = Boolean.hashCode(this.r);
        int hashCode9 = this.d.hashCode();
        int hashCode10 = Boolean.hashCode(this.p);
        int hashCode11 = Float.hashCode(this.C);
        int hashCode12 = Boolean.hashCode(this.a);
        Watermark watermark = this.H;
        int hashCode13 = watermark == null ? 0 : watermark.hashCode();
        int hashCode14 = this.n.hashCode();
        int hashCode15 = this.F.hashCode();
        int hashCode16 = this.E.hashCode();
        int hashCode17 = this.x.hashCode();
        int hashCode18 = this.m.hashCode();
        InterfaceC5835cKc interfaceC5835cKc = this.B;
        int hashCode19 = interfaceC5835cKc == null ? 0 : interfaceC5835cKc.hashCode();
        int hashCode20 = this.k.hashCode();
        PlayerUIExperience playerUIExperience = this.h;
        int hashCode21 = playerUIExperience == null ? 0 : playerUIExperience.hashCode();
        Long l = this.A;
        int hashCode22 = l == null ? 0 : l.hashCode();
        Long l2 = this.z;
        return (((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + (l2 == null ? 0 : l2.hashCode());
    }

    public final boolean i() {
        return this.f;
    }

    public final C5817cJl j() {
        return this.i;
    }

    public final C5817cJl k() {
        return this.s;
    }

    public final PlayerUIExperience l() {
        return this.k;
    }

    public final boolean m() {
        return this.l;
    }

    public final cJZ n() {
        return this.n;
    }

    public final boolean o() {
        return this.f13673o;
    }

    public final cJY p() {
        return this.y;
    }

    public final Long q() {
        return this.z;
    }

    public final Long r() {
        return this.A;
    }

    public final PlayPauseButtonState s() {
        return this.v;
    }

    public final C5837cKe t() {
        return this.x;
    }

    public String toString() {
        cJV cjv = this.I;
        boolean z = this.l;
        boolean z2 = this.f13673o;
        boolean z3 = this.e;
        boolean z4 = this.b;
        PlaybackState playbackState = this.w;
        float f = this.u;
        boolean z5 = this.r;
        C5834cKb c5834cKb = this.d;
        boolean z6 = this.p;
        float f2 = this.C;
        boolean z7 = this.a;
        Watermark watermark = this.H;
        cJZ cjz = this.n;
        cJX cjx = this.F;
        cJW cjw = this.E;
        C5837cKe c5837cKe = this.x;
        C5596cBg c5596cBg = this.m;
        InterfaceC5835cKc interfaceC5835cKc = this.B;
        PlayerUIExperience playerUIExperience = this.k;
        PlayerUIExperience playerUIExperience2 = this.h;
        Long l = this.A;
        Long l2 = this.z;
        return "PlayerUIState(titleState=" + cjv + ", controlsDisplaying=" + z + ", controlsLocked=" + z2 + ", animateBackwardSeekButton=" + z3 + ", animateForwardSeekButton=" + z4 + ", playbackState=" + playbackState + ", playbackSpeed=" + f + ", isEpisodesButtonVisible=" + z5 + ", adsUIExperienceState=" + c5834cKb + ", isInPipMode=" + z6 + ", playerBrightnessValue=" + f2 + ", areAnimationsDisabled=" + z7 + ", watermark=" + watermark + ", contentAdvisoryState=" + cjz + ", seekbarState=" + cjx + ", seekbarBifState=" + cjw + ", liveUIExperienceState=" + c5837cKe + ", featureFlags=" + c5596cBg + ", postPlayUIExperienceState=" + interfaceC5835cKc + ", currentUIExperience=" + playerUIExperience + ", cachedUIExperience=" + playerUIExperience2 + ", postPlayCountdownStartTimeStampMs=" + l + ", postPlayCountdownCancelTimeStampMs=" + l2 + ")";
    }

    public final InterfaceC5816cJk u() {
        return this.G;
    }

    public final cJX v() {
        return this.F;
    }

    public final cJW w() {
        return this.E;
    }

    public final InterfaceC5835cKc x() {
        return this.B;
    }

    public final boolean y() {
        return this.D;
    }

    public final boolean z() {
        return this.t;
    }

    public C5836cKd(cJV cjv, boolean z, boolean z2, boolean z3, boolean z4, PlaybackState playbackState, float f, boolean z5, C5834cKb c5834cKb, boolean z6, float f2, boolean z7, Watermark watermark, cJZ cjz, cJX cjx, cJW cjw, C5837cKe c5837cKe, C5596cBg c5596cBg, InterfaceC5835cKc interfaceC5835cKc, PlayerUIExperience playerUIExperience, PlayerUIExperience playerUIExperience2, Long l, Long l2) {
        InterfaceC5816cJk interfaceC5816cJk;
        boolean z8;
        cJY cjy;
        PlayPauseButtonState playPauseButtonState;
        boolean z9;
        C8632dsu.c((Object) cjv, "");
        C8632dsu.c((Object) playbackState, "");
        C8632dsu.c((Object) c5834cKb, "");
        C8632dsu.c((Object) cjz, "");
        C8632dsu.c((Object) cjx, "");
        C8632dsu.c((Object) cjw, "");
        C8632dsu.c((Object) c5837cKe, "");
        C8632dsu.c((Object) c5596cBg, "");
        C8632dsu.c((Object) playerUIExperience, "");
        this.I = cjv;
        this.l = z;
        this.f13673o = z2;
        this.e = z3;
        this.b = z4;
        this.w = playbackState;
        this.u = f;
        this.r = z5;
        this.d = c5834cKb;
        this.p = z6;
        this.C = f2;
        this.a = z7;
        this.H = watermark;
        this.n = cjz;
        this.F = cjx;
        this.E = cjw;
        this.x = c5837cKe;
        this.m = c5596cBg;
        this.B = interfaceC5835cKc;
        this.k = playerUIExperience;
        this.h = playerUIExperience2;
        this.A = l;
        this.z = l2;
        int[] iArr = c.c;
        int i = iArr[playerUIExperience.ordinal()];
        boolean z10 = true;
        if (i == 1) {
            interfaceC5816cJk = InterfaceC5816cJk.c.c;
        } else if (i == 2) {
            interfaceC5816cJk = InterfaceC5816cJk.c.c;
        } else if (i == 3) {
            interfaceC5816cJk = InterfaceC5816cJk.c.c;
        } else if (i == 4) {
            interfaceC5816cJk = new InterfaceC5816cJk.e(f);
        } else if (i != 5) {
            throw new NoWhenBranchMatchedException();
        } else {
            interfaceC5816cJk = new InterfaceC5816cJk.e(f);
        }
        this.G = interfaceC5816cJk;
        this.t = c5596cBg.d();
        boolean z11 = !z2 && z;
        this.f = z11;
        this.j = z2 && z;
        int[] iArr2 = c.a;
        int i2 = iArr2[playbackState.ordinal()];
        if (i2 == 1 || i2 == 2) {
            z8 = true;
        } else if (i2 != 3 && i2 != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            z8 = false;
        }
        this.q = z8;
        boolean z12 = !z8;
        this.c = z12;
        if (c5596cBg.c() && !z8) {
            cjy = new cJY.b(f2);
        } else {
            cjy = cJY.d.e;
        }
        this.y = cjy;
        int i3 = iArr2[playbackState.ordinal()];
        if (i3 == 1) {
            playPauseButtonState = PlayPauseButtonState.b;
        } else if (i3 == 2) {
            playPauseButtonState = PlayPauseButtonState.b;
        } else if (i3 == 3) {
            playPauseButtonState = PlayPauseButtonState.d;
        } else if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            playPauseButtonState = PlayPauseButtonState.a;
        }
        this.v = playPauseButtonState;
        int i4 = iArr[playerUIExperience.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                int i5 = c.d[c5837cKe.e().ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                if (i5 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    }
                    z9 = true;
                }
            } else if (i4 != 3) {
                if (i4 != 4 && i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                z9 = true;
            }
            this.g = z9;
            this.i = new C5817cJl((!z11 || z3) && z9, z12, z3);
            this.s = new C5817cJl((!z11 || z4) && z9, (z12 || (playerUIExperience == PlayerUIExperience.c && c5837cKe.a())) ? false : true, z4);
            this.D = (z11 || !z9) ? false : z10;
        }
        z9 = false;
        this.g = z9;
        this.i = new C5817cJl((!z11 || z3) && z9, z12, z3);
        this.s = new C5817cJl((!z11 || z4) && z9, (z12 || (playerUIExperience == PlayerUIExperience.c && c5837cKe.a())) ? false : true, z4);
        this.D = (z11 || !z9) ? false : z10;
    }

    public /* synthetic */ C5836cKd(cJV cjv, boolean z, boolean z2, boolean z3, boolean z4, PlaybackState playbackState, float f, boolean z5, C5834cKb c5834cKb, boolean z6, float f2, boolean z7, Watermark watermark, cJZ cjz, cJX cjx, cJW cjw, C5837cKe c5837cKe, C5596cBg c5596cBg, InterfaceC5835cKc interfaceC5835cKc, PlayerUIExperience playerUIExperience, PlayerUIExperience playerUIExperience2, Long l, Long l2, int i, C8627dsp c8627dsp) {
        this(cjv, z, z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, playbackState, (i & 64) != 0 ? 1.0f : f, z5, c5834cKb, z6, f2, z7, watermark, (i & 8192) != 0 ? new cJZ(null, null, false, null, 15, null) : cjz, (i & 16384) != 0 ? new cJX(0, 0, false, false, false, 0, null, false, false, 511, null) : cjx, (32768 & i) != 0 ? new cJW(0, false, 0, false, false, 31, null) : cjw, (65536 & i) != 0 ? new C5837cKe(null, false, null, false, null, 31, null) : c5837cKe, (131072 & i) != 0 ? new C5596cBg(false, false, 3, null) : c5596cBg, (262144 & i) != 0 ? null : interfaceC5835cKc, (524288 & i) != 0 ? PlayerUIExperience.b : playerUIExperience, (1048576 & i) != 0 ? null : playerUIExperience2, (2097152 & i) != 0 ? null : l, (i & 4194304) != 0 ? null : l2);
    }

    public final String D() {
        return this.I.d();
    }
}
