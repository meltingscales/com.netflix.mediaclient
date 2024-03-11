package o;

import android.media.MediaCrypto;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.player.drm.LicenseType;
import com.netflix.mediaclient.service.player.drm.NfDrmException;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.drm.NetflixDrmException;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.Event;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.C4709bjd;
import o.InterfaceC4424beJ;

/* renamed from: o.bjd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4709bjd implements DrmSessionManager {
    private final C4582bhI a;
    private final LinkedHashMap<ByteBuffer, d> b = new LinkedHashMap<>();
    private final InterfaceC4708bjc c;
    private final Handler d;
    private final a e;
    private InterfaceC4423beI g;
    private final Handler h;
    private final boolean i;
    private final InterfaceC4423beI j;

    /* renamed from: o.bjd$a */
    /* loaded from: classes3.dex */
    public interface a {
        void b(long j, Event event);

        void b(long j, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjd$b */
    /* loaded from: classes3.dex */
    public interface b {
        C4462bev e();
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public void setPlayer(Looper looper, PlayerId playerId) {
    }

    public C4709bjd(Looper looper, InterfaceC4423beI interfaceC4423beI, InterfaceC4708bjc interfaceC4708bjc, a aVar, C4582bhI c4582bhI, boolean z) {
        this.d = new Handler(looper);
        this.h = new Handler(interfaceC4423beI.c());
        this.j = interfaceC4423beI;
        this.c = interfaceC4708bjc;
        this.e = aVar;
        this.a = c4582bhI;
        this.i = z;
    }

    public void d(final String str, final InterfaceC4525bgE interfaceC4525bgE) {
        if (interfaceC4525bgE.at()) {
            ByteBuffer wrap = ByteBuffer.wrap(interfaceC4525bgE.R());
            final long longValue = interfaceC4525bgE.aa().longValue();
            synchronized (this.b) {
                if (this.b.get(wrap) != null) {
                    C1044Mm.a("nf_ExoDrmSessionManager", "already found DRM session for %s. not opening new one", Long.valueOf(longValue));
                    return;
                }
                final d dVar = new d(this.h, this.d, longValue, this.e, this.a);
                this.b.put(wrap, dVar);
                C1044Mm.a("nf_ExoDrmSessionManager", "acquireDrmSessionOnManifestAvailable for %s", Long.valueOf(longValue));
                this.h.post(new Runnable() { // from class: o.bji
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4709bjd.this.b(str, longValue, interfaceC4525bgE, dVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, long j, InterfaceC4525bgE interfaceC4525bgE, d dVar) {
        try {
            a(str, j, interfaceC4525bgE, dVar);
        } catch (Exception e) {
            dVar.d(e);
        }
    }

    private void a(final String str, final long j, final InterfaceC4525bgE interfaceC4525bgE, d dVar) {
        InterfaceC4423beI interfaceC4423beI;
        b bVar = new b() { // from class: o.bjb
            @Override // o.C4709bjd.b
            public final C4462bev e() {
                C4462bev a2;
                a2 = C4709bjd.a(InterfaceC4525bgE.this, str, j);
                return a2;
            }
        };
        if (interfaceC4525bgE.ay() != null) {
            C1044Mm.a("nf_ExoDrmSessionManager", "doAcquireLicense offline license for %s", Long.valueOf(j));
            this.a.e();
            if (this.g == null) {
                this.g = this.c.c();
            }
            interfaceC4423beI = this.g;
        } else {
            C1044Mm.a("nf_ExoDrmSessionManager", "doAcquireLicense standard streaming license for %s", Long.valueOf(j));
            interfaceC4423beI = this.j;
        }
        dVar.c(interfaceC4423beI, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C4462bev a(InterfaceC4525bgE interfaceC4525bgE, String str, long j) {
        if (interfaceC4525bgE.ay() == null) {
            return new C4462bev(LicenseType.LICENSE_TYPE_STANDARD, str, interfaceC4525bgE.R(), interfaceC4525bgE.S(), interfaceC4525bgE.Q(), j, interfaceC4525bgE.as(), interfaceC4525bgE.n() != null);
        }
        C4430beP c4430beP = new C4430beP(str, interfaceC4525bgE.R(), interfaceC4525bgE.E(), null, j, null, interfaceC4525bgE.n() != null, interfaceC4525bgE.ax());
        c4430beP.a(interfaceC4525bgE.ay());
        return c4430beP;
    }

    public void e() {
        this.h.post(new Runnable() { // from class: o.bjf
            @Override // java.lang.Runnable
            public final void run() {
                C4709bjd.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        synchronized (this.b) {
            for (d dVar : this.b.values()) {
                C1044Mm.a("nf_ExoDrmSessionManager", "releasing DRM session for %s", Long.valueOf(dVar.s));
                dVar.c();
            }
            this.b.clear();
        }
        InterfaceC4423beI interfaceC4423beI = this.g;
        if (interfaceC4423beI != null) {
            interfaceC4423beI.d();
            this.g = null;
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public DrmSession acquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData == null) {
            return a(format);
        }
        DrmInitData.SchemeData d2 = d(drmInitData);
        if (d2 == null) {
            return null;
        }
        synchronized (this.b) {
            final d dVar = this.b.get(ByteBuffer.wrap(d2.data));
            if (dVar != null) {
                C1044Mm.a("nf_ExoDrmSessionManager", "exoplayer acquiring DRM session for %s", Long.valueOf(dVar.s));
                if (dVar.j() == 0) {
                    dVar.a();
                    this.h.post(new Runnable() { // from class: o.bjh
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4709bjd.d.this.e();
                        }
                    });
                }
                return dVar;
            }
            d dVar2 = new d(this.h, this.d, -1L, this.e, this.a);
            dVar2.d(new IllegalStateException("DRM not configured for playable"));
            return dVar2;
        }
    }

    private d a(Format format) {
        LinkedList linkedList;
        if (this.i && MimeTypes.isVideo(format.sampleMimeType)) {
            synchronized (this.b) {
                linkedList = new LinkedList(this.b.values());
            }
            Iterator descendingIterator = linkedList.descendingIterator();
            while (descendingIterator.hasNext()) {
                d dVar = (d) descendingIterator.next();
                if (dVar.getError() == null && !dVar.h.get()) {
                    C1044Mm.a("nf_ExoDrmSessionManager", "getNetflixDrmSessionWrapperForNonDrm with %s", Long.valueOf(dVar.s));
                    dVar.j();
                    return dVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public int getCryptoType(Format format) {
        return format.drmInitData == null ? 0 : 2;
    }

    private DrmInitData.SchemeData d(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.get(i);
            if (schemeData.matches(InterfaceC4605bhf.d)) {
                return schemeData;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bjd$d */
    /* loaded from: classes3.dex */
    public static class d implements DrmSession, InterfaceC4424beJ.c {
        private static final long b = TimeUnit.MINUTES.toMillis(5);
        private final C4582bhI a;
        private final Handler d;
        private LicenseType e;
        private InterfaceC4423beI f;
        private DrmSession.DrmSessionException g;
        private InterfaceC4424beJ i;
        private b j;
        private boolean k;
        private FrameworkCryptoConfig l;
        private final a m;
        private int n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f13610o;
        private Boolean p;
        private final Handler r;
        private final long s;
        private FrameworkCryptoConfig t;
        private final AtomicInteger q = new AtomicInteger(0);
        private AtomicBoolean h = new AtomicBoolean(false);
        private final Runnable c = new Runnable() { // from class: o.bjn
            @Override // java.lang.Runnable
            public final void run() {
                C4709bjd.d.this.r();
            }
        };

        @Override // androidx.media3.exoplayer.drm.DrmSession
        public boolean playClearSamplesWithoutKeys() {
            return true;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSession
        public Map<String, String> queryKeyStatus() {
            return null;
        }

        public d(Handler handler, Handler handler2, long j, a aVar, C4582bhI c4582bhI) {
            this.r = handler;
            this.d = handler2;
            this.s = j;
            this.m = aVar;
            this.a = c4582bhI;
        }

        public void c(InterfaceC4423beI interfaceC4423beI, b bVar) {
            synchronized (this) {
                this.f = interfaceC4423beI;
                this.j = bVar;
                if (interfaceC4423beI != null) {
                    this.t = interfaceC4423beI.c(this.s);
                }
                e();
                if (this.p == null) {
                    this.p = Boolean.FALSE;
                }
            }
        }

        public void e() {
            if (Looper.myLooper() == this.r.getLooper()) {
                m();
            } else {
                this.r.post(new Runnable() { // from class: o.bjj
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4709bjd.d.this.m();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m() {
            synchronized (this) {
                if (this.i == null && this.f != null && this.j != null) {
                    C1044Mm.a("nf_ExoDrmSessionManager", "NetflixExoDrmSessionWrapper getting Drm Session for %s", Long.valueOf(this.s));
                    this.d.post(new Runnable() { // from class: o.bjk
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4709bjd.d.this.o();
                        }
                    });
                    try {
                        InterfaceC4424beJ e = this.f.e(Long.valueOf(this.s), this.j.e(), this);
                        this.i = e;
                        e.c(this);
                    } catch (NfDrmException e2) {
                        this.g = new DrmSession.DrmSessionException(e2, 6000);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o() {
            this.m.b(this.s, Event.a);
        }

        /* renamed from: i */
        public void r() {
            if (Looper.myLooper() == this.r.getLooper()) {
                p();
            } else {
                this.r.post(new Runnable() { // from class: o.bjm
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4709bjd.d.this.p();
                    }
                });
            }
        }

        /* renamed from: d */
        public void p() {
            synchronized (this) {
                if (this.i != null) {
                    C1044Mm.a("nf_ExoDrmSessionManager", "closing DRM session for %s", Long.valueOf(this.s));
                    this.i.l();
                    this.f.e(Long.valueOf(this.s));
                    this.i = null;
                    this.t = null;
                    this.l = null;
                    this.g = null;
                }
            }
        }

        public void d(Throwable th) {
            synchronized (this) {
                this.g = new DrmSession.DrmSessionException(th, 6000);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSession
        public int getState() {
            synchronized (this) {
                t();
                if (this.g != null) {
                    return 1;
                }
                InterfaceC4424beJ interfaceC4424beJ = this.i;
                if (interfaceC4424beJ == null) {
                    return 2;
                }
                int r = interfaceC4424beJ.r();
                if (r == 4) {
                    q();
                }
                return r;
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSession
        public DrmSession.DrmSessionException getError() {
            synchronized (this) {
                DrmSession.DrmSessionException drmSessionException = this.g;
                if (drmSessionException != null) {
                    return drmSessionException;
                }
                InterfaceC4424beJ interfaceC4424beJ = this.i;
                if (interfaceC4424beJ == null || interfaceC4424beJ.o() == null) {
                    return null;
                }
                return new DrmSession.DrmSessionException(this.g, 6000);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSession
        public UUID getSchemeUuid() {
            return InterfaceC4605bhf.d;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSession
        /* renamed from: f */
        public FrameworkCryptoConfig getCryptoConfig() {
            InterfaceC4424beJ interfaceC4424beJ;
            synchronized (this) {
                if (this.l == null && (interfaceC4424beJ = this.i) != null && interfaceC4424beJ.s() != null) {
                    this.l = new FrameworkCryptoConfig(NetflixMediaDrm.WIDEVINE_SCHEME, this.i.m(), false);
                }
                FrameworkCryptoConfig frameworkCryptoConfig = this.l;
                if (frameworkCryptoConfig == null) {
                    FrameworkCryptoConfig frameworkCryptoConfig2 = this.t;
                    if (frameworkCryptoConfig2 != null) {
                        return frameworkCryptoConfig2;
                    }
                }
                return frameworkCryptoConfig;
            }
        }

        @Override // o.InterfaceC4424beJ.c
        public void c(final Long l, LicenseType licenseType) {
            synchronized (this) {
                LicenseType licenseType2 = this.e;
                LicenseType licenseType3 = LicenseType.LICENSE_TYPE_OFFLINE;
                if (licenseType2 == licenseType3 && licenseType != licenseType3) {
                    this.a.e(true);
                }
                if (this.e != null) {
                    return;
                }
                this.e = licenseType;
                if (this.p == null) {
                    this.p = Boolean.TRUE;
                }
                this.d.post(new Runnable() { // from class: o.bjs
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4709bjd.d.this.a(l);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Long l) {
            this.m.b(l.longValue(), this.p.booleanValue());
        }

        @Override // o.InterfaceC4424beJ.c
        public void c(Status status, LicenseType licenseType) {
            synchronized (this) {
                LicenseType licenseType2 = this.e;
                LicenseType licenseType3 = LicenseType.LICENSE_TYPE_OFFLINE;
                if (licenseType2 == licenseType3 && licenseType != licenseType3) {
                    this.a.e(false);
                }
                LicenseType licenseType4 = this.e;
                if (licenseType4 == null || licenseType4 == licenseType) {
                    this.g = new NetflixDrmException(status);
                    if (g() == 0) {
                        this.n++;
                        r();
                        this.r.postDelayed(new Runnable() { // from class: o.bjl
                            @Override // java.lang.Runnable
                            public final void run() {
                                C4709bjd.d.this.k();
                            }
                        }, OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k() {
            if (this.h.get() || this.n >= 5) {
                return;
            }
            C1044Mm.d("nf_ExoDrmSessionManager", "attempting prefetch retry for %s", Long.valueOf(this.s));
            e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Long l, String str) {
            this.m.b(l.longValue(), Event.d(str, Event.Component.LICENSE));
        }

        @Override // o.InterfaceC4424beJ.c
        public void b(final Long l, final String str) {
            this.d.post(new Runnable() { // from class: o.bjp
                @Override // java.lang.Runnable
                public final void run() {
                    C4709bjd.d.this.e(l, str);
                }
            });
        }

        @Override // androidx.media3.exoplayer.drm.DrmSession
        public boolean requiresSecureDecoder(String str) {
            MediaCrypto s;
            InterfaceC4424beJ interfaceC4424beJ = this.i;
            if (interfaceC4424beJ != null && (s = interfaceC4424beJ.s()) != null) {
                return s.requiresSecureDecoderComponent(str);
            }
            C1044Mm.d("nf_ExoDrmSessionManager", "could not query if secure decoder needed");
            return true;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSession
        public void acquire(DrmSessionEventListener.EventDispatcher eventDispatcher) {
            C1044Mm.d("nf_ExoDrmSessionManager", "%s acquire for %d", Integer.valueOf(hashCode()), Long.valueOf(this.s));
            if (j() == 0) {
                a();
                e();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSession
        public void release(DrmSessionEventListener.EventDispatcher eventDispatcher) {
            C1044Mm.d("nf_ExoDrmSessionManager", "%s release for %d", Integer.valueOf(hashCode()), Long.valueOf(this.s));
            if (b() == 0) {
                this.r.postDelayed(this.c, b);
            }
        }

        public void a() {
            this.r.removeCallbacks(this.c);
        }

        public void c() {
            a();
            this.h.set(true);
            r();
        }

        public int j() {
            return this.q.getAndIncrement();
        }

        public int b() {
            return this.q.decrementAndGet();
        }

        public int g() {
            return this.q.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l() {
            this.m.b(this.s, Event.d("drmRequested", Event.Component.LICENSE));
        }

        private void t() {
            if (this.f13610o) {
                return;
            }
            this.d.post(new Runnable() { // from class: o.bjg
                @Override // java.lang.Runnable
                public final void run() {
                    C4709bjd.d.this.l();
                }
            });
            this.f13610o = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n() {
            this.m.b(this.s, Event.d("drmOpen", Event.Component.LICENSE));
        }

        private void q() {
            if (this.k) {
                return;
            }
            this.d.post(new Runnable() { // from class: o.bjo
                @Override // java.lang.Runnable
                public final void run() {
                    C4709bjd.d.this.n();
                }
            });
            this.k = true;
        }
    }
}
