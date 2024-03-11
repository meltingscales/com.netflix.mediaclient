package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.bdl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4399bdl {
    private static List<AbstractC4561bgo> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4399bdl b(List<AbstractC4561bgo> list) {
        b = list;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return "syncDeactivateLinks";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 2);
            jSONObject.put("method", "syncDeactivateLinks");
            jSONObject.put(SignupConstants.Field.URL, "/syncDeactivateLinks");
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("deactivateLinks", a());
            jSONObject2.put("clientTime", seconds);
            jSONObject.putOpt("params", jSONObject2);
        } catch (Exception e) {
            C1044Mm.b("nf_msl_volley_bladerunner", e, "error creating manifest params", new Object[0]);
        }
        return jSONObject.toString();
    }

    private JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        List<AbstractC4561bgo> list = b;
        if (list == null) {
            return jSONArray;
        }
        for (AbstractC4561bgo abstractC4561bgo : list) {
            String d = abstractC4561bgo.d();
            if (C8168dfL.h(d)) {
                jSONArray.put(d);
            }
        }
        return jSONArray;
    }
}
