package com.netflix.cl.model.event.session;

import com.netflix.cl.model.PushNotificationType;
import com.netflix.cl.model.event.session.action.RegisterForPushNotifications;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class RegisterForPushNotificationsEnded extends SessionEnded {
    private String deviceToken;
    private PushNotificationType[] enabledNotificationTypes;
    private Boolean infoOptStatus;
    private Boolean pushOptStatus;

    public RegisterForPushNotificationsEnded(RegisterForPushNotifications registerForPushNotifications, PushNotificationType[] pushNotificationTypeArr, Boolean bool, Boolean bool2, String str) {
        super(registerForPushNotifications);
        addContextType("RegisterForPushNotificationsEnded");
        this.enabledNotificationTypes = pushNotificationTypeArr;
        this.infoOptStatus = bool;
        this.pushOptStatus = bool2;
        this.deviceToken = str;
    }

    @Override // com.netflix.cl.model.event.session.SessionEnded, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "enabledNotificationTypes", this.enabledNotificationTypes);
        ExtCLUtils.addObjectToJson(jSONObject, "infoOptStatus", this.infoOptStatus);
        ExtCLUtils.addObjectToJson(jSONObject, "pushOptStatus", this.pushOptStatus);
        ExtCLUtils.addStringToJson(jSONObject, "deviceToken", this.deviceToken);
        return jSONObject;
    }
}
