package o;

import com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever;
import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import com.netflix.mediaclient.service.mdx.logging.intents.MdxIntentLogblob;
import com.netflix.mediaclient.service.pushnotification.Payload;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class aWX extends MdxIntentLogblob {
    public static final String[] a = {Payload.Action.PLAY, "PLAYING"};

    public aWX(String str, int i, MdxNotificationIntentRetriever.SegmentType segmentType, MdxNotificationIntentRetriever.InvocSource invocSource, MdxTargetType mdxTargetType) {
        super(str, i, MdxIntentLogblob.IntentType.SkipSegment, mdxTargetType);
        e(segmentType.b());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("invoc_src", invocSource.a());
            d(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
