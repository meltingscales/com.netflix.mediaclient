package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNF implements aNN {
    public static final a e = new a(null);
    private final CdxAgentImpl c;
    private final JSONObject d;

    public aNF(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.c = cdxAgentImpl;
        this.d = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("nf_cdx_message_device_list");
        }

        public final boolean b(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            JSONObject optJSONObject = jSONObject.optJSONObject("payload");
            return optJSONObject != null && C8632dsu.c((Object) optJSONObject.optString("category"), (Object) "zuulDDRMsg") && optJSONObject.has("devices");
        }
    }

    @Override // o.aNN
    public void c() {
        e.getLogTag();
        JSONObject optJSONObject = this.d.optJSONObject("payload");
        C1763aNi i = this.c.i();
        C8632dsu.d(optJSONObject);
        i.b(optJSONObject);
    }
}
