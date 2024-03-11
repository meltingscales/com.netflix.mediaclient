package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Chipset extends CLContext implements Exclusive {
    private String chipset;

    public Chipset(String str) {
        addContextType("Chipset");
        this.chipset = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "chipset", this.chipset);
        return jSONObject;
    }
}
