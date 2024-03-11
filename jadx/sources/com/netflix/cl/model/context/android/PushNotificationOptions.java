package com.netflix.cl.model.context.android;

import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class PushNotificationOptions extends CLContext {
    private JSONObject channelOptStatus;
    private String oldDeviceToken;
    private Boolean systemOptStatus;

    public PushNotificationOptions(Boolean bool, JSONObject jSONObject, String str) {
        addContextType("android.PushNotificationOptions");
        this.systemOptStatus = bool;
        this.channelOptStatus = jSONObject;
        this.oldDeviceToken = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "systemOptStatus", this.systemOptStatus);
        ExtCLUtils.addJsonToJson(jSONObject, "channelOptStatus", this.channelOptStatus);
        ExtCLUtils.addStringToJson(jSONObject, "oldDeviceToken", this.oldDeviceToken);
        return jSONObject;
    }
}
