package o;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.offline.log.OfflineErrorLogblob;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.ClientActionFromLase;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import o.C4263bbH;
import o.InterfaceC4262bbG;

/* renamed from: o.bbK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4266bbK implements InterfaceC4262bbG, C4263bbH.a {
    private final C4390bdc c;
    private final Context d;
    private final IClientLogging e;
    private final Handler i;
    private final Queue<C4263bbH> a = new LinkedList();
    private final Queue<C4267bbL> j = new LinkedList();
    private final Queue<C4259bbD> b = new LinkedList();

    private static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // o.InterfaceC4262bbG
    public void c() {
    }

    public C4266bbK(Context context, Looper looper, C4390bdc c4390bdc, IClientLogging iClientLogging) {
        this.d = context;
        this.i = new Handler(looper);
        this.c = c4390bdc;
        this.e = iClientLogging;
    }

    @Override // o.InterfaceC4262bbG
    public void a(InterfaceC4297bbp interfaceC4297bbp, byte[] bArr, AbstractC4561bgo abstractC4561bgo, InterfaceC4264bbI interfaceC4264bbI) {
        C1044Mm.c("nf_offlineLicenseMgr", "requestNewLicense playableId=%s", interfaceC4297bbp.h());
        C4263bbH c4263bbH = new C4263bbH(interfaceC4297bbp, bArr, abstractC4561bgo, interfaceC4264bbI, this, this.c, this.i);
        this.a.add(c4263bbH);
        if (this.j.size() + this.a.size() + this.b.size() <= 1) {
            c4263bbH.a();
        } else {
            C1044Mm.a("nf_offlineLicenseMgr", "requestNewLicense serializing the request");
        }
    }

    @Override // o.InterfaceC4262bbG
    public void c(boolean z, InterfaceC4297bbp interfaceC4297bbp, byte[] bArr, byte[] bArr2, AbstractC4561bgo abstractC4561bgo, AbstractC4561bgo abstractC4561bgo2, InterfaceC4264bbI interfaceC4264bbI) {
        C4267bbL c4267bbL;
        C1044Mm.a("nf_offlineLicenseMgr", "refreshLicense playableId=" + interfaceC4297bbp.h());
        if (b()) {
            c4267bbL = new C4265bbJ(z, interfaceC4297bbp, bArr, abstractC4561bgo, abstractC4561bgo2, interfaceC4264bbI, this, this.c, this.i, bArr2);
        } else {
            c4267bbL = new C4267bbL(z, interfaceC4297bbp, bArr, abstractC4561bgo, abstractC4561bgo2, interfaceC4264bbI, this, this.c, this.i, bArr2);
        }
        this.j.add(c4267bbL);
        if (this.j.size() + this.a.size() + this.b.size() <= 1) {
            c4267bbL.a();
        } else {
            C1044Mm.a("nf_offlineLicenseMgr", "refreshLicense serializing the request");
        }
    }

    @Override // o.InterfaceC4262bbG
    public void a(InterfaceC4297bbp interfaceC4297bbp, byte[] bArr, boolean z, AbstractC4561bgo abstractC4561bgo, InterfaceC4264bbI interfaceC4264bbI) {
        C1044Mm.a("nf_offlineLicenseMgr", "deleteLicense playableId=" + interfaceC4297bbp.h());
        C4259bbD c4259bbD = new C4259bbD(interfaceC4297bbp, bArr, z, interfaceC4264bbI, this, this.c, abstractC4561bgo, this.i);
        this.b.add(c4259bbD);
        if (this.j.size() + this.a.size() + this.b.size() <= 1) {
            c4259bbD.a();
        } else {
            C1044Mm.a("nf_offlineLicenseMgr", "deleteLicense serializing the request");
        }
    }

    private void e() {
        C1044Mm.c("nf_offlineLicenseMgr", "trySendingNextRequest %d %d %d", Integer.valueOf(this.a.size()), Integer.valueOf(this.j.size()), Integer.valueOf(this.b.size()));
        C4263bbH peek = this.a.peek();
        if (peek != null) {
            peek.a();
            return;
        }
        C4267bbL peek2 = this.j.peek();
        if (peek2 != null) {
            peek2.a();
            return;
        }
        C4259bbD peek3 = this.b.peek();
        if (peek3 != null) {
            peek3.a();
        }
    }

    @Override // o.C4263bbH.a
    public void a(C4263bbH c4263bbH, Status status) {
        C1044Mm.c("nf_offlineLicenseMgr", "onLicenseRequestDone %s %s %d %d %d", c4263bbH.b(), c4263bbH.getClass().getSimpleName(), Integer.valueOf(this.a.size()), Integer.valueOf(this.j.size()), Integer.valueOf(this.b.size()));
        OfflineErrorLogblob.ErrorCategory errorCategory = OfflineErrorLogblob.ErrorCategory.License;
        if (c4263bbH instanceof C4267bbL) {
            errorCategory = OfflineErrorLogblob.ErrorCategory.LicenseRefresh;
            Iterator<C4267bbL> it = this.j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().b().equals(c4263bbH.b())) {
                    C1044Mm.a("nf_offlineLicenseMgr", "onLicenseRequestDone removing from mRefreshLicenseRequestQueue");
                    it.remove();
                    break;
                }
            }
        } else if (c4263bbH instanceof C4259bbD) {
            errorCategory = OfflineErrorLogblob.ErrorCategory.LicenseDelete;
            Iterator<C4259bbD> it2 = this.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next().b().equals(c4263bbH.b())) {
                    C1044Mm.a("nf_offlineLicenseMgr", "onLicenseRequestDone removing from mDeactivateOfflineLicenseRequestQueue");
                    it2.remove();
                    break;
                }
            }
        } else {
            Iterator<C4263bbH> it3 = this.a.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (it3.next().b().equals(c4263bbH.b())) {
                    C1044Mm.a("nf_offlineLicenseMgr", "onLicenseRequestDone removing from mNewLicenseRequestQueue");
                    it3.remove();
                    break;
                }
            }
        }
        if (status.i()) {
            OfflineErrorLogblob.a(this.e.e(), c4263bbH.i, status, OfflineErrorLogblob.ErrorCategory.d(status, errorCategory));
            C1983aVn.c(this.d, c4263bbH.b(), status);
        }
        e();
    }

    @Override // o.InterfaceC4262bbG
    public void a(List<AbstractC4561bgo> list, final InterfaceC4262bbG.b bVar) {
        C1044Mm.c("nf_offlineLicenseMgr", "sendSyncActiveLicensesToServer %d", Integer.valueOf(list.size()));
        this.c.e(list, new AbstractC4397bdj() { // from class: o.bbK.1
            @Override // o.AbstractC4397bdj, o.InterfaceC4389bdb
            public void c(Map<String, ClientActionFromLase> map, Status status) {
                C1044Mm.c("nf_offlineLicenseMgr", "onSyncLicenseDone res=%s", status);
                bVar.d(map, status);
            }
        });
    }
}
