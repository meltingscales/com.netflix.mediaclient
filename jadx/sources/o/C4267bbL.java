package o;

import android.media.NotProvisionedException;
import android.os.Handler;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.OfflineLicenseResponse;
import o.C4263bbH;

/* renamed from: o.bbL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4267bbL extends C4263bbH {
    AbstractC4561bgo e;
    boolean m;

    public C4267bbL(boolean z, InterfaceC4297bbp interfaceC4297bbp, byte[] bArr, AbstractC4561bgo abstractC4561bgo, AbstractC4561bgo abstractC4561bgo2, InterfaceC4264bbI interfaceC4264bbI, C4263bbH.a aVar, C4390bdc c4390bdc, Handler handler, byte[] bArr2) {
        super(interfaceC4297bbp, bArr, abstractC4561bgo2, interfaceC4264bbI, aVar, c4390bdc, handler);
        this.b = bArr2;
        this.m = z;
        this.e = abstractC4561bgo;
    }

    @Override // o.C4263bbH
    public void a() {
        if (d(this.b)) {
            c();
        }
    }

    @Override // o.C4263bbH
    protected void c() {
        NetflixImmutableStatus netflixImmutableStatus;
        try {
            C1044Mm.a("nf_offlineLicenseMgr", "RefreshOfflineLicenseRequest sendLicenseRequest playableId=" + b());
            this.d.c(e(), this.m, this.e, this.c, C8427dle.e(this.j.getKeyRequest(this.n, this.a, "", 2, this.f).getData()), new AbstractC4397bdj() { // from class: o.bbL.5
                @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
                public void a(final OfflineLicenseResponse offlineLicenseResponse, final Status status) {
                    C1044Mm.a("nf_offlineLicenseMgr", "RefreshOfflineLicenseRequest onLicenseFetched playableId=" + C4267bbL.this.b());
                    C4267bbL.this.f13564o.post(new Runnable() { // from class: o.bbL.5.4
                        @Override // java.lang.Runnable
                        public void run() {
                            C4267bbL.this.e(offlineLicenseResponse, status);
                        }
                    });
                }
            });
        } catch (NotProvisionedException unused) {
            netflixImmutableStatus = InterfaceC1078Nw.l;
            C1044Mm.d("nf_offlineLicenseMgr", "RefreshOfflineLicenseRequest getKeyRequest NotProvisionedException");
            b(null, null, netflixImmutableStatus);
        } catch (Exception e) {
            netflixImmutableStatus = InterfaceC1078Nw.f;
            C1044Mm.d("nf_offlineLicenseMgr", "RefreshOfflineLicenseRequest Exception " + e);
            b(null, null, netflixImmutableStatus);
        }
    }
}
