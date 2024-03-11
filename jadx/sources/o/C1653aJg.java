package o;

import android.content.Context;
import android.os.SystemClock;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aJg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1653aJg {
    public static void c(Context context) {
        String e = C8157dfA.e(context, "stubLaunchLogs", (String) null);
        if (C8168dfL.g(e)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(e);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                jSONObject.putOpt(UmaAlert.ICON_INFO, "AndroidAppWidgetLaunch");
                jSONObject.putOpt("elapsedTimeToAppStartMs", Long.valueOf(SystemClock.elapsedRealtime()));
                Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
            }
        } catch (JSONException e2) {
            C1044Mm.e("partner", "could not send stub launch logs", e2);
        }
        C8157dfA.e(context, "stubLaunchLogs");
    }
}
