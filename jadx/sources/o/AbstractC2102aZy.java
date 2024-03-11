package o;

import android.os.Build;
import com.netflix.android.volley.AuthFailureError;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aZy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2102aZy<T> extends aZE<T> {
    private String e;

    @Override // com.netflix.android.volley.Request
    public boolean C() {
        return true;
    }

    protected abstract String J();

    @Override // o.aZE
    public String O() {
        return "/android/7.64/api";
    }

    protected String P() {
        return "router";
    }

    protected boolean R() {
        return false;
    }

    protected boolean S() {
        return true;
    }

    @Override // o.aZE
    public boolean V() {
        return true;
    }

    public AbstractC2102aZy(int i) {
        super(i);
    }

    @Override // com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.HIGH;
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        C8200dfr.d(j, P(), J(), true, S());
        return j;
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        Map<String, String> o2 = super.o();
        int c = C8055ddE.c(AbstractApplicationC1040Mh.d());
        o2.put(SignupConstants.Key.NETFLIX_CLIENT_PLATFORM, SignupConstants.AndroidPlatform.ANDROID_NATIVE);
        o2.put("appVer", Integer.toString(c));
        o2.put("appVersion", C8055ddE.e(AbstractApplicationC1040Mh.d()));
        o2.put("api", Integer.toString(Build.VERSION.SDK_INT));
        o2.put("mnf", Build.MANUFACTURER.trim());
        o2.put("ffbc", C8151dev.e());
        o2.put("mId", ((aZE) this).i.q().h());
        o2.put("devmod", ((aZE) this).i.w().p());
        if (((aZE) this).p != null) {
            this.e = aMH.c().c(((aZE) this).p);
        }
        o2.remove("languages");
        return o2;
    }

    public JSONObject M() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, String> o2 = o();
            if (o2 != null) {
                for (String str : o2.keySet()) {
                    String str2 = o2.get(str);
                    if (str2 != null) {
                        jSONObject.put(str, str2);
                    }
                }
            }
        } catch (AuthFailureError e) {
            C1044Mm.b("nf_nqmslvolleyrequest", e, "Unable to add params", new Object[0]);
        }
        return new JSONObject();
    }

    @Override // o.aZE
    public String w_() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(SignupConstants.Field.URL, "/" + J());
            if (R()) {
                jSONObject.putOpt("params", M());
            } else {
                jSONObject.putOpt("params", M().toString());
            }
            if (C8168dfL.h(this.e)) {
                jSONObject.putOpt("languages", new JSONArray((Collection) Arrays.asList(this.e)));
            }
        } catch (JSONException e) {
            C1044Mm.b("nf_nqmslvolleyrequest", e, "error building payload for Nq", new Object[0]);
        }
        return jSONObject.toString();
    }
}
