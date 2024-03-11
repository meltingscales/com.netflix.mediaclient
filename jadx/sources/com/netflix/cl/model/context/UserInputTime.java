package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UserInputTime extends CLContext implements Exclusive {
    private Long inputTime;

    public UserInputTime(Long l) {
        addContextType("UserInputTime");
        this.inputTime = l;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "inputTime", this.inputTime);
        return jSONObject;
    }
}
