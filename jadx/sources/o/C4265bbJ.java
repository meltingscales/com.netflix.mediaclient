package o;

import android.os.Handler;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.drm.PlatformMediaDrmApi29;
import com.netflix.mediaclient.service.player.bladerunnerclient.OfflineLicenseResponse;
import o.C4263bbH;

/* renamed from: o.bbJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4265bbJ extends C4267bbL {
    private final byte[] k;

    @Override // o.C4267bbL, o.C4263bbH
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public C4265bbJ(boolean z, InterfaceC4297bbp interfaceC4297bbp, byte[] bArr, AbstractC4561bgo abstractC4561bgo, AbstractC4561bgo abstractC4561bgo2, InterfaceC4264bbI interfaceC4264bbI, C4263bbH.a aVar, C4390bdc c4390bdc, Handler handler, byte[] bArr2) {
        super(z, interfaceC4297bbp, bArr, abstractC4561bgo, abstractC4561bgo2, interfaceC4264bbI, aVar, c4390bdc, handler, null);
        this.k = bArr2;
        C1044Mm.a("nf_offlineLicenseMgr", "RefreshNewOfflineLicenseRequest  playableId=" + interfaceC4297bbp.h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C4263bbH
    public void b(OfflineLicenseResponse offlineLicenseResponse, byte[] bArr, Status status) {
        byte[] bArr2;
        NetflixMediaDrm netflixMediaDrm;
        if (status.j() && bArr != null && (bArr2 = this.k) != null && bArr2.length > 0 && (netflixMediaDrm = this.j) != null) {
            try {
                if (netflixMediaDrm instanceof PlatformMediaDrmApi29) {
                    ((PlatformMediaDrmApi29) netflixMediaDrm).removeOfflineLicense(bArr2);
                } else {
                    netflixMediaDrm.getKeyRequest(bArr2, null, "", 3, this.f);
                }
            } catch (Throwable th) {
                C1044Mm.a("nf_offlineLicenseMgr", "RefreshNewOfflineLicenseRequest  delete previous license failed " + th);
            }
        }
        super.b(offlineLicenseResponse, bArr, status);
    }
}
