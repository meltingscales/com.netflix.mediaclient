package o;

import android.content.Context;
import android.os.Handler;
import android.util.LongSparseArray;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import com.netflix.mediaclient.media.PlaybackMetadataImpl;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.Event;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.StopReason;
import com.netflix.mediaclient.servicemgr.ExitPipAction;
import com.netflix.mediaclient.servicemgr.LiveEventState;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C4625bhz;
import o.C4642biP;
import o.C4781bmP;
import o.InterfaceC4610bhk;
import o.InterfaceC4660bih;

/* renamed from: o.boO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4886boO implements C4625bhz.c, InterfaceC4660bih.b, InterfaceC4968bpr {
    private final Handler C;
    private InterfaceC4734bkH a;
    private ExoPlayer b;
    private final long c;
    private final C4911bon d;
    private final Context e;
    private final C4875boD f;
    private final InterfaceC4856bnl g;
    private boolean h;
    private final InterfaceC4657bie i;
    private InterfaceC4665bim j;
    private final PlaybackMetadataImpl k;
    private C4585bhL l;
    private C4854bnj m;
    private InterfaceC4662bij n;

    /* renamed from: o  reason: collision with root package name */
    private final C4880boI f13624o;
    private IAsePlayerState p;
    private C4592bhS q;
    private final String r;
    private C4589bhP t;
    private List<C4970bpt> u;
    private final C4859bno w;
    private InterfaceC4661bii x;
    private String y;
    private final LongSparseArray<C4845bna> s = new LongSparseArray<>();
    private long v = -1;

    public String a() {
        return this.r;
    }

    public void a(C4585bhL c4585bhL) {
        this.l = c4585bhL;
    }

    public void b(IAsePlayerState iAsePlayerState) {
        this.p = iAsePlayerState;
    }

    public void b(List<C4970bpt> list) {
        this.u = list;
    }

    public void b(InterfaceC4665bim interfaceC4665bim) {
        this.j = interfaceC4665bim;
    }

    public void b(InterfaceC4734bkH interfaceC4734bkH) {
        this.a = interfaceC4734bkH;
    }

    public void b(C4854bnj c4854bnj) {
        this.m = c4854bnj;
    }

    public InterfaceC4834bnP c() {
        return this.w;
    }

    public void c(C4589bhP c4589bhP) {
        this.t = c4589bhP;
    }

    public void c(C4592bhS c4592bhS) {
        this.q = c4592bhS;
    }

    public void d(ExoPlayer exoPlayer) {
        this.b = exoPlayer;
    }

    public void d(InterfaceC4661bii interfaceC4661bii) {
        this.x = interfaceC4661bii;
    }

    public C4911bon e() {
        return this.d;
    }

    public void e(InterfaceC4662bij interfaceC4662bij) {
        this.n = interfaceC4662bij;
    }

    public void o(long j) {
        this.v = j;
    }

    public C4886boO(Context context, C4875boD c4875boD, PlaybackMetadataImpl playbackMetadataImpl, String str, String str2, C4880boI c4880boI, long j) {
        C4911bon c4911bon = new C4911bon();
        this.d = c4911bon;
        this.e = context;
        this.i = c4875boD.e();
        Handler handler = new Handler(c4875boD.p());
        this.C = handler;
        this.g = c4875boD.o();
        this.k = playbackMetadataImpl;
        this.r = str;
        this.y = str2;
        this.f13624o = c4880boI;
        this.c = j;
        this.w = new C4859bno(handler, c4911bon);
        this.f = c4875boD;
    }

    public void e(String str) {
        this.y = str;
        synchronized (this.s) {
            for (int i = 0; i < this.s.size(); i++) {
                this.s.valueAt(i).c(str);
            }
        }
    }

    public void b(InterfaceC4660bih interfaceC4660bih) {
        interfaceC4660bih.a(this);
    }

    public void e(long j, boolean z) {
        C4845bna k = k(j);
        InterfaceC4525bgE c = this.f13624o.c(j);
        if (c != null) {
            k.e(c);
            if (z) {
                PlayerPrefetchSource ah = c.ah();
                k.d(c.al(), ah == null ? null : ah.name());
            }
            k.d(c.ad(), c.aq());
            AbstractC4558bgl j2 = c.j();
            if (j2 == null || j2.b() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(2);
            for (Map.Entry<String, AbstractC4531bgK> entry : j2.b().c().entrySet()) {
                Long h = entry.getValue().h();
                if (h.longValue() != j && !arrayList.contains(h)) {
                    arrayList.add(h);
                }
                if (this.s.get(h.longValue()) == null) {
                    this.s.put(h.longValue(), k);
                }
            }
            k.b(arrayList);
        }
    }

    public void b(long j, long j2, long j3) {
        C4845bna k = k(j);
        k.f(this.v);
        k.c(j2, j3);
        if (this.f13624o.c(j) != null) {
            e(j, true);
        }
    }

    public void b(long j, C4614bho c4614bho, int i) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.d(c4614bho, i);
    }

    public void a(long j, StopReason stopReason, long j2) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.b(stopReason, j2);
    }

    public void d(long j, long j2) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.c(j2);
    }

    public void l(long j) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.o();
    }

    public void n(long j) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.l();
    }

    public void b(long j, boolean z) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.d(this.u);
        b.e(z);
        synchronized (this.s) {
            b.m();
            this.s.remove(j);
            for (int i = 0; i < this.s.size(); i++) {
                if (this.s.valueAt(i) == b) {
                    LongSparseArray<C4845bna> longSparseArray = this.s;
                    longSparseArray.remove(longSparseArray.keyAt(i));
                }
            }
            C1044Mm.d("nf_playreport", "playbackClosed[%d]", Long.valueOf(j));
        }
    }

    public void c(long j, Format format, Format format2) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.d(format, format2);
    }

    public void i(long j) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.i();
    }

    public void b(long j, Format format) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.c(format);
    }

    public void a(long j, Event event) {
        C4845bna k = Event.j.equals(event) ? k(j) : b(j);
        if (k == null) {
            return;
        }
        k.a(event);
    }

    public void a(long j, int i, long j2) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.e(i, j2);
    }

    public void d(long j, long j2, InterfaceC4610bhk.b bVar) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.d(j2, bVar);
    }

    public void g(long j) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.g();
    }

    public void c(long j, long j2) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.e(j2);
    }

    public void c(long j, ExitPipAction exitPipAction, long j2) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.e(exitPipAction, j2);
    }

    public void e(long j, long j2, String str, String str2, boolean z, List<C4973bpw> list, Long l, Long l2) {
        C4845bna k = k(j);
        if (k == null || str == null) {
            return;
        }
        k.e(c(j2), str, z, list, l, l2);
    }

    public void e(String str, String str2, long j, long j2, IPlaylistControl.SegmentTransitionType segmentTransitionType) {
        C4845bna b = b(j);
        if (b == null || str == null) {
            return;
        }
        b.d(str, j2, segmentTransitionType);
    }

    public void e(long j, long j2) {
        if (j == j2) {
            return;
        }
        b(j2, true);
    }

    public void a(long j, boolean z, boolean z2, String str) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.a(z, z2, str);
    }

    public void j(long j) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.b(true);
    }

    @Override // o.InterfaceC4968bpr
    public String c(long j) {
        return k(j).c();
    }

    public boolean e(long j) {
        C4845bna b = b(j);
        if (b != null) {
            return b.b();
        }
        return C4618bhs.a.a().d();
    }

    public C4845bna b(long j) {
        C4845bna c4845bna;
        synchronized (this.s) {
            c4845bna = this.s.get(j);
        }
        return c4845bna;
    }

    private C4845bna k(long j) {
        LongSparseArray<C4845bna> longSparseArray;
        LongSparseArray<C4845bna> longSparseArray2 = this.s;
        synchronized (longSparseArray2) {
            try {
                try {
                    C4845bna c4845bna = this.s.get(j);
                    if (c4845bna == null) {
                        String d = C8193dfk.d();
                        C1044Mm.d("nf_playreport", "getPlaybackReporter[%d], xid : %s", Long.valueOf(j), d);
                        Context context = this.e;
                        longSparseArray = longSparseArray2;
                        c4845bna = new C4845bna(context, this.C, this.g, this.k, this.r, d, j, this.y, this.w, TU.d(context), this.f.d().b(), this.c);
                        synchronized (this.s) {
                            this.s.put(j, c4845bna);
                        }
                        if (this.h) {
                            b(c4845bna);
                        }
                    } else {
                        longSparseArray = longSparseArray2;
                    }
                    return c4845bna;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
        throw th;
    }

    public void b() {
        if (this.h) {
            return;
        }
        synchronized (this.s) {
            for (int i = 0; i < this.s.size(); i++) {
                b(this.s.valueAt(i));
            }
        }
        this.h = true;
    }

    public void d() {
        synchronized (this.s) {
            for (int i = 0; i < this.s.size(); i++) {
                this.s.valueAt(i).m();
            }
            this.s.clear();
        }
    }

    private void b(C4845bna c4845bna) {
        c4845bna.d(this.m);
        c4845bna.e(this.b);
        c4845bna.c(this.p);
        c4845bna.c(this.t);
        c4845bna.a(this.x);
        c4845bna.a(this.a);
        c4845bna.b(this.j);
        c4845bna.a(this.q);
        c4845bna.c(this.n);
        c4845bna.a(this.i);
        c4845bna.a(this.l);
    }

    @Override // o.InterfaceC4660bih.b
    public void b(long j, InterfaceC4660bih.e eVar, long j2) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.c(eVar, j2);
    }

    @Override // o.InterfaceC4660bih.b
    public void e(long j, String str, long j2, long j3, String str2, long j4) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.d(str, j2, j3, str2, j4);
    }

    @Override // o.InterfaceC4660bih.b
    public void a(long j, long j2, long j3, String str, long j4) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.c(j2, j3, str, j4);
    }

    @Override // o.InterfaceC4660bih.b
    public void d(long j) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.e();
    }

    @Override // o.InterfaceC4660bih.b
    public void e(long j, long j2, long j3, long j4, long j5) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.c(j2, j3, j4, j5);
    }

    @Override // o.InterfaceC4660bih.b
    public void e(long j, InterfaceC4660bih.h hVar, long j2, boolean z) {
        C4845bna b = b(j);
        if (!z || b == null) {
            return;
        }
        b.a(hVar, j2);
    }

    @Override // o.InterfaceC4660bih.b
    public void a(long j, InterfaceC4660bih.a aVar) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.c(aVar);
    }

    @Override // o.InterfaceC4660bih.b
    public void e(long j, InterfaceC4660bih.j jVar) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.b(jVar);
    }

    @Override // o.InterfaceC4660bih.b
    public void b(long j, InterfaceC4660bih.f fVar) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.b(fVar);
    }

    @Override // o.InterfaceC4660bih.b
    public void e(String str, long j, long j2) {
        synchronized (this.s) {
            for (int i = 0; i < this.s.size(); i++) {
                this.s.valueAt(i).a(str, j, j2);
            }
        }
    }

    public void b(long j, LiveEventState liveEventState) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.e(liveEventState);
    }

    public void e(long j, String str, String str2, String str3, String str4) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.d(str, str2, str3, str4);
    }

    public void b(long j, long j2) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.b(j2);
    }

    @Override // o.C4625bhz.c
    public void c(long j, int i, InterfaceC4660bih.l lVar) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.e(i, lVar);
    }

    @Override // o.C4625bhz.c
    public void a(long j) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.j();
    }

    @Override // o.C4625bhz.c
    public void c(long j, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.d(loadEventInfo, mediaLoadData);
    }

    public void c(long j, boolean z, boolean z2, int i) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.d(z, z2, i);
    }

    public void e(long j, int i, int i2, String str) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        C4781bmP.e d = C4781bmP.c(this.e).d(Integer.valueOf(i2), str, null);
        b.b(i, i2, str, d.a(), d.d(), d.e());
    }

    public void a(long j, long j2) {
        C4845bna b = b(j);
        if (b == null) {
            return;
        }
        b.a(j2);
    }

    public void a(C4642biP.e eVar, long j) {
        b(j).a(eVar);
    }

    public void e(String str, C4651biY c4651biY, String str2) {
        b(((C5273bve) c4651biY).f).d(str, c4651biY, str2);
    }

    public void f(long j) {
        C4845bna b = b(j);
        if (b != null) {
            b.f();
        }
    }

    public void h(long j) {
        C4845bna b = b(j);
        if (b != null) {
            b.h();
        }
    }

    public void m(long j) {
        C4845bna b = b(j);
        if (b != null) {
            b.k();
        }
    }

    public void j(long j, long j2) {
        C4845bna b = b(j);
        if (b != null) {
            b.d(j2);
        }
    }
}
