package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.RdidAccessState;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AppDevicePermissions extends CLContext implements Exclusive {
    private RdidAccessState rdidAccess;

    public AppDevicePermissions(RdidAccessState rdidAccessState) {
        addContextType("AppDevicePermissions");
        this.rdidAccess = rdidAccessState;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "rdidAccess", this.rdidAccess);
        return jSONObject;
    }
}
