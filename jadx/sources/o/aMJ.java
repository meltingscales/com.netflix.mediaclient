package o;

import com.netflix.mediaclient.service.api.diagnostics.IDiagnosis;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class aMJ {
    private final String a;
    private IDiagnosis.UrlStatus b;
    private boolean c;
    private int d;
    private int e;

    public IDiagnosis.UrlStatus a() {
        return this.b;
    }

    public void a(int i) {
        this.e = i;
    }

    public void a(IDiagnosis.UrlStatus urlStatus) {
        this.b = urlStatus;
    }

    public int b() {
        return this.e;
    }

    public void b(boolean z) {
        this.c = z;
    }

    public int c() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public String e() {
        return this.a;
    }

    public boolean i() {
        return this.c;
    }

    public aMJ(String str, IDiagnosis.UrlStatus urlStatus) {
        IDiagnosis.UrlStatus urlStatus2 = IDiagnosis.UrlStatus.NOT_TESTED;
        this.e = 0;
        this.d = 0;
        this.c = false;
        this.a = str;
        this.b = urlStatus;
    }

    public boolean d() {
        String str = this.a;
        return str != null && str.contains("netflix");
    }

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("URL", this.a);
        jSONObject.put("errorgroup", this.d);
        jSONObject.put("errorcode", this.e);
        jSONObject.put("success", this.c);
        jSONObject.put("urlType", d() ? "NETFLIX" : "INTERNET");
        return jSONObject;
    }
}
