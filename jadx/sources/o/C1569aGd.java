package o;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aGd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1569aGd {
    public String a;
    private JSONObject b;
    public boolean c;
    public String d;

    public C1569aGd(JSONObject jSONObject) {
        e(jSONObject);
    }

    public C1569aGd(String str, String str2) {
        this.a = str;
        this.d = str2;
        b();
    }

    public String toString() {
        return this.b.toString();
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        return ((hashCode + 31) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1569aGd)) {
            C1569aGd c1569aGd = (C1569aGd) obj;
            String str = this.a;
            if (str == null) {
                if (c1569aGd.a != null) {
                    return false;
                }
            } else if (!str.equals(c1569aGd.a)) {
                return false;
            }
            String str2 = this.d;
            if (str2 == null) {
                if (c1569aGd.d != null) {
                    return false;
                }
            } else if (!str2.equals(c1569aGd.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private void e(JSONObject jSONObject) {
        this.b = jSONObject;
        if (jSONObject == null) {
            C1044Mm.d("nf_reg", "Tokens are null");
            return;
        }
        this.a = C8123deT.a(jSONObject, "NetflixId", (String) null);
        String a = C8123deT.a(jSONObject, "SecureNetflixId", (String) null);
        this.d = a;
        if (this.a == null || a == null) {
            throw new JSONException("Tokens cannot be null");
        }
    }

    private void b() {
        if (this.a != null && this.d != null) {
            JSONObject jSONObject = new JSONObject();
            this.b = jSONObject;
            jSONObject.put("NetflixId", this.a);
            this.b.put("SecureNetflixId", this.d);
            return;
        }
        throw new JSONException("Tokens cannot be null");
    }
}
