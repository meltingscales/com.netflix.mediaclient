package o;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aVk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1980aVk {
    private static final String a = "DownloadContext";
    private String b;
    private String c;
    private long d;
    private int e;
    private int f;
    private int g;
    private String h;

    public String a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public String f() {
        return this.h;
    }

    public int g() {
        return this.g;
    }

    public int j() {
        return this.f;
    }

    public C1980aVk(String str, String str2, long j, String str3, int i, int i2, int i3) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.h = str3;
        this.g = i;
        this.f = i2;
        this.e = i3;
    }

    public static C1980aVk a(InterfaceC5206buQ interfaceC5206buQ) {
        return new C1980aVk(interfaceC5206buQ.y(), interfaceC5206buQ.u(), interfaceC5206buQ.ar_(), interfaceC5206buQ.n(), interfaceC5206buQ.l(), interfaceC5206buQ.at_(), interfaceC5206buQ.as_());
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_id", g());
            jSONObject.put("rank", j());
            jSONObject.put("row", e());
            jSONObject.put("profile_guid", a());
            jSONObject.put("request_id", f());
            jSONObject.put("oxid", b());
            jSONObject.put("download_utc_sec", c() / 1000);
        } catch (JSONException e) {
            C1044Mm.e(a, "downloadContext jsonObject", e);
        }
        return jSONObject;
    }

    public String toString() {
        return "DownloadContext{oxid='" + this.b + "', profileGuid='" + this.c + "', downloadInitTimeMs=" + this.d + ", requestId='" + this.h + "', trackId=" + this.g + ", videoPos=" + this.f + ", listPos=" + this.e + '}';
    }
}
