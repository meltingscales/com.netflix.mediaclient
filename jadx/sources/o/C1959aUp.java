package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.NqErrorStatus;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.aUp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1959aUp {
    public static Status c(Context context, JSONObject jSONObject, BasePlayErrorStatus.PlayRequestType playRequestType) {
        return a(context, jSONObject.opt(VisualStateDefinition.ELEMENT_STATE.RESULT), playRequestType);
    }

    private static Status a(Context context, Object obj, BasePlayErrorStatus.PlayRequestType playRequestType) {
        Status status = InterfaceC1078Nw.aJ;
        if (obj instanceof JSONObject) {
            return a(context, (JSONObject) obj, playRequestType);
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                status = a(context, jSONArray.optJSONObject(i), playRequestType);
                if (status.i()) {
                    return status;
                }
            }
            return status;
        }
        return status;
    }

    public static Status a(Context context, JSONObject jSONObject, BasePlayErrorStatus.PlayRequestType playRequestType) {
        return BasePlayErrorStatus.d(jSONObject) ? new NqErrorStatus(context, jSONObject, playRequestType) : InterfaceC1078Nw.aJ;
    }
}
