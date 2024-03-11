package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNG implements aNN {
    public static final a a = new a(null);
    private final JSONObject b;
    private final CdxAgentImpl c;

    public aNG(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.c = cdxAgentImpl;
        this.b = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("nf_cdx_ack_handler");
        }

        public final boolean e(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "ack");
        }
    }

    @Override // o.aNN
    public void c() {
        int optInt = this.b.optInt("msgId");
        String optString = this.b.optString("senderEsn");
        a.getLogTag();
        CdxAgentImpl cdxAgentImpl = this.c;
        C8632dsu.d((Object) optString);
        cdxAgentImpl.c(optInt, optString);
    }
}
