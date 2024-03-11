package com.netflix.cl.model.context;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UserAgent extends CLContext {
    private String userAgent;

    public UserAgent(String str) {
        addContextType("UserAgent");
        this.userAgent = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "userAgent", this.userAgent);
        return jSONObject;
    }
}
