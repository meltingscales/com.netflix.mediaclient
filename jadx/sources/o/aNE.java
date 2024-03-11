package o;

import com.netflix.mediaclient.cdx.api.DeviceType;
import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNE implements aNN {
    public static final e e = new e(null);
    private final JSONObject a;
    private final CdxAgentImpl c;

    public aNE(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.c = cdxAgentImpl;
        this.a = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("nf_cdx_message_handler_generic");
        }

        public final boolean d(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice");
        }
    }

    @Override // o.aNN
    public void c() {
        e eVar = e;
        eVar.getLogTag();
        int optInt = this.a.optInt("msgId");
        String optString = this.a.optString("senderEsn");
        if (optInt != 0 && C8168dfL.h(optString)) {
            C8632dsu.d((Object) optString);
            DeviceType deviceType = DeviceType.d;
            String optString2 = this.a.optString("profileGuid");
            C8632dsu.a(optString2, "");
            String optString3 = this.a.optString("networkId");
            C8632dsu.a(optString3, "");
            C1772aNr c1772aNr = new C1772aNr(optInt, new C1255Uq(optString, null, null, null, deviceType, optString2, optString3, false, 128, null), this.c.f(), this.c.k());
            ZuulAgent zuulAgent = this.c.getZuulAgent();
            if (zuulAgent != null) {
                zuulAgent.b(C1774aNt.c.e(c1772aNr).e());
            }
        } else {
            eVar.getLogTag();
        }
        this.c.i().a(this.a);
    }
}
