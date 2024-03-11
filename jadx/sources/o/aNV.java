package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNV implements aNN {
    public static final b a = new b(null);
    private final CdxAgentImpl c;
    private final JSONObject d;

    public aNV(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.c = cdxAgentImpl;
        this.d = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_cdx_target_disconnected_event_handler");
        }

        public final boolean c(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "targetDisconnected");
        }
    }

    @Override // o.aNN
    public void c() {
        a.getLogTag();
        JSONObject optJSONObject = this.d.optJSONObject("payload");
        aOM aom = aOM.b;
        C8632dsu.d(optJSONObject);
        InterfaceC1265Va c = aom.c(optJSONObject);
        if (c != null) {
            this.c.i().b(c);
        }
    }
}
