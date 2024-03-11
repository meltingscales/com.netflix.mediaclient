package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNJ implements aNN {
    public static final b b = new b(null);
    private final CdxAgentImpl a;
    private final JSONObject e;

    public aNJ(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.a = cdxAgentImpl;
        this.e = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_cdx_playback_event_handler");
        }

        public final boolean e(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "playbackState");
        }
    }

    @Override // o.aNN
    public void c() {
        b.getLogTag();
        JSONObject optJSONObject = this.e.optJSONObject("payload");
        aOH aoh = aOH.b;
        C8632dsu.d(optJSONObject);
        UU b2 = aoh.b(optJSONObject);
        if (b2 != null) {
            this.a.i().c(b2);
        }
    }
}
