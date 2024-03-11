package o;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Format;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.upstream.Loader;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.cache.SegmentAsePlayerState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.cache.SegmentHolderList;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import o.C4637biK;
import o.C4675biw;
import o.InterfaceC4663bik;
import o.InterfaceC4682bjC;

/* renamed from: o.biw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4675biw {
    private static final long a = TimeUnit.SECONDS.toMicros(120);
    private Tracks D;
    private final DataSource b;
    private final InterfaceC4657bie c;
    private final IAsePlayerState d;
    private final C4753bkr e;
    private final Player.Listener f;
    private final Handler g;
    private final PlayerMessage.Target h;
    private final ExoPlayer i;
    private PlayerMessage j;
    private final C4628biB k;
    private final Handler.Callback l;
    private final InterfaceC4663bik.c m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13606o;
    private final Loader.Callback<C4635biI> q;
    private final C4624bhy s;
    private final int t;
    private final InterfaceC4734bkH u;
    private final C4738bkW v;
    private final C4637biK.a x;
    private final SegmentHolderList y = new SegmentHolderList();
    private final List<e> r = new CopyOnWriteArrayList();
    private final Loader p = new Loader("playlist_prefetch");
    private final byte[] w = new byte[16000];

    /* renamed from: o.biw$a */
    /* loaded from: classes3.dex */
    public interface a {
        void d(C5209buT c5209buT, long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.biw$e */
    /* loaded from: classes3.dex */
    public static class e {
        public final a b;
        public final long c;
        public final C5209buT d;
    }

    public C4675biw(Looper looper, ExoPlayer exoPlayer, IAsePlayerState iAsePlayerState, C4628biB c4628biB, DataSource.Factory factory, InterfaceC4657bie interfaceC4657bie, C4753bkr c4753bkr, InterfaceC4734bkH interfaceC4734bkH, C4738bkW c4738bkW, C4624bhy c4624bhy) {
        Handler.Callback callback = new Handler.Callback() { // from class: o.biw.5
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (C4675biw.this.f13606o) {
                    return true;
                }
                switch (message.what) {
                    case 4096:
                        C4675biw.this.d((C4637biK) message.obj);
                        break;
                    case 4097:
                        C4675biw.this.e((C5209buT) message.obj);
                        break;
                    case 4098:
                        C4675biw.this.j();
                        break;
                    case 4099:
                        C4675biw.this.c();
                        break;
                    case 4100:
                        C4675biw.this.g();
                        break;
                    case 4101:
                        C4675biw.this.a((e) message.obj);
                        break;
                    case 4102:
                        C4675biw.this.c((C4635biI) message.obj);
                        break;
                    case 4103:
                        C4675biw.this.b((a) message.obj);
                        break;
                    case 4104:
                        C4675biw.this.c((Tracks) message.obj);
                        break;
                    case 4105:
                        C4675biw.this.d(message.arg1 != 0);
                        break;
                    case 4106:
                        C4675biw.this.b((C4637biK) message.obj);
                        break;
                    case 4107:
                        C4675biw.this.f();
                        break;
                    case 4108:
                        C4675biw.this.a((C4637biK) message.obj);
                        break;
                }
                return true;
            }
        };
        this.l = callback;
        this.m = new InterfaceC4663bik.c() { // from class: o.biw.4
            @Override // o.InterfaceC4663bik.c
            public void a(String str, List<C4656bid> list) {
                C4675biw.this.g.obtainMessage(4099).sendToTarget();
            }

            @Override // o.InterfaceC4663bik.c
            public void a(String str) {
                C4675biw.this.g.obtainMessage(4099).sendToTarget();
            }
        };
        this.x = new C4637biK.a() { // from class: o.biw.1
            @Override // o.C4637biK.a
            public void c(C4637biK c4637biK) {
                C4675biw.this.g.obtainMessage(4106, c4637biK).sendToTarget();
            }
        };
        this.q = new Loader.Callback<C4635biI>() { // from class: o.biw.2
            @Override // androidx.media3.exoplayer.upstream.Loader.Callback
            /* renamed from: a */
            public void onLoadCompleted(C4635biI c4635biI, long j, long j2) {
                C4675biw.this.g.obtainMessage(4102, c4635biI).sendToTarget();
                C4675biw.this.g.obtainMessage(4099).sendToTarget();
            }

            @Override // androidx.media3.exoplayer.upstream.Loader.Callback
            /* renamed from: c */
            public void onLoadCanceled(C4635biI c4635biI, long j, long j2, boolean z) {
                C1044Mm.d("nf_branch_cache", "onLoadCanceled(%s)", c4635biI.a);
                C4675biw.this.g.obtainMessage(4099).sendToTarget();
            }

            @Override // androidx.media3.exoplayer.upstream.Loader.Callback
            /* renamed from: c */
            public Loader.LoadErrorAction onLoadError(C4635biI c4635biI, long j, long j2, IOException iOException, int i) {
                C1044Mm.d("nf_branch_cache", "onLoadError(%s, %s)", c4635biI.a, iOException.getMessage());
                C4675biw.this.g.obtainMessage(4099).sendToTarget();
                return Loader.DONT_RETRY_FATAL;
            }
        };
        Player.Listener listener = new Player.Listener() { // from class: o.biw.3
            @Override // androidx.media3.common.Player.Listener
            public void onTimelineChanged(Timeline timeline, int i) {
                C4675biw.this.g.sendEmptyMessage(4107);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onTracksChanged(Tracks tracks) {
                C4675biw.this.g.obtainMessage(4104, tracks).sendToTarget();
            }

            @Override // androidx.media3.common.Player.Listener
            public void onIsLoadingChanged(boolean z) {
                C4675biw.this.g.obtainMessage(4105, z ? 1 : 0, 0).sendToTarget();
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                C4675biw.this.g.sendEmptyMessage(4107);
            }
        };
        this.f = listener;
        this.h = new PlayerMessage.Target() { // from class: o.biw.10
            @Override // androidx.media3.exoplayer.PlayerMessage.Target
            public void handleMessage(int i, Object obj) {
                C1044Mm.b("nf_branch_cache", "onExoMessage(min skip offset reached)");
                C4675biw.this.g.sendEmptyMessage(4099);
            }
        };
        this.g = new Handler(looper, callback);
        this.i = exoPlayer;
        this.k = c4628biB;
        this.e = c4753bkr;
        this.t = interfaceC4657bie.h();
        this.b = factory.createDataSource();
        this.d = iAsePlayerState;
        this.c = interfaceC4657bie;
        this.u = interfaceC4734bkH;
        this.v = c4738bkW;
        this.s = c4624bhy;
        exoPlayer.addListener(listener);
    }

    public void c(PlaylistMap playlistMap, C5209buT c5209buT, long j, String str) {
        this.g.obtainMessage(4096, new C4637biK(this.x, playlistMap, c5209buT, j, str, this.e.d().c())).sendToTarget();
    }

    public void c(C5209buT c5209buT) {
        this.g.obtainMessage(4097, c5209buT).sendToTarget();
    }

    public void e() {
        this.g.obtainMessage(4098).sendToTarget();
    }

    public void d() {
        this.i.removeListener(this.f);
        this.g.obtainMessage(4100).sendToTarget();
    }

    public long d(C5209buT c5209buT) {
        C4637biK e2 = this.y.e(c5209buT);
        if (e2 == null) {
            return 0L;
        }
        return androidx.media3.common.C.usToMs(e2.d());
    }

    public List<C4973bpw> b() {
        ArrayList arrayList = new ArrayList(this.y.size());
        Iterator<C4637biK> it = this.y.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(C4637biK c4637biK) {
        C4637biK e2 = this.y.e(c4637biK.m);
        if (e2 != null) {
            C1044Mm.a("nf_branch_cache", "attempted to add duplicate segment %s - updating weight %s -> %s", c4637biK.m, Integer.valueOf(e2.i), Integer.valueOf(c4637biK.i));
            e2.i = c4637biK.i;
        } else {
            C1044Mm.a("nf_branch_cache", "adding segment %s", c4637biK);
            this.y.add(c4637biK);
        }
        C4726bju e3 = this.s.e(c4637biK.n);
        if (e3 != null) {
            c4637biK.b(e3);
        } else {
            this.s.e(c4637biK.n, new b(c4637biK));
        }
        this.g.sendEmptyMessageDelayed(4099, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(C5209buT c5209buT) {
        ArrayList arrayList = new ArrayList();
        Iterator<C4637biK> it = this.y.iterator();
        while (it.hasNext()) {
            C4637biK next = it.next();
            if (next.m == c5209buT) {
                arrayList.add(next);
            }
        }
        this.y.removeAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar) {
        C4637biK e2 = this.y.e(eVar.d);
        if (e2 == null) {
            C1044Mm.d("nf_branch_cache", "not adding listener - segment is not in prefetch list");
            return;
        }
        if (e2.d() >= eVar.c) {
            a(eVar, e2);
        }
        this.r.add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.r) {
            if (eVar.b == aVar) {
                arrayList.add(eVar);
            }
        }
        this.r.removeAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.p.isLoading()) {
            this.p.cancelLoading();
        }
        this.y.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f13606o = true;
        this.y.clear();
        this.p.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        List<C4656bid> b2;
        this.g.removeMessages(4099);
        if (this.D == null) {
            C1044Mm.e("nf_branch_cache", "track selection not initialized - pausing until ASE ready");
            return;
        }
        if (this.n) {
            long e2 = this.y.e();
            if (e2 < 0) {
                C1044Mm.e("nf_branch_cache", "exoplayer currently loading - pausing until exoplayer finishes loading");
                return;
            } else if (this.i.getCurrentPosition() < e2) {
                C1044Mm.a("nf_branch_cache", "exoplayer currently loading - pausing until exoplayer finishes loading or at %s ms", Long.valueOf(e2));
                this.g.sendEmptyMessage(4107);
                return;
            }
        }
        if (this.p.isLoading()) {
            C1044Mm.b("nf_branch_cache", "load already in progress - pausing until resource available");
        } else if (this.y.b() >= a) {
            C1044Mm.a("nf_branch_cache", "reached max buffer duration %s - pausing until segments removed", Long.valueOf(this.y.b()));
        } else if (this.y.c() >= this.t) {
            C1044Mm.a("nf_branch_cache", "reached max buffer size %s - pausing until segments removed", Long.valueOf(this.y.c()));
        } else {
            C4637biK d = this.y.d();
            if (d == null) {
                C1044Mm.e("nf_branch_cache", "no next segment to fetch in list - pausing until new segments added");
            } else if (d.l() == null) {
                C1044Mm.a("nf_branch_cache", "%s not ready - no manifest", d);
            } else if (d.l().o() || d.l().dynamic) {
                C1044Mm.e("nf_branch_cache", "not able to prefetch a live title");
            } else {
                int k = d.k();
                Representation d2 = d(d, k);
                if (d2 == null) {
                    C1044Mm.d("nf_branch_cache", "could not find a valid representation to fetch - delaying fetch");
                    this.g.sendEmptyMessageDelayed(4099, 1000L);
                    return;
                }
                List<C4656bid> b3 = this.k.b(d2.format.id, d.e(), k == 1 ? androidx.media3.common.C.msToUs(this.e.d().d().e().minDurationMs()) : 1L);
                if (b3 == null) {
                    C1044Mm.b("nf_branch_cache", "chunk map not in memory - requesting header fetch");
                    this.k.d(d2.format.id, this.m);
                } else if (b3.isEmpty()) {
                    C1044Mm.d("nf_branch_cache", "could not find chunk in chunk list - removing segment");
                    c(d.m);
                } else {
                    if (k == 2 && d.n() > 0 && d.b() == 0) {
                        C1044Mm.d("nf_branch_cache", "updating start time of %s from %s to %s", d.e, Long.valueOf(androidx.media3.common.C.usToMs(d.n())), Long.valueOf(androidx.media3.common.C.usToMs(b3.get(0).f())));
                        d.c(b3.get(0).f() + 1);
                    }
                    if (d.f() < 0 && (b2 = this.k.b(d2.format.id, -9223372036854775807L, -9223372036854775807L)) != null && !b2.isEmpty()) {
                        long g = b2.get(b2.size() - 1).g();
                        C1044Mm.d("nf_branch_cache", "updating end time of %s to %s", d, Long.valueOf(g));
                        d.e(g);
                    }
                    C4635biI e3 = e(d, d2, k, b3);
                    C1044Mm.d("nf_branch_cache", "downloading chunk %s", e3);
                    this.p.startLoading(e3, this.q, 3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(C4635biI c4635biI) {
        C5213buX[] c5213buXArr;
        int i;
        C4637biK c4637biK = c4635biI.a;
        c4637biK.b(c4635biI);
        if (c4637biK.r()) {
            C5213buX[] f = c4637biK.m.f();
            int length = f.length;
            int i2 = 0;
            while (i2 < length) {
                C5213buX c5213buX = f[i2];
                C5209buT a2 = c4637biK.j.a(c5213buX.d);
                if (a2 == null) {
                    C1044Mm.e("nf_branch_cache", "could not find next segment of %s (%s) in playgraph", c4637biK.e, c5213buX.d);
                    c5213buXArr = f;
                    i = length;
                } else {
                    long j = c4637biK.n;
                    if (a2 instanceof C5273bve) {
                        j = ((C5273bve) a2).i;
                    }
                    long j2 = j;
                    c5213buXArr = f;
                    i = length;
                    C4637biK c4637biK2 = new C4637biK(this.x, c4637biK.j, c4637biK, j2, c5213buX.d, this.e.d().c());
                    C4726bju e2 = this.s.e(j2);
                    if (e2 != null) {
                        c4637biK2.b(e2);
                    } else {
                        this.s.e(j2, new b(c4637biK2));
                    }
                    C1044Mm.d("nf_branch_cache", "adding child of %s: %s", c4637biK, c4637biK2);
                    c4637biK.e(c4637biK2);
                }
                i2++;
                f = c5213buXArr;
                length = i;
            }
        }
        for (e eVar : this.r) {
            if (eVar.d == c4637biK.m && eVar.c <= c4637biK.d()) {
                a(eVar, c4637biK);
            }
        }
    }

    private void a(final e eVar, final C4637biK c4637biK) {
        this.g.post(new Runnable() { // from class: o.biu
            @Override // java.lang.Runnable
            public final void run() {
                C4675biw.d(C4675biw.e.this, c4637biK);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(e eVar, C4637biK c4637biK) {
        eVar.b.d(c4637biK.m, androidx.media3.common.C.usToMs(c4637biK.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Tracks tracks) {
        this.D = tracks;
        this.g.obtainMessage(4099).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        this.n = z;
        if (z || this.y.isEmpty()) {
            return;
        }
        this.g.sendEmptyMessage(4099);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(C4637biK c4637biK) {
        if (c4637biK.s()) {
            this.y.a();
            this.y.g();
        }
        C1044Mm.d("nf_branch_cache", "updating weight of %s", c4637biK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        long e2 = this.y.e();
        if (e2 < 0) {
            a();
        } else if (this.i.getCurrentPosition() > e2) {
            a();
            this.g.sendEmptyMessage(4099);
        } else if (this.i.getDuration() < e2) {
            a();
        } else {
            int currentWindowIndex = this.i.getCurrentWindowIndex();
            PlayerMessage playerMessage = this.j;
            if (playerMessage != null && (playerMessage.getPositionMs() != e2 || this.j.getMediaItemIndex() != currentWindowIndex)) {
                a();
            }
            if (this.j == null) {
                PlayerMessage deleteAfterDelivery = this.i.createMessage(this.h).setHandler(this.g).setDeleteAfterDelivery(true);
                Timeline timeline = deleteAfterDelivery.getTimeline();
                if (currentWindowIndex < 0 || (!timeline.isEmpty() && currentWindowIndex >= timeline.getWindowCount())) {
                    C1044Mm.d("nf_branch_cache", "unable to set earliest skip request trigger - invalid timeline");
                    return;
                }
                deleteAfterDelivery.setPosition(currentWindowIndex, e2);
                this.j = deleteAfterDelivery;
                deleteAfterDelivery.send();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C4637biK c4637biK) {
        c4637biK.b(this.s.e(c4637biK.n));
        this.g.sendEmptyMessage(4099);
    }

    private void a() {
        PlayerMessage playerMessage = this.j;
        if (playerMessage != null) {
            playerMessage.cancel();
            this.j = null;
        }
    }

    private C4635biI e(C4637biK c4637biK, Representation representation, int i, List<C4656bid> list) {
        C4656bid c4656bid = list.get(0);
        C4656bid c4656bid2 = list.get(list.size() - 1);
        return new C4635biI(c4637biK, this.w, i, this.b, new DataSpec(Uri.parse(representation.baseUrls.get(0).url), c4656bid.c(), c4656bid2.e() - c4656bid.c(), representation.getCacheKey(), 524288), representation.format, 0, null, c4656bid.f(), c4656bid2.g(), 0);
    }

    private Representation d(C4637biK c4637biK, int i) {
        if (i == 1) {
            Representation representation = null;
            for (int i2 = 0; i2 < c4637biK.l().getPeriodCount(); i2++) {
                for (AdaptationSet adaptationSet : c4637biK.l().getPeriod(i2).adaptationSets) {
                    if (adaptationSet.type == 1) {
                        for (Representation representation2 : adaptationSet.representations) {
                            Format format = representation2.format;
                            if ((format.selectionFlags & 1) != 0 && (representation == null || format.bitrate <= 64000)) {
                                representation = representation2;
                            }
                        }
                    }
                }
            }
            if (representation != null) {
                return representation;
            }
            C1044Mm.e("nf_branch_cache", "could not find valid representation for %s", c4637biK);
            return null;
        }
        SegmentAsePlayerState a2 = c4637biK.a();
        if (a2 == null) {
            a2 = new SegmentAsePlayerState(c4637biK, this.e, this.k, this.d, this.c, this.v, this.u, null);
            c4637biK.d(a2);
        }
        Representation a3 = a2.a();
        if (a3 != null) {
            return a3;
        }
        C1044Mm.e("nf_branch_cache", "could not find valid representation for %s", c4637biK);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.biw$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC4682bjC.e {
        private final C4637biK b;

        public b(C4637biK c4637biK) {
            this.b = c4637biK;
        }

        @Override // o.InterfaceC4682bjC.e
        public void b(long j, C4726bju c4726bju) {
            C4675biw.this.g.obtainMessage(4108, this.b).sendToTarget();
            C4675biw.this.s.d(j, this);
        }

        @Override // o.InterfaceC4682bjC.e
        public void a(long j, IOException iOException) {
            C4675biw.this.s.d(j, this);
        }
    }
}
