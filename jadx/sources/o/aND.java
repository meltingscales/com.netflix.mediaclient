package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aND implements aNN {
    public static final a b = new a(null);
    private final CdxAgentImpl e;

    public aND(CdxAgentImpl cdxAgentImpl) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        this.e = cdxAgentImpl;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("nf_cdx_connection_offer_event_handler");
        }

        public final boolean e(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "connectionOffer");
        }
    }

    @Override // o.aNN
    public void c() {
        b.getLogTag();
        this.e.i().a();
    }
}
