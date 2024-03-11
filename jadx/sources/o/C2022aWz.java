package o;

import org.json.JSONObject;

/* renamed from: o.aWz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2022aWz {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final String e;
    private final int h;

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2022aWz) {
            C2022aWz c2022aWz = (C2022aWz) obj;
            return C8632dsu.c((Object) this.d, (Object) c2022aWz.d) && C8632dsu.c((Object) this.b, (Object) c2022aWz.b) && C8632dsu.c((Object) this.a, (Object) c2022aWz.a) && this.c == c2022aWz.c && C8632dsu.c((Object) this.e, (Object) c2022aWz.e) && this.h == c2022aWz.h;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + this.a.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.h);
    }

    public String toString() {
        String str = this.d;
        String str2 = this.b;
        String str3 = this.a;
        int i = this.c;
        String str4 = this.e;
        int i2 = this.h;
        return "DdrAssociateRequest(localUrl=" + str + ", remoteUrl=" + str2 + ", ts=" + str3 + ", msgId=" + i + ", type=" + str4 + ", version=" + i2 + ")";
    }

    public C2022aWz(String str, String str2, String str3, int i, String str4, int i2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.d = str;
        this.b = str2;
        this.a = str3;
        this.c = i;
        this.e = str4;
        this.h = i2;
    }

    public final JSONObject c() {
        if (this.h == 1) {
            return b();
        }
        return a();
    }

    private final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sourceDeviceAddr", this.d);
        jSONObject.put("type", this.e);
        jSONObject.put("ts", this.a);
        jSONObject.put("msgId", this.c);
        return jSONObject;
    }

    private final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("s", this.d);
        jSONObject.put("type", this.e);
        jSONObject.put("ts", this.a);
        jSONObject.put("m", this.c);
        return jSONObject;
    }
}
