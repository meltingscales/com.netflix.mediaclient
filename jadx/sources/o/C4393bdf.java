package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bdf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4393bdf {
    Map<String, String> b;
    AbstractC4561bgo c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4393bdf c(AbstractC4561bgo abstractC4561bgo) {
        this.c = abstractC4561bgo;
        this.b = new HashMap();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4393bdf d(String str, String str2) {
        try {
            if (C8168dfL.h(str) && C8168dfL.h(str2)) {
                this.b.put(str, str2);
            }
        } catch (Exception unused) {
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientTime", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                if (C8168dfL.h(entry.getKey()) && C8168dfL.h(entry.getValue())) {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                }
            }
        } catch (JSONException e) {
            C1044Mm.b("nf_msl_volley_bladerunner", e, "error creating params", new Object[0]);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("version", 2);
            AbstractC4561bgo abstractC4561bgo = this.c;
            if (abstractC4561bgo != null) {
                jSONObject2.put("method", abstractC4561bgo.a());
                jSONObject2.put(SignupConstants.Field.URL, this.c.d());
            }
            jSONObject2.putOpt("params", d());
        } catch (JSONException e) {
            C1044Mm.b("nf_msl_volley_bladerunner", e, "error creating request object", new Object[0]);
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return b(d()).toString();
    }
}
