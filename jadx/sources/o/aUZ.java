package o;

import android.content.Context;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.Logblob;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.List;
import o.aTW;

/* loaded from: classes3.dex */
public class aUZ {
    private final Context c;
    private final UserAgent d;
    private final InterfaceC5129bst e;

    public aUZ(Context context, UserAgent userAgent, InterfaceC5129bst interfaceC5129bst) {
        this.c = context;
        this.d = userAgent;
        this.e = interfaceC5129bst;
    }

    public NetflixDataRequest d(String str, List<Logblob> list, Logblob.d dVar, aTW.a aVar) {
        if (((aMF) this.e).isReady()) {
            C1044Mm.e("nf_logblob_factory", "Using MSL: SendLogblobsMSLRequest...");
            return C8185dfc.d(this.d, str, new C1970aVa(this.c, list, dVar, aVar), true);
        }
        C1044Mm.e("nf_logblob_factory", "Using Web: SendLogblobsWebRequest...");
        C1977aVh c1977aVh = new C1977aVh(this.c, list, dVar, aVar);
        if (str != null) {
            c1977aVh.e(this.d.c(str));
        }
        return c1977aVh;
    }
}
