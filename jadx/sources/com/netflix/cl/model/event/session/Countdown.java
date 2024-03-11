package com.netflix.cl.model.event.session;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Countdown extends Session {
    private Long maxDuration;

    public Countdown(Long l) {
        addContextType("Countdown");
        this.maxDuration = l;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "maxDuration", this.maxDuration);
        return jSONObject;
    }
}
