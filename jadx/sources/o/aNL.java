package o;

import com.netflix.mediaclient.cdx.api.DeviceType;
import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNL implements aNN {
    public static final d e = new d(null);
    private final CdxAgentImpl b;
    private final JSONObject c;

    public aNL(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.b = cdxAgentImpl;
        this.c = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("nf_cdx_metadata_handler");
        }

        public final boolean a(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "metadata");
        }
    }

    @Override // o.aNN
    public void c() {
        e.getLogTag();
        int optInt = this.c.optInt("msgId");
        String optString = this.c.optString("senderEsn");
        ZuulAgent zuulAgent = this.b.getZuulAgent();
        if (zuulAgent != null) {
            C8632dsu.d((Object) optString);
            DeviceType deviceType = DeviceType.d;
            String optString2 = this.c.optString("profileGuid");
            C8632dsu.a(optString2, "");
            String optString3 = this.c.optString("networkId");
            C8632dsu.a(optString3, "");
            zuulAgent.b(C1774aNt.c.a(new C1772aNr(optInt, new C1255Uq(optString, null, null, null, deviceType, optString2, optString3, false, 128, null), this.b.f(), this.b.k())).b());
        }
    }
}
