package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BrowsingExperience extends CLContext implements Exclusive {
    private String experience;
    private Boolean featureAllowed;

    public BrowsingExperience(Boolean bool, String str) {
        addContextType("BrowsingExperience");
        this.featureAllowed = bool;
        this.experience = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "featureAllowed", this.featureAllowed);
        ExtCLUtils.addStringToJson(jSONObject, "experience", this.experience);
        return jSONObject;
    }
}
