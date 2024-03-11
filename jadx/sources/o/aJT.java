package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.JsonSerializer;
import com.netflix.cl.model.event.discrete.ChangedValue;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aJT {
    public static final void d(final String str, final Integer num, CommandValue commandValue) {
        C8632dsu.c((Object) commandValue, "");
        Logger.INSTANCE.logEvent(new ChangedValue(null, null, new JsonSerializer() { // from class: o.aJS
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject b;
                b = aJT.b(str, num);
                return b;
            }
        }, commandValue, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(String str, Integer num) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "subtitles");
        jSONObject.put("language", str);
        jSONObject.put("trackType", d(num));
        return jSONObject;
    }

    public static final void a() {
        Logger.INSTANCE.logEvent(new ChangedValue(null, null, new JsonSerializer() { // from class: o.aJP
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject c;
                c = aJT.c();
                return c;
            }
        }, CommandValue.ViewAudioSubtitlesSelectorCommand, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "subtitles");
        jSONObject.put("disableSubtitlesOnMute", "true");
        return jSONObject;
    }

    private static final String d(Integer num) {
        return (num != null && num.intValue() == 0) ? "UNKNOWN_SUBTITLE" : (num != null && num.intValue() == 1) ? "PRIMARY_SUBTITLE" : (num != null && num.intValue() == 2) ? "CLOSED_CAPTION_SUBTITLE" : (num != null && num.intValue() == 3) ? "SUBTITLES" : (num != null && num.intValue() == 4) ? "COMMENTARY" : (num != null && num.intValue() == 5) ? "DESCRIPTIONS" : (num != null && num.intValue() == 6) ? "FORCED_NARRATIVE" : "NONE";
    }
}
