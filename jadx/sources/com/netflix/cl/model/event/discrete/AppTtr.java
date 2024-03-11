package com.netflix.cl.model.event.discrete;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AppTtr extends PerformanceTraceTtr {
    public AppTtr(JSONObject jSONObject, Long l, Long l2) {
        super(jSONObject, l, l2);
        addContextType("AppTtr");
    }

    @Override // com.netflix.cl.model.event.discrete.PerformanceTraceTtr, com.netflix.cl.model.event.discrete.PerformanceTraceReported, com.netflix.cl.model.event.discrete.MeasurementReported, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
