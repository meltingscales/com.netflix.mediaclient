package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNK implements aNN {
    public static final e b = new e(null);
    private final CdxAgentImpl a;
    private final JSONObject e;

    public aNK(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.a = cdxAgentImpl;
        this.e = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("nf_cdx_location_event_handler");
        }

        public final boolean c(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "Location");
        }
    }

    @Override // o.aNN
    public void c() {
        b.getLogTag();
        JSONObject optJSONObject = this.e.optJSONObject("payload");
        C1776aNv c1776aNv = C1776aNv.e;
        C8632dsu.d(optJSONObject);
        UY c = c1776aNv.c(optJSONObject);
        if (c != null) {
            this.a.i().c(c);
        }
    }
}
