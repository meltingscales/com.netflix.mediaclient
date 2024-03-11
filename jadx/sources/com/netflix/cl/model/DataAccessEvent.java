package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.pushnotification.Payload;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DataAccessEvent extends Data {
    private DataAccessEventArgs args;
    private NetflixTraceCategory cat;
    private Long dur;
    private NetflixTraceEventTypeDataAccess eventType;
    private String name;
    private TraceEventFormatTypeX ph;
    private Long ts;

    public DataAccessEvent(DataAccessEventArgs dataAccessEventArgs, Long l, NetflixTraceCategory netflixTraceCategory, String str, TraceEventFormatTypeX traceEventFormatTypeX, NetflixTraceEventTypeDataAccess netflixTraceEventTypeDataAccess, Long l2) {
        this.args = dataAccessEventArgs;
        this.dur = l;
        this.cat = netflixTraceCategory;
        this.name = str;
        this.ph = traceEventFormatTypeX;
        this.eventType = netflixTraceEventTypeDataAccess;
        this.ts = l2;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "args", this.args);
        ExtCLUtils.addObjectToJson(jSONObject, "dur", this.dur);
        ExtCLUtils.addObjectToJson(jSONObject, "cat", this.cat);
        ExtCLUtils.addStringToJson(jSONObject, "name", this.name);
        ExtCLUtils.addObjectToJson(jSONObject, "ph", this.ph);
        ExtCLUtils.addObjectToJson(jSONObject, Payload.PARAM_RENO_EVENT_TYPE, this.eventType);
        ExtCLUtils.addObjectToJson(jSONObject, "ts", this.ts);
        return jSONObject;
    }
}
