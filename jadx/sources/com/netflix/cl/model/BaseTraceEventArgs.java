package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BaseTraceEventArgs extends Data {
    private Map<String, Object> additionalProperties = new HashMap();
    private JSONObject data;
    private AppView navigationLevel;

    public BaseTraceEventArgs(AppView appView, JSONObject jSONObject) {
        this.navigationLevel = appView;
        this.data = jSONObject;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "navigationLevel", this.navigationLevel);
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
