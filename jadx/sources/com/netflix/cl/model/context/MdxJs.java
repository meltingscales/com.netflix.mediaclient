package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MdxJs extends CLContext implements Exclusive {
    private String jsVersion;

    public MdxJs(String str) {
        addContextType("MdxJs");
        this.jsVersion = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "jsVersion", this.jsVersion);
        return jSONObject;
    }
}
