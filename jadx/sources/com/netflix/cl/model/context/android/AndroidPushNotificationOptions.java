package com.netflix.cl.model.context.android;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AndroidPushNotificationOptions extends PushNotificationOptions {
    public AndroidPushNotificationOptions(Boolean bool, JSONObject jSONObject, String str) {
        super(bool, jSONObject, str);
        addContextType("android.AndroidPushNotificationOptions");
    }

    @Override // com.netflix.cl.model.context.android.PushNotificationOptions, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
