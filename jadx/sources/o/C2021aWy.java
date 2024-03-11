package o;

import org.json.JSONObject;

/* renamed from: o.aWy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2021aWy {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final int g;
    private final String i;

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2021aWy) {
            C2021aWy c2021aWy = (C2021aWy) obj;
            return C8632dsu.c((Object) this.d, (Object) c2021aWy.d) && C8632dsu.c((Object) this.b, (Object) c2021aWy.b) && C8632dsu.c((Object) this.c, (Object) c2021aWy.c) && C8632dsu.c((Object) this.a, (Object) c2021aWy.a) && this.e == c2021aWy.e && C8632dsu.c((Object) this.i, (Object) c2021aWy.i) && this.g == c2021aWy.g;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.a.hashCode()) * 31) + Integer.hashCode(this.e)) * 31) + this.i.hashCode()) * 31) + Integer.hashCode(this.g);
    }

    public String toString() {
        String str = this.d;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.a;
        int i = this.e;
        String str5 = this.i;
        int i2 = this.g;
        return "DdrAssociateResponse(localUrl=" + str + ", remoteUrl=" + str2 + ", response=" + str3 + ", ts=" + str4 + ", msgId=" + i + ", type=" + str5 + ", version=" + i2 + ")";
    }

    public C2021aWy(String str, String str2, String str3, String str4, int i, String str5, int i2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) str5, "");
        this.d = str;
        this.b = str2;
        this.c = str3;
        this.a = str4;
        this.e = i;
        this.i = str5;
        this.g = i2;
    }

    public final JSONObject c() {
        if (this.g == 1) {
            return e();
        }
        return a();
    }

    private final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sourceDeviceAddr", this.d);
        jSONObject.put("type", this.i);
        jSONObject.put("ts", this.a);
        jSONObject.put("response", this.c);
        jSONObject.put("msgId", this.e);
        return jSONObject;
    }

    private final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("s", this.d);
        jSONObject.put("type", this.i);
        jSONObject.put("ts", this.a);
        jSONObject.put("r", this.c);
        jSONObject.put("m", this.e);
        return jSONObject;
    }
}
