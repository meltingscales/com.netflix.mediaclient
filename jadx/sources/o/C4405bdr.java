package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BladerunnerErrorStatus;
import org.json.JSONObject;

/* renamed from: o.bdr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4405bdr {
    private static JSONObject d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONObject("value");
    }

    public static JSONObject e(String str, String str2, JSONObject jSONObject) {
        JSONObject d = d(jSONObject);
        if (d == null) {
            C1044Mm.b(str, "null response ");
            return null;
        }
        return d.optJSONObject(str2);
    }

    public static Status b(Context context, JSONObject jSONObject, BasePlayErrorStatus.PlayRequestType playRequestType) {
        return BasePlayErrorStatus.d(jSONObject) ? c(context, jSONObject, playRequestType) : InterfaceC1078Nw.aJ;
    }

    private static Status c(Context context, JSONObject jSONObject, BasePlayErrorStatus.PlayRequestType playRequestType) {
        return new BladerunnerErrorStatus(context, jSONObject, playRequestType);
    }
}
