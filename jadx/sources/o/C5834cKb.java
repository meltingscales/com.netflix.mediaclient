package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.ads.AdBreakProgressPhase;

/* renamed from: o.cKb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5834cKb {
    public static final c b = new c(null);
    private final boolean a;
    private final long c;
    private final long d;
    private final boolean e;
    private final long f;
    private final boolean g;
    private final int h;
    private final long i;
    private final int j;
    private final AdBreakProgressPhase m;
    private final int n;

    /* renamed from: o  reason: collision with root package name */
    private final int f13672o;

    public C5834cKb() {
        this(0L, 0, 0L, 0L, 0, false, false, false, null, 511, null);
    }

    public final int a() {
        return this.j;
    }

    public final long b() {
        return this.f;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.e;
    }

    public final long e() {
        return this.i;
    }

    public final C5834cKb e(long j, int i, long j2, long j3, int i2, boolean z, boolean z2, boolean z3, AdBreakProgressPhase adBreakProgressPhase) {
        C8632dsu.c((Object) adBreakProgressPhase, "");
        return new C5834cKb(j, i, j2, j3, i2, z, z2, z3, adBreakProgressPhase);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5834cKb) {
            C5834cKb c5834cKb = (C5834cKb) obj;
            return this.i == c5834cKb.i && this.n == c5834cKb.n && this.d == c5834cKb.d && this.c == c5834cKb.c && this.h == c5834cKb.h && this.e == c5834cKb.e && this.a == c5834cKb.a && this.g == c5834cKb.g && this.m == c5834cKb.m;
        }
        return false;
    }

    public final int f() {
        return this.f13672o;
    }

    public final int g() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.i) * 31) + Integer.hashCode(this.n)) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.c)) * 31) + Integer.hashCode(this.h)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.g)) * 31) + this.m.hashCode();
    }

    public final boolean i() {
        return this.g;
    }

    public final AdBreakProgressPhase j() {
        return this.m;
    }

    public String toString() {
        long j = this.i;
        int i = this.n;
        long j2 = this.d;
        long j3 = this.c;
        int i2 = this.h;
        boolean z = this.e;
        boolean z2 = this.a;
        boolean z3 = this.g;
        AdBreakProgressPhase adBreakProgressPhase = this.m;
        return "PlayerAdsUIExperienceState(currentlyPlayingAdBreakId=" + j + ", numberOfAdsInCurrentAdBreak=" + i + ", currentAdBreakDurationMs=" + j2 + ", currentAdBreakTimeElapsedMs=" + j3 + ", currentlyPlayingAdIndexWithinAdBreak=" + i2 + ", canShowTimerDuringAd=" + z + ", canShowAdCount=" + z2 + ", doubleTapUnavailablePromptVisible=" + z3 + ", progressPhase=" + adBreakProgressPhase + ")";
    }

    public C5834cKb(long j, int i, long j2, long j3, int i2, boolean z, boolean z2, boolean z3, AdBreakProgressPhase adBreakProgressPhase) {
        C8632dsu.c((Object) adBreakProgressPhase, "");
        this.i = j;
        this.n = i;
        this.d = j2;
        this.c = j3;
        this.h = i2;
        this.e = z;
        this.a = z2;
        this.g = z3;
        this.m = adBreakProgressPhase;
        this.f13672o = i;
        this.j = i2 + 1;
        long j4 = -1;
        if (j3 != -1 && j2 != -1) {
            j4 = j2 - j3;
        }
        this.f = j4;
    }

    public /* synthetic */ C5834cKb(long j, int i, long j2, long j3, int i2, boolean z, boolean z2, boolean z3, AdBreakProgressPhase adBreakProgressPhase, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? -1L : j, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1L : j2, (i3 & 8) == 0 ? j3 : -1L, (i3 & 16) == 0 ? i2 : -1, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2, (i3 & 128) == 0 ? z3 : false, (i3 & JSONzip.end) != 0 ? AdBreakProgressPhase.b : adBreakProgressPhase);
    }

    /* renamed from: o.cKb$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PlayerAdBreaksUIState");
        }
    }
}
