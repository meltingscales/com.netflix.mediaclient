package o;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.StopReason;
import com.netflix.mediaclient.servicemgr.LiveEventState;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.LegacyBranchingBookmark;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import java.util.ArrayList;
import java.util.List;
import o.C4589bhP;
import o.C4625bhz;
import o.C4654bib;
import o.C4655bic;

/* renamed from: o.bhO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4588bhO extends AbstractC4621bhv implements InterfaceC5274bvf, C4655bic.a, C4589bhP.c {
    private final Handler A;
    private InterfaceC4593bhT B;
    private PlaylistMap C;
    private InterfaceC4610bhk D;
    private long p;
    private final C4624bhy q;
    private PlaylistTimestamp r;
    private final List<C4582bhI> s;
    private final C4675biw t;
    private final C4744bkd u;
    private C4577bhD v;
    private String w;
    private boolean x;
    private C5209buT y;
    private InterfaceC5274bvf z;

    public void c(InterfaceC4593bhT interfaceC4593bhT) {
        this.B = interfaceC4593bhT;
    }

    public void c(InterfaceC5274bvf interfaceC5274bvf) {
        this.z = interfaceC5274bvf;
    }

    public PlaylistMap o() {
        return this.C;
    }

    public C4588bhO(Context context, Handler handler, Handler handler2, InterfaceC4610bhk interfaceC4610bhk, DrmSessionManager drmSessionManager, C4628biB c4628biB, InterfaceC4665bim interfaceC4665bim, C4666bin c4666bin, InterfaceC4657bie interfaceC4657bie, C4886boO c4886boO, InterfaceC4793bmb interfaceC4793bmb, PlaybackExperience playbackExperience, PriorityTaskManager priorityTaskManager, PlaylistTimestamp playlistTimestamp, C4624bhy c4624bhy, C4646biT c4646biT) {
        super(context, handler2, interfaceC4610bhk, c4628biB, interfaceC4665bim, c4666bin, interfaceC4657bie, c4886boO, interfaceC4793bmb, playbackExperience, new C4589bhP(handler2, interfaceC4610bhk, priorityTaskManager));
        this.s = new ArrayList();
        this.A = handler;
        this.g.setShuffleModeEnabled(true);
        this.i.b(this.g);
        this.i.e(this);
        this.i.c(this);
        this.i.c(new C4655bic(this, 2000L, true, true));
        this.r = playlistTimestamp;
        this.D = interfaceC4610bhk;
        this.q = c4624bhy;
        C4753bkr c = this.b.c();
        c4624bhy.b(c.e());
        this.u = new C4744bkd(this.g, new C4703bjX(drmSessionManager, this.l, c4624bhy, this.e, this.k, handler2, new C4625bhz.b(c4886boO), c, this.d, this.f), c4646biT);
        this.t = new C4675biw(handler.getLooper(), this.g, this.c, c4628biB, this.d, interfaceC4657bie, this.b.c(), this.b.d(), this.b.g(), c4624bhy);
    }

    public BandwidthMeter i() {
        return this.b.d();
    }

    @Override // o.AbstractC4621bhv
    protected void a(C4886boO c4886boO) {
        super.a(c4886boO);
    }

    @Override // o.AbstractC4621bhv
    public void g() {
        super.g();
        q();
        this.t.d();
        this.B = null;
        this.z = null;
    }

    private void w() {
        PlaylistMap playlistMap;
        int d;
        long j;
        if (this.x || (playlistMap = this.C) == null) {
            return;
        }
        PlaylistTimestamp playlistTimestamp = this.r;
        if (playlistTimestamp instanceof LegacyBranchingBookmark) {
            PlaylistTimestamp a = ((LegacyBranchingBookmark) playlistTimestamp).a(playlistMap);
            this.r = a;
            C1044Mm.c("PlaylistPlayer", "bookmark %s converted from LegacyBranchingBookmark.", a);
        }
        if (this.C.a(this.r) == null) {
            C1044Mm.j("PlaylistPlayer", "bookmark does not map to a segment. starting at initial segment %s", this.C.e());
            this.w = this.C.e();
            d = this.u.d(this.C.e());
            j = 0;
        } else {
            String str = this.r.a;
            this.w = str;
            d = this.u.d(str);
            j = this.r.e;
        }
        if (j == 0) {
            this.g.seekToDefaultPosition(d);
        } else {
            this.g.seekTo(d, j);
        }
        this.x = true;
        f();
    }

    public void l() {
        long n = n();
        if (n != this.p) {
            C4726bju e = this.q.e(n);
            if (e != null) {
                a(e);
                C4761blb j = this.b.j();
                j.b(e.m());
                j.d(this.m.c(e.k().longValue()));
                j.c(this.m.e(e.k().longValue()));
                j.b(this.m.b(e.k().longValue()));
                this.p = n;
            }
            q();
        }
        m();
    }

    public boolean c(PlaylistMap playlistMap) {
        if (playlistMap == this.C) {
            return true;
        }
        C1044Mm.a("PlaylistPlayer", "updating playlist map %s", playlistMap.b());
        PlaylistMap playlistMap2 = this.C;
        this.C = playlistMap;
        this.i.d(playlistMap);
        this.u.e(playlistMap);
        if (playlistMap2 != null) {
            this.A.post(new Runnable() { // from class: o.bhW
                @Override // java.lang.Runnable
                public final void run() {
                    C4588bhO.this.x();
                }
            });
        }
        w();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        InterfaceC4593bhT interfaceC4593bhT = this.B;
        if (interfaceC4593bhT != null) {
            interfaceC4593bhT.e();
        }
    }

    public boolean d(String str, String str2) {
        if (e(str, str2)) {
            C1044Mm.a("PlaylistPlayer", "setNextSegment %s : %s", str, str2);
            Long a = a(str, str2);
            C5209buT a2 = this.C.a(str);
            this.m.e(d(str2), d(str), str2, str, true, this.t.b(), a, (a2 == null || a2.j() == -2147483648L) ? null : Long.valueOf(a2.j()));
            this.u.c(str, str2);
            if (a != null) {
                c(str, str2);
                return true;
            }
            return true;
        }
        C1044Mm.a("PlaylistPlayer", "setNextSegment %s : %s, invalid!", str, str2);
        return false;
    }

    private Long a(String str, String str2) {
        if (!e(str)) {
            C1044Mm.j("PlaylistPlayer", "prepareSeamlessTransitionIfNeeded %s -> %s - not playing", str, str2);
            return null;
        } else if (this.b.c().d().aV() >= 2147483647L) {
            return null;
        } else {
            long c = this.C.a(str).c(Math.max(t(), 0L), true);
            if (c == -1) {
                return null;
            }
            return Long.valueOf(c);
        }
    }

    public boolean c(final String str, final String str2) {
        new C4654bib(this.g, this.b.c()).c(new C4654bib.a() { // from class: o.bhV
            @Override // o.C4654bib.a
            public final void d() {
                C4588bhO.this.i(str, str2);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void i(String str, String str2) {
        if (!e(str)) {
            C1044Mm.j("PlaylistPlayer", "setupTransitionToNextSegment %s -> %s : not playing", str, str2);
            return;
        }
        ClippingMediaSource a = this.u.a(str);
        if (a == null) {
            C1044Mm.j("PlaylistPlayer", "setupTransitionToNextSegment %s could not find media source", str);
            return;
        }
        long max = Math.max(t(), 0L);
        C5209buT a2 = this.C.a(str);
        long j = 1500 + max;
        long c = a2.c(j, false);
        if (c == -1) {
            C1044Mm.j("PlaylistPlayer", "could not find valid transition zone for delayed jump");
            return;
        }
        C1044Mm.a("PlaylistPlayer", "ready for delayed seamless %s -> %s @ %s (current=%s, candidate=%s, end=%s)", str, str2, Long.valueOf(c), Long.valueOf(max), Long.valueOf(j), Long.valueOf(a2.b));
        this.m.e(str2, str, d(str2), c, IPlaylistControl.SegmentTransitionType.SEAMLESS);
        a.updateEndPositionUs(androidx.media3.common.C.msToUs(c + a2.c));
    }

    public void a(String str, long j) {
        this.u.a(str).updateStartPositionUs(Util.msToUs(j));
    }

    public PlaylistTimestamp j() {
        String s = s();
        long max = Math.max(t(), 0L);
        if (s != null) {
            return new PlaylistTimestamp(this.C.b(), s, max);
        }
        return null;
    }

    public void c(PlaylistTimestamp playlistTimestamp) {
        int i;
        String str;
        C4577bhD c4577bhD;
        if (playlistTimestamp.c.equals(this.C.b())) {
            C1044Mm.d("PlaylistPlayer", "seekToPlaylistTimestamp(%s) mPlaylistMap=%s", playlistTimestamp, this.C);
            C4680bjA p = p();
            int d = this.u.d(playlistTimestamp.a);
            if (d >= 0) {
                if (p == null || p.e().equals(playlistTimestamp.a)) {
                    i = d;
                    str = "PlaylistPlayer";
                } else {
                    C5209buT a = this.C.a(playlistTimestamp.a);
                    long a2 = p.a();
                    long d2 = d(playlistTimestamp.a);
                    C5209buT a3 = this.C.a(p.e());
                    i = d;
                    str = "PlaylistPlayer";
                    this.m.e(d2, a2, playlistTimestamp.a, p.e(), false, this.t.b(), null, (a3 == null || a3.j() == -2147483648L) ? null : Long.valueOf(a3.j()));
                    this.m.e(playlistTimestamp.a, p.e(), d2, t(), this.t.d(a) > 0 ? IPlaylistControl.SegmentTransitionType.SHORT : IPlaylistControl.SegmentTransitionType.LONG);
                    if (a2 != d2) {
                        this.m.e(d2, a2);
                        this.f13599o.e();
                    }
                }
                long j = playlistTimestamp.e;
                if (this.g.isCurrentMediaItemLive() && (c4577bhD = this.v) != null) {
                    if (c4577bhD.c() != -9223372036854775807L) {
                        j += this.v.c();
                        if (j >= (this.g.getDuration() - this.b.c().d().ar().K()) - 5000) {
                            C1044Mm.e(str, "snapping to live edge - in live event");
                        }
                    } else {
                        C1044Mm.e(str, "snapping to live edge - in waiting room");
                    }
                    j = -9223372036854775807L;
                }
                this.g.seekTo(i, j);
            }
        }
    }

    private String s() {
        C4680bjA p = p();
        if (p == null) {
            C1044Mm.e("PlaylistPlayer", "getCurrentWindowIndex exceeds available segments");
            return this.w;
        }
        return p.e();
    }

    public long n() {
        C4680bjA p = p();
        if (p == null) {
            C1044Mm.e("PlaylistPlayer", "getCurrentWindowIndex exceeds available segments");
            PlaylistMap playlistMap = this.C;
            if (playlistMap != null) {
                return playlistMap.e(this.w);
            }
            return -1L;
        }
        return p.b();
    }

    private C4680bjA p() {
        Timeline currentTimeline = this.g.getCurrentTimeline();
        int currentWindowIndex = this.g.getCurrentWindowIndex();
        if (currentWindowIndex >= currentTimeline.getWindowCount()) {
            C1044Mm.e("PlaylistPlayer", "getCurrentWindowIndex exceeds available segments");
            return null;
        }
        Timeline.Window window = new Timeline.Window();
        currentTimeline.getWindow(currentWindowIndex, window);
        return (C4680bjA) window.tag;
    }

    private long d(String str) {
        C5209buT a = this.C.a(str);
        if (a instanceof C5273bve) {
            return ((C5273bve) a).f;
        }
        return this.C.e(str);
    }

    private boolean e(String str, String str2) {
        if (str2 == null) {
            return true;
        }
        for (C5213buX c5213buX : this.C.a(str).f()) {
            if (str2.equals(c5213buX.d)) {
                return true;
            }
        }
        d(str2);
        return false;
    }

    private void v() {
        C5213buX[] f;
        C5209buT e = this.u.e(this.g.getCurrentWindowIndex());
        if (e == null) {
            this.t.e();
        } else if (e != this.y) {
            this.y = e;
            this.t.e();
            for (C5213buX c5213buX : e.f()) {
                if (this.C.a(c5213buX.d) == null) {
                    C1044Mm.e("PlaylistPlayer", "playlist does not contain next segment %s for %s", c5213buX.d, e);
                    return;
                }
                long e2 = this.C.e(c5213buX.d);
                C1044Mm.a("PlaylistPlayer", "prefetch %s", c5213buX.d);
                this.t.c(this.C, e, e2, c5213buX.d);
            }
        }
    }

    private boolean e(String str) {
        return str.equals(s());
    }

    @Override // o.InterfaceC5274bvf
    public void e(final String str, final PlaylistTimestamp playlistTimestamp) {
        InterfaceC4593bhT interfaceC4593bhT = this.B;
        if (interfaceC4593bhT != null) {
            interfaceC4593bhT.c(playlistTimestamp.a, playlistTimestamp.e);
        }
        if (str != null) {
            long d = d(playlistTimestamp.a);
            long d2 = d(str);
            if (d2 != d) {
                this.m.e(d, d2);
            }
        }
        if (str != null) {
            this.u.b(str);
        }
        final InterfaceC5274bvf interfaceC5274bvf = this.z;
        if (interfaceC5274bvf != null) {
            this.A.post(new Runnable() { // from class: o.bhX
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC5274bvf.this.e(str, playlistTimestamp);
                }
            });
        }
        InterfaceC4593bhT interfaceC4593bhT2 = this.B;
        if (interfaceC4593bhT2 != null) {
            interfaceC4593bhT2.d(str, playlistTimestamp);
        }
        long d3 = d(playlistTimestamp.a);
        this.b.h().c(d(playlistTimestamp.a));
        this.b.f().setPlayableId(d3);
        v();
        l();
    }

    @Override // o.C4655bic.a
    public void e(final String str, String str2, long j) {
        if (str2 == null) {
            InterfaceC4593bhT interfaceC4593bhT = this.B;
            if (interfaceC4593bhT != null) {
                interfaceC4593bhT.d(str, str2, j);
            }
            final C5209buT a = this.C.a(str);
            if (a == null || a.f().length < 2 || a.a() == null) {
                return;
            }
            this.A.post(new Runnable() { // from class: o.bhU
                @Override // java.lang.Runnable
                public final void run() {
                    C4588bhO.this.b(str, a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, C5209buT c5209buT) {
        this.u.c(str, c5209buT.a());
    }

    @Override // o.C4589bhP.c
    public void a() {
        l();
        v();
        y();
    }

    @Override // o.C4589bhP.c
    public void a(int i) {
        C4577bhD c4577bhD;
        if (this.g.isCurrentMediaItemLive() && (c4577bhD = this.v) != null) {
            c4577bhD.a(i);
        } else if (r()) {
            y();
            this.D.b(new C5086bsC(LiveEventState.EVENT_DVR_MODE, false));
        }
    }

    public void m() {
        C4726bju e = this.g.getCurrentManifest() instanceof C4726bju ? this.q.e(n()) : null;
        if (this.g.isCurrentMediaItemLive() && e != null && this.v == null) {
            Timeline currentTimeline = this.g.getCurrentTimeline();
            int currentWindowIndex = this.g.getCurrentWindowIndex();
            if (currentWindowIndex >= currentTimeline.getWindowCount()) {
                C1044Mm.e("PlaylistPlayer", "getCurrentWindowIndex exceeds available segments");
                return;
            }
            Timeline.Window window = new Timeline.Window();
            currentTimeline.getWindow(currentWindowIndex, window);
            this.v = new C4577bhD(e.j().longValue(), window.windowStartTimeMs, e.b, e.c(), e.a(), this.D, this.g, this.m, this.n, this.b.c(), this.u.a(((C4680bjA) window.tag).e()));
            for (C4582bhI c4582bhI : this.s) {
                this.v.b(c4582bhI);
            }
            this.n.d(this.v);
            this.b.j().d(this.v);
            C1044Mm.e("PlaylistPlayer", "New timelineHandler created " + this.v);
        } else if (!this.g.isCurrentMediaItemLive() && this.v != null) {
            q();
        }
    }

    @Override // o.AbstractC4621bhv
    public void c(C4582bhI c4582bhI) {
        super.c(c4582bhI);
        this.s.add(c4582bhI);
        this.b.m().c(c4582bhI);
        C4577bhD c4577bhD = this.v;
        if (c4577bhD != null) {
            c4577bhD.b(c4582bhI);
        }
    }

    private void q() {
        if (this.v != null) {
            this.b.j().e(this.v);
            this.n.c(this.v);
            this.v = null;
            C1044Mm.e("PlaylistPlayer", "LiveHandler cleaned up");
        }
    }

    private long t() {
        if (this.g.isCurrentMediaItemLive() && this.v != null) {
            return this.g.getCurrentPosition() - this.v.c();
        }
        return Math.max(0L, this.g.getCurrentPosition());
    }

    private void y() {
        C4577bhD c4577bhD;
        if (this.g.isCurrentMediaItemLive() && (c4577bhD = this.v) != null) {
            c4577bhD.c(this.g.getDuration());
        } else if (r()) {
            this.D.c(this.g.getDuration());
        }
    }

    private boolean r() {
        Object currentManifest = this.g.getCurrentManifest();
        if (currentManifest instanceof C4726bju) {
            C4726bju c4726bju = (C4726bju) currentManifest;
            if (c4726bju.o() && !c4726bju.a) {
                return true;
            }
        }
        return false;
    }

    public void k() {
        C4577bhD c4577bhD = this.v;
        if (c4577bhD == null || !this.g.isCurrentMediaItemLive() || this.g.getPlayWhenReady() || !c4577bhD.d()) {
            return;
        }
        this.m.a(n(), StopReason.SEEK, this.g.getDuration());
        this.g.seekToDefaultPosition();
    }
}
