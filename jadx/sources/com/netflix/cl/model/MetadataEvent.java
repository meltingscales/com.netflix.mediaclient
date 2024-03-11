package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.pushnotification.Payload;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MetadataEvent extends Data {
    private BaseTraceEventArgs args;
    private NetflixTraceCategory cat;
    private Object eventType;
    private Object name;
    private TraceEventFormatTypeM ph;
    private Long ts;

    public MetadataEvent(BaseTraceEventArgs baseTraceEventArgs, NetflixTraceCategory netflixTraceCategory, Object obj, TraceEventFormatTypeM traceEventFormatTypeM, Object obj2, Long l) {
        this.args = baseTraceEventArgs;
        this.cat = netflixTraceCategory;
        this.name = obj;
        this.ph = traceEventFormatTypeM;
        this.eventType = obj2;
        this.ts = l;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "args", this.args);
        ExtCLUtils.addObjectToJson(jSONObject, "cat", this.cat);
        ExtCLUtils.addObjectToJson(jSONObject, "name", this.name);
        ExtCLUtils.addObjectToJson(jSONObject, "ph", this.ph);
        ExtCLUtils.addObjectToJson(jSONObject, Payload.PARAM_RENO_EVENT_TYPE, this.eventType);
        ExtCLUtils.addObjectToJson(jSONObject, "ts", this.ts);
        return jSONObject;
    }
}
