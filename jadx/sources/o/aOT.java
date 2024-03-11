package o;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOT implements UZ {
    private final C1250Ul b;
    private List<C1253Uo> c;
    private List<C1258Ut> d;

    @Override // o.UZ
    public List<C1258Ut> a() {
        return this.d;
    }

    @Override // o.UZ
    public List<C1253Uo> b() {
        return this.c;
    }

    @Override // o.UZ
    public C1250Ul d() {
        return this.b;
    }

    public aOT(JSONObject jSONObject) {
        List<C1253Uo> i;
        List<C1258Ut> i2;
        C8654dtp g;
        int B;
        C8632dsu.c((Object) jSONObject, "");
        i = C8569dql.i();
        this.c = i;
        i2 = C8569dql.i();
        this.d = i2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("currentTrackIds");
        String optString = jSONObject2.optString("audioTrackId");
        C8632dsu.a(optString, "");
        String optString2 = jSONObject2.optString("timedTextTrackId");
        C8632dsu.a(optString2, "");
        this.b = new C1250Ul(optString, optString2);
        JSONArray jSONArray = jSONObject.getJSONArray("audioTracks");
        ArrayList arrayList = new ArrayList();
        g = C8657dts.g(0, jSONArray.length());
        B = C8576dqs.B(g);
        for (int i3 = 0; i3 < B; i3++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
            String optString3 = jSONObject3.optString("trackId", "");
            String optString4 = jSONObject3.optString("languageDescription", "");
            boolean optBoolean = jSONObject3.optBoolean("offTrackDisallowed", false);
            String optString5 = jSONObject3.optString("defaultTimedTextTrackId", "");
            C8632dsu.d((Object) optString3);
            C8632dsu.d((Object) optString4);
            C8632dsu.d((Object) optString5);
            arrayList.add(new C1253Uo(optString3, optString4, optBoolean, optString5));
        }
        this.c = arrayList;
        JSONArray jSONArray2 = jSONObject.getJSONArray("timedTextTracks");
        C1774aNt c1774aNt = C1774aNt.c;
        C8632dsu.d(jSONArray2);
        List<C1258Ut> e = c1774aNt.e(jSONArray2);
        this.c = arrayList;
        this.d = e;
    }
}
