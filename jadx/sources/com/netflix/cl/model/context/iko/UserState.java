package com.netflix.cl.model.context.iko;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UserState extends CLContext implements Exclusive {
    private JSONObject state;

    public UserState(JSONObject jSONObject) {
        addContextType("iko.UserState");
        this.state = jSONObject;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addJsonToJson(jSONObject, "state", this.state);
        return jSONObject;
    }
}
