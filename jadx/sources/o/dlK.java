package o;

import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.cl.model.android.PartnerInputSource;
import com.netflix.cl.model.context.android.PartnerInput;
import com.netflix.mediaclient.AppUpdateReceiver;
import com.netflix.mediaclient.service.webclient.model.leafs.SfinderConfig;
import com.netflix.mediaclient.servicemgr.ServiceManager;

/* loaded from: classes6.dex */
public final class dlK {
    public static final dlK e = new dlK();
    private static final String c = "nf_partner_PServiceRequestUtils";

    private dlK() {
    }

    public final boolean e() {
        return C1849aQn.e.d();
    }

    public final long a(Context context, PartnerInputSource partnerInputSource) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) partnerInputSource, "");
        String e2 = C8157dfA.e(context, "channelIdValue", (String) null);
        if (e2 != null) {
            return Logger.INSTANCE.addContext(new PartnerInput(partnerInputSource, e2, Double.valueOf(1.0d)));
        }
        return 0L;
    }

    public final void c(Context context) {
        C8632dsu.c((Object) context, "");
        AppUpdateReceiver.c.a(context);
    }

    public final boolean e(ServiceManager serviceManager) {
        SfinderConfig sfinderConfig;
        C8632dsu.c((Object) serviceManager, "");
        if (e()) {
            C1044Mm.e(c, "force enabled partner features");
            return false;
        }
        if (serviceManager.g() != null) {
            aOV g = serviceManager.g();
            C8632dsu.d(g);
            if (g.M() != null) {
                aOV g2 = serviceManager.g();
                C8632dsu.d(g2);
                sfinderConfig = g2.M().sfinderConfig();
                return sfinderConfig == null && !SfinderConfig.isSfinderEnabled(sfinderConfig);
            }
        }
        sfinderConfig = null;
        if (sfinderConfig == null) {
            return false;
        }
    }
}
