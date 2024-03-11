package o;

import android.content.Context;
import android.media.MediaCrypto;
import android.os.Handler;
import android.os.SystemClock;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_OfflineRecovery;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.player.drm.LicenseType;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.HashMap;
import o.InterfaceC4424beJ;
import org.json.JSONObject;

/* renamed from: o.beO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4429beO implements InterfaceC4420beF {
    private static int c;
    private final Context b;
    private Exception d;
    private final InterfaceC4416beB e;
    private InterfaceC4424beJ.c f;
    private JSONObject g;
    private final Long h;
    private final InterfaceC4348bcn i;
    private final InterfaceC4333bcY j;
    private final aTX l;
    private byte[] m;
    private final NetflixMediaDrm n;

    /* renamed from: o  reason: collision with root package name */
    private MediaCrypto f13576o;
    private final Handler p;
    private final int k = InterfaceC4420beF.a.getAndAdd(1);
    private final long s = SystemClock.elapsedRealtime();
    private int r = 2;

    @Override // o.InterfaceC4420beF
    public Long a() {
        return this.h;
    }

    @Override // o.InterfaceC4420beF
    public boolean b() {
        return this.r == 0;
    }

    @Override // o.InterfaceC4420beF
    public int c() {
        return 0;
    }

    @Override // o.InterfaceC4420beF
    public void d(Status status, boolean z) {
    }

    @Override // o.InterfaceC4420beF
    public void d(byte[] bArr, String str) {
    }

    @Override // o.InterfaceC4420beF
    public InterfaceC4416beB e() {
        return this.e;
    }

    @Override // o.InterfaceC4420beF
    public void e(InterfaceC4416beB interfaceC4416beB) {
    }

    @Override // o.InterfaceC4420beF
    public boolean f() {
        int i = this.r;
        return i == 0 || i == 1;
    }

    @Override // o.InterfaceC4420beF
    public boolean g() {
        return this.r == 1;
    }

    @Override // o.InterfaceC4420beF
    public boolean h() {
        return true;
    }

    @Override // o.InterfaceC4420beF
    public void k() {
    }

    @Override // o.InterfaceC4424beJ
    public byte[] m() {
        return this.m;
    }

    @Override // o.InterfaceC4420beF
    public void n() {
    }

    @Override // o.InterfaceC4424beJ
    public Exception o() {
        return this.d;
    }

    @Override // o.InterfaceC4424beJ
    public int p() {
        return this.k;
    }

    @Override // o.InterfaceC4424beJ
    public int r() {
        return this.r;
    }

    @Override // o.InterfaceC4424beJ
    public MediaCrypto s() {
        return this.f13576o;
    }

    public C4429beO(InterfaceC4348bcn interfaceC4348bcn, Context context, Handler handler, InterfaceC4333bcY interfaceC4333bcY, aTX atx, NetflixMediaDrm netflixMediaDrm, InterfaceC4416beB interfaceC4416beB, Long l, InterfaceC4424beJ.c cVar) {
        this.i = interfaceC4348bcn;
        this.b = context;
        this.p = handler;
        this.j = interfaceC4333bcY;
        this.l = atx;
        this.h = l;
        this.n = netflixMediaDrm;
        this.e = interfaceC4416beB;
        this.f = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void v() {
        byte[] bArr;
        NetflixMediaDrm.KeyRequest keyRequest;
        byte[] c2;
        boolean z;
        InterfaceC4416beB interfaceC4416beB;
        HashMap<String, String> hashMap;
        if (this.r == 0) {
            return;
        }
        try {
            hashMap = new HashMap<>();
            bArr = this.n.openSession(NetflixMediaDrm.SessionType.STREAMING);
        } catch (Throwable th) {
            th = th;
            bArr = null;
        }
        try {
            keyRequest = this.n.getKeyRequest(bArr, this.e.e(), "", 1, hashMap);
        } catch (Throwable th2) {
            th = th2;
            try {
                C1044Mm.a("NfPlayerDrmManager", th, "unable to open hybrid session");
                b(DrmMetricsCollector.WvApi.k, this.n, th, null);
                if (bArr != null) {
                    try {
                        this.n.closeSession(bArr);
                    } catch (Throwable th3) {
                        b(DrmMetricsCollector.WvApi.d, this.n, th3, null);
                    }
                }
                keyRequest = null;
                c2 = this.e.c();
                byte[] openSession = this.n.openSession(NetflixMediaDrm.SessionType.OFFLINE);
                this.m = openSession;
                try {
                    this.n.restoreKeys(openSession, c2);
                    this.f13576o = new MediaCrypto(C8189dfg.d, this.m);
                    c = 0;
                    this.f.c(this.h, LicenseType.LICENSE_TYPE_OFFLINE);
                    this.r = 4;
                    interfaceC4416beB = this.e;
                    if (interfaceC4416beB != null) {
                    }
                    C1044Mm.d("NfPlayerDrmManager", "could not fetch hybrid license - no license link");
                    this.f.c(new NetflixStatus(StatusCode.INVALID_ARGUMENTS), LicenseType.LICENSE_TYPE_STANDARD);
                } catch (Exception e) {
                    e = e;
                    z = true;
                    C1044Mm.b("NfPlayerDrmManager", e, "unable to open offline DRM session", new Object[0]);
                    if (z) {
                        b(DrmMetricsCollector.WvApi.t, this.n, e, c2);
                    } else {
                        b(DrmMetricsCollector.WvApi.r, this.n, e, null);
                    }
                    this.d = e;
                    this.f.c(new NetflixStatus(StatusCode.DRM_FAILURE_MEDIADRM_KEYS_RESTORE_FAILED, e), LicenseType.LICENSE_TYPE_OFFLINE);
                    this.r = 1;
                    t();
                    return;
                }
            } finally {
                if (bArr != null) {
                    try {
                        this.n.closeSession(bArr);
                    } catch (Throwable th4) {
                        b(DrmMetricsCollector.WvApi.d, this.n, th4, null);
                    }
                }
            }
        }
        c2 = this.e.c();
        try {
            byte[] openSession2 = this.n.openSession(NetflixMediaDrm.SessionType.OFFLINE);
            this.m = openSession2;
            this.n.restoreKeys(openSession2, c2);
            this.f13576o = new MediaCrypto(C8189dfg.d, this.m);
            c = 0;
            this.f.c(this.h, LicenseType.LICENSE_TYPE_OFFLINE);
            this.r = 4;
            interfaceC4416beB = this.e;
            if (interfaceC4416beB != null || C8168dfL.g(interfaceC4416beB.j())) {
                C1044Mm.d("NfPlayerDrmManager", "could not fetch hybrid license - no license link");
                this.f.c(new NetflixStatus(StatusCode.INVALID_ARGUMENTS), LicenseType.LICENSE_TYPE_STANDARD);
            } else if (!ConnectivityUtils.n(this.b)) {
                C1044Mm.e("NfPlayerDrmManager", "could not fetch hybrid license - no internet connection");
                this.f.c(new NetflixStatus(StatusCode.NET_CRONET_INTERNET_DISCONNECTED), LicenseType.LICENSE_TYPE_STANDARD);
            } else if (keyRequest == null) {
                C1044Mm.e("NfPlayerDrmManager", "could not fetch hybrid license - failed to build challenge");
                this.f.c(new NetflixStatus(StatusCode.DRM_FAILURE_MEDIADRM_GET_KEY_REQUEST), LicenseType.LICENSE_TYPE_STANDARD);
            } else {
                this.e.b(keyRequest.getData());
                C1044Mm.e("NfPlayerDrmManager", "fetching hybrid license");
                this.j.d(this.e, new AbstractC4397bdj() { // from class: o.beO.3
                    @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
                    public void d(JSONObject jSONObject, Status status) {
                        C4429beO.this.g = jSONObject;
                        if (C4429beO.this.r == 0) {
                            C4429beO.this.y();
                            return;
                        }
                        if (status.j()) {
                            C4429beO.this.f.c(C4429beO.this.h, LicenseType.LICENSE_TYPE_STANDARD);
                        } else {
                            C4429beO.this.f.c(status, LicenseType.LICENSE_TYPE_STANDARD);
                        }
                        if (status instanceof BasePlayErrorStatus) {
                            BasePlayErrorStatus basePlayErrorStatus = (BasePlayErrorStatus) status;
                            if (basePlayErrorStatus.D() || basePlayErrorStatus.w() || basePlayErrorStatus.y()) {
                                C4429beO.this.f.c(status, LicenseType.LICENSE_TYPE_OFFLINE);
                                C4429beO.this.r = 1;
                            }
                        }
                    }
                });
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }

    private void t() {
        c++;
        if (ConnectivityUtils.l(this.b)) {
            if (C8150deu.c(15)) {
                Config_FastProperty_OfflineRecovery.c cVar = Config_FastProperty_OfflineRecovery.Companion;
                if (cVar.b() && c >= cVar.a()) {
                    c = 0;
                    this.i.d(null, null);
                    return;
                }
            }
            Config_FastProperty_OfflineRecovery.c cVar2 = Config_FastProperty_OfflineRecovery.Companion;
            if (!cVar2.d() || c < cVar2.c()) {
                return;
            }
            c = 0;
            this.i.d(this.h + "", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        JSONObject jSONObject = this.g;
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("links");
        if (optJSONObject == null) {
            this.g = null;
            return;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("releaseLicense");
        if (optJSONObject2 != null) {
            AbstractC4561bgo d = AbstractC4561bgo.d(optJSONObject2);
            if (d != null) {
                C1044Mm.e("NfPlayerDrmManager", "releasing hybrid license");
                this.l.a(C4390bdc.a(d, this.e.n()));
            }
            this.g = null;
        }
    }

    @Override // o.InterfaceC4424beJ
    public void c(InterfaceC4424beJ.c cVar) {
        this.r = 2;
        this.f = cVar;
        this.p.post(new Runnable() { // from class: o.beT
            @Override // java.lang.Runnable
            public final void run() {
                C4429beO.this.v();
            }
        });
    }

    @Override // o.InterfaceC4424beJ
    public void l() {
        try {
            byte[] bArr = this.m;
            if (bArr != null) {
                this.n.closeSession(bArr);
            }
        } catch (Exception e) {
            b(DrmMetricsCollector.WvApi.b, this.n, e, null);
        }
        try {
            this.n.close();
        } catch (Exception e2) {
            b(DrmMetricsCollector.WvApi.e, this.n, e2, null);
        }
        this.m = null;
        this.r = 0;
        y();
    }

    @Override // o.InterfaceC4420beF
    public void j() {
        InterfaceC4424beJ.c cVar = this.f;
        if (cVar != null) {
            cVar.b(this.h, "acquireLicenseStart");
        }
    }

    @Override // o.InterfaceC4420beF
    public void i() {
        InterfaceC4424beJ.c cVar = this.f;
        if (cVar != null) {
            cVar.b(this.h, "acquireLicenseEnd");
        }
    }

    @Override // o.InterfaceC4420beF
    public long d() {
        return SystemClock.elapsedRealtime() - this.s;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(InterfaceC4420beF interfaceC4420beF) {
        return d() > interfaceC4420beF.d() ? 1 : -1;
    }

    private void b(DrmMetricsCollector.WvApi wvApi, NetflixMediaDrm netflixMediaDrm, Throwable th, byte[] bArr) {
        DrmMetricsCollector drmMetricsCollector = DrmMetricsCollector.d;
        aPH b = new aPH(netflixMediaDrm, DrmMetricsCollector.NfAppStage.b).b(wvApi).c("NfOfflineDrmSession").b(th);
        String i = this.e.i();
        drmMetricsCollector.e(b.d(bArr, i, this.e.f() + ""));
    }
}
