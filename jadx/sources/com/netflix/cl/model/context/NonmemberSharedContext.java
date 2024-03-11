package com.netflix.cl.model.context;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NonmemberSharedContext extends CLContext {
    private String sharedUuid;

    public NonmemberSharedContext(String str) {
        addContextType("NonmemberSharedContext");
        this.sharedUuid = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "sharedUuid", this.sharedUuid);
        return jSONObject;
    }
}
