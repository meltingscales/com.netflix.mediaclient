package com.netflix.model.leafs.social;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.model.leafs.social.C$AutoValue_UserNotificationActionTrackingInfo;
import o.InterfaceC5088bsE;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class UserNotificationActionTrackingInfo implements Parcelable, InterfaceC5088bsE {
    public abstract String action();

    public abstract String messageGuid();

    public abstract String titleId();

    public abstract Integer trackId();

    public static TypeAdapter<UserNotificationActionTrackingInfo> typeAdapter(Gson gson) {
        return new C$AutoValue_UserNotificationActionTrackingInfo.GsonTypeAdapter(gson);
    }

    @Override // o.InterfaceC5088bsE
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("titleId", titleId());
            jSONObject.putOpt(SignupConstants.Error.DEBUG_INFO_ACTION, action());
            jSONObject.putOpt(Payload.PARAM_MESSAGE_GUID, messageGuid());
            jSONObject.putOpt("trackId", trackId());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
