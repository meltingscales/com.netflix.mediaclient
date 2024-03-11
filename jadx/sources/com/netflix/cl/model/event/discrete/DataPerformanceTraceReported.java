package com.netflix.cl.model.event.discrete;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DataPerformanceTraceReported extends PerformanceTraceReported {
    private String userActionId;

    public DataPerformanceTraceReported(String str, JSONObject jSONObject, Long l, Long l2) {
        super(jSONObject, l, l2);
        addContextType("DataPerformanceTraceReported");
        this.userActionId = str;
    }

    @Override // com.netflix.cl.model.event.discrete.PerformanceTraceReported, com.netflix.cl.model.event.discrete.MeasurementReported, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "userActionId", this.userActionId);
        return jSONObject;
    }
}
