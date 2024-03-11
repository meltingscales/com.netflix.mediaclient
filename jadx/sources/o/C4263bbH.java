package o;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.media.ResourceBusyException;
import android.os.Handler;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.MediaDrmConsumer;
import com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_WidevineFailureHandling;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.service.player.bladerunnerclient.OfflineLicenseResponse;
import java.util.HashMap;

/* renamed from: o.bbH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4263bbH {
    protected byte[] a;
    protected byte[] b;
    protected AbstractC4561bgo c;
    protected final C4390bdc d;
    private boolean e;
    protected final HashMap<String, String> f = new HashMap<>();
    final a g;
    final InterfaceC4264bbI h;
    final InterfaceC4297bbp i;
    protected NetflixMediaDrm j;
    protected byte[] n;

    /* renamed from: o  reason: collision with root package name */
    protected final Handler f13564o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bbH$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(C4263bbH c4263bbH, Status status);
    }

    private boolean h() {
        return this.e;
    }

    public C4263bbH(InterfaceC4297bbp interfaceC4297bbp, byte[] bArr, AbstractC4561bgo abstractC4561bgo, InterfaceC4264bbI interfaceC4264bbI, a aVar, C4390bdc c4390bdc, Handler handler) {
        this.i = interfaceC4297bbp;
        this.h = interfaceC4264bbI;
        this.g = aVar;
        this.a = bArr;
        this.c = abstractC4561bgo;
        this.d = c4390bdc;
        this.f13564o = handler;
    }

    public void a() {
        if (g()) {
            c();
        }
    }

    protected void c() {
        Status netflixStatus;
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
        try {
            C1044Mm.a("nf_offlineLicenseMgr", "sendLicenseRequest playableId=" + b());
            String e = C8427dle.e(this.j.getKeyRequest(this.n, this.a, "", 2, this.f).getData());
            if (Config_FastProperty_WidevineFailureHandling.Companion.e()) {
                aPJ.e.c(AbstractApplicationC1040Mh.d(), this.i.i(), b(), e);
            }
            this.d.a(e(), this.c, e, new AbstractC4397bdj() { // from class: o.bbH.4
                @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
                public void a(final OfflineLicenseResponse offlineLicenseResponse, final Status status) {
                    C1044Mm.a("nf_offlineLicenseMgr", "sendLicenseRequest onLicenseFetched playableId=" + C4263bbH.this.b());
                    C4263bbH.this.f13564o.post(new Runnable() { // from class: o.bbH.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C4263bbH.this.e(offlineLicenseResponse, status);
                        }
                    });
                }
            });
        } catch (NotProvisionedException e2) {
            DrmMetricsCollector.d.d(new aPH(this.j, DrmMetricsCollector.NfAppStage.c).b(DrmMetricsCollector.WvApi.a).c("OfflineLicenseRequest").b(e2));
            netflixStatus = InterfaceC1078Nw.l;
            C1044Mm.d("nf_offlineLicenseMgr", "deactivate getKeyRequest NotProvisionedException");
            b(null, null, netflixStatus);
        } catch (Exception e3) {
            DrmMetricsCollector.d.d(new aPH(this.j, DrmMetricsCollector.NfAppStage.c).b(DrmMetricsCollector.WvApi.a).c("OfflineLicenseRequest").b(e3));
            netflixStatus = new NetflixStatus(StatusCode.DRM_FAILURE_MEDIADRM_GET_KEY_REQUEST, e3);
            C1044Mm.d("nf_offlineLicenseMgr", "sendLicenseRequest Exception" + e3);
            b(null, null, netflixStatus);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(OfflineLicenseResponse offlineLicenseResponse, Status status) {
        NetflixImmutableStatus netflixImmutableStatus;
        if (h()) {
            C1044Mm.a("nf_offlineLicenseMgr", "handleLicenseResponse request was aborted.");
            return;
        }
        if (status.j()) {
            if (offlineLicenseResponse != null) {
                try {
                    if (offlineLicenseResponse.c() != null && offlineLicenseResponse.c().length > 0) {
                        byte[] provideKeyResponse = this.j.provideKeyResponse(this.n, offlineLicenseResponse.c());
                        byte[] bArr = this.b;
                        if (bArr == null || bArr.length == 0) {
                            this.b = provideKeyResponse;
                        }
                        byte[] bArr2 = this.b;
                        if (bArr2 != null && bArr2.length != 0) {
                            C8189dfg.b("nf_offlineLicenseMgr", this.j, this.n);
                            C1044Mm.a("nf_offlineLicenseMgr", "handleLicenseResponse keySetId", this.b);
                        }
                        status = InterfaceC1078Nw.g;
                        C1044Mm.d("nf_offlineLicenseMgr", "handleLicenseResponse provideKeyResponse returned null");
                    }
                } catch (DeniedByServerException e) {
                    netflixImmutableStatus = InterfaceC1078Nw.s;
                    DrmMetricsCollector.d.d(new aPH(this.j, DrmMetricsCollector.NfAppStage.c).b(DrmMetricsCollector.WvApi.p).c("OfflineLicenseRequest").b(e));
                    C1044Mm.d("nf_offlineLicenseMgr", "handleLicenseResponse provideKeyResponse DeniedByServerException");
                    status = netflixImmutableStatus;
                } catch (NotProvisionedException e2) {
                    netflixImmutableStatus = InterfaceC1078Nw.l;
                    DrmMetricsCollector.d.d(new aPH(this.j, DrmMetricsCollector.NfAppStage.c).b(DrmMetricsCollector.WvApi.p).c("OfflineLicenseRequest").b(e2));
                    C1044Mm.d("nf_offlineLicenseMgr", "handleLicenseResponse provideKeyResponse NotProvisionedException");
                    status = netflixImmutableStatus;
                } catch (Exception e3) {
                    DrmMetricsCollector.d.d(new aPH(this.j, DrmMetricsCollector.NfAppStage.c).b(DrmMetricsCollector.WvApi.p).c("OfflineLicenseRequest").b(e3));
                    NetflixStatus netflixStatus = new NetflixStatus(StatusCode.DRM_FAILURE_CDM_EXCEPTION, e3);
                    netflixStatus.a(e3.toString());
                    C1044Mm.d("nf_offlineLicenseMgr", "handleLicenseResponse provideKeyResponse Exception" + e3);
                    C8189dfg.a(netflixStatus, ErrorSource.offline_playback);
                    status = netflixStatus;
                }
            }
            status = InterfaceC1078Nw.j;
            C1044Mm.d("nf_offlineLicenseMgr", "handleLicenseResponse license is empty");
        }
        b(offlineLicenseResponse, this.b, status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(OfflineLicenseResponse offlineLicenseResponse, byte[] bArr, Status status) {
        C1044Mm.e("nf_offlineLicenseMgr", "doLicenseResponseCallback " + status);
        d();
        if (h()) {
            return;
        }
        if (offlineLicenseResponse != null) {
            offlineLicenseResponse.c(bArr);
        }
        this.h.d(b(), offlineLicenseResponse, status);
        this.g.a(this, status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d(byte[] bArr) {
        C1044Mm.a("nf_offlineLicenseMgr", "tryCreateDrmSession using keySetId", bArr);
        if (g()) {
            try {
                byte[] bArr2 = this.b;
                if (bArr2 != null) {
                    this.j.restoreKeys(this.n, bArr2);
                }
                C8189dfg.b("nf_offlineLicenseMgr", this.j, this.n);
                return true;
            } catch (Throwable th) {
                C1044Mm.e("nf_offlineLicenseMgr", "restoreKeys failed ", th);
                DrmMetricsCollector.d.d(new aPH(this.j, DrmMetricsCollector.NfAppStage.c).b(DrmMetricsCollector.WvApi.t).c("OfflineLicenseRequest").b(th).d(this.b, null, null));
                b(null, null, new NetflixStatus(StatusCode.DRM_FAILURE_MEDIADRM_KEYS_RESTORE_FAILED, th));
                return false;
            }
        }
        return false;
    }

    private boolean g() {
        try {
            NetflixMediaDrm d = C8189dfg.d(MediaDrmConsumer.OFFLINE, (NetflixMediaDrm.OnEventListener) null);
            this.j = d;
            byte[] openSession = d.openSession(NetflixMediaDrm.SessionType.OFFLINE);
            this.n = openSession;
            if (openSession == null || openSession.length == 0) {
                b(null, null, InterfaceC1078Nw.u);
                C1044Mm.d("nf_offlineLicenseMgr", "tryCreateDrmSession DrmSession invalid");
                return false;
            }
            return true;
        } catch (NotProvisionedException e) {
            C1044Mm.d("nf_offlineLicenseMgr", "createDrmSession failed " + e);
            b(null, null, InterfaceC1078Nw.l);
            DrmMetricsCollector.d.d(new aPH(this.j, DrmMetricsCollector.NfAppStage.c).b(DrmMetricsCollector.WvApi.f13197o).c("OfflineLicenseRequest").b(e));
            return false;
        } catch (ResourceBusyException e2) {
            C1044Mm.d("nf_offlineLicenseMgr", "createDrmSession failed " + e2);
            b(null, null, InterfaceC1078Nw.n);
            DrmMetricsCollector.d.d(new aPH(this.j, DrmMetricsCollector.NfAppStage.c).b(DrmMetricsCollector.WvApi.f13197o).c("OfflineLicenseRequest").b(e2));
            return false;
        } catch (Exception e3) {
            b(null, null, InterfaceC1078Nw.h);
            DrmMetricsCollector.d.d(new aPH(this.j, DrmMetricsCollector.NfAppStage.c).b(DrmMetricsCollector.WvApi.f13197o).c("OfflineLicenseRequest").b(e3));
            return false;
        }
    }

    private void d() {
        if (this.n != null) {
            try {
                C1044Mm.a("nf_offlineLicenseMgr", "closing mediaDrm session for mPlayableId=" + b());
                this.j.closeSession(this.n);
            } catch (Exception e) {
                C1044Mm.d("nf_offlineLicenseMgr", "error closing mediaDrm Session " + e);
            }
            this.n = null;
        }
        NetflixMediaDrm netflixMediaDrm = this.j;
        if (netflixMediaDrm != null) {
            netflixMediaDrm.close();
            this.j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b() {
        return this.i.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        return C4338bcd.e(this.i);
    }
}
