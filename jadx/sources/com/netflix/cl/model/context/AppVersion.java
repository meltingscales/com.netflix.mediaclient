package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppVersion extends CLContext implements Exclusive {
    private String appVersion;

    public AppVersion(String str) {
        addContextType("AppVersion");
        this.appVersion = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "appVersion", this.appVersion);
        return jSONObject;
    }
}
