package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.Iterator;
import o.aWC;
import org.json.JSONObject;

/* renamed from: o.aWa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1997aWa {
    private static ArrayList<Long> b = new ArrayList<>();

    public static boolean b(JSONObject jSONObject) {
        String optString = jSONObject.optString(SignupConstants.Error.DEBUG_INFO_ACTION);
        if (optString != null && optString.equals("pingresponse")) {
            C1044Mm.a("MdxGuard", "pingresponse");
            return true;
        }
        String optString2 = jSONObject.optString("type");
        C1044Mm.c("MdxGuard", "msg=%s", jSONObject.toString());
        if (optString2 != null) {
            aWC.b bVar = aWC.c;
            if (optString2.equals("deviceChallengeRequest")) {
                C1044Mm.c("MdxGuard", "valid ddrAssociateRequestType1=%s", optString2);
                return true;
            } else if (optString2.equals("deviceChallengeResponse")) {
                C1044Mm.c("MdxGuard", "valid ddrAssociateResponseType1=%s", optString2);
                return true;
            } else if (optString2.equals("dcq")) {
                C1044Mm.c("MdxGuard", "valid ddrAssociateRequestType2=%s", optString2);
                return true;
            } else if (optString2.equals("dcr")) {
                C1044Mm.c("MdxGuard", "valid ddrAssociateResponseType2=%s", optString2);
                return true;
            }
        }
        return d(Long.valueOf(jSONObject.optLong("nonce")));
    }

    private static boolean d(Long l) {
        if (l == null || l.longValue() <= 0) {
            C1044Mm.j("MdxGuard", "Invalid Nonce");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C1044Mm.c("MdxGuard", "Nonce: %s", l);
        if (b.contains(l)) {
            C1044Mm.j("MdxGuard", "Duplicate Nonce: %s", l);
            return false;
        }
        Iterator<Long> it = b.iterator();
        while (it.hasNext()) {
            if (Math.abs(it.next().longValue() - currentTimeMillis) > 10000) {
                it.remove();
            }
        }
        b.add(l);
        return true;
    }
}
