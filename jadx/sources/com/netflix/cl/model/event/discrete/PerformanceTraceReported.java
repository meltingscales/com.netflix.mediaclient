package com.netflix.cl.model.event.discrete;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PerformanceTraceReported extends MeasurementReported {
    private JSONObject data;
    private Long sessionId;

    public JSONObject getData() {
        return this.data;
    }

    public PerformanceTraceReported(JSONObject jSONObject, Long l, Long l2) {
        super(l2);
        addContextType("PerformanceTraceReported");
        this.data = jSONObject;
        this.sessionId = l;
    }

    @Override // com.netflix.cl.model.event.discrete.MeasurementReported, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addJsonToJson(jSONObject, NotificationFactory.DATA, this.data);
        ExtCLUtils.addObjectToJson(jSONObject, "sessionId", this.sessionId);
        return jSONObject;
    }
}
