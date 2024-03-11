package o;

import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.util.Locale;

/* renamed from: o.cwD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7434cwD {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(ServiceManager serviceManager) {
        UserAgent u;
        String e = AbstractApplicationC1040Mh.getInstance().i().e();
        if (e == null) {
            e = (serviceManager == null || (u = serviceManager.u()) == null) ? null : u.a();
            if (e == null) {
                e = "";
            }
        }
        Locale locale = Locale.US;
        C8632dsu.a(locale, "");
        String lowerCase = e.toLowerCase(locale);
        C8632dsu.a(lowerCase, "");
        return lowerCase;
    }
}
