package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOS implements InterfaceC1268Vd {
    private List<C1258Ut> a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;

    @Override // o.InterfaceC1268Vd
    public List<C1258Ut> a() {
        return this.a;
    }

    @Override // o.InterfaceC1268Vd
    public String b() {
        return this.c;
    }

    @Override // o.InterfaceC1268Vd
    public String c() {
        return this.b;
    }

    @Override // o.InterfaceC1268Vd
    public String d() {
        return this.d;
    }

    @Override // o.InterfaceC1268Vd
    public boolean e() {
        return this.e;
    }

    public aOS(JSONObject jSONObject) {
        List<C1258Ut> i;
        C8632dsu.c((Object) jSONObject, "");
        i = C8569dql.i();
        this.a = i;
        String optString = jSONObject.getJSONObject("currentTimedTextTrack").optString(SignupConstants.Field.LANG_ID, "");
        C8632dsu.a(optString, "");
        this.b = optString;
        JSONObject jSONObject2 = jSONObject.getJSONObject("currentAudioTrack");
        String optString2 = jSONObject2.optString(SignupConstants.Field.LANG_ID, "");
        C8632dsu.a(optString2, "");
        this.c = optString2;
        this.e = jSONObject2.optBoolean("offTrackDisallowed", false);
        String optString3 = jSONObject2.optString("offTrackId", "");
        C8632dsu.a(optString3, "");
        this.d = optString3;
        JSONArray jSONArray = jSONObject.getJSONArray("timedTextTracks");
        C1774aNt c1774aNt = C1774aNt.c;
        C8632dsu.d(jSONArray);
        this.a = c1774aNt.e(jSONArray);
    }
}
