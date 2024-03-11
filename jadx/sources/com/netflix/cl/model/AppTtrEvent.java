package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.pushnotification.Payload;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AppTtrEvent extends Data {
    private AppTtrArgs args;
    private NetflixTraceCategory cat;
    private Long dur;
    private NetflixTraceEventTypeTiming eventType;
    private Object name;
    private TraceEventFormatTypeX ph;
    private Long ts;

    public AppTtrEvent(AppTtrArgs appTtrArgs, Long l, NetflixTraceCategory netflixTraceCategory, Object obj, TraceEventFormatTypeX traceEventFormatTypeX, NetflixTraceEventTypeTiming netflixTraceEventTypeTiming, Long l2) {
        this.args = appTtrArgs;
        this.dur = l;
        this.cat = netflixTraceCategory;
        this.name = obj;
        this.ph = traceEventFormatTypeX;
        this.eventType = netflixTraceEventTypeTiming;
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
