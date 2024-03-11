package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNP implements aNN {
    public static final e a = new e(null);
    private final JSONObject b;
    private final CdxAgentImpl e;

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("nf_cdx_player_subscription_response_handler");
        }

        public final boolean b(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "subscriptionResponse");
        }
    }

    public aNP(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.e = cdxAgentImpl;
        this.b = jSONObject;
    }

    @Override // o.aNN
    public void c() {
        a.getLogTag();
        JSONObject optJSONObject = this.b.optJSONObject("payload");
        aOK aok = aOK.b;
        C8632dsu.d(optJSONObject);
        UW c = aok.c(optJSONObject);
        if (c != null) {
            this.e.i().e(c);
        }
    }
}
