package o;

import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector;
import com.netflix.mediaclient.service.player.drm.LicenseType;
import com.netflix.mediaclient.service.player.drm.NfDrmException;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.InterfaceC4424beJ;
import o.InterfaceC4522bgB;
import org.json.JSONObject;
import org.linphone.BuildConfig;

/* renamed from: o.beD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4418beD implements NetflixMediaDrm.OnEventListener {
    private static final byte[] n = {8, 1, 18, 16, 0, 0, 0, 0, 5, -124, -77, 106, 0, 0, 0, 0, 0, 0, 0, 0};
    protected boolean a;
    protected boolean b;
    protected boolean c;
    protected InterfaceC1843aQh e;
    protected InterfaceC4420beF h;
    protected NetflixMediaDrm i;
    protected aTX j;
    protected Handler l;

    /* renamed from: o  reason: collision with root package name */
    protected C4427beM f13574o;
    private byte[] p;
    private FrameworkCryptoConfig r;
    protected int g = 3;
    protected int f = 5;
    protected Map<Long, InterfaceC4420beF> d = Collections.synchronizedMap(new HashMap());
    private List<Pair<Long, Integer>> m = Collections.synchronizedList(new ArrayList());
    private int k = 0;

    private void e() {
        this.r = null;
        this.p = null;
    }

    public void e(Long l, Status status) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4418beD(Looper looper, C4427beM c4427beM) {
        this.f13574o = c4427beM;
        this.e = c4427beM.a().c();
        this.j = this.f13574o.g();
        Handler c = c(looper);
        this.l = c;
        this.j.e(c);
        c(this.f13574o.f());
        e();
    }

    public FrameworkCryptoConfig c() {
        FrameworkCryptoConfig frameworkCryptoConfig;
        synchronized (this) {
            if (this.p != null && C8189dfg.e.getAndSet(false)) {
                this.i.closeSession(this.p);
                this.p = null;
                this.r = null;
                this.f++;
                e();
            }
            frameworkCryptoConfig = this.r;
        }
        return frameworkCryptoConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Long l) {
        C1044Mm.c("nf_MediaDrmController", "reportLicenseRequestStarted DrmSessionCount=%d", Integer.valueOf(this.d.size()));
        InterfaceC4420beF interfaceC4420beF = this.d.get(l);
        if (interfaceC4420beF != null) {
            interfaceC4420beF.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Long l) {
        InterfaceC4420beF interfaceC4420beF = this.d.get(l);
        if (interfaceC4420beF != null) {
            interfaceC4420beF.d((Status) InterfaceC1078Nw.l, false);
        }
    }

    private Handler c(Looper looper) {
        return new Handler(looper) { // from class: o.beD.4
            private Long a(int i, int i2) {
                return Long.valueOf(i2 | (i << 32));
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Object obj;
                Long a = a(message.arg1, message.arg2);
                int i = message.what;
                if (i == 0) {
                    Object obj2 = message.obj;
                    if (obj2 != null && (obj2 instanceof Exception)) {
                        C4418beD.this.c(a.longValue(), (Exception) obj2);
                        return;
                    } else {
                        C1044Mm.j("nf_MediaDrmController", "DrmSession reported error, unknown cause.BUG!!!");
                        return;
                    }
                }
                if (i == 1) {
                    Object obj3 = message.obj;
                    if (obj3 != null && (obj3 instanceof NetflixMediaDrm.ProvisionRequest)) {
                        C4418beD c4418beD = C4418beD.this;
                        if (c4418beD.b) {
                            return;
                        }
                        c4418beD.e((NetflixMediaDrm.ProvisionRequest) obj3);
                        return;
                    }
                    C4418beD.this.a(a);
                } else if (i == 2 || i == 3) {
                    boolean z = i == 3;
                    Object obj4 = message.obj;
                    if (obj4 == null || !(obj4 instanceof C4462bev)) {
                        return;
                    }
                    C4462bev c4462bev = (C4462bev) obj4;
                    C1044Mm.a("nf_MediaDrmController", "about to fetchStreamingLicense for session %s, challenge [%d], %s", a, Integer.valueOf(c4462bev.a().length()), c4462bev.h());
                    C4418beD.this.f(a);
                    C4418beD.this.f13574o.a().d(c4462bev, C4418beD.this.d(a, z));
                } else if (i != 5) {
                    if (i == 6 && (obj = message.obj) != null && (obj instanceof JSONObject)) {
                        JSONObject jSONObject = (JSONObject) obj;
                    }
                } else {
                    C1044Mm.e("nf_MediaDrmController", "handling releaseLicense MSG_RELEASE_LICENSE");
                    Object obj5 = message.obj;
                    if (obj5 == null || !(obj5 instanceof C4462bev)) {
                        return;
                    }
                    C4462bev c4462bev2 = (C4462bev) obj5;
                    AbstractC4561bgo m = c4462bev2.m();
                    C1044Mm.a("nf_MediaDrmController", "handling releaseLicense link: %s", m);
                    if (m != null && C8168dfL.h(m.d())) {
                        C4418beD.this.j.a(C4390bdc.a(m, c4462bev2.n()));
                    } else {
                        C1044Mm.e("nf_MediaDrmController", "dropping releaseLicense - no link");
                    }
                }
            }
        };
    }

    protected void c(long j, Exception exc) {
        if (exc instanceof MediaDrmResetException) {
            this.g--;
            C1044Mm.j("nf_MediaDrmController", "Attempt to recover from Exception %s with session %d ...", exc, Long.valueOf(j));
            try {
                this.i.close();
            } catch (Throwable th) {
                c(DrmMetricsCollector.WvApi.e, this.i, th);
            }
            this.d.clear();
            this.h = null;
            f();
            return;
        }
        C1044Mm.j("nf_MediaDrmController", "DrmSession reported Exception %s with session %d", exc, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(NetflixMediaDrm.ProvisionRequest provisionRequest) {
        this.b = true;
        aPS.c(provisionRequest, new InterfaceC1836aQa() { // from class: o.beD.3
            @Override // o.InterfaceC1836aQa
            public void a(byte[] bArr) {
                C1044Mm.e("nf_MediaDrmController", "provision request has response.");
                C4418beD.this.b(bArr);
            }

            @Override // o.InterfaceC1836aQa
            public void a(int i) {
                C1044Mm.d("nf_MediaDrmController", "provision request aborted.");
                C4418beD c4418beD = C4418beD.this;
                DrmMetricsCollector.WvApi wvApi = DrmMetricsCollector.WvApi.f;
                NetflixMediaDrm netflixMediaDrm = c4418beD.i;
                c4418beD.c(wvApi, netflixMediaDrm, new Throwable("httpStatusCode=" + i));
                C4418beD.this.b((byte[]) null);
            }
        }).execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final byte[] bArr) {
        this.l.post(new Runnable() { // from class: o.beC
            @Override // java.lang.Runnable
            public final void run() {
                C4418beD.this.a(bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(byte[] bArr) {
        if (bArr != null) {
            try {
                this.i.provideProvisionResponse(bArr);
                this.b = false;
                b();
                return;
            } catch (Exception e) {
                c(DrmMetricsCollector.WvApi.q, this.i, e);
                this.b = false;
                C1044Mm.e("nf_MediaDrmController", "provision failed %s", e);
                return;
            }
        }
        this.b = false;
        a();
    }

    private void c(boolean z) {
        f();
        NetflixMediaDrm netflixMediaDrm = this.i;
        int maxSessionCount = netflixMediaDrm == null ? 0 : netflixMediaDrm.getMaxSessionCount();
        boolean z2 = z || maxSessionCount < 8;
        this.c = z2;
        if (z) {
            C1044Mm.e("nf_MediaDrmController", "license prefetch is disabled by config");
        } else if (z2) {
            C1044Mm.e("nf_MediaDrmController", "license prefetch is disabled due to insufficient session");
        }
        int min = Math.min(maxSessionCount - 3, 20) - 1;
        this.f = min;
        this.a = min <= 8;
        C8192dfj.e(this.i);
    }

    public void d() {
        C1044Mm.e("nf_MediaDrmController", BuildConfig.BUILD_TYPE);
        NetflixMediaDrm netflixMediaDrm = this.i;
        if (netflixMediaDrm != null) {
            byte[] bArr = this.p;
            if (bArr != null) {
                try {
                    netflixMediaDrm.closeSession(bArr);
                } catch (Exception e) {
                    c(DrmMetricsCollector.WvApi.b, this.i, e);
                }
            }
            try {
                this.i.close();
            } catch (Exception e2) {
                c(DrmMetricsCollector.WvApi.e, this.i, e2);
            }
        }
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrm.OnEventListener
    public void onEvent(NetflixMediaDrm netflixMediaDrm, final byte[] bArr, int i, int i2, byte[] bArr2) {
        C1044Mm.a("nf_MediaDrmController", "onEvent [" + i + "]", bArr);
        if (i == 3) {
            C1044Mm.e("nf_MediaDrmController", "EVENT_KEY_EXPIRED - error");
        } else if (i == 2) {
            C1044Mm.e("nf_MediaDrmController", "EVENT_KEY_REQUIRED - to renew");
            this.l.post(new Runnable() { // from class: o.beD.5
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceC4420beF c = C4418beD.this.c(bArr);
                    if (c != null) {
                        try {
                            c.k();
                        } catch (NotProvisionedException e) {
                            C1044Mm.j("nf_MediaDrmController", "exception trying to renew %s", e);
                        } catch (Exception e2) {
                            C1044Mm.j("nf_MediaDrmController", "exception trying to renew %s", e2);
                        }
                    }
                }
            });
        } else if (i == 5) {
            C1044Mm.e("nf_MediaDrmController", "EVENT_SESSION_RECLAIMED.");
            this.l.post(new Runnable() { // from class: o.beD.2
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceC4420beF c = C4418beD.this.c(bArr);
                    if (c != null) {
                        C4418beD.this.e(c.a());
                    }
                }
            });
        } else if (i == 4) {
            C1044Mm.e("nf_MediaDrmController", "EVENT_VENDOR_DEFINED");
        } else if (i == 1) {
            C1044Mm.e("nf_MediaDrmController", "EVENT_PROVISION_REQUIRED -  shouldn't happen, will handle later.");
        } else {
            C1044Mm.e("nf_MediaDrmController", "EVENT_UNKNOWN");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC4397bdj d(final Long l, final boolean z) {
        return new AbstractC4397bdj() { // from class: o.beD.1
            @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
            public void d(final JSONObject jSONObject, final Status status) {
                C1044Mm.a("nf_MediaDrmController", "fetchStreamingLicense movie %d, result %s", l, status);
                final boolean j = status.j();
                C4418beD.this.l.post(new Runnable() { // from class: o.beD.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            InterfaceC4420beF c = C4418beD.this.c(l, (InterfaceC4416beB) null, (InterfaceC4424beJ.c) null);
                            c.i();
                            if (!j || jSONObject == null) {
                                C1044Mm.e("nf_MediaDrmController", "fetchStreamingLicense failed");
                                c.d(status, z);
                                return;
                            }
                            InterfaceC4416beB e = c.e();
                            e.a(jSONObject);
                            if (c.h()) {
                                c.d(e.g(), "fetchCallBack");
                            }
                        } catch (NfDrmException unused) {
                            C1044Mm.e("nf_MediaDrmController", "fetchStreamingLicense returned, no matching session");
                        }
                    }
                });
            }
        };
    }

    public InterfaceC4420beF c(Long l, InterfaceC4416beB interfaceC4416beB, InterfaceC4424beJ.c cVar) {
        synchronized (this) {
            C1044Mm.c("nf_MediaDrmController", "getDrmSession DrmSessionCount=%d", Integer.valueOf(this.d.size()));
            if (this.i == null) {
                f();
            }
            g();
            Exception exc = null;
            if (interfaceC4416beB != null) {
                InterfaceC4420beF interfaceC4420beF = this.d.get(l);
                if (interfaceC4420beF != null && interfaceC4420beF.e().equals(interfaceC4416beB) && !interfaceC4420beF.f()) {
                    interfaceC4420beF.e(interfaceC4416beB);
                    if (interfaceC4416beB.h().equals(LicenseType.LICENSE_TYPE_STANDARD) && !interfaceC4420beF.e().o()) {
                        C1044Mm.a("nf_MediaDrmController", "%d has pending LDL session, promote pending request.", l);
                        this.f13574o.a().e(interfaceC4420beF.e(), d(l, false));
                    }
                    C1044Mm.a("nf_MediaDrmController", "getDrmSession %d using cached session", l);
                    return interfaceC4420beF;
                }
                C4462bev c4462bev = (C4462bev) interfaceC4416beB;
                if (interfaceC4420beF == null && c4462bev.k() != null && this.h != null && c4462bev.k().drmSessionId() == this.h.p() && this.h.d() <= 900000) {
                    C1044Mm.a("nf_MediaDrmController", "getDrmSession %d using mLicensedManifestSession", l);
                    InterfaceC4420beF interfaceC4420beF2 = this.h;
                    this.h = null;
                    this.d.put(c4462bev.f(), interfaceC4420beF2);
                    interfaceC4420beF2.e(interfaceC4416beB);
                    return interfaceC4420beF2;
                }
                if (interfaceC4420beF != null) {
                    Object[] objArr = new Object[3];
                    objArr[0] = l;
                    objArr[1] = interfaceC4420beF.e().equals(interfaceC4416beB) ? "for" : "not for";
                    objArr[2] = interfaceC4420beF.b() ? ", already closed." : interfaceC4420beF.g() ? ", has error." : ".";
                    C1044Mm.a("nf_MediaDrmController", "%d has cached drm session %s this manifest %s", objArr);
                    e(l);
                }
                e(this.f - 1);
                try {
                    C1044Mm.a("nf_MediaDrmController", "getDrmSession creating newWidevineDrmSession");
                    this.d.put(l, C4426beL.e(this.l, this.i, Long.valueOf(l.longValue()), interfaceC4416beB, cVar));
                } catch (Exception e) {
                    exc = e;
                    C1044Mm.b("nf_MediaDrmController", exc, "unable to get newWidevineDrmSession", new Object[0]);
                    c(l.longValue(), exc);
                }
            }
            InterfaceC4420beF interfaceC4420beF3 = this.d.get(l);
            if (interfaceC4420beF3 != null) {
                return interfaceC4420beF3;
            }
            throw new NfDrmException(this.d.size(), this.f, exc);
        }
    }

    public C4419beE d(boolean z) {
        synchronized (this) {
            try {
                InterfaceC4420beF interfaceC4420beF = this.h;
                if (interfaceC4420beF != null && interfaceC4420beF.d() >= 450000) {
                    this.h.l();
                    this.h = null;
                }
                if (this.c && z) {
                    return null;
                }
                if (this.h == null) {
                    e(this.f - 1);
                    C4462bev c4462bev = new C4462bev(LicenseType.LICENSE_TYPE_MANIFEST_LDL, "", n, "", "", 0L, null, false);
                    C1044Mm.a("nf_MediaDrmController", "getManifestKeyRequest creating newWidevineDrmSession");
                    this.h = C4426beL.e(this.l, this.i, 0L, c4462bev, null);
                } else {
                    C1044Mm.a("nf_MediaDrmController", "getManifestKeyRequest using existing mLicensedManifestSession");
                }
                return new C4419beE(this.h.e().a(), this.h.e().d(), this.h.p());
            } catch (Exception e) {
                C1044Mm.b("nf_MediaDrmController", e, "unable to get manifest key request", new Object[0]);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final Long l) {
        this.l.post(new Runnable() { // from class: o.beA
            @Override // java.lang.Runnable
            public final void run() {
                C4418beD.this.b(l);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void b(Long l) {
        this.d.remove(l);
    }

    private void g() {
        if (this.d.isEmpty()) {
            return;
        }
        synchronized (this.d) {
            Iterator<Map.Entry<Long, InterfaceC4420beF>> it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                InterfaceC4420beF value = it.next().getValue();
                if ((value.d() >= 900000 && !value.h()) || value.g()) {
                    value.l();
                    it.remove();
                } else if (value.b()) {
                    it.remove();
                }
            }
        }
    }

    private void e(int i) {
        if (this.d.isEmpty()) {
            return;
        }
        C1044Mm.a("nf_MediaDrmController", "purgeCachedSessions has  %d, target is %d", Integer.valueOf(this.d.size()), Integer.valueOf(i));
        int size = this.d.size();
        if (size > i) {
            ArrayList<InterfaceC4420beF> arrayList = new ArrayList(this.d.values());
            Collections.sort(arrayList);
            for (InterfaceC4420beF interfaceC4420beF : arrayList) {
                if (!interfaceC4420beF.h() && size > i) {
                    size--;
                    Long a = interfaceC4420beF.a();
                    e(a);
                    C1044Mm.a("nf_MediaDrmController", "purgeCachedSessions remove a cached session %d", a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Long l) {
        InterfaceC4420beF remove = this.d.remove(l);
        if (remove != null) {
            remove.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(final boolean z, final boolean z2) {
        this.l.post(new Runnable() { // from class: o.beD.6
            @Override // java.lang.Runnable
            public void run() {
                if (!C4418beD.this.d.isEmpty()) {
                    synchronized (C4418beD.this.d) {
                        Iterator<Map.Entry<Long, InterfaceC4420beF>> it = C4418beD.this.d.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<Long, InterfaceC4420beF> next = it.next();
                            if (!z || !next.getValue().h()) {
                                next.getValue().l();
                                it.remove();
                            }
                        }
                        InterfaceC4420beF interfaceC4420beF = C4418beD.this.h;
                        if (interfaceC4420beF != null) {
                            interfaceC4420beF.l();
                            C4418beD.this.h = null;
                        }
                    }
                }
                C4418beD.this.m.clear();
                if (z2) {
                    C4418beD.this.d();
                }
            }
        });
    }

    InterfaceC4420beF c(byte[] bArr) {
        if (this.d.isEmpty()) {
            return null;
        }
        synchronized (this.d) {
            for (Map.Entry<Long, InterfaceC4420beF> entry : this.d.entrySet()) {
                InterfaceC4420beF value = entry.getValue();
                if (Arrays.equals(value.m(), bArr)) {
                    return value;
                }
            }
            return null;
        }
    }

    private void f() {
        synchronized (this) {
            try {
                try {
                    try {
                        NetflixMediaDrm e = C8189dfg.e(this);
                        this.i = e;
                        e.setPropertyString(NetflixMediaDrm.PROPERTY_SESSION_SHARING, "enable");
                    } catch (Exception e2) {
                        c(DrmMetricsCollector.WvApi.s, this.i, e2);
                    }
                } catch (MediaDrmResetException e3) {
                    C1044Mm.b("nf_MediaDrmController", e3, "Failed to instantiate MediaDrm, media server is restarting...", new Object[0]);
                    c(e3);
                }
            } catch (UnsupportedSchemeException e4) {
                C1044Mm.b("nf_MediaDrmController", e4, "fail to instantiate MediaDrm", new Object[0]);
            }
        }
    }

    private void c(MediaDrmResetException mediaDrmResetException) {
        int i = this.k;
        if (i >= 2) {
            throw mediaDrmResetException;
        }
        this.k = i + 1;
        C1044Mm.d("nf_MediaDrmController", "MediaDrm instance is not usable anymore, recreate!");
        try {
            this.i.close();
        } catch (Throwable th) {
            c(DrmMetricsCollector.WvApi.e, this.i, th);
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(final C5102bsS c5102bsS) {
        if (this.c) {
            return;
        }
        final boolean z = c5102bsS.b() == PlayerPrefetchSource.PlayByUser;
        this.l.post(new Runnable() { // from class: o.beD.7
            @Override // java.lang.Runnable
            public void run() {
                long e = c5102bsS.e();
                Integer valueOf = Integer.valueOf(c5102bsS.b().b());
                if (C4418beD.this.d.get(Long.valueOf(e)) != null) {
                    C1044Mm.a("nf_MediaDrmController", "movieId=%d priority=%d already cached", Long.valueOf(e), valueOf);
                } else if (c5102bsS.b().d() || (c5102bsS.b().f() && C4418beD.this.a)) {
                    C1044Mm.a("nf_MediaDrmController", "movieId=%d priority=%d skip", Long.valueOf(e), valueOf);
                } else {
                    C1044Mm.a("nf_MediaDrmController", "movieId=%d priority=%d request manifest", Long.valueOf(e), valueOf);
                    C4418beD.this.m.add(new Pair(Long.valueOf(e), valueOf));
                    C4418beD.this.f13574o.b().c(Long.valueOf(e), C4877boF.e(c5102bsS), new InterfaceC4522bgB.c() { // from class: o.beD.7.5
                        @Override // o.InterfaceC4522bgB.c
                        public String d() {
                            return "MediaDrmController prefetchLicense";
                        }

                        @Override // o.InterfaceC4522bgB.c
                        public void d(InterfaceC4525bgE interfaceC4525bgE, boolean z2) {
                            AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                            C4418beD.this.a(interfaceC4525bgE, z2, z);
                        }

                        @Override // o.InterfaceC4522bgB.c
                        public void d(Long l, Status status) {
                            C4418beD.this.e(l, status);
                        }
                    });
                }
            }
        });
    }

    private void b() {
        synchronized (this.d) {
            for (InterfaceC4420beF interfaceC4420beF : this.d.values()) {
                if (interfaceC4420beF != null) {
                    interfaceC4420beF.n();
                }
            }
        }
    }

    private void a() {
        synchronized (this.d) {
            for (InterfaceC4420beF interfaceC4420beF : this.d.values()) {
                if (interfaceC4420beF != null) {
                    interfaceC4420beF.d((Status) InterfaceC1078Nw.l, false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(o.InterfaceC4525bgE r18, boolean r19, boolean r20) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Long r0 = r18.aa()
            java.util.Map<java.lang.Long, o.beF> r2 = r1.d
            java.lang.Object r2 = r2.get(r0)
            if (r2 == 0) goto L1a
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "nf_MediaDrmController"
            java.lang.String r3 = "onManifestAvailable, however there is already a session %d"
            o.C1044Mm.a(r2, r3, r0)
            return
        L1a:
            o.beF r2 = r1.h
            if (r2 == 0) goto L44
            boolean r3 = r2.h()
            if (r3 != 0) goto L44
            com.netflix.mediaclient.media.manifest.ManifestLimitedLicense r3 = r18.as()
            if (r3 == 0) goto L44
            com.netflix.mediaclient.media.manifest.ManifestLimitedLicense r3 = r18.as()
            int r3 = r3.drmSessionId()
            int r2 = r2.p()
            if (r3 != r2) goto L44
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "nf_MediaDrmController"
            java.lang.String r3 = "onManifestAvailable, however there is already a license in manifest %d"
            o.C1044Mm.a(r2, r3, r0)
            return
        L44:
            boolean r2 = r18.at()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 != 0) goto Lb6
            long r4 = java.lang.System.nanoTime()
            if (r20 == 0) goto L55
            com.netflix.mediaclient.service.player.drm.LicenseType r6 = com.netflix.mediaclient.service.player.drm.LicenseType.LICENSE_TYPE_STANDARD
            goto L57
        L55:
            com.netflix.mediaclient.service.player.drm.LicenseType r6 = com.netflix.mediaclient.service.player.drm.LicenseType.LICENSE_TYPE_LDL
        L57:
            r8 = r6
            if (r20 == 0) goto L62
            java.lang.String r6 = "nf_MediaDrmController"
            java.lang.String r7 = "onManifestAvailable, asking for LICENSE_TYPE_STANDARD"
            o.C1044Mm.e(r6, r7)
            goto L69
        L62:
            java.lang.String r6 = "nf_MediaDrmController"
            java.lang.String r7 = "onManifestAvailable, asking for LICENSE_TYPE_LDL"
            o.C1044Mm.e(r6, r7)
        L69:
            java.lang.String r9 = java.lang.Long.toString(r4)
            byte[] r10 = r18.R()
            java.lang.String r11 = r18.S()
            java.lang.String r12 = r18.Q()
            java.lang.Long r4 = r18.aa()
            long r13 = r4.longValue()
            com.netflix.mediaclient.service.player.manifest.LiveMetadata r4 = r18.n()
            if (r4 == 0) goto L8a
        L87:
            r16 = r3
            goto L8c
        L8a:
            r3 = 0
            goto L87
        L8c:
            o.bev r3 = new o.bev
            r15 = 0
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16)
            java.lang.Object[] r4 = new java.lang.Object[]{r0}     // Catch: com.netflix.mediaclient.service.player.drm.NfDrmException -> Lab
            java.lang.String r5 = "nf_MediaDrmController"
            java.lang.String r6 = "onManifestAvailable, getDrmSession %d"
            o.C1044Mm.a(r5, r6, r4)     // Catch: com.netflix.mediaclient.service.player.drm.NfDrmException -> Lab
            long r4 = r0.longValue()     // Catch: com.netflix.mediaclient.service.player.drm.NfDrmException -> Lab
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: com.netflix.mediaclient.service.player.drm.NfDrmException -> Lab
            r5 = 0
            r1.c(r4, r3, r5)     // Catch: com.netflix.mediaclient.service.player.drm.NfDrmException -> Lab
            goto Lb8
        Lab:
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            java.lang.String r4 = "nf_MediaDrmController"
            java.lang.String r5 = "can't create drm session for %d"
            o.C1044Mm.a(r4, r5, r3)
        Lb6:
            if (r2 == 0) goto Le1
        Lb8:
            java.util.List<android.util.Pair<java.lang.Long, java.lang.Integer>> r2 = r1.m
            monitor-enter(r2)
            java.util.List<android.util.Pair<java.lang.Long, java.lang.Integer>> r3 = r1.m     // Catch: java.lang.Throwable -> Lde
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lde
        Lc1:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lde
            if (r4 == 0) goto Ldc
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lde
            android.util.Pair r4 = (android.util.Pair) r4     // Catch: java.lang.Throwable -> Lde
            java.lang.Object r5 = r4.first     // Catch: java.lang.Throwable -> Lde
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> Lde
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> Lde
            if (r5 == 0) goto Lc1
            java.util.List<android.util.Pair<java.lang.Long, java.lang.Integer>> r0 = r1.m     // Catch: java.lang.Throwable -> Lde
            r0.remove(r4)     // Catch: java.lang.Throwable -> Lde
        Ldc:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lde
            goto Le1
        Lde:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lde
            throw r0
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4418beD.a(o.bgE, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DrmMetricsCollector.WvApi wvApi, NetflixMediaDrm netflixMediaDrm, Throwable th) {
        DrmMetricsCollector.d.e(new aPH(netflixMediaDrm, DrmMetricsCollector.NfAppStage.b).b(wvApi).c("MediaDrmController").b(th));
    }
}
