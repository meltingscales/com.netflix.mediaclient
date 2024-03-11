package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TimeZone extends CLContext implements Exclusive {
    private Long utcOffset;

    public TimeZone(Long l) {
        addContextType("TimeZone");
        this.utcOffset = l;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "utcOffset", this.utcOffset);
        return jSONObject;
    }
}
