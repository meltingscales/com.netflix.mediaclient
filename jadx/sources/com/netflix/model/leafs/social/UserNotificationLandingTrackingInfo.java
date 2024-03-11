package com.netflix.model.leafs.social;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.model.leafs.social.C$AutoValue_UserNotificationLandingTrackingInfo;
import o.C1596aHd;
import o.InterfaceC1598aHf;
import o.InterfaceC5088bsE;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class UserNotificationLandingTrackingInfo implements Parcelable, InterfaceC5088bsE {
    public static String TAG = "UserNotificationLandingTrackingInfo";

    public abstract String action();

    public abstract String messageGuid();

    public abstract String notificationItemType();

    public abstract String titleId();

    public abstract Integer trackId();

    public static TypeAdapter<UserNotificationLandingTrackingInfo> typeAdapter(Gson gson) {
        return new C$AutoValue_UserNotificationLandingTrackingInfo.GsonTypeAdapter(gson);
    }

    @Override // o.InterfaceC5088bsE
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(Payload.PARAM_MESSAGE_GUID, messageGuid()).putOpt("titleId", titleId()).putOpt("notificationItemType", notificationItemType()).putOpt("trackId", trackId()).putOpt(SignupConstants.Error.DEBUG_INFO_ACTION, action());
        } catch (JSONException e) {
            InterfaceC1598aHf.a(new C1596aHd(TAG + ": Could not convert to JSON object.").b(ErrorType.m).d(e));
        }
        return jSONObject;
    }
}
