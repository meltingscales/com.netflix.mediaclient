package com.netflix.cl.model.context.android;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AmazonPushNotificationOptions extends PushNotificationOptions {
    public AmazonPushNotificationOptions(Boolean bool, JSONObject jSONObject, String str) {
        super(bool, jSONObject, str);
        addContextType("android.AmazonPushNotificationOptions");
    }

    @Override // com.netflix.cl.model.context.android.PushNotificationOptions, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
