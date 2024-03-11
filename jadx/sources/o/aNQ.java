package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNQ implements aNN {
    public static final d b = new d(null);
    private final JSONObject c;
    private final CdxAgentImpl d;

    public aNQ(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.d = cdxAgentImpl;
        this.c = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("nf_cdx_player_ui_state_event_handler");
        }

        public final boolean b(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "PlaymodeState");
        }
    }

    @Override // o.aNN
    public void c() {
        b.getLogTag();
        JSONObject optJSONObject = this.c.optJSONObject("payload");
        aOF aof = aOF.c;
        C8632dsu.d(optJSONObject);
        UV d2 = aof.d(optJSONObject);
        if (d2 != null) {
            this.d.i().d(d2);
        }
    }
}
