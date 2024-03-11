package com.netflix.cl.model.event.discrete;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class LoggerInitialized extends DiscreteEvent {
    public LoggerInitialized() {
        addContextType("LoggerInitialized");
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        jSONObject.put("version", "4.1.0");
        return jSONObject;
    }
}
