package com.netflix.cl.model.event.discrete;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class MeasurementReported extends DiscreteEvent {
    private Long measurementId;

    public MeasurementReported(Long l) {
        addContextType("MeasurementReported");
        this.measurementId = l;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "measurementId", this.measurementId);
        return jSONObject;
    }
}
