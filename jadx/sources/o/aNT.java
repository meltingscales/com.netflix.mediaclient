package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNT implements aNN {
    public static final b d = new b(null);
    private final JSONObject c;
    private final CdxAgentImpl e;

    public aNT(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.e = cdxAgentImpl;
        this.c = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_cdx_track_list_event_handler");
        }

        public final boolean b(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "getTrackListResponse");
        }
    }

    @Override // o.aNN
    public void c() {
        d.getLogTag();
        JSONObject optJSONObject = this.c.optJSONObject("payload");
        aOR aor = aOR.a;
        C8632dsu.d(optJSONObject);
        UZ d2 = aor.d(optJSONObject);
        if (d2 != null) {
            this.e.i().a(d2);
        }
    }
}
