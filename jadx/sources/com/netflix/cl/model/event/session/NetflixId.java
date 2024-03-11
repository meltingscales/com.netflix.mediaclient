package com.netflix.cl.model.event.session;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NetflixId extends ProfileIdentity {
    private String netflixId;

    public NetflixId(String str) {
        addContextType("NetflixId");
        this.netflixId = str;
    }

    @Override // com.netflix.cl.model.event.session.ProfileIdentity, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "netflixId", this.netflixId);
        return jSONObject;
    }
}
