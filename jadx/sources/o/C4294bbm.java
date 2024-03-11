package o;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.OfflineLicenseResponse;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;

/* renamed from: o.bbm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4294bbm {
    private final boolean a;
    private final InterfaceC4290bbi b;
    private final InterfaceC4299bbr c;
    private final InterfaceC4268bbM d;
    private final InterfaceC4262bbG e;

    /* renamed from: o.bbm$b */
    /* loaded from: classes3.dex */
    public interface b {
        void e(InterfaceC4299bbr interfaceC4299bbr, Status status);
    }

    public C4294bbm(InterfaceC4290bbi interfaceC4290bbi, InterfaceC4268bbM interfaceC4268bbM, InterfaceC4262bbG interfaceC4262bbG, boolean z) {
        this.b = interfaceC4290bbi;
        this.d = interfaceC4268bbM;
        this.e = interfaceC4262bbG;
        this.c = interfaceC4290bbi.e();
        this.a = z;
    }

    public void c(final b bVar) {
        C1044Mm.c("nfLicenseReplace", "startLicenseReplace %s", d());
        this.d.e(this.c, c(), new InterfaceC4271bbP() { // from class: o.bbv
            @Override // o.InterfaceC4271bbP
            public final void a(InterfaceC4525bgE interfaceC4525bgE, Status status) {
                C4294bbm.this.d(bVar, interfaceC4525bgE, status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void d(final b bVar, final InterfaceC4525bgE interfaceC4525bgE, Status status) {
        C1044Mm.c("nfLicenseReplace", "onManifestResponse %s %s", d(), status);
        if (status.i()) {
            bVar.e(this.c, status);
            return;
        }
        byte[] b2 = C4338bcd.b(this.b.e());
        if (b2 == null || b2.length == 0) {
            bVar.e(this.b.e(), InterfaceC1078Nw.aJ);
        } else if (this.a) {
            C1044Mm.c("nfLicenseReplace", "refreshLicense %s", d());
            this.e.c(true, this.c, interfaceC4525bgE.R(), b2, this.c.k(), this.c.E(), new InterfaceC4264bbI() { // from class: o.bbt
                @Override // o.InterfaceC4264bbI
                public final void d(String str, OfflineLicenseResponse offlineLicenseResponse, Status status2) {
                    C4294bbm.this.c(bVar, str, offlineLicenseResponse, status2);
                }
            });
        } else {
            C1044Mm.c("nfLicenseReplace", "deleteLicense %s", d());
            this.e.a(this.c, b2, false, b(), new InterfaceC4264bbI() { // from class: o.bbu
                @Override // o.InterfaceC4264bbI
                public final void d(String str, OfflineLicenseResponse offlineLicenseResponse, Status status2) {
                    C4294bbm.this.e(bVar, interfaceC4525bgE, str, offlineLicenseResponse, status2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(b bVar, String str, OfflineLicenseResponse offlineLicenseResponse, Status status) {
        e(bVar, offlineLicenseResponse, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(b bVar, InterfaceC4525bgE interfaceC4525bgE, String str, OfflineLicenseResponse offlineLicenseResponse, Status status) {
        a(bVar, status, interfaceC4525bgE);
    }

    private void a(final b bVar, Status status, InterfaceC4525bgE interfaceC4525bgE) {
        C1044Mm.c("nfLicenseReplace", "onLicenseReleaseDone %s %s", d(), status);
        if (status.j() || status.c() == StatusCode.DRM_FAILURE_CDM_NO_LICENSE_RELEASE_ACK) {
            if (DownloadState.a(this.c.t())) {
                C1044Mm.c("nfLicenseReplace", "onLicenseReleaseDone ignoring deleted %s %s", d(), status);
                bVar.e(this.b.e(), InterfaceC1078Nw.aJ);
                return;
            }
            this.e.a(this.c, interfaceC4525bgE.R(), interfaceC4525bgE.U().a(), new InterfaceC4264bbI() { // from class: o.bbo
                @Override // o.InterfaceC4264bbI
                public final void d(String str, OfflineLicenseResponse offlineLicenseResponse, Status status2) {
                    C4294bbm.this.e(bVar, str, offlineLicenseResponse, status2);
                }
            });
            return;
        }
        bVar.e(this.b.e(), status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(b bVar, String str, OfflineLicenseResponse offlineLicenseResponse, Status status) {
        c(bVar, offlineLicenseResponse, status);
    }

    private void c(b bVar, OfflineLicenseResponse offlineLicenseResponse, Status status) {
        C1044Mm.c("nfLicenseReplace", "onLicenseAcquireDone %s %s", d(), status);
        a(bVar, offlineLicenseResponse, status);
    }

    private void e(b bVar, OfflineLicenseResponse offlineLicenseResponse, Status status) {
        C1044Mm.c("nfLicenseReplace", "onLicenseRefreshDone %s %s", d(), status);
        if (status.j()) {
            this.c.f(C1842aQg.a.j());
        }
        a(bVar, offlineLicenseResponse, status);
    }

    private void a(b bVar, OfflineLicenseResponse offlineLicenseResponse, Status status) {
        if (status.j()) {
            C4338bcd.a(offlineLicenseResponse, this.c);
            this.c.Q();
        }
        bVar.e(this.c, status);
    }

    private AbstractC4561bgo b() {
        return this.c.s();
    }

    private String d() {
        return this.c.h();
    }

    private String c() {
        return this.b.d();
    }
}
