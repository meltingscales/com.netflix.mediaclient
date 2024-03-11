package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNR implements aNN {
    public static final a e = new a(null);
    private final JSONObject a;
    private final CdxAgentImpl c;

    public aNR(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.c = cdxAgentImpl;
        this.a = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("nf_cdx_track_event_handler");
        }

        public final boolean a(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "trackChanged");
        }
    }

    @Override // o.aNN
    public void c() {
        e.getLogTag();
        JSONObject optJSONObject = this.a.optJSONObject("payload");
        aOQ aoq = aOQ.d;
        C8632dsu.d(optJSONObject);
        InterfaceC1268Vd a2 = aoq.a(optJSONObject);
        if (a2 != null) {
            this.c.i().a(a2);
        }
    }
}
