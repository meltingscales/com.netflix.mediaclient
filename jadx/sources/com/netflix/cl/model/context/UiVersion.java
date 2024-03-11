package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UiVersion extends CLContext implements Exclusive {
    private String uiVersion;

    public UiVersion(String str) {
        addContextType("UiVersion");
        this.uiVersion = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "uiVersion", this.uiVersion);
        return jSONObject;
    }
}
