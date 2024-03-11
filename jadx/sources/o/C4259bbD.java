package o;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.os.Handler;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.MediaDrmConsumer;
import o.C4263bbH;

/* renamed from: o.bbD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4259bbD extends C4263bbH {
    static final boolean e = C8054ddD.f();
    private final boolean l;

    public C4259bbD(InterfaceC4297bbp interfaceC4297bbp, byte[] bArr, boolean z, InterfaceC4264bbI interfaceC4264bbI, C4263bbH.a aVar, C4390bdc c4390bdc, AbstractC4561bgo abstractC4561bgo, Handler handler) {
        super(interfaceC4297bbp, null, abstractC4561bgo, interfaceC4264bbI, aVar, c4390bdc, handler);
        this.b = bArr;
        this.l = z;
    }

    @Override // o.C4263bbH
    public void a() {
        String str;
        C1044Mm.a("nf_offlineLicenseMgr", "deactivate playableId=" + b());
        byte[] bArr = this.b;
        if (bArr == null || bArr.length == 0) {
            b(null, null, InterfaceC1078Nw.aJ);
            return;
        }
        C1044Mm.a("nf_offlineLicenseMgr", "handleLicenseRequest keySetId", bArr);
        if (e) {
            NetflixMediaDrm d = C8189dfg.d(MediaDrmConsumer.OFFLINE, (NetflixMediaDrm.OnEventListener) null);
            this.j = d;
            str = C8427dle.e(d.getKeyRequest(this.b, null, "", 3, this.f).getData());
            final boolean h = C8168dfL.h(str);
            this.d.c(this.c, str, this.l, new AbstractC4397bdj() { // from class: o.bbD.1
                @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
                public void b(final Status status, final String str2) {
                    C4259bbD.this.f13564o.post(new Runnable() { // from class: o.bbD.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            C1044Mm.c("nf_offlineLicenseMgr", "DeactivateOfflineLicenseRequest onLicenseDeactivated playableId=%s", C4259bbD.this.b());
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            C4259bbD.this.e(str2, status, h);
                        }
                    });
                }
            });
        }
        str = "";
        final boolean h2 = C8168dfL.h(str);
        this.d.c(this.c, str, this.l, new AbstractC4397bdj() { // from class: o.bbD.1
            @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
            public void b(final Status status, final String str2) {
                C4259bbD.this.f13564o.post(new Runnable() { // from class: o.bbD.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C1044Mm.c("nf_offlineLicenseMgr", "DeactivateOfflineLicenseRequest onLicenseDeactivated playableId=%s", C4259bbD.this.b());
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        C4259bbD.this.e(str2, status, h2);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, Status status, boolean z) {
        if (status.j() && z) {
            try {
                if (C8168dfL.h(str)) {
                    this.j.provideKeyResponse(this.b, C8427dle.e(str));
                    C1044Mm.a("nf_offlineLicenseMgr", "handleDeactivateResponse license released successfully.");
                } else {
                    status = InterfaceC1078Nw.m;
                    C1044Mm.d("nf_offlineLicenseMgr", "handleDeactivateResponse licenseRelease is empty");
                }
            } catch (DeniedByServerException unused) {
                status = InterfaceC1078Nw.s;
                C1044Mm.d("nf_offlineLicenseMgr", "handleDeactivateResponse provideKeyResponse DeniedByServerException");
            } catch (NotProvisionedException unused2) {
                status = InterfaceC1078Nw.l;
                C1044Mm.d("nf_offlineLicenseMgr", "handleDeactivateResponse provideKeyResponse NotProvisionedException");
            } catch (Exception e2) {
                status = InterfaceC1078Nw.h;
                C1044Mm.d("nf_offlineLicenseMgr", "handleDeactivateResponse provideKeyResponse Exception" + e2);
            }
        }
        b(null, null, status);
    }
}
