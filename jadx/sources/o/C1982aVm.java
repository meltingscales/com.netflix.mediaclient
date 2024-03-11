package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONObject;

/* renamed from: o.aVm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1982aVm {
    private static final String a = "PdsDownloadEventParamBuilder";
    private String c;
    private C1980aVk d;
    private String e;
    private String g;
    private AbstractC4561bgo h;
    private String i;
    private String j;
    private final int b = -1;
    private int f = -1;

    public C1982aVm c(int i) {
        this.f = i;
        return this;
    }

    public C1982aVm d(String str, String str2) {
        this.c = str;
        this.j = str2;
        return this;
    }

    public C1982aVm d(C1980aVk c1980aVk) {
        this.d = c1980aVk;
        return this;
    }

    public C1982aVm(AbstractC4561bgo abstractC4561bgo, String str, String str2, String str3) {
        this.h = abstractC4561bgo;
        this.i = str;
        this.e = str2;
        this.g = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        if (this.h == null) {
            return jSONObject.toString();
        }
        try {
            jSONObject.put("version", 2);
            jSONObject.put(SignupConstants.Field.URL, this.h.d());
            long d = C8170dfN.d();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event", this.i);
            jSONObject2.put("clientTime", d);
            jSONObject2.put("appSessionId", this.e);
            jSONObject2.put("userSessionId", this.g);
            jSONObject2.put("isInBackground", !AbstractApplicationC1040Mh.e());
            jSONObject2.put("trackerId", this.d.g());
            int i = this.f;
            if (i != -1) {
                jSONObject2.put("progressPercentage", i);
            }
            if (C8168dfL.h(this.c)) {
                jSONObject2.put("errorCode", this.c);
            }
            if (C8168dfL.h(this.j)) {
                jSONObject2.put("errorMessage", this.j);
            }
            jSONObject2.put("uiDownloadContext", this.d.d().toString());
            jSONObject.putOpt("params", jSONObject2);
        } catch (Exception e) {
            C1044Mm.b(a, e, "error creating pds download event params", new Object[0]);
        }
        return jSONObject.toString();
    }
}
