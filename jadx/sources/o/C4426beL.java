package o;

import android.media.MediaCrypto;
import android.media.NotProvisionedException;
import android.os.Handler;
import com.netflix.cl.ExtLogger;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.drm.PlatformMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector;
import com.netflix.mediaclient.service.player.drm.LicenseType;
import java.util.HashMap;
import o.InterfaceC4424beJ;

/* renamed from: o.beL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4426beL implements InterfaceC4420beF {
    protected byte[] b;
    protected boolean c;
    protected Handler d;
    protected Exception e;
    protected InterfaceC4424beJ.c f;
    protected Long g;
    protected int h;
    protected InterfaceC4416beB i;
    protected LicenseType j;
    protected int k;
    protected NetflixMediaDrm m;

    /* renamed from: o  reason: collision with root package name */
    protected int f13575o;
    private MediaCrypto r;
    private final int n = InterfaceC4420beF.a.getAndAdd(1);
    protected long l = System.currentTimeMillis();

    private void c(boolean z) {
        this.c = z;
    }

    private void d(InterfaceC4424beJ.c cVar) {
        this.f = cVar;
    }

    @Override // o.InterfaceC4420beF
    public Long a() {
        return this.g;
    }

    @Override // o.InterfaceC4420beF
    public boolean b() {
        return this.k == 0;
    }

    @Override // o.InterfaceC4420beF
    public int c() {
        return 0;
    }

    @Override // o.InterfaceC4420beF
    public InterfaceC4416beB e() {
        return this.i;
    }

    @Override // o.InterfaceC4420beF
    public boolean f() {
        int i = this.k;
        return i == 0 || i == 1;
    }

    @Override // o.InterfaceC4420beF
    public boolean g() {
        return this.k == 1;
    }

    @Override // o.InterfaceC4420beF
    public boolean h() {
        return this.c;
    }

    @Override // o.InterfaceC4424beJ
    public byte[] m() {
        return this.b;
    }

    @Override // o.InterfaceC4424beJ
    public Exception o() {
        return this.e;
    }

    @Override // o.InterfaceC4424beJ
    public int p() {
        return this.n;
    }

    @Override // o.InterfaceC4424beJ
    public int r() {
        return this.k;
    }

    @Override // o.InterfaceC4424beJ
    public MediaCrypto s() {
        return this.r;
    }

    public C4426beL(Handler handler, NetflixMediaDrm netflixMediaDrm, Long l, InterfaceC4416beB interfaceC4416beB, InterfaceC4424beJ.c cVar) {
        this.k = 0;
        this.d = handler;
        this.m = netflixMediaDrm;
        this.g = l;
        this.f13575o = (int) l.longValue();
        this.h = (int) (l.longValue() >> 32);
        this.j = interfaceC4416beB.h();
        this.i = interfaceC4416beB;
        this.k = 2;
        this.f = cVar;
        v();
    }

    private void v() {
        try {
            q();
        } catch (NotProvisionedException unused) {
            u();
        } catch (Exception e) {
            b(DrmMetricsCollector.WvApi.m, this.m, e);
            if (this.k == 3) {
                l();
            }
            throw e;
        }
    }

    @Override // o.InterfaceC4424beJ
    public void c(InterfaceC4424beJ.c cVar) {
        C1044Mm.a("nf_MediaDrmSession", "%d set listener and use session.", Integer.valueOf(hashCode()));
        d(cVar);
        x();
        c(true);
    }

    private void x() {
        if (this.i.o()) {
            d(this.i.g(), "useCachedLicense");
        }
    }

    @Override // o.InterfaceC4420beF
    public void e(InterfaceC4416beB interfaceC4416beB) {
        if (interfaceC4416beB == null || interfaceC4416beB == this.i) {
            return;
        }
        C1044Mm.a("nf_MediaDrmSession", "updateLicenseContext %d -> %d from=%s to=%s", this.g, interfaceC4416beB.f(), this.j, interfaceC4416beB.h());
        if (this.j == LicenseType.LICENSE_TYPE_MANIFEST_LDL && interfaceC4416beB.k() != null) {
            Long f = interfaceC4416beB.f();
            this.g = f;
            this.f13575o = (int) f.longValue();
            this.h = (int) (this.g.longValue() >> 32);
            this.i = interfaceC4416beB;
            interfaceC4416beB.d(interfaceC4416beB.k().bytes());
        }
        this.i.b(interfaceC4416beB.n());
        LicenseType h = interfaceC4416beB.h();
        this.j = h;
        this.i.b(h);
    }

    @Override // o.InterfaceC4424beJ
    public void l() {
        this.c = false;
        int i = this.k;
        if (i == 3 || i == 4 || i == 1) {
            try {
                t();
                this.m.closeSession(this.b);
            } catch (Exception e) {
                b(DrmMetricsCollector.WvApi.b, this.m, e);
            }
        }
        this.f = null;
        this.k = 0;
    }

    protected void q() {
        InterfaceC4424beJ.c cVar = this.f;
        if (cVar != null) {
            cVar.b(this.g, "openDrmSessionStart");
        }
        C1044Mm.c("nf_MediaDrmSession", "openSessionGetKeyRequest calling mediaDrm openSession %d", this.g);
        this.b = this.m.openSession(NetflixMediaDrm.SessionType.STREAMING);
        this.k = 3;
        this.r = new MediaCrypto(C8189dfg.d, this.b);
        InterfaceC4424beJ.c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.b(this.g, "openDrmSessionEnd");
        }
        k();
    }

    private void u() {
        C1044Mm.e("nf_MediaDrmSession", "postProvisionRequest ...");
        this.d.obtainMessage(1, this.h, this.f13575o, this.m.getProvisionRequest()).sendToTarget();
    }

    @Override // o.InterfaceC4420beF
    public void k() {
        int i;
        InterfaceC4424beJ.c cVar = this.f;
        if (cVar != null) {
            cVar.b(this.g, "generateChallengeStart");
        }
        C1044Mm.a("nf_MediaDrmSession", "postKeyRequest start %d %s", this.g, this.j);
        int i2 = 2;
        if (this.j.equals(LicenseType.LICENSE_TYPE_OFFLINE)) {
            i = 2;
            i2 = 4;
        } else {
            if (this.k != 4) {
                LicenseType licenseType = this.j;
                LicenseType licenseType2 = LicenseType.LICENSE_TYPE_LDL;
                if (licenseType.equals(licenseType2)) {
                    this.i.b(licenseType2);
                    C1044Mm.a("nf_MediaDrmSession", "request LDL %d", this.g);
                    i2 = 3;
                    i = 1;
                }
            }
            if (this.k != 4 && this.j.equals(LicenseType.LICENSE_TYPE_MANIFEST_LDL)) {
                C1044Mm.a("nf_MediaDrmSession", "request manifest LDL %d", this.g);
                i2 = -1;
            } else {
                this.i.b(LicenseType.LICENSE_TYPE_STANDARD);
                C1044Mm.a("nf_MediaDrmSession", "request STANDARD %d", this.g);
            }
            i = 1;
        }
        try {
            this.i.b(this.m.getKeyRequest(this.b, this.i.e(), new String(), i, new HashMap<>()).getData());
            if (i2 > 0) {
                this.d.obtainMessage(i2, this.h, this.f13575o, this.i).sendToTarget();
            }
            InterfaceC4424beJ.c cVar2 = this.f;
            if (cVar2 != null) {
                cVar2.b(this.g, "generateChallengeEnd");
            }
            C1044Mm.a("nf_MediaDrmSession", "postKeyRequest succeeds. %d", this.g);
        } catch (NotProvisionedException e) {
            C1044Mm.e("nf_MediaDrmSession", "keyRequest has NotProvisionedException.");
            throw e;
        }
    }

    protected void t() {
        C1044Mm.a("nf_MediaDrmSession", "postReleaseLicenseRequest start %d", this.g);
        this.d.obtainMessage(5, this.h, this.f13575o, this.i).sendToTarget();
    }

    private void c(StatusCode statusCode, Exception exc) {
        this.e = exc;
        if (this.f != null) {
            Throwable cause = exc.getCause();
            Throwable th = exc;
            if (cause != null) {
                th = exc.getCause();
            }
            this.f.c(new NetflixStatus(statusCode, th), this.j);
        }
        this.k = 1;
        this.d.obtainMessage(0, this.h, this.f13575o, this.e).sendToTarget();
    }

    @Override // o.InterfaceC4420beF
    public void d(byte[] bArr, String str) {
        C1044Mm.a("nf_MediaDrmSession", "provideKeyResponse start %d %s %s", this.g, this.j, str);
        InterfaceC4424beJ.c cVar = this.f;
        if (cVar != null) {
            cVar.b(this.g, "provideLicenseStart");
            InterfaceC4424beJ.c cVar2 = this.f;
            Long l = this.g;
            cVar2.b(l, "provideLicenseStart" + str);
        }
        try {
            this.m.provideKeyResponse(this.b, bArr);
            this.k = 4;
            C1044Mm.a("nf_MediaDrmSession", "provideKeyResponse succeeds %d", this.g);
            InterfaceC4424beJ.c cVar3 = this.f;
            if (cVar3 != null) {
                cVar3.b(this.g, "provideLicenseEnd");
                InterfaceC4424beJ.c cVar4 = this.f;
                Long l2 = this.g;
                cVar4.b(l2, "provideLicenseEnd" + str);
                this.f.c(this.g, this.j);
            }
        } catch (Exception e) {
            b(DrmMetricsCollector.WvApi.p, this.m, e);
            c(StatusCode.DRM_FAILURE_MEDIADRM_PROVIDE_KEY_RESPONSE, e);
        }
    }

    @Override // o.InterfaceC4420beF
    public void d(Status status, boolean z) {
        if (z) {
            try {
                if (this.j.equals(LicenseType.LICENSE_TYPE_STANDARD)) {
                    C1044Mm.e("nf_MediaDrmSession", "LicenseRequestFailed, retry with standard license.");
                    k();
                    return;
                }
            } catch (Exception unused) {
                C1044Mm.e("nf_MediaDrmSession", "LicenseRequestFailed NotProvisionedException.");
            }
        }
        this.k = 1;
        InterfaceC4424beJ.c cVar = this.f;
        if (cVar != null) {
            cVar.c(status, this.j);
        }
    }

    @Override // o.InterfaceC4420beF
    public void j() {
        InterfaceC4424beJ.c cVar = this.f;
        if (cVar != null) {
            cVar.b(this.g, "acquireLicenseStart");
        }
    }

    @Override // o.InterfaceC4420beF
    public void i() {
        InterfaceC4424beJ.c cVar = this.f;
        if (cVar != null) {
            cVar.b(this.g, "acquireLicenseEnd");
        }
    }

    @Override // o.InterfaceC4420beF
    public long d() {
        return System.currentTimeMillis() - this.l;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(InterfaceC4420beF interfaceC4420beF) {
        long d = d();
        long d2 = interfaceC4420beF.d();
        if (!this.c || interfaceC4420beF.h()) {
            if ((this.c || !interfaceC4420beF.h()) && c() <= interfaceC4420beF.c()) {
                if (c() < interfaceC4420beF.c()) {
                    return 1;
                }
                int i = (d > d2 ? 1 : (d == d2 ? 0 : -1));
                if (i > 0) {
                    return -1;
                }
                return i < 0 ? 1 : 0;
            }
            return -1;
        }
        return 1;
    }

    public static C4426beL e(Handler handler, NetflixMediaDrm netflixMediaDrm, Long l, InterfaceC4416beB interfaceC4416beB, InterfaceC4424beJ.c cVar) {
        if (netflixMediaDrm instanceof PlatformMediaDrm) {
            return new C4426beL(handler, netflixMediaDrm, l, interfaceC4416beB, cVar);
        }
        throw new IllegalStateException("We do NOT support " + netflixMediaDrm.getClass().getSimpleName());
    }

    @Override // o.InterfaceC4420beF
    public void n() {
        C1044Mm.e("nf_MediaDrmSession", "Re-init after provisioning");
        if (this.k == 2) {
            C1044Mm.e("nf_MediaDrmSession", "Session is still opening, move it to opened.");
            try {
                v();
                return;
            } catch (Throwable th) {
                ExtLogger.INSTANCE.logError("Failed to re-initialize NfDrmSession, playback fails", th);
                C1044Mm.b("nf_MediaDrmSession", th, "Failed to re initialize, leave playback agent to report an error!", new Object[0]);
                return;
            }
        }
        C1044Mm.j("nf_MediaDrmSession", "Session was already opened!");
    }

    private void b(DrmMetricsCollector.WvApi wvApi, NetflixMediaDrm netflixMediaDrm, Throwable th) {
        DrmMetricsCollector.d.e(new aPH(netflixMediaDrm, DrmMetricsCollector.NfAppStage.b).b(wvApi).c("NfDrmSession").b(th));
    }
}
