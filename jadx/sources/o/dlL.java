package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.android.PartnerInputSource;
import com.netflix.cl.model.event.session.action.Search;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.partner.NetflixPartnerSearchResults;
import java.util.List;
import o.InterfaceC8448dlz;
import o.aMN;

/* loaded from: classes6.dex */
public class dlL {
    private C8446dlx b = new C8446dlx();
    private final Handler e;

    public dlL(Looper looper) {
        this.e = new Handler(looper);
    }

    public void d(Context context, ServiceManager serviceManager, String str, int i, InterfaceC8433dlk interfaceC8433dlk) {
        C1044Mm.a("nf_partner_PServiceSearchReqestHan", "search: got query: %s", str);
        this.b.a(interfaceC8433dlk);
        if (this.b.b().size() > 1) {
            C1044Mm.e("nf_partner_PServiceSearchReqestHan", "previous search request still in progress.. stashing");
            return;
        }
        dlK dlk = dlK.e;
        final long a = dlk.a(context, PartnerInputSource.sFinder);
        final Long startSession = Logger.INSTANCE.startSession(new Search(null, str, null, null, null));
        if (serviceManager == null) {
            C1044Mm.e("nf_partner_PServiceSearchReqestHan", "no connection");
            if (interfaceC8433dlk != null) {
                dlG dlg = dlG.b;
                c(a, startSession, -5);
                return;
            }
            C1044Mm.d("nf_partner_PServiceSearchReqestHan", "ignoring search, manager null, callback null");
            a(a, startSession, StatusCode.INT_ERR_SERVICE_DISCONNECTED.toString());
        } else if (!serviceManager.c()) {
            C1044Mm.e("nf_partner_PServiceSearchReqestHan", "serviceManager not ready");
            a(a, startSession, StatusCode.INT_ERR_MNGR_NOT_READY.toString());
        } else if (interfaceC8433dlk == null) {
            C1044Mm.d("nf_partner_PServiceSearchReqestHan", "partner callback null ");
            a(str, serviceManager);
            a(a, startSession, StatusCode.INT_ERR_CB_NULL.toString());
        } else if (!serviceManager.E()) {
            dlG dlg2 = dlG.b;
            c(a, startSession, -2);
        } else if (((aMN) C1332Xp.b(aMN.class)).c(aMN.d.e)) {
            try {
                InterfaceC8448dlz interfaceC8448dlz = (InterfaceC8448dlz) Class.forName("com.netflix.partner.PSearchDataHandler").getConstructor(ServiceManager.class, Handler.class, Long.TYPE, Long.class).newInstance(serviceManager, this.e, Long.valueOf(a), startSession);
                if (dlk.e(serviceManager)) {
                    C1044Mm.d("nf_partner_PServiceSearchReqestHan", "sFinder functionality not supported on device - disabled by config");
                    dlG dlg3 = dlG.b;
                    c(a, startSession, -1);
                    return;
                }
                interfaceC8448dlz.doSearch(str, i, new InterfaceC8448dlz.d() { // from class: o.dlJ
                    @Override // o.InterfaceC8448dlz.d
                    public final void d(int i2, List list) {
                        dlL.this.e(a, startSession, i2, list);
                    }
                });
            } catch (NoSuchMethodException e) {
                C1044Mm.e("nf_partner_PServiceSearchReqestHan", "NoSuchMethodException", e);
                dlG dlg4 = dlG.b;
                c(a, startSession, -4);
            } catch (Exception e2) {
                C1044Mm.e("nf_partner_PServiceSearchReqestHan", "Exception", e2);
                dlG dlg5 = dlG.b;
                c(a, startSession, -4);
            }
        } else {
            C1044Mm.e("nf_partner_PServiceSearchReqestHan", "module not present, cant handle the query");
            dlk.c(serviceManager.f());
            dlG dlg6 = dlG.b;
            c(a, startSession, -7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(long j, Long l, int i, List list) {
        try {
            e(new NetflixPartnerSearchResults(i, list));
        } catch (RemoteException e) {
            C1044Mm.e("nf_partner_PServiceSearchReqestHan", " remote Exception", e);
            dlG dlg = dlG.b;
            c(j, l, -4);
        }
    }

    public void a(String str, ServiceManager serviceManager) {
        if (serviceManager == null || !serviceManager.E()) {
            C1044Mm.d("nf_partner_PServiceSearchReqestHan", "ignoring in app search. user not logged In");
            return;
        }
        serviceManager.f().startActivity(InterfaceC6084cTg.e(serviceManager.f()).d(serviceManager.f(), str));
    }

    private void c(long j, Long l, int i) {
        C1044Mm.a("nf_partner_PServiceSearchReqestHan", "sending error response to partner code: %s", Integer.valueOf(i));
        try {
            e(new NetflixPartnerSearchResults(i));
        } catch (RemoteException e) {
            C1044Mm.e("nf_partner_PServiceSearchReqestHan", "could not send error result ", e);
        }
        a(j, l, String.valueOf(i));
    }

    private void a(long j, Long l, String str) {
        ExtLogger.INSTANCE.failedAction(l, CLv2Utils.a(new Error(str, null, null)));
        Logger.INSTANCE.removeContext(Long.valueOf(j));
    }

    private void e(NetflixPartnerSearchResults netflixPartnerSearchResults) {
        for (InterfaceC8433dlk interfaceC8433dlk : this.b.a()) {
            C1044Mm.e("nf_partner_PServiceSearchReqestHan", "sending searchResponse... ");
            interfaceC8433dlk.a(netflixPartnerSearchResults);
        }
    }
}
