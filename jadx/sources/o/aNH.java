package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNH implements aNN {
    public static final c b = new c(null);
    private final JSONObject c;
    private final CdxAgentImpl e;

    public aNH(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.e = cdxAgentImpl;
        this.c = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("nf_cdx_metadata_response_handler");
        }

        public final boolean a(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "metadataResponse");
        }
    }

    @Override // o.aNN
    public void c() {
        int optInt = this.c.optInt("msgId");
        String optString = this.c.optString("senderEsn");
        CdxAgentImpl cdxAgentImpl = this.e;
        C8632dsu.d((Object) optString);
        cdxAgentImpl.c(optInt, optString);
        b.getLogTag();
        this.e.i().a(this.c);
    }
}
