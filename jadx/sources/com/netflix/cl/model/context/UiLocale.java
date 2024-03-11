package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UiLocale extends CLContext implements Exclusive {
    private String uiLocale;

    public UiLocale(String str) {
        addContextType("UiLocale");
        this.uiLocale = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "uiLocale", this.uiLocale);
        return jSONObject;
    }
}
