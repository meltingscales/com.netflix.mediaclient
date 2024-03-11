package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.pushnotification.Payload;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SampleEvent extends Data {
    private SampleEventArgs args;
    private NetflixTraceCategory cat;
    private Long dur;
    private NetflixTraceEventTypeSample eventType;
    private Object name;
    private TraceEventFormatTypeX ph;
    private Long ts;

    public SampleEvent(SampleEventArgs sampleEventArgs, Long l, NetflixTraceCategory netflixTraceCategory, Object obj, TraceEventFormatTypeX traceEventFormatTypeX, NetflixTraceEventTypeSample netflixTraceEventTypeSample, Long l2) {
        this.args = sampleEventArgs;
        this.dur = l;
        this.cat = netflixTraceCategory;
        this.name = obj;
        this.ph = traceEventFormatTypeX;
        this.eventType = netflixTraceEventTypeSample;
        this.ts = l2;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "args", this.args);
        ExtCLUtils.addObjectToJson(jSONObject, "dur", this.dur);
        ExtCLUtils.addObjectToJson(jSONObject, "cat", this.cat);
        ExtCLUtils.addObjectToJson(jSONObject, "name", this.name);
        ExtCLUtils.addObjectToJson(jSONObject, "ph", this.ph);
        ExtCLUtils.addObjectToJson(jSONObject, Payload.PARAM_RENO_EVENT_TYPE, this.eventType);
        ExtCLUtils.addObjectToJson(jSONObject, "ts", this.ts);
        return jSONObject;
    }
}
