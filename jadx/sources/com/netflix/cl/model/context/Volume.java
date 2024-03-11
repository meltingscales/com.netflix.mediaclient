package com.netflix.cl.model.context;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Volume extends CLContext {
    private Double level;
    private Boolean muting;

    public Volume(Boolean bool, Double d) {
        addContextType("Volume");
        this.muting = bool;
        this.level = d;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "muting", this.muting);
        ExtCLUtils.addObjectToJson(jSONObject, "level", this.level);
        return jSONObject;
    }
}
