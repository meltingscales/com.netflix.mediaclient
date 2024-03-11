package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NrdSessionId extends CLContext implements Exclusive {
    private String id;

    public NrdSessionId(long j) {
        addContextType("tvui.NrdSessionId");
        this.id = Long.toString(j);
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        addStringToJson(jSONObject, "nrdSessionId", this.id);
        return jSONObject;
    }
}
