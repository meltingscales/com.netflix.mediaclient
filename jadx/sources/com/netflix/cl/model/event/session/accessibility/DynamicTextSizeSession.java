package com.netflix.cl.model.event.session.accessibility;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DynamicTextSizeSession extends AccessibilityToolSession {
    private Double value;

    public DynamicTextSizeSession(Double d) {
        addContextType("accessibility.DynamicTextSizeSession");
        this.value = d;
    }

    @Override // com.netflix.cl.model.event.session.accessibility.AccessibilityToolSession, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "value", this.value);
        return jSONObject;
    }
}
