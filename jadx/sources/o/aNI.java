package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNI implements aNN {
    public static final b a = new b(null);
    private final JSONObject d;
    private final CdxAgentImpl e;

    public aNI(CdxAgentImpl cdxAgentImpl, JSONObject jSONObject) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) jSONObject, "");
        this.e = cdxAgentImpl;
        this.d = jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_cdx_GetTimedTextTracksResponse_event_handler");
        }

        public final boolean d(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return C8632dsu.c((Object) jSONObject.optString("category"), (Object) "deviceToDevice") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "timedTextTrackListResponse");
        }
    }

    @Override // o.aNN
    public void c() {
        a.getLogTag();
        JSONArray jSONArray = this.d.optJSONObject("payload").getJSONArray("timedTextTracks");
        C1774aNt c1774aNt = C1774aNt.c;
        C8632dsu.d(jSONArray);
        this.e.i().e(c1774aNt.e(jSONArray));
    }
}
