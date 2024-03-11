package o;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aVv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1991aVv extends aUI {
    private final JSONArray a;

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "connlog";
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    public final JSONArray i() {
        return this.a;
    }

    public C1991aVv() {
        JSONArray jSONArray = new JSONArray();
        this.a = jSONArray;
        this.i.put("q", jSONArray);
    }

    public final void c(boolean z) {
        try {
            this.i.put("hasVT", z);
        } catch (JSONException unused) {
        }
    }

    public final void a(String str, boolean z, Map<String, aVA> map) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("res", str);
        jSONObject.put("sys", z);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("resp", jSONObject2);
        for (Map.Entry<String, aVA> entry : map.entrySet()) {
            aVA value = entry.getValue();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject2.put(entry.getKey(), jSONObject3);
            if (value.c() == null) {
                jSONObject3.put("cname", value.e());
                JSONArray jSONArray = new JSONArray();
                jSONObject3.put("ips", jSONArray);
                for (String str2 : value.a()) {
                    jSONArray.put(str2);
                }
            } else {
                jSONObject3.put("err", value.c());
            }
        }
        this.a.put(jSONObject);
    }
}
