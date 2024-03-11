package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNS implements aNN {
    public static final e b = new e(null);
    private final JSONObject a;
    private final CdxAgentImpl c;

    public aNS(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
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
            super("nf_cdx_skip_window_config_event_handler");
        }

        public final boolean b(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "SkipWindowConfig");
        }
    }

    @Override // o.aNN
    public void c() {
        b.getLogTag();
        JSONObject optJSONObject = this.a.optJSONObject("payload");
        aOJ aoj = aOJ.e;
        C8632dsu.d(optJSONObject);
        UX b2 = aoj.b(optJSONObject);
        if (b2 != null) {
            this.c.i().c(b2);
        }
    }
}
