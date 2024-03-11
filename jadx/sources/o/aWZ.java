package o;

import com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever;
import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import com.netflix.mediaclient.service.mdx.logging.intents.MdxIntentLogblob;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class aWZ extends MdxIntentLogblob {
    public static final String[] a = {"END_PLAYBACK"};

    public aWZ(String str, int i, MdxNotificationIntentRetriever.InvocSource invocSource, MdxTargetType mdxTargetType) {
        super(str, i, MdxIntentLogblob.IntentType.Stop, mdxTargetType);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("invoc_src", invocSource.a());
            d(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
