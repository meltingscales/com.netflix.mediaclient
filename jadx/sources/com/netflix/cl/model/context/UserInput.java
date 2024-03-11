package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class UserInput extends CLContext implements Exclusive {
    private Double confidence;

    public UserInput(Double d) {
        addContextType("UserInput");
        this.confidence = d;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "confidence", this.confidence);
        return jSONObject;
    }
}
