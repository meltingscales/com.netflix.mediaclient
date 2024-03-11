package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class OsVersion extends CLContext implements Exclusive {
    private String osVersion;

    public OsVersion(String str) {
        addContextType("OsVersion");
        this.osVersion = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "osVersion", this.osVersion);
        return jSONObject;
    }
}
