package o;

import android.util.Pair;
import com.netflix.mediaclient.servicemgr.ServiceManager;

/* renamed from: o.dcH  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8005dcH {
    public static String e(ServiceManager serviceManager) {
        if (!a(serviceManager)) {
            C1044Mm.d("ServiceManagerUtils", "Service manager is not available!");
            return "";
        }
        String i = serviceManager.q().i();
        Pair<String, String>[] l = serviceManager.q().l();
        if (l != null && l.length >= 1 && i != null) {
            for (int i2 = 0; i2 < l.length; i2++) {
                if (i.equals(l[i2].first)) {
                    return (String) l[i2].second;
                }
            }
        }
        return "";
    }

    public static boolean a(ServiceManager serviceManager) {
        return (serviceManager == null || !serviceManager.c() || serviceManager.q() == null) ? false : true;
    }

    public static InterfaceC5131bsv d(ServiceManager serviceManager) {
        if (serviceManager == null || !serviceManager.c()) {
            return null;
        }
        return serviceManager.q();
    }
}
