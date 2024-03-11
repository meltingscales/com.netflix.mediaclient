package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.PriorityTaskManager;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.util.PlayContext;

/* renamed from: o.boD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4875boD {
    private final InterfaceC4657bie a;
    private final Context b;
    private final aOV c;
    private final IClientLogging d;
    private final PlaybackExperience e;
    private final InterfaceC4793bmb f;
    private final C4606bhg g;
    private final InterfaceC4873boB h;
    private final Handler i;
    private final InterfaceC4342bch j;
    private final InterfaceC4942bpR k;
    private final PriorityTaskManager l;
    private final PreferredLanguageData m;
    private final PlayContext n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC4856bnl f13622o;
    private final UserAgent p;
    private final boolean r;
    private final Looper s;
    private final InterfaceC4607bhh t;

    public final Context a() {
        return this.b;
    }

    public final aOV b() {
        return this.c;
    }

    public final PlaybackExperience c() {
        return this.e;
    }

    public final C4606bhg d() {
        return this.g;
    }

    public final InterfaceC4657bie e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4875boD) {
            C4875boD c4875boD = (C4875boD) obj;
            return C8632dsu.c(this.g, c4875boD.g) && C8632dsu.c(this.p, c4875boD.p) && C8632dsu.c(this.c, c4875boD.c) && C8632dsu.c(this.k, c4875boD.k) && C8632dsu.c(this.d, c4875boD.d) && C8632dsu.c(this.i, c4875boD.i) && C8632dsu.c(this.s, c4875boD.s) && C8632dsu.c(this.n, c4875boD.n) && C8632dsu.c(this.e, c4875boD.e) && C8632dsu.c(this.t, c4875boD.t) && this.r == c4875boD.r && C8632dsu.c(this.m, c4875boD.m) && C8632dsu.c(this.f13622o, c4875boD.f13622o);
        }
        return false;
    }

    public final InterfaceC4873boB f() {
        return this.h;
    }

    public final PlayContext g() {
        return this.n;
    }

    public final Handler h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = this.g.hashCode();
        int hashCode2 = this.p.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.k.hashCode();
        int hashCode5 = this.d.hashCode();
        int hashCode6 = this.i.hashCode();
        int hashCode7 = this.s.hashCode();
        PlayContext playContext = this.n;
        int hashCode8 = playContext == null ? 0 : playContext.hashCode();
        int hashCode9 = this.e.hashCode();
        int hashCode10 = this.t.hashCode();
        int hashCode11 = Boolean.hashCode(this.r);
        PreferredLanguageData preferredLanguageData = this.m;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (preferredLanguageData != null ? preferredLanguageData.hashCode() : 0)) * 31) + this.f13622o.hashCode();
    }

    public final InterfaceC4342bch i() {
        return this.j;
    }

    public final InterfaceC4793bmb j() {
        return this.f;
    }

    public final PriorityTaskManager k() {
        return this.l;
    }

    public final PreferredLanguageData l() {
        return this.m;
    }

    public final InterfaceC4942bpR m() {
        return this.k;
    }

    public final InterfaceC4607bhh n() {
        return this.t;
    }

    public final InterfaceC4856bnl o() {
        return this.f13622o;
    }

    public final Looper p() {
        return this.s;
    }

    public final boolean q() {
        return this.r;
    }

    public final UserAgent r() {
        return this.p;
    }

    public String toString() {
        C4606bhg c4606bhg = this.g;
        UserAgent userAgent = this.p;
        aOV aov = this.c;
        InterfaceC4942bpR interfaceC4942bpR = this.k;
        IClientLogging iClientLogging = this.d;
        Handler handler = this.i;
        Looper looper = this.s;
        PlayContext playContext = this.n;
        PlaybackExperience playbackExperience = this.e;
        InterfaceC4607bhh interfaceC4607bhh = this.t;
        boolean z = this.r;
        PreferredLanguageData preferredLanguageData = this.m;
        InterfaceC4856bnl interfaceC4856bnl = this.f13622o;
        return "GenericSessionParams(factoryParams=" + c4606bhg + ", userAgent=" + userAgent + ", configuration=" + aov + ", resourceFetcher=" + interfaceC4942bpR + ", clientLogging=" + iClientLogging + ", mainHandler=" + handler + ", workLooper=" + looper + ", playContext=" + playContext + ", experience=" + playbackExperience + ", streamingBitRateAdjuster=" + interfaceC4607bhh + ", streamingForced=" + z + ", preferredLanguage=" + preferredLanguageData + ", playbackEventSender=" + interfaceC4856bnl + ")";
    }

    public C4875boD(C4606bhg c4606bhg, UserAgent userAgent, aOV aov, InterfaceC4942bpR interfaceC4942bpR, IClientLogging iClientLogging, Handler handler, Looper looper, PlayContext playContext, PlaybackExperience playbackExperience, InterfaceC4607bhh interfaceC4607bhh, boolean z, PreferredLanguageData preferredLanguageData, InterfaceC4856bnl interfaceC4856bnl) {
        C8632dsu.c((Object) c4606bhg, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) interfaceC4942bpR, "");
        C8632dsu.c((Object) iClientLogging, "");
        C8632dsu.c((Object) handler, "");
        C8632dsu.c((Object) looper, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) interfaceC4607bhh, "");
        C8632dsu.c((Object) interfaceC4856bnl, "");
        this.g = c4606bhg;
        this.p = userAgent;
        this.c = aov;
        this.k = interfaceC4942bpR;
        this.d = iClientLogging;
        this.i = handler;
        this.s = looper;
        this.n = playContext;
        this.e = playbackExperience;
        this.t = interfaceC4607bhh;
        this.r = z;
        this.m = preferredLanguageData;
        this.f13622o = interfaceC4856bnl;
        this.j = c4606bhg.h();
        this.l = c4606bhg.g();
        this.f = c4606bhg.f();
        this.h = c4606bhg.a();
        this.b = c4606bhg.d();
        this.a = c4606bhg.e();
    }
}
