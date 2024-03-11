package com.netflix.cl.model.context.ftl;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Target extends CLContext implements Exclusive {
    private String hostname;
    private String target;

    public Target(String str, String str2) {
        addContextType("ftl.Target");
        this.hostname = str;
        this.target = str2;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "hostname", this.hostname);
        ExtCLUtils.addStringToJson(jSONObject, "target", this.target);
        return jSONObject;
    }
}
