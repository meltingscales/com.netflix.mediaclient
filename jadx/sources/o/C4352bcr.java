package o;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import com.netflix.mediaclient.media.PlayerManifestData;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import o.C5208buS;
import o.C5273bve;
import o.InterfaceC4348bcn;
import o.InterfaceC4360bcz;

/* renamed from: o.bcr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4352bcr {
    public static final b b = new b(null);
    private final C4390bdc a;
    private Pair<Long, Long> c;
    private final InterfaceC4348bcn.d d;
    private final aOV e;
    private final IClientLogging f;
    private final Handler g;
    private boolean h;
    private InterfaceC4348bcn i;
    private final Context j;
    private InterfaceC4346bcl k;
    private final UserAgent l;
    private final C4359bcy m;
    private HandlerThread n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC4942bpR f13567o;
    private final InterfaceC4607bhh q;
    private final InterfaceC4708bjc t;

    private final void g() {
    }

    private final void h() {
    }

    public final InterfaceC4776bmK c() {
        return this.m;
    }

    public C4352bcr(Context context, aOV aov, UserAgent userAgent, InterfaceC4942bpR interfaceC4942bpR, IClientLogging iClientLogging, C4390bdc c4390bdc) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) interfaceC4942bpR, "");
        C8632dsu.c((Object) iClientLogging, "");
        C8632dsu.c((Object) c4390bdc, "");
        this.j = context;
        this.e = aov;
        this.l = userAgent;
        this.f13567o = interfaceC4942bpR;
        this.f = iClientLogging;
        this.a = c4390bdc;
        this.m = new C4359bcy();
        this.g = new Handler();
        this.q = new C4915bor(context, aov);
        this.t = new InterfaceC4708bjc() { // from class: o.bct
            @Override // o.InterfaceC4708bjc
            public final InterfaceC4423beI c() {
                InterfaceC4423beI a2;
                a2 = C4352bcr.a(C4352bcr.this);
                return a2;
            }
        };
        this.d = new a();
    }

    public final void e(InterfaceC4346bcl interfaceC4346bcl, InterfaceC4348bcn interfaceC4348bcn, HandlerThread handlerThread) {
        C8632dsu.c((Object) interfaceC4346bcl, "");
        C8632dsu.c((Object) handlerThread, "");
        this.n = handlerThread;
        this.k = interfaceC4346bcl;
        this.c = new Pair<>(C8127deX.b(), C8127deX.a());
        this.i = interfaceC4348bcn;
        g();
        InterfaceC4348bcn interfaceC4348bcn2 = this.i;
        C8632dsu.d(interfaceC4348bcn2);
        interfaceC4348bcn2.c(this.d);
        this.h = true;
    }

    public final void a() {
        this.h = false;
        InterfaceC4348bcn interfaceC4348bcn = this.i;
        if (interfaceC4348bcn != null) {
            C8632dsu.d(interfaceC4348bcn);
            interfaceC4348bcn.c(null);
        }
        h();
    }

    public final InterfaceC5085bsB c(long j, InterfaceC5097bsN interfaceC5097bsN, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, long j2, PlayContext playContext, long j3, boolean z, boolean z2, String str, PreferredLanguageData preferredLanguageData) {
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) playContext, "");
        C1044Mm.a("nf_playbackSessionMgr", "openPlaybackSessionAndPlay %d", Long.valueOf(j2));
        if (this.h) {
            StringBuilder sb = new StringBuilder();
            sb.append(j2);
            String sb2 = sb.toString();
            C5208buS a2 = new C5208buS.b(sb2).a(sb2, new C5273bve.b(j2).d()).d(sb2).a();
            PlaylistTimestamp playlistTimestamp = new PlaylistTimestamp(sb2, sb2, j3);
            C8632dsu.d(a2);
            return d(j, interfaceC5097bsN, abstractC5100bsQ, playbackExperience, a2, playContext, playlistTimestamp, z, z2, str, preferredLanguageData);
        }
        return null;
    }

    public final InterfaceC5085bsB a(long j, InterfaceC5097bsN interfaceC5097bsN, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, long j2, PlayContext playContext, PlaylistTimestamp playlistTimestamp, boolean z, boolean z2, String str, PreferredLanguageData preferredLanguageData) {
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) playContext, "");
        if (!ConnectivityUtils.l(this.j)) {
            C1044Mm.a("nf_playbackSessionMgr", "openPlaybackSessionAndPlay no network %d", Long.valueOf(j2));
            C4351bcq.a(this.j, interfaceC5097bsN);
            return null;
        }
        C1044Mm.a("nf_playbackSessionMgr", "openBranchedPlaybackSessionAndPlay %d", Long.valueOf(j2));
        if (!playbackExperience.f()) {
            this.m.b();
        }
        InterfaceC4346bcl interfaceC4346bcl = this.k;
        C8632dsu.d(interfaceC4346bcl);
        UserAgent userAgent = this.l;
        aOV aov = this.e;
        InterfaceC4942bpR interfaceC4942bpR = this.f13567o;
        IClientLogging iClientLogging = this.f;
        Handler handler = this.g;
        HandlerThread handlerThread = this.n;
        C8632dsu.d(handlerThread);
        InterfaceC5085bsB a2 = interfaceC4346bcl.a(interfaceC5097bsN, userAgent, aov, interfaceC4942bpR, iClientLogging, handler, handlerThread.getLooper(), j2, playContext, playlistTimestamp, this.c, this.q, playbackExperience, this.t, z, j, z2, str, preferredLanguageData);
        C8632dsu.d(a2);
        a2.d(new e(this, abstractC5100bsQ, playbackExperience, a2));
        this.m.d(abstractC5100bsQ, playbackExperience, a2);
        return a2;
    }

    public final InterfaceC5085bsB d(long j, InterfaceC5097bsN interfaceC5097bsN, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, PlaylistMap<?> playlistMap, PlayContext playContext, PlaylistTimestamp playlistTimestamp, boolean z, boolean z2, String str, PreferredLanguageData preferredLanguageData) {
        C8632dsu.c((Object) abstractC5100bsQ, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) playlistMap, "");
        C8632dsu.c((Object) playContext, "");
        C1044Mm.a("nf_playbackSessionMgr", "openPlaylistPlaybackSessionAndPlay %s", playlistMap);
        String b2 = playlistMap.b();
        C8632dsu.a(b2, "");
        C4882boK b3 = b(abstractC5100bsQ, b2);
        if (b3 == null) {
            C1044Mm.a("nf_playbackSessionMgr", "openPlaylistPlaybackSessionAndPlay creating new session %s", playlistMap);
            if (!playbackExperience.f()) {
                this.m.b();
            } else if (!C4350bcp.d()) {
                C1044Mm.d("nf_playbackSessionMgr", "openPlaylistPlaybackSessionAndPlay max sessions reached.");
                return null;
            }
            InterfaceC4346bcl interfaceC4346bcl = this.k;
            C8632dsu.d(interfaceC4346bcl);
            UserAgent userAgent = this.l;
            aOV aov = this.e;
            InterfaceC4942bpR interfaceC4942bpR = this.f13567o;
            IClientLogging iClientLogging = this.f;
            Handler handler = this.g;
            HandlerThread handlerThread = this.n;
            C8632dsu.d(handlerThread);
            InterfaceC5085bsB c = interfaceC4346bcl.c(userAgent, aov, interfaceC4942bpR, iClientLogging, handler, handlerThread.getLooper(), playlistMap, playContext, playlistTimestamp, this.c, this.q, playbackExperience, this.t, z, j, z2, str, preferredLanguageData);
            C8632dsu.a(c, "");
            c.d(interfaceC5097bsN);
            c.d(new e(this, abstractC5100bsQ, playbackExperience, c));
            InterfaceC4348bcn interfaceC4348bcn = this.i;
            C8632dsu.d(interfaceC4348bcn);
            c.d(interfaceC4348bcn.f());
            this.m.d(abstractC5100bsQ, playbackExperience, c);
            return c;
        }
        C1044Mm.a("nf_playbackSessionMgr", "openPlaylistPlaybackSessionAndPlay re-using the session %s", playlistMap);
        b3.a(interfaceC5097bsN);
        b3.d(playlistMap, playlistTimestamp, playContext, z, j, str);
        return b3;
    }

    public final void f() {
        InterfaceC5085bsB c = C4350bcp.c();
        if (c != null) {
            c.r();
            if (C1613aHu.g(this.j) || !C4618bhs.a.d().bH()) {
                this.q.d(c, c.p());
            }
        }
    }

    public final AbstractC5100bsQ e() {
        d dVar = new d();
        this.m.b(dVar);
        return dVar;
    }

    public final void b(AbstractC5100bsQ abstractC5100bsQ) {
        C8632dsu.c((Object) abstractC5100bsQ, "");
        this.m.e(abstractC5100bsQ);
    }

    public final InterfaceC5085bsB d() {
        return C4350bcp.c();
    }

    public final InterfaceC4360bcz.e b() {
        return C4350bcp.e();
    }

    public final InterfaceC5085bsB e(C4355bcu c4355bcu) {
        C8632dsu.c((Object) c4355bcu, "");
        AbstractC5100bsQ f = c4355bcu.f();
        String b2 = c4355bcu.e().b();
        C8632dsu.a(b2, "");
        InterfaceC5085bsB b3 = b(f, b2);
        if (b3 == null) {
            if (!c4355bcu.a().f()) {
                this.m.b();
            } else if (!C4350bcp.b(3)) {
                C1044Mm.d("nf_playbackSessionMgr", "createPlaybackSession2 max sessions reached.");
                return null;
            }
            InterfaceC4346bcl interfaceC4346bcl = this.k;
            C8632dsu.d(interfaceC4346bcl);
            UserAgent userAgent = this.l;
            aOV aov = this.e;
            InterfaceC4942bpR interfaceC4942bpR = this.f13567o;
            IClientLogging iClientLogging = this.f;
            Handler handler = this.g;
            HandlerThread handlerThread = this.n;
            C8632dsu.d(handlerThread);
            b3 = interfaceC4346bcl.c(userAgent, aov, interfaceC4942bpR, iClientLogging, handler, handlerThread.getLooper(), c4355bcu.e(), c4355bcu.d(), c4355bcu.c(), this.c, this.q, c4355bcu.a(), this.t, false, c4355bcu.j(), c4355bcu.g(), c4355bcu.b(), c4355bcu.i());
            b3.d(new e(this, c4355bcu.f(), c4355bcu.a(), b3));
            InterfaceC4348bcn interfaceC4348bcn = this.i;
            C8632dsu.d(interfaceC4348bcn);
            b3.d(interfaceC4348bcn.f());
            this.m.d(c4355bcu.f(), c4355bcu.a(), b3);
        } else {
            String b4 = c4355bcu.e().b();
            C1044Mm.a("nf_playbackSessionMgr", "createPlaybackSession2 re-using the session " + b4);
        }
        C1044Mm.a("nf_playbackSessionMgr", "createPlaybackSession2 success");
        return b3;
    }

    private final C4882boK b(AbstractC5100bsQ abstractC5100bsQ, String str) {
        C4882boK e2 = this.m.e(abstractC5100bsQ, str);
        if (e2 == null || e2.b()) {
            return e2;
        }
        C1044Mm.c("nf_playbackSessionMgr", "cannot re-use session %s", e2.c());
        this.m.c(abstractC5100bsQ, e2);
        e2.d();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bcr$e */
    /* loaded from: classes3.dex */
    public final class e implements InterfaceC5097bsN {
        private final AbstractC5100bsQ a;
        private final PlaybackExperience b;
        final /* synthetic */ C4352bcr c;
        private final InterfaceC5085bsB e;

        @Override // o.InterfaceC5097bsN
        public void a(PlayerManifestData playerManifestData) {
            C8632dsu.c((Object) playerManifestData, "");
        }

        @Override // o.InterfaceC5097bsN
        public boolean b() {
            return true;
        }

        @Override // o.InterfaceC5097bsN
        public void c() {
        }

        @Override // o.InterfaceC5097bsN
        public void d() {
        }

        @Override // o.InterfaceC5097bsN
        public void d(long j) {
        }

        @Override // o.InterfaceC5097bsN
        public void i() {
        }

        public e(C4352bcr c4352bcr, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, InterfaceC5085bsB interfaceC5085bsB) {
            C8632dsu.c((Object) abstractC5100bsQ, "");
            C8632dsu.c((Object) playbackExperience, "");
            C8632dsu.c((Object) interfaceC5085bsB, "");
            this.c = c4352bcr;
            this.a = abstractC5100bsQ;
            this.b = playbackExperience;
            this.e = interfaceC5085bsB;
        }

        @Override // o.InterfaceC5097bsN
        public void d(IPlayer.c cVar) {
            C8632dsu.c((Object) cVar, "");
            String a = cVar.a();
            long k = this.e.k();
            C1044Mm.a("nf_playbackSessionMgr", "onPlaybackError message=" + a + " mid=" + k);
            if (!this.e.x()) {
                this.e.d();
            }
            this.c.m.c(this.a, this.e);
        }

        @Override // o.InterfaceC5097bsN
        public void a() {
            C1044Mm.a("nf_playbackSessionMgr", "onPlaybackClosed");
            if (this.b.f()) {
                long k = this.e.k();
                C1044Mm.a("nf_playbackSessionMgr", "onPlaybackClosed removeSession " + k);
                this.c.m.c(this.a, this.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4423beI a(C4352bcr c4352bcr) {
        C8632dsu.c((Object) c4352bcr, "");
        return new C4425beK(c4352bcr.j, c4352bcr.g, c4352bcr.a, c4352bcr.i, c4352bcr.f.g(), c4352bcr.e.w());
    }

    /* renamed from: o.bcr$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC4348bcn.d {
        a() {
        }

        @Override // o.InterfaceC4348bcn.d
        public void d() {
            C4352bcr.this.m.a();
        }

        @Override // o.InterfaceC4348bcn.d
        public void b() {
            C4352bcr.this.m.d();
        }
    }

    /* renamed from: o.bcr$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC5100bsQ {
        @Override // o.AbstractC5100bsQ
        public void e() {
            InterfaceC4360bcz.b.a().a(this);
        }
    }

    /* renamed from: o.bcr$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
