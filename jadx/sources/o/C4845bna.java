package o;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import com.netflix.mediaclient.media.PlaybackMetadataImpl;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.CurrentNetworkInfo;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.DlReportJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.Event;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.ExitPipPlayJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlaybackAbortedJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.ResumePlayJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.StartPlayEventJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.StateChangedJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.SubtitleErrorJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.TransitionJson;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.LogAudioSinkType;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.StopReason;
import com.netflix.mediaclient.servicemgr.ExitPipAction;
import com.netflix.mediaclient.servicemgr.LiveEventState;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.LegacyBranchingBookmark;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import o.C4642biP;
import o.C4780bmO;
import o.C4781bmP;
import o.C4898boa;
import o.InterfaceC4610bhk;
import o.InterfaceC4660bih;
import o.InterfaceC4776bmK;
import o.InterfaceC4834bnP;

/* renamed from: o.bna  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4845bna implements C4898boa.d, PlayerStateMachine.b, InterfaceC4834bnP.a, C4781bmP.d {
    private static final long a;
    private static final long b;
    private static final long c;
    public static final long d;
    private static final long h;
    private CurrentNetworkInfo C;
    private boolean F;
    private DlReportJson G;
    private final PlaybackMetadataImpl I;
    private String K;
    private InterfaceC4665bim L;
    private EndPlayJson M;
    private ExoPlayer N;
    private C4849bne O;
    private C4585bhL P;
    private String Q;
    private C4974bpx R;
    private boolean T;
    private String U;
    private InterfaceC4662bij V;
    private final InterfaceC4856bnl X;
    private int Y;
    private String Z;
    private long aC;
    private C4832bnN aD;
    private boolean aE;
    private final long aa;
    private final PlayerStateMachine ab;
    private String ac;
    private final String ad;
    private C4854bnj ae;
    private C4592bhS af;
    private String ag;
    private final C4859bno ah;
    private C4589bhP ai;
    private InterfaceC4661bii ak;
    private C4829bnK al;
    private long an;
    private final C4839bnU ao;
    private C4826bnH ar;
    private final String as;
    private volatile String at;
    private final Handler au;
    private InterfaceC4525bgE aw;
    private InterfaceC4776bmK.e ax;
    private final long ay;
    private final InterfaceC4776bmK f;
    private InterfaceC4657bie g;
    private final TU j;
    private LiveEventState n;
    private C4780bmO q;
    private C4777bmL r;
    private IAsePlayerState t;
    private final Context v;
    private InterfaceC4734bkH w;
    private final C4343bci y;
    private LongSparseArray<String> s = new LongSparseArray<>();
    private C4831bnM am = new C4831bnM();
    private C4831bnM u = new C4831bnM();
    private Map<String, Event> aj = new HashMap();

    /* renamed from: J  reason: collision with root package name */
    private List<Long> f13620J = new ArrayList();
    private final SparseArray<InterfaceC4660bih.e> D = new SparseArray<>();
    private final SparseArray<InterfaceC4660bih.l> z = new SparseArray<>();
    private final SparseArray<InterfaceC4610bhk.b> B = new SparseArray<>();
    private final SparseArray<C4831bnM> A = new SparseArray<>();
    private final Map<String, TransitionJson> aq = new HashMap();
    private C4831bnM ap = new C4831bnM();
    private boolean E = false;
    private boolean m = false;
    private boolean l = false;
    private final Object aG = new Object();
    private int av = 0;
    private final List<Long> x = new CopyOnWriteArrayList();
    private long k = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    private long f13621o = -9223372036854775807L;
    private boolean aA = false;
    private long az = -1;
    private long aB = -1;
    private boolean i = false;
    long e = -9223372036854775807L;
    private final Runnable W = new Runnable() { // from class: o.bna.4
        @Override // java.lang.Runnable
        public void run() {
            if (C4845bna.this.F) {
                C4845bna.this.au.removeCallbacks(C4845bna.this.W);
                return;
            }
            Timeline.Window c2 = C4845bna.this.ab.c();
            if (C4845bna.this.O != null && c2 != null) {
                synchronized (C4845bna.this.O) {
                    C4845bna.this.O.e(c2.getCurrentUnixTimeMs(), c2.windowStartTimeMs + C4845bna.this.N.getCurrentPosition(), C4845bna.this.t.a(1), C4845bna.this.t.a(2));
                }
            }
            C4845bna.this.au.postDelayed(C4845bna.this.W, C4845bna.this.ae.d);
        }
    };
    private final Runnable S = new Runnable() { // from class: o.bna.5
        @Override // java.lang.Runnable
        public void run() {
            if (C4845bna.this.F) {
                C4845bna.this.au.removeCallbacks(C4845bna.this.S);
                return;
            }
            if (C4845bna.this.O != null) {
                synchronized (C4845bna.this.O) {
                    if (!C4845bna.this.O.c()) {
                        C4845bna.this.O.a(C4845bna.this.am.c()).d((InterfaceC4610bhk.b) C4845bna.this.B.get(2)).c((InterfaceC4610bhk.b) C4845bna.this.B.get(1)).d(C4845bna.this.p(), C4845bna.this.q());
                        C4845bna c4845bna = C4845bna.this;
                        c4845bna.a(c4845bna.O);
                        C4845bna.this.O.a();
                    }
                }
            }
            C4845bna.this.au.postDelayed(C4845bna.this.S, C4845bna.this.ae.a);
        }
    };
    private final Runnable H = new Runnable() { // from class: o.bna.2
        @Override // java.lang.Runnable
        public void run() {
            if (C4845bna.this.F) {
                C4845bna.this.au.removeCallbacks(C4845bna.this.H);
                return;
            }
            if (C4845bna.this.G != null) {
                synchronized (C4845bna.this.G) {
                    if (!C4845bna.this.G.c()) {
                        C4845bna c4845bna = C4845bna.this;
                        c4845bna.a(c4845bna.G);
                        C4845bna.this.G.a();
                    }
                }
            }
            C4845bna.this.au.postDelayed(C4845bna.this.H, C4845bna.b);
        }
    };
    private final Runnable p = new Runnable() { // from class: o.bna.3
        @Override // java.lang.Runnable
        public void run() {
            if (C4845bna.this.F) {
                C4845bna.this.au.removeCallbacks(C4845bna.this.p);
                return;
            }
            synchronized (C4845bna.this.r) {
                if (!C4845bna.this.r.c()) {
                    C4845bna c4845bna = C4845bna.this;
                    c4845bna.a(c4845bna.r);
                    C4845bna.this.r.a();
                }
            }
            C4845bna.this.au.postDelayed(C4845bna.this.p, C4845bna.b);
        }
    };

    public void a(C4585bhL c4585bhL) {
        this.P = c4585bhL;
    }

    public void a(C4592bhS c4592bhS) {
        this.af = c4592bhS;
    }

    public void a(InterfaceC4657bie interfaceC4657bie) {
        this.g = interfaceC4657bie;
    }

    public void a(InterfaceC4661bii interfaceC4661bii) {
        this.ak = interfaceC4661bii;
    }

    public void a(InterfaceC4734bkH interfaceC4734bkH) {
        this.w = interfaceC4734bkH;
    }

    public void b(InterfaceC4665bim interfaceC4665bim) {
        this.L = interfaceC4665bim;
    }

    public boolean b() {
        return this.E;
    }

    public String c() {
        return this.as;
    }

    public void c(IAsePlayerState iAsePlayerState) {
        this.t = iAsePlayerState;
    }

    public void c(String str) {
        this.at = str;
    }

    public void c(C4589bhP c4589bhP) {
        this.ai = c4589bhP;
    }

    public void c(InterfaceC4662bij interfaceC4662bij) {
        this.V = interfaceC4662bij;
    }

    public void d(long j) {
        this.aC = j;
    }

    public void e(LiveEventState liveEventState) {
        this.n = liveEventState;
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c = timeUnit.toMillis(4L);
        b = timeUnit.toMillis(2L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        a = timeUnit2.toMillis(10L);
        h = timeUnit2.toMillis(2L);
        d = timeUnit2.toMillis(2L);
    }

    public C4845bna(Context context, Handler handler, InterfaceC4856bnl interfaceC4856bnl, PlaybackMetadataImpl playbackMetadataImpl, String str, String str2, long j, String str3, C4859bno c4859bno, TU tu, InterfaceC4776bmK interfaceC4776bmK, long j2) {
        this.v = context;
        this.X = interfaceC4856bnl;
        this.ad = str;
        this.as = str2;
        this.aa = j;
        this.I = playbackMetadataImpl;
        C4343bci d2 = C4343bci.d(context);
        this.y = d2;
        C4869bny.a.d(context, d2);
        this.au = handler;
        PlayerStateMachine playerStateMachine = new PlayerStateMachine(handler, j);
        this.ab = playerStateMachine;
        playerStateMachine.d(this);
        this.al = new C4829bnK(str, str2, this.Z, this.K, this.ac, j2);
        this.M = new EndPlayJson("endplay", str, str2, this.Z, this.K, this.ac, j2);
        this.r = new C4777bmL(str, str2, this.Z, this.K, this.ac);
        this.at = str3;
        this.ah = c4859bno;
        this.ao = c4859bno.a(j, this);
        this.Q = "";
        this.ae = C4618bhs.a.a();
        this.Y = (int) (PlaybackParameters.DEFAULT.speed * 1000.0f);
        this.j = tu;
        this.f = interfaceC4776bmK;
        this.ay = j2;
    }

    public void e(ExoPlayer exoPlayer) {
        this.N = exoPlayer;
        this.ab.d(exoPlayer);
    }

    public void d(C4854bnj c4854bnj) {
        this.ae = c4854bnj;
        y();
    }

    public void b(boolean z) {
        this.M.b(z);
    }

    public void c(InterfaceC4660bih.e eVar, long j) {
        if (j != 0) {
            long j2 = this.aa;
            if (j != j2) {
                C1044Mm.d("nf_playreport", "Skip onCDNSwitch because event is a playlist prefetch. Current reporting viewableId = (%s), reported  = (%s)", Long.valueOf(j2), Long.valueOf(j));
                return;
            }
        }
        if (eVar.m == -1) {
            C1044Mm.b("nf_playreport", "Skip onCDNSwitch because reading from local file");
            return;
        }
        C1044Mm.d("nf_playreport", "onCDNSwitch(%s)", eVar);
        if (this.D.get(eVar.f13604o) == null && eVar.f13604o == 2) {
            this.al.a(eVar);
        }
        a(new C4787bmV(this.ad, this.as, this.Z, this.K, this.ac).a(this.am.c()).e(this.D.get(eVar.f13604o)).a(eVar));
        this.D.put(eVar.f13604o, eVar);
        if (!this.m && this.D.get(2) != null) {
            a(Event.d("initialVideoCDNSelectionDone", Event.Component.BUFFERING));
            this.m = true;
        }
        if (this.l || this.D.get(1) == null) {
            return;
        }
        a(Event.d("initialAudioCDNSelectionDone", Event.Component.BUFFERING));
        this.l = true;
    }

    public void e(int i, InterfaceC4660bih.l lVar) {
        if (i != 2 && i != 1) {
            C1044Mm.e("nf_playreport", "onTrackSelection(%s) - logging of track type not supported!", Integer.valueOf(i));
            return;
        }
        InterfaceC4660bih.l lVar2 = this.z.get(i);
        if (lVar2 != null && lVar != null && !lVar.j && lVar2.j) {
            C1044Mm.a("nf_playreport", "post cache bitrate %s, last cache bitrate %s", Integer.valueOf(lVar.e.bitrate / 1000), Integer.valueOf(lVar2.e.bitrate / 1000));
            d(i, lVar.e, lVar2.e, lVar.d);
        }
        if (this.z.get(i) == null) {
            this.al.d(i, lVar.e);
        } else if (this.z.get(i).e != lVar.e) {
            a(new C4785bmT(i, this.ad, this.as, this.Z, this.K, this.ac).d$528f036b(lVar.b$728c57fe).a(this.am.c()).c(this.z.get(i).e).d(lVar.e).a(lVar.i, (PlaylistTimestamp) null).a(lVar.g).e(n(), this.t));
        }
        this.z.put(i, lVar);
        if (this.ae.c()) {
            IAsePlayerState iAsePlayerState = this.t;
            long b2 = iAsePlayerState != null ? iAsePlayerState.b(i) : 0L;
            PlayerStateMachine.State b3 = this.ab.b();
            synchronized (this.r) {
                if (this.r.b(i, lVar.c, lVar.j)) {
                    a(this.r);
                    this.r.a();
                }
                this.r.a(i, b3, lVar.c, this.am.c(), lVar.f, lVar.i, lVar.d, b2, lVar.g, lVar.h, this.w.d(), lVar.m, lVar.j);
            }
        }
    }

    public void j() {
        a(Event.d);
    }

    public void d(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        int i = this.av;
        this.av = i + 1;
        if (i < 3) {
            a(new SubtitleErrorJson(this.ad, this.as, this.Z, this.K, this.ac).c(mediaLoadData.trackFormat).a(loadEventInfo.uri));
        }
    }

    public void d(String str, long j, long j2, String str2, long j3) {
        this.Q = str;
        a(Event.e);
        if (this.i) {
            return;
        }
        this.al.d(this.am.c(), j, j2, str2, j3);
        this.i = true;
    }

    public void c(long j, long j2, String str, long j3) {
        if (this.i) {
            return;
        }
        if (this.e == -9223372036854775807L) {
            this.e = SystemClock.elapsedRealtime();
        } else if (SystemClock.elapsedRealtime() - this.e > 1000) {
            this.al.e(this.am.c(), j, j2, str, j3);
            this.e = SystemClock.elapsedRealtime();
        }
    }

    public void e() {
        a(Event.d("pauseBuffering", Event.Component.BUFFERING));
    }

    public void c(long j, long j2, long j3, long j4) {
        this.M.b(j, j2, j3, j4);
    }

    public void a(InterfaceC4660bih.h hVar, long j) {
        if (j == 0 || j == this.aa) {
            if (TextUtils.equals(hVar.j, Integer.toString(-1))) {
                C1044Mm.b("nf_playreport", "Skip onServerSelection because reading from local file");
                return;
            }
            C4830bnL b2 = new C4830bnL(this.ad, this.as, this.Z, this.K, this.ac).d(this.am.c()).b(hVar);
            a(b2);
            C1044Mm.d("nf_playreport", "onServerSelection(%s)", b2.toString());
        }
    }

    public void c(InterfaceC4660bih.a aVar) {
        C4790bmY c2 = new C4790bmY().b(this.am.c()).c(aVar);
        this.M.b(c2);
        C1044Mm.b("nf_playreport", c2.toString());
    }

    public void b(InterfaceC4660bih.j jVar) {
        C4822bnD c2 = new C4822bnD().c(this.am.c()).c(jVar);
        this.M.e(c2);
        C1044Mm.b("nf_playreport", c2.toString());
    }

    public void b(InterfaceC4660bih.f fVar) {
        C4825bnG e = new C4825bnG().c(this.am.c()).e(fVar);
        if (fVar.e) {
            this.M.e(e);
        } else {
            this.M.d(e);
        }
        C1044Mm.b("nf_playreport", e.toString());
    }

    public void d(String str, String str2, String str3, String str4) {
        if (str == null && str3 == null) {
            return;
        }
        a(new C4846bnb(this.ad, this.as, this.Z, this.K, this.ac).e(this.am.c()).a(p(), q()).b(str, str3).c(str2, str4));
    }

    public void b(long j) {
        this.k = j;
        this.f13621o = SystemClock.elapsedRealtime();
    }

    public void a(String str, long j, long j2) {
        C1044Mm.b("nf_playreport", "onTroughputEstimateProvided");
        synchronized (this.aG) {
            if (this.aD == null) {
                this.aD = new C4832bnN(this.ad, this.as, this.Z, this.K, Long.valueOf(this.am.b()), this.ac);
            }
            this.aD.c(str, j, j2);
            if (this.aD.f()) {
                a(this.aD);
                this.aD.c();
            }
        }
    }

    @Override // o.C4898boa.d
    public void e(String str, int i, int i2) {
        C1044Mm.d("nf_playreport", "onVolumeChanged(%s, %s)", Integer.valueOf(i), Integer.valueOf(i2));
        a(new C4843bnY(this.ad, this.as, this.Z, this.K, this.ac).a(this.am.c()).b(p(), q()).b(i2).d(i).b(str).e(n(), this.t));
    }

    public void c(long j, long j2) {
        C1044Mm.d("nf_playreport", "userPlay(%s, %s)", Long.valueOf(j), Long.valueOf(j2));
        if (this.aE) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - j2;
        if (j2 < 0 || j3 < 0 || j3 > c) {
            this.al.a();
            j2 = elapsedRealtime;
        }
        this.ap = new C4831bnM(j2);
        this.am = new C4831bnM(elapsedRealtime);
        this.al.d(j, q());
        a(Event.d("openSession", Event.Component.DEBUG));
        InterfaceC4525bgE interfaceC4525bgE = this.aw;
        if (interfaceC4525bgE != null) {
            d(interfaceC4525bgE.al(), this.aw.ah() == null ? null : this.aw.ah().name());
        }
        C4898boa.b(this.v).b(this);
        C4781bmP.c(this.v).c(this);
        this.G = new DlReportJson(this.ad, this.as, this.Z, this.K, this.am.c(), this.ac);
        InterfaceC4657bie interfaceC4657bie = this.g;
        if (interfaceC4657bie != null) {
            this.al.c(interfaceC4657bie.d());
            this.al.d(this.g.j());
            this.al.b(this.g.f());
        }
        this.aE = true;
    }

    public void c(long j) {
        this.aA = true;
        this.az = j;
        this.aB = d();
    }

    public void b(StopReason stopReason, long j) {
        C1044Mm.d("nf_playreport", "userStop(%s, %s)", stopReason, Long.valueOf(j));
        if (stopReason == StopReason.SEEK || stopReason == StopReason.SKIP || stopReason == StopReason.MISSING_SEGMENTS) {
            if (this.ab.b() == PlayerStateMachine.State.INITIALIZING) {
                C1044Mm.d("nf_playreport", "avoid repos when initializing");
                return;
            }
            C4592bhS c4592bhS = this.af;
            PlaylistMap H = c4592bhS == null ? null : c4592bhS.H();
            C4824bnF a2 = new C4824bnF(this.ad, this.as, this.Z, this.K, this.ac).d(this.am.c()).b(p(), q()).e(x()).a(j, H != null ? new LegacyBranchingBookmark(this.aa, j).b(H) : null);
            this.ag = stopReason == StopReason.MISSING_SEGMENTS ? "missing_segments" : "user";
            a2.a(this.ag);
            if (this.ab.f()) {
                a2.a(this.ab.e());
            }
            a(a2);
            this.ab.g();
            return;
        }
        this.M.b(EndPlayJson.EndReason.STOPPED);
    }

    public void d(C4614bho c4614bho, int i) {
        c("recovery");
        this.al.e(c4614bho.c(), i);
    }

    public void e(String str, final String str2, boolean z, List<C4973bpw> list, Long l, Long l2) {
        IPlaylistControl.SegmentTransitionType segmentTransitionType;
        C1044Mm.d("nf_playreport", "onTransitionRequested(%s, %s, %s prefetched branches)", str2, Boolean.valueOf(z), Integer.valueOf(list.size()));
        if (!this.aE) {
            C1044Mm.e("nf_playreport", "onTransitionRequested() - starting new timers for playback");
            c(this.al.c(), SystemClock.elapsedRealtime());
            Optional<C4973bpw> findAny = list.stream().filter(new Predicate() { // from class: o.bmZ
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean c2;
                    c2 = C4845bna.c(str2, (C4973bpw) obj);
                    return c2;
                }
            }).findAny();
            if (findAny.isPresent() && findAny.get().b > 2000) {
                this.al.c(true, findAny.get().d, findAny.get().b);
            }
            this.al.h(true);
        }
        if (this.ab.b() == PlayerStateMachine.State.INITIALIZING && this.as.equals(str)) {
            C1044Mm.a("nf_playreport", "playgraph transition requested during init");
            return;
        }
        TransitionJson e = new TransitionJson(this.ad, this.as, this.Z, this.K, this.ac).e(z);
        if (z) {
            segmentTransitionType = IPlaylistControl.SegmentTransitionType.SEAMLESS;
        } else {
            segmentTransitionType = IPlaylistControl.SegmentTransitionType.LONG;
        }
        this.aq.put(str2, e.d(segmentTransitionType).e(list, str2).d(str).e(l).a(l2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(String str, C4973bpw c4973bpw) {
        return c4973bpw.c.equals(str);
    }

    public void d(String str, long j, IPlaylistControl.SegmentTransitionType segmentTransitionType) {
        C1044Mm.d("nf_playreport", "onTransitionPerformed(%s, %s, %s)", str, Long.valueOf(j), segmentTransitionType);
        if (this.ab.b() == PlayerStateMachine.State.INITIALIZING && !this.aq.containsKey(str)) {
            C1044Mm.a("nf_playreport", "content playgraph transition performed during init");
            return;
        }
        F();
        this.ab.i();
        TransitionJson transitionJson = this.aq.get(str);
        if (transitionJson != null) {
            transitionJson.d(j).d(segmentTransitionType);
        }
        if (segmentTransitionType != IPlaylistControl.SegmentTransitionType.SEAMLESS) {
            this.ab.i();
        }
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine.b
    public void b(C4680bjA c4680bjA, long j, C4680bjA c4680bjA2) {
        C1044Mm.d("nf_playreport", "onSegmentTransitionStart(%s, %s)", c4680bjA, c4680bjA2);
        F();
        TransitionJson transitionJson = this.aq.get(c4680bjA2.e());
        if (transitionJson == null) {
            C1044Mm.a("nf_playreport", "detected transition without transition event - creating one ad-hoc");
            transitionJson = new TransitionJson(this.ad, this.as, this.Z, this.K, this.ac).d(IPlaylistControl.SegmentTransitionType.SEAMLESS);
            this.aq.put(c4680bjA2.e(), transitionJson);
        } else if (transitionJson.f()) {
            transitionJson.g();
        }
        transitionJson.c(c4680bjA).d(c4680bjA2).e(this.am.c()).e(p(), q()).e(n(), this.t).a(w());
        if (transitionJson.c() == null) {
            transitionJson.a(Long.valueOf(j));
        }
        if (transitionJson.a() == null) {
            transitionJson.d(j);
        }
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine.b
    public void a(C4680bjA c4680bjA, C4680bjA c4680bjA2, long j) {
        TransitionJson transitionJson;
        C1044Mm.d("nf_playreport", "onSegmentTransitionEnd(%s, %s, %s)", c4680bjA, c4680bjA2, Long.valueOf(j));
        F();
        if (c4680bjA2 != null) {
            transitionJson = this.aq.get(c4680bjA2.e());
            this.aq.remove(c4680bjA2.e());
        } else {
            transitionJson = null;
        }
        if (transitionJson != null) {
            if (j < 0) {
                j = this.am.c();
            }
            transitionJson.a(j);
            transitionJson.b(Boolean.valueOf(!this.x.isEmpty()));
            transitionJson.c(c4680bjA);
            transitionJson.d(c4680bjA2);
            a(transitionJson);
        }
    }

    private void F() {
        if (this.aE) {
            return;
        }
        C1044Mm.e("nf_playreport", "setStartplayFieldsOnTransitionIfNeeded() - starting new timers for playback");
        c(this.al.c(), SystemClock.elapsedRealtime());
        long n = n();
        if (n > 2000) {
            this.al.c(true, n, n);
        }
        this.al.h(true);
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine.b
    public void b(float f) {
        int i = this.Y;
        this.Y = (int) (f * 1000.0f);
        a(new C4828bnJ(this.ad, this.as, this.Z, this.K, this.aa, this.ac).d(i, this.Y).a(this.ai.a()).d(this.am.c()).d(p(), q()).e(n(), this.t));
    }

    public void a(boolean z, boolean z2, String str) {
        C1044Mm.d("nf_playreport", "onManifestUpdatedOnNetworkChange(%s, %s, %s)", Boolean.valueOf(z), Boolean.valueOf(z2), str);
        a(new C4850bnf(this.ad, this.as, this.Z, this.K, this.ac).e(this.am.c()).e(p(), q()).d(z).a(z2).b(str));
    }

    private void a(String str, String str2) {
        this.Z = str;
        this.K = str2;
        this.al.a(str, str2);
        this.M.a(str, str2);
    }

    private void z() {
        int i;
        int i2;
        C1044Mm.b("nf_playreport", "onPlaybackStarted()");
        this.y.e(true);
        C();
        A();
        ExoPlayer exoPlayer = this.N;
        PlaybackParameters playbackParameters = exoPlayer == null ? null : exoPlayer.getPlaybackParameters();
        if (playbackParameters == null || (i = (int) (playbackParameters.speed * 1000.0f)) == (i2 = this.Y)) {
            return;
        }
        this.Y = i;
        a(new C4828bnJ(this.ad, this.as, this.Z, this.K, this.aa, this.ac).d(i2, this.Y).a(this.ai.a()).d(this.am.c()).d(p(), q()).e(n(), this.t));
    }

    private void B() {
        C1044Mm.b("nf_playreport", "onPaused()");
        a(new StateChangedJson(this.ad, this.as, this.Z, this.K, this.ac).e(this.am.c()).e(p(), q()).d(x()).a(true));
    }

    private void a(boolean z) {
        Object[] objArr = new Object[1];
        objArr[0] = z ? "subtitle" : "media/network";
        C1044Mm.d("nf_playreport", "onRebuffering(%s)", objArr);
        a(new C4847bnc(this.ad, this.as, this.Z, this.K, this.ac).b(Long.valueOf(this.aa)).d(this.D.get(2)).d(p(), q()).d(this.am.c()).d(z).a(x()).a(this.aA, this.az, this.aB).e(n(), this.t));
    }

    private void e(PlayerStateMachine.State state) {
        C1044Mm.b("nf_playreport", "onPlaybackResumed()");
        if (state == PlayerStateMachine.State.PAUSED) {
            a(new StateChangedJson(this.ad, this.as, this.Z, this.K, this.ac).e(this.am.c()).e(p(), q()).d(x()).a(false));
            return;
        }
        if (state == PlayerStateMachine.State.AUDIO || state == PlayerStateMachine.State.TIMEDTEXT) {
            C4780bmO c4780bmO = this.q;
            if (c4780bmO != null) {
                c4780bmO.a(this.ab.e());
                a(this.q);
                this.q = null;
            }
        } else if (state != PlayerStateMachine.State.TRANSITIONING_SEGMENT) {
            ResumePlayJson resumePlayJson = new ResumePlayJson(this.ad, this.as, this.Z, this.K, this.ac);
            InterfaceC4734bkH interfaceC4734bkH = this.w;
            ResumePlayJson a2 = resumePlayJson.a(interfaceC4734bkH == null ? null : Long.valueOf(interfaceC4734bkH.getBitrateEstimate() / 1000));
            C4831bnM c4831bnM = this.u;
            ResumePlayJson e = a2.e(c4831bnM != null ? Long.valueOf(c4831bnM.c()) : null).c(Long.valueOf(this.ab.e())).a(this.D.get(2)).d(this.C).a(this.am.c()).e(p(), q());
            e.e(n(), this.t);
            int i = AnonymousClass1.b[this.ab.b().ordinal()];
            if (i == 1) {
                e.b(ResumePlayJson.Reason.REBUFFER);
                A();
            } else if (i == 2) {
                e.b(ResumePlayJson.Reason.REPOS);
                e.a(this.ag);
                A();
            } else if (i == 3) {
                e.b(ResumePlayJson.Reason.SKIP);
                A();
            }
            a(e);
        }
    }

    private void C() {
        if (this.L != null) {
            long msToUs = androidx.media3.common.C.msToUs(p());
            List<C4658bif> d2 = this.L.d(this.aa, androidx.media3.common.C.msToUs(this.al.c()));
            long j = 0;
            long j2 = 0;
            for (C4658bif c4658bif : d2) {
                if (c4658bif.b() == 1) {
                    j = Math.max(j, c4658bif.g() - msToUs);
                } else if (c4658bif.b() == 2) {
                    j2 = Math.max(j2, c4658bif.g() - msToUs);
                }
            }
            this.al.c(true ^ d2.isEmpty(), androidx.media3.common.C.usToMs(j), androidx.media3.common.C.usToMs(j2));
        }
        C4781bmP.e d3 = C4781bmP.c(this.v).d(null, null, this.aw);
        C4829bnK f = this.al.d(p(), q()).e(Long.valueOf(this.ap.c())).f(Long.valueOf(this.am.c()));
        InterfaceC4734bkH interfaceC4734bkH = this.w;
        C4829bnK d4 = f.d(interfaceC4734bkH == null ? null : Long.valueOf(interfaceC4734bkH.getBitrateEstimate() / 1000));
        C4831bnM c4831bnM = this.u;
        C4829bnK d5 = d4.c(c4831bnM == null ? null : Long.valueOf(c4831bnM.c())).d(this.am.c());
        ExoPlayer exoPlayer = this.N;
        C4829bnK d6 = d5.d(exoPlayer != null ? exoPlayer.getVideoFormat() : null);
        ExoPlayer exoPlayer2 = this.N;
        C4829bnK a2 = d6.e(exoPlayer2 != null ? exoPlayer2.getAudioFormat() : null).f(s()).a(t());
        InterfaceC4661bii interfaceC4661bii = this.ak;
        a2.a(interfaceC4661bii != null ? interfaceC4661bii.d() : null).h(this.at).d(w()).e(this.y).f(C4781bmP.c(this.v).a()).g(d3.c()).e(d3.d()).a(d3.a()).e(d3.e()).b(C4779bmN.b(this.v).b()).j(C4898boa.b(this.v).d()).b(C4898boa.b(this.v).a()).h(this.j.e()).a(this.aC).e(n(), this.t);
        synchronized (this.aj) {
            this.al.a(this.aj, this.am);
        }
        this.al.i();
        if (this.O != null) {
            this.au.postDelayed(this.W, 0L);
            this.au.postDelayed(this.S, this.ae.a);
        }
        a(this.al);
    }

    private String s() {
        Format b2 = this.ab.b(3);
        if (b2 != null) {
            return b2.id;
        }
        return null;
    }

    private long n() {
        ExoPlayer exoPlayer = this.N;
        if (exoPlayer == null) {
            return 0L;
        }
        return Math.max(0L, exoPlayer.getBufferedPosition() - this.N.getCurrentPosition());
    }

    private void A() {
        synchronized (this.aj) {
            if (this.aj.isEmpty()) {
                return;
            }
            StartPlayEventJson a2 = new StartPlayEventJson(this.ad, this.as, this.Z, this.K, this.ac).e(this.am.c()).b(this.aj, this.am).a(t());
            int i = AnonymousClass1.b[this.ab.b().ordinal()];
            if (i == 1) {
                a2.a(StartPlayEventJson.Reason.REBUFFER);
            } else if (i == 2) {
                a2.a(StartPlayEventJson.Reason.REPOS);
            } else if (i == 3) {
                a2.a(StartPlayEventJson.Reason.SKIP);
            } else if (i == 4) {
                a2.a(StartPlayEventJson.Reason.START);
            }
            a(a2);
            this.aj.clear();
        }
    }

    public void m() {
        synchronized (this) {
            C1044Mm.b("nf_playreport", "release()");
            if (this.F) {
                return;
            }
            this.F = true;
            this.au.removeCallbacksAndMessages(null);
            this.ab.h();
            C4898boa.b(this.v).d(this);
            C4781bmP.c(this.v).a(this);
            C4869bny.a.b(this.v, this.y);
            this.ah.d(this.aa);
        }
    }

    public void o() {
        C1044Mm.b("nf_playreport", "setUsedLDL(true)");
        this.al.f(true);
    }

    public void d(long j, String str) {
        C1044Mm.d("nf_playreport", "setManifestCacheHit(%s, %s)", Long.valueOf(j), str);
        this.al.c(Boolean.TRUE);
        this.al.a(Long.valueOf(j));
        this.al.d(str);
    }

    private void e(String str) {
        C1044Mm.d("nf_playreport", "setSubtitleProfile(%s)", str);
        this.al.i(str);
    }

    public void a(Event event) {
        C1044Mm.d("nf_playreport", "reportKeyStartplayEvent(%s)", event.n);
        c(event, this.am.b());
    }

    public void e(int i, long j) {
        if (this.ae.b() > 0 && i >= this.ae.b() && j <= this.ae.a()) {
            synchronized (this.f13620J) {
                if (this.f13620J.size() < 30) {
                    this.f13620J.add(Long.valueOf(this.am.c()));
                }
            }
        }
    }

    private void c(Event event, long j) {
        synchronized (this.aj) {
            if (!this.aj.containsKey(event.n)) {
                this.aj.put(event.n, event.e(j));
            }
        }
    }

    public void d(long j, InterfaceC4610bhk.b bVar) {
        if (this.B.get(bVar.b) != null && this.B.get(bVar.b).equals(bVar)) {
            C1044Mm.d("nf_playreport", "ignoring downstream format change - %s = %s", this.B.get(bVar.b), bVar);
            return;
        }
        if (this.B.get(bVar.b) != null) {
            C4821bnC b2 = new C4821bnC(bVar.b, this.ad, this.as, this.Z, this.K, this.ac).a(j, q()).d(this.am.c()).d(bVar.d, bVar.a / 1000).b(this.B.get(bVar.b).d, this.B.get(bVar.b).a / 1000);
            b2.e(n(), this.t);
            a(b2);
            b(bVar.b, this.M);
        }
        this.B.put(bVar.b, bVar);
        this.A.put(bVar.b, new C4831bnM());
    }

    public void g() {
        EndPlayJson d2 = new C4851bng(this.ad, this.as, this.Z, this.K, this.ac, this.ay).d(this.C).a(p(), q()).j(this.am.c()).a(this.R, this.ab.b(), this.ax).d(true);
        C4589bhP c4589bhP = this.ai;
        EndPlayJson d3 = d2.d(c4589bhP == null ? null : c4589bhP.a());
        C4589bhP c4589bhP2 = this.ai;
        EndPlayJson f = d3.f(c4589bhP2 == null ? null : c4589bhP2.c());
        C4589bhP c4589bhP3 = this.ai;
        EndPlayJson b2 = f.b(c4589bhP3 == null ? null : c4589bhP3.e());
        C4589bhP c4589bhP4 = this.ai;
        EndPlayJson h2 = b2.a(c4589bhP4 != null ? c4589bhP4.b() : null).c(this.aA, this.az).h(x());
        h2.ab = this.M.c();
        if (this.ab.b() != PlayerStateMachine.State.INITIALIZING) {
            for (int i = 0; i < this.B.size(); i++) {
                b(this.B.keyAt(i), h2);
            }
        }
        a(h2);
    }

    public void e(long j) {
        a(new C4786bmU(this.ad, this.as, this.Z, this.K, this.ac).d(this.am.c()).b(p(), q()));
    }

    public void e(ExitPipAction exitPipAction, long j) {
        ExitPipPlayJson b2 = new ExitPipPlayJson(this.ad, this.as, this.Z, this.K, this.ac).e(this.am.c()).b(p(), q());
        int i = AnonymousClass1.e[exitPipAction.ordinal()];
        if (i == 1) {
            b2.d(ExitPipPlayJson.ExitType.CONTINUEPLAY);
        } else if (i == 2) {
            b2.d(ExitPipPlayJson.ExitType.ENDSESSION);
        }
        a(b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bna$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ExitPipAction.values().length];
            e = iArr;
            try {
                iArr[ExitPipAction.CONTINUEPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[ExitPipAction.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PlayerStateMachine.State.values().length];
            b = iArr2;
            try {
                iArr2[PlayerStateMachine.State.REBUFFERING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[PlayerStateMachine.State.SEEKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[PlayerStateMachine.State.SKIPPING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[PlayerStateMachine.State.INITIALIZING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[PlayerStateMachine.State.AUDIO.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[PlayerStateMachine.State.PLAYING.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[PlayerStateMachine.State.PAUSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[PlayerStateMachine.State.TIMEDTEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private void b(int i, EndPlayJson endPlayJson) {
        if (this.D.get(i) != null && this.B.get(i) != null && this.A.get(i) != null) {
            endPlayJson.e(this.D.get(i).m, this.D.get(i).h, this.B.get(i), this.A.get(i).c());
        } else {
            C1044Mm.e("nf_playreport", "unable to add playable duration (null data): %s, %s, %s", this.D, this.B, this.A);
        }
    }

    public void f(long j) {
        C1044Mm.d("nf_playreport", "setTrackingId(%s)", Long.valueOf(j));
        this.al.e(j);
    }

    public void e(InterfaceC4525bgE interfaceC4525bgE) {
        if (this.aw == interfaceC4525bgE) {
            C1044Mm.c("nf_playreport", "ignoring duplicate setManifest()  %d", interfaceC4525bgE.aa());
            return;
        }
        C1044Mm.c("nf_playreport", "setManifest()  %d", interfaceC4525bgE.aa());
        if (interfaceC4525bgE.J() != null) {
            for (InterfaceC4525bgE interfaceC4525bgE2 : interfaceC4525bgE.J()) {
                if (interfaceC4525bgE2.av()) {
                    C1044Mm.d("nf_playreport", "setManifest() for %s, add secondary manifest.", interfaceC4525bgE2.aa());
                    this.al.a(interfaceC4525bgE2);
                    this.s.put(interfaceC4525bgE2.aa().longValue(), interfaceC4525bgE2.ac());
                }
            }
        }
        this.aw = interfaceC4525bgE;
        this.al.e(interfaceC4525bgE);
        this.M.i(interfaceC4525bgE.P());
        if (interfaceC4525bgE.ax() != null && interfaceC4525bgE.F() != null) {
            a(interfaceC4525bgE.ax(), interfaceC4525bgE.F());
        }
        String ac = interfaceC4525bgE.ac();
        this.ac = ac;
        this.al.e(ac);
        this.M.e(this.ac);
        DlReportJson dlReportJson = this.G;
        if (dlReportJson != null) {
            dlReportJson.e(this.ac);
        }
        C4777bmL c4777bmL = this.r;
        if (c4777bmL != null) {
            c4777bmL.e(this.ac);
        }
        for (TransitionJson transitionJson : this.aq.values()) {
            transitionJson.e(this.ac);
        }
        this.T = (interfaceC4525bgE.H() == null || interfaceC4525bgE.H().b() == null || interfaceC4525bgE.H().b().isEmpty()) ? false : true;
        l();
        if (interfaceC4525bgE.n() != null && !interfaceC4525bgE.n().o() && this.ae.h()) {
            this.O = new C4849bne(this.ad, this.as, this.Z, this.K, this.ac).d(this.ae.d);
        }
        if (interfaceC4525bgE.x() == null || interfaceC4525bgE.x().e() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : interfaceC4525bgE.x().e()) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append(str);
        }
        this.U = sb.toString();
    }

    public void l() {
        C1044Mm.b("nf_playreport", "updateNetworkInterfaceParams()");
        CurrentNetworkInfo d2 = CurrentNetworkInfo.d(this.v);
        if (this.C == null) {
            this.al.a(d2);
        }
        if (d2.equals(this.C)) {
            return;
        }
        a(new C4852bnh(this.ad, this.as, this.Z, this.K, this.ac).c(d2));
        this.C = d2;
        this.ao.e(this.am.c(), d2);
    }

    public void e(boolean z) {
        aHH ahh;
        C4974bpx c4974bpx;
        C1044Mm.d("nf_playreport", "playbackClosed(%b)", Boolean.valueOf(z));
        this.H.run();
        if (this.O != null) {
            this.S.run();
        }
        this.p.run();
        this.y.e(false);
        if (u()) {
            D();
        }
        PlayerStateMachine.State b2 = this.ab.b();
        PlayerStateMachine.State state = PlayerStateMachine.State.INITIALIZING;
        if (b2 == state && (c4974bpx = this.R) != null) {
            this.al.e(c4974bpx, this.ax);
            C();
        } else if (this.R == null && this.ab.b().a()) {
            if (this.aw == null) {
                l();
            }
            A();
            PlaybackAbortedJson a2 = new PlaybackAbortedJson(this.ad, this.as, this.Z, this.K, this.ac, this.ay).e(this.am.c()).b(p(), q()).b(t()).a(this.at).d(this.aC).a(this.ab.e());
            if (this.ab.b() == PlayerStateMachine.State.TRANSITIONING_SEGMENT) {
                a2.e(PlaybackAbortedJson.AbortedEvent.TRANSITION);
            } else if (this.ab.b() == state) {
                a2.e(PlaybackAbortedJson.AbortedEvent.STARTPLAY);
            } else {
                a2.e(PlaybackAbortedJson.AbortedEvent.RESUMEPLAY);
                int i = AnonymousClass1.b[this.ab.b().ordinal()];
                if (i == 1) {
                    a2.c(PlaybackAbortedJson.ResumePlayReason.REBUFFER);
                } else if (i == 2) {
                    a2.c(PlaybackAbortedJson.ResumePlayReason.REPOS);
                } else if (i == 3) {
                    a2.c(PlaybackAbortedJson.ResumePlayReason.SKIP);
                } else if (i == 5) {
                    a2.c(PlaybackAbortedJson.ResumePlayReason.AUDIO);
                }
            }
            a2.e(Boolean.valueOf(!this.x.isEmpty()));
            a(a2);
        }
        if (this.ab.b() != state) {
            if (this.ab.b() == PlayerStateMachine.State.PLAYING) {
                for (int i2 = 0; i2 < this.B.size(); i2++) {
                    b(this.B.keyAt(i2), this.M);
                }
            }
            double[] e = this.w.e(3);
            this.M.d(this.C).a(p(), q()).j(this.am.c()).a(this.R, this.ab.b(), this.ax).h(x()).b(t()).d(LogAudioSinkType.c(this.v)).h(C4969bps.a(this.v)).d(z).e(this.ao.f()).b(this.ao.b()).b(this.ao.a()).c(this.ao.d()).e(this.ao.c()).d(this.ao.j()).a(this.ao.b(this.am.c())).d(this.y).b(Double.valueOf(e[0])).d(Double.valueOf(e[1])).a(Double.valueOf(e[2])).g(this.at).a(w()).e(C1613aHu.b(this.v)).c(C1613aHu.e(this.v)).c(this.aA, this.az).g(this.aC).b(this.y);
            synchronized (this.f13620J) {
                this.M.c(this.f13620J);
            }
            if (this.ae.f()) {
                this.M.d(this.ab.d());
            }
            InterfaceC4662bij interfaceC4662bij = this.V;
            if (interfaceC4662bij != null) {
                this.M.b(interfaceC4662bij.d(this.aa));
            }
            synchronized (this.aG) {
                C4832bnN c4832bnN = this.aD;
                if (c4832bnN != null && c4832bnN.a()) {
                    a(this.aD);
                    this.aD.c();
                }
            }
            C4589bhP c4589bhP = this.ai;
            if (c4589bhP != null) {
                EndPlayJson d2 = this.M.d(c4589bhP == null ? null : c4589bhP.a());
                C4589bhP c4589bhP2 = this.ai;
                EndPlayJson f = d2.f(c4589bhP2 == null ? null : c4589bhP2.c());
                C4589bhP c4589bhP3 = this.ai;
                EndPlayJson b3 = f.b(c4589bhP3 == null ? null : c4589bhP3.e());
                C4589bhP c4589bhP4 = this.ai;
                b3.a(c4589bhP4 != null ? c4589bhP4.b() : null);
            }
            this.M.c(Boolean.valueOf(!this.x.isEmpty()));
            a(this.M);
            InterfaceC4853bni e2 = InterfaceC4853bni.c.e();
            if (e2 != null) {
                e2.e(this.M);
            }
        }
        if (this.ao != null && (ahh = (aHH) C1332Xp.b(aHH.class)) != null) {
            ahh.a(this.as, this.ao.h());
        }
        m();
    }

    public void d(List<C4970bpt> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a(new C4827bnI(this.ad, this.as, this.Z, this.K, this.ac).a(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long p() {
        PlaylistTimestamp l;
        ExoPlayer exoPlayer = this.N;
        if (exoPlayer != null) {
            if (this.af != null && !exoPlayer.isCurrentMediaItemDynamic() && (l = this.af.l()) != null) {
                return l.e(this.af.H());
            }
            return this.N.getCurrentPosition();
        }
        return this.al.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PlaylistTimestamp q() {
        C4592bhS c4592bhS = this.af;
        if (c4592bhS instanceof C4592bhS) {
            return c4592bhS.b();
        }
        if (c4592bhS != null) {
            return c4592bhS.l();
        }
        return null;
    }

    public void d(Format format, Format format2) {
        e(C4453bem.c(format));
        a(Event.i);
        if (format2 == null && u()) {
            D();
        }
        if (this.ab.b() != PlayerStateMachine.State.INITIALIZING) {
            a(format, format2);
        }
    }

    private boolean u() {
        C4826bnH c4826bnH = this.ar;
        return c4826bnH != null && !TextUtils.isEmpty(c4826bnH.c.a) && TextUtils.isEmpty(this.ar.e.a) && this.am.c() > this.ar.M.longValue() + d;
    }

    public void i() {
        a(Event.h);
        D();
    }

    public void c(Format format) {
        a((Format) null, format);
    }

    private void a(Format format, Format format2) {
        this.ar = new C4826bnH(this.ad, this.as, this.Z, this.K, this.ac).a(format2).e(format).a(this.am.c()).a(p(), q());
    }

    private void D() {
        C4826bnH c4826bnH = this.ar;
        if (c4826bnH != null) {
            long c2 = TextUtils.isEmpty(c4826bnH.e.a) ? 0L : this.am.c() - this.ar.M.longValue();
            this.ar.e(c2);
            C4826bnH c4826bnH2 = this.ar;
            C1044Mm.d("nf_playreport", "onTimedTextSwitchComplete(old=%s, new=%s, switchDelay=%d)", c4826bnH2.c.d, c4826bnH2.e.d, Long.valueOf(c2));
            a(this.ar);
            this.ar = null;
        }
    }

    private void v() {
        C1044Mm.d("nf_playreport", "onAudioSwitch(%s)", this.ab.b(1));
        this.q = new C4780bmO(this.ad, this.as, this.Z, this.K, this.ac).c(new C4780bmO.a(this.ab.e(1))).a(new C4780bmO.a(this.ab.b(1))).d(this.am.c()).e(p(), q());
    }

    private void y() {
        if (this.ae.d()) {
            this.ah.c(this.aa);
        }
        if (this.ae.g() || this.ae.d()) {
            this.au.postDelayed(this.H, b);
        }
        if (this.ae.c()) {
            this.au.postDelayed(this.p, b);
        }
        boolean d2 = this.ae.d();
        this.E = d2;
        this.al.b(d2).a(this.ae.c());
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine.b
    public void d(PlayerStateMachine.State state, PlayerStateMachine.State state2) {
        if (state2.a()) {
            this.u = new C4831bnM();
        }
        int i = AnonymousClass1.b[state2.ordinal()];
        boolean z = true;
        if (i == 1) {
            long a2 = this.t.a(1);
            long a3 = this.t.a(2);
            long a4 = this.t.a(3);
            a((a4 < 0 || a4 >= a || a4 >= Math.min(a2, a3) - h) ? false : false);
        } else if (i == 5) {
            v();
        } else if (i != 6) {
            if (i == 7) {
                B();
            }
        } else if (state == PlayerStateMachine.State.INITIALIZING) {
            z();
        } else {
            e(state);
        }
        if (state == PlayerStateMachine.State.PLAYING) {
            this.an += this.ab.e();
            for (int i2 = 0; i2 < this.B.size(); i2++) {
                b(this.B.keyAt(i2), this.M);
            }
        }
        if (state2 == PlayerStateMachine.State.PLAYING) {
            for (int i3 = 0; i3 < this.B.size(); i3++) {
                this.A.put(this.B.keyAt(i3), new C4831bnM());
            }
        }
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine.b
    public void d(C4974bpx c4974bpx) {
        C1044Mm.d("nf_playreport", "onPlayerError(%s)", c4974bpx);
        this.R = c4974bpx;
        String c2 = c4974bpx.c();
        if (c2 != null) {
            if (c2.startsWith("5.") || c2.startsWith("2.")) {
                InterfaceC4776bmK.e a2 = this.f.a(r());
                this.ax = a2;
                C1044Mm.d("nf_playreport", "otherSessionStats(%s)", a2.toString());
            }
        }
    }

    @Override // o.InterfaceC4834bnP.a
    public void b(InterfaceC4835bnQ interfaceC4835bnQ, DataSpec dataSpec, C4857bnm c4857bnm) {
        C4854bnj c4854bnj;
        if (this.G == null || this.C == null || (c4854bnj = this.ae) == null) {
            return;
        }
        if (!c4854bnj.d() && (!this.ae.g() || !DlReportJson.e(c4857bnm, interfaceC4835bnQ))) {
            return;
        }
        synchronized (this.G) {
            this.G.d(this.am.c(), this.C, interfaceC4835bnQ, dataSpec, c4857bnm, this.ab.c(), this.k, this.f13621o);
        }
    }

    public void b(List<Long> list) {
        this.x.addAll(list);
        this.al.b(this.x);
        this.al.b(Boolean.valueOf(!this.x.isEmpty()));
    }

    private long x() {
        return this.ab.b() == PlayerStateMachine.State.PLAYING ? this.an + this.ab.e() : this.an;
    }

    private String t() {
        String e = this.ae.e();
        if (C8168dfL.h(this.Q)) {
            if (C8168dfL.g(e)) {
                e = this.Q;
            } else {
                e = e + "|" + this.Q;
            }
        }
        if (C8168dfL.h(this.U)) {
            if (C8168dfL.g(e)) {
                return this.U;
            }
            return e + "|" + this.U;
        }
        return e;
    }

    void a(BaseEventJson baseEventJson) {
        C4585bhL c4585bhL;
        C4585bhL c4585bhL2;
        baseEventJson.b(Long.valueOf(this.aa));
        baseEventJson.b(this.ab.a());
        baseEventJson.c(this.T);
        C4680bjA a2 = this.ab.a();
        if (a2 != null && a2.c() == SegmentType.c) {
            C4592bhS c4592bhS = this.af;
            PlaylistMap H = c4592bhS == null ? null : c4592bhS.H();
            PlaylistTimestamp q = q();
            if (H != null && q != null && (H.a(q) instanceof C4651biY)) {
                baseEventJson.b(q.e);
            }
        }
        Long l = baseEventJson.i;
        if (l != null) {
            baseEventJson.c(this.s.get(l.longValue()));
        }
        InterfaceC4525bgE interfaceC4525bgE = this.aw;
        if (interfaceC4525bgE != null && interfaceC4525bgE.n() != null) {
            Timeline.Window c2 = this.ab.c();
            baseEventJson.e(c2, this.n, c2 != null && c2.isDynamic && (c4585bhL2 = this.P) != null && c4585bhL2.d(), this.k, (c2 == null || !c2.isDynamic || (c4585bhL = this.P) == null) ? 0L : c4585bhL.b());
        }
        this.X.d(baseEventJson);
    }

    public void d(String str, String str2) {
        this.M.i(str).j(str2);
        this.al.g(str).j(str2);
    }

    private boolean w() {
        C4592bhS c4592bhS = this.af;
        if (c4592bhS == null) {
            return false;
        }
        return c4592bhS.H() instanceof C5211buV;
    }

    public void d(int i, Format format, Format format2, long j) {
        this.M.a(i, format, format2, j);
    }

    public long d() {
        return this.am.c();
    }

    public void d(boolean z, boolean z2, int i) {
        this.M.a(z, z2, i);
    }

    @Override // o.C4781bmP.d
    public void b(int i, int i2, String str, int i3, int i4, boolean z) {
        C1044Mm.d("nf_playreport", "onBrightnessChanged(%s, %s, %s, %s, %s)", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4));
        a(new C4783bmR(this.ad, this.as, this.Z, this.K, this.ac).d(str).a(this.am.c()).b(p(), q()).e(i).c(i2).b(i3).d(i4).b(z));
    }

    public void a(long j) {
        this.M.a(j);
    }

    public void d(String str, C4651biY c4651biY, String str2) {
        C4775bmJ c4775bmJ = new C4775bmJ(this.ad, this.as, this.Z, this.K, true, this.ac);
        c4775bmJ.a(this.am.c()).a(p(), q()).d(str2).b(C4855bnk.a.d(((C5273bve) c4651biY).g)).e(((C5273bve) c4651biY).i).e(c4651biY.c());
        a(c4775bmJ);
    }

    public void a(C4642biP.e eVar) {
        C4775bmJ c4775bmJ = new C4775bmJ(this.ad, this.as, this.Z, this.K, false, this.ac);
        c4775bmJ.a(this.am.c()).a(p(), q()).d(eVar.j()).b(C4855bnk.a.d(SegmentType.c)).e(eVar.h().e()).e(eVar);
        a(c4775bmJ);
    }

    public void f() {
        this.ab.e("onSurfaceDestroyed");
    }

    public void h() {
        this.ab.e("onSurfaceAvailable");
    }

    public void k() {
        this.ab.e("setSurfaceView");
    }

    private String r() {
        C4592bhS c4592bhS = this.af;
        PlaylistMap H = c4592bhS == null ? null : c4592bhS.H();
        if (H == null) {
            return null;
        }
        return H.b();
    }
}
