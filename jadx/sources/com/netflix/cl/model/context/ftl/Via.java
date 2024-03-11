package com.netflix.cl.model.context.ftl;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Via extends CLContext implements Exclusive {
    private String via;

    public Via(String str) {
        addContextType("ftl.Via");
        this.via = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "via", this.via);
        return jSONObject;
    }
}
