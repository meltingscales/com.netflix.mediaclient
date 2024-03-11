package com.netflix.cl.model.event.session;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class VisitorDeviceId extends AccountIdentity {
    private String nfvdid;

    public VisitorDeviceId(String str) {
        addContextType("VisitorDeviceId");
        this.nfvdid = str;
    }

    @Override // com.netflix.cl.model.event.session.AccountIdentity, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "nfvdid", this.nfvdid);
        return jSONObject;
    }
}
