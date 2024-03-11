package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.pushnotification.Payload;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NetworkCallEvent extends Data {
    private Long dur;
    private String requestId;
    private Long ts;

    public NetworkCallEvent(Long l, String str, Long l2) {
        this.dur = l;
        this.requestId = str;
        this.ts = l2;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "dur", this.dur);
        ExtCLUtils.addStringToJson(jSONObject, Payload.PARAM_RENO_REQUEST_ID, this.requestId);
        ExtCLUtils.addObjectToJson(jSONObject, "ts", this.ts);
        return jSONObject;
    }
}
