package com.netflix.cl.model.event.session;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DebugSession extends Session {
    private Map<String, Object> additionalProperties = new HashMap();
    private JSONObject data;

    public DebugSession(JSONObject jSONObject) {
        addContextType("DebugSession");
        this.data = jSONObject;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = this.data;
        if (jSONObject3 != null) {
            jSONObject2.put(NotificationFactory.DATA, jSONObject3);
        }
        for (Map.Entry<String, Object> entry : this.additionalProperties.entrySet()) {
            ExtCLUtils.addObjectToJson(jSONObject2, entry.getKey(), entry.getValue());
        }
        jSONObject.put("debug", jSONObject2.toString());
        return jSONObject;
    }
}
