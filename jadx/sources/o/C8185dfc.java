package o;

import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MSLTransport;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.msl.MslErrorException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.dfc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8185dfc {
    private static void i(C8416dku c8416dku) {
    }

    public static boolean a(VolleyError volleyError) {
        if (volleyError.getCause() instanceof IOException) {
            IOException iOException = (IOException) volleyError.getCause();
            if (iOException.getCause() instanceof MslErrorException) {
                return a(((MslErrorException) iOException.getCause()).c(), 205032);
            }
            return false;
        }
        return false;
    }

    public static boolean b(C8416dku c8416dku) {
        return a(c8416dku, 207007);
    }

    public static boolean e(C8416dku c8416dku) {
        return a(c8416dku, 207003);
    }

    public static boolean c(C8416dku c8416dku) {
        return a(c8416dku, 207004) && Config_FastProperty_MSLTransport.shouldHandleBadChallenge();
    }

    public static boolean d(C8416dku c8416dku) {
        return a(c8416dku, 204035) && Config_FastProperty_MSLTransport.shouldHandleKeyRequestInvalid();
    }

    public static boolean a(C8416dku c8416dku) {
        return (a(c8416dku, 204042) || a(c8416dku, 207014)) && Config_FastProperty_MSLTransport.shouldHandleAllZerosSigantureBadChallenge();
    }

    public static boolean a(C8416dku c8416dku, int i) {
        if (c8416dku == null) {
            return false;
        }
        i(c8416dku);
        return c8416dku.a() == i;
    }

    public static aZE d(UserAgent userAgent, String str, aZE aze, boolean z) {
        InterfaceC5093bsJ e = userAgent.e(str);
        if (e != null) {
            aze.c(e);
        } else if (z) {
            C1044Mm.j("nf_msl_utils", "MSLUserCredentialRegistry not found for profile %s, but request is marked as always deliver, use current credentials.", str);
        } else {
            C1044Mm.j("nf_msl_utils", "MSLUserCredentialRegistry not found for profile %s, drop request", str);
            return null;
        }
        return aze;
    }

    public static Map<String, String> b(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), C8124deU.a(entry.getValue()));
            }
        }
        return hashMap;
    }
}
