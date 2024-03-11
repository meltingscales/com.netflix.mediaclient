package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.bdd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4391bdd {
    AbstractC4561bgo a;
    String b;
    long c;
    private final boolean d;
    boolean e;
    private final UserAgent i;

    C4391bdd a(String str) {
        this.b = str;
        return this;
    }

    C4391bdd a(AbstractC4561bgo abstractC4561bgo) {
        this.a = abstractC4561bgo;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4391bdd b(long j) {
        this.c = j;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4391bdd d(boolean z) {
        this.e = z;
        return this;
    }

    public C4391bdd(UserAgent userAgent, boolean z) {
        this.i = userAgent;
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        JSONObject jSONObject = new JSONObject();
        if (this.a == null) {
            return jSONObject.toString();
        }
        try {
            jSONObject.put("version", 2);
            jSONObject.put("method", this.a.a());
            jSONObject.put(SignupConstants.Field.URL, this.a.d());
            jSONObject.put("languages", new JSONArray((Collection) Arrays.asList(this.i.j().getLanguages())));
            TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            JSONObject jSONObject2 = new JSONObject();
            long j = this.c;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            jSONObject2.put("clientTime", j);
            jSONObject2.put("forceDeviceActivate", this.e);
            jSONObject2.putOpt("challengeBase64", this.b);
            jSONObject2.put("enableSecureDelete", this.d);
            jSONObject.putOpt("params", jSONObject2);
        } catch (Exception e) {
            C1044Mm.b("nf_msl_volley_FetchLicenseRequest", e, "error creating manifest params", new Object[0]);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4391bdd e(AbstractC4561bgo abstractC4561bgo, String str) {
        return a(abstractC4561bgo).a(str);
    }
}
