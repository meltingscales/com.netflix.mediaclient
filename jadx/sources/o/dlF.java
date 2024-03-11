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
import com.netflix.partner.NetflixPartnerRecoResults;
import java.util.List;
import o.InterfaceC8445dlw;
import o.aMN;

/* loaded from: classes6.dex */
public class dlF {
    private C8446dlx c = new C8446dlx();
    private final Handler d;

    public dlF(Looper looper) {
        this.d = new Handler(looper);
    }

    public void b(Context context, ServiceManager serviceManager, String str, int i, int i2, InterfaceC8433dlk interfaceC8433dlk) {
        C1044Mm.a("nf_partner_PServiceRecoRequestHand", "getRecommendations: got query: %s, toView: %s, toExpanded: %s", str, Integer.valueOf(i), Integer.valueOf(i2));
        this.c.a(interfaceC8433dlk);
        if (this.c.b().size() > 1) {
            C1044Mm.e("nf_partner_PServiceRecoRequestHand", "previous reco request still in progress.. stashing");
            return;
        }
        dlK dlk = dlK.e;
        final long a = dlk.a(context, PartnerInputSource.sFinderRecommendation);
        final Long startSession = Logger.INSTANCE.startSession(new Search(null, str, null, null, null));
        if (serviceManager == null) {
            C1044Mm.e("nf_partner_PServiceRecoRequestHand", "no connection");
            if (interfaceC8433dlk != null) {
                dlG dlg = dlG.b;
                d(a, startSession, -5);
                return;
            }
            C1044Mm.d("nf_partner_PServiceRecoRequestHand", "ignoring getRecommendations, manager null, callback null");
            a(a, startSession, StatusCode.INT_ERR_SERVICE_DISCONNECTED.toString());
        } else if (interfaceC8433dlk == null) {
            C1044Mm.d("nf_partner_PServiceRecoRequestHand", "partner callback null ");
            a(a, startSession, StatusCode.INT_ERR_CB_NULL.toString());
        } else if (((aMN) C1332Xp.b(aMN.class)).c(aMN.d.e)) {
            try {
                InterfaceC8445dlw interfaceC8445dlw = (InterfaceC8445dlw) Class.forName("com.netflix.partner.PRecoDataHandler").getConstructor(Context.class, ServiceManager.class, Handler.class, Long.TYPE, Long.class).newInstance(context, serviceManager, this.d, Long.valueOf(a), startSession);
                if (serviceManager.c() && dlk.e(serviceManager)) {
                    C1044Mm.d("nf_partner_PServiceRecoRequestHand", "sFinder functionality not supported on device - config blocked");
                    dlG dlg2 = dlG.b;
                    d(a, startSession, -1);
                    return;
                }
                interfaceC8445dlw.getRecommendations(str, i, i2, new InterfaceC8445dlw.a() { // from class: o.dlD
                    @Override // o.InterfaceC8445dlw.a
                    public final void e(int i3, List list) {
                        dlF.this.b(a, startSession, i3, list);
                    }
                });
            } catch (NoSuchMethodException e) {
                C1044Mm.e("nf_partner_PServiceRecoRequestHand", "NoSuchMethodException", e);
                dlG dlg3 = dlG.b;
                d(a, startSession, -4);
            } catch (Exception e2) {
                C1044Mm.e("nf_partner_PServiceRecoRequestHand", "Exception", e2);
                dlG dlg4 = dlG.b;
                d(a, startSession, -4);
            }
        } else {
            C1044Mm.e("nf_partner_PServiceRecoRequestHand", "module not present, cant handle the query");
            dlk.c(serviceManager.f());
            dlG dlg5 = dlG.b;
            d(a, startSession, -7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j, Long l, int i, List list) {
        try {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(list != null ? list.size() : 0);
            C1044Mm.a("nf_partner_PServiceRecoRequestHand", "sending onRecommendationComplete %s", objArr);
            e(new NetflixPartnerRecoResults(i, list));
        } catch (RemoteException e) {
            C1044Mm.e("nf_partner_PServiceRecoRequestHand", " remote Exception", e);
            dlG dlg = dlG.b;
            d(j, l, -4);
        }
    }

    private void e(NetflixPartnerRecoResults netflixPartnerRecoResults) {
        for (InterfaceC8433dlk interfaceC8433dlk : this.c.a()) {
            C1044Mm.e("nf_partner_PServiceRecoRequestHand", "sending recommendations... ");
            interfaceC8433dlk.d(netflixPartnerRecoResults);
        }
    }

    private void d(long j, Long l, int i) {
        C1044Mm.a("nf_partner_PServiceRecoRequestHand", "sending error response to partner code: %s", Integer.valueOf(i));
        try {
            e(new NetflixPartnerRecoResults(i));
        } catch (RemoteException e) {
            C1044Mm.e("nf_partner_PServiceRecoRequestHand", "could not send error result ", e);
        }
        a(j, l, String.valueOf(i));
    }

    private void a(long j, Long l, String str) {
        ExtLogger.INSTANCE.failedAction(l, CLv2Utils.a(new Error(str, null, null)));
        Logger.INSTANCE.removeContext(Long.valueOf(j));
    }
}
