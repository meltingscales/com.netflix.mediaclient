package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.cdx.api.event.type.LocationType;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import org.json.JSONObject;

/* renamed from: o.aNz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1780aNz implements UY {
    public static final e a = new e(null);
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    @Override // o.UY
    public String d() {
        return this.c;
    }

    public C1780aNz(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        this.d = a(jSONObject);
        this.c = e(jSONObject);
        String optString = jSONObject.optString("pathname", "");
        C8632dsu.a(optString, "");
        this.b = optString;
        String optString2 = jSONObject.optString("viewName", "");
        C8632dsu.a(optString2, "");
        this.e = optString2;
    }

    /* renamed from: o.aNz$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("nf_cdx_location_event");
        }
    }

    private final String a(JSONObject jSONObject) {
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            if (jSONObject2.has(SignupConstants.Field.VIDEO_ID)) {
                return jSONObject2.optString(SignupConstants.Field.VIDEO_ID);
            }
            return null;
        }
        return null;
    }

    private final String e(JSONObject jSONObject) {
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            if (jSONObject2.has("viewableId")) {
                return jSONObject2.optString("viewableId");
            }
            return null;
        }
        return null;
    }

    @Override // o.UY
    public LocationType a() {
        boolean e2;
        boolean e3;
        boolean a2;
        boolean e4;
        boolean e5;
        boolean e6;
        boolean e7;
        e2 = duD.e((CharSequence) this.b, (CharSequence) "browse", true);
        if (e2) {
            return LocationType.e;
        }
        e3 = duD.e((CharSequence) this.b, (CharSequence) "details", true);
        if (e3) {
            e7 = duD.e((CharSequence) this.b, (CharSequence) "exiting", true);
            if (!e7) {
                return LocationType.b;
            }
        }
        a2 = C8691duz.a(this.b, UmaAlert.ICON_ERROR, true);
        if (a2) {
            return LocationType.d;
        }
        e4 = duD.e((CharSequence) this.b, (CharSequence) "playmodeError", true);
        if (e4) {
            return LocationType.d;
        }
        e5 = duD.e((CharSequence) this.b, (CharSequence) "playmode", true);
        if (e5) {
            return LocationType.a;
        }
        e6 = duD.e((CharSequence) this.b, (CharSequence) "postplay", true);
        return e6 ? LocationType.c : LocationType.g;
    }
}
