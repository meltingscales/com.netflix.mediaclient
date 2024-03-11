package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DeepLinkSharedContext extends CLContext implements Exclusive {
    private String sharedUuid;

    public DeepLinkSharedContext(String str) {
        addContextType("DeepLinkSharedContext");
        this.sharedUuid = str;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "sharedUuid", this.sharedUuid);
        return jSONObject;
    }
}
