package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOR {
    public static final aOR a = new aOR();

    private aOR() {
    }

    public final UZ d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        if (jSONObject.has("currentTrackIds") && jSONObject.has("audioTracks") && jSONObject.has("timedTextTracks")) {
            return new aOT(jSONObject);
        }
        return null;
    }
}
