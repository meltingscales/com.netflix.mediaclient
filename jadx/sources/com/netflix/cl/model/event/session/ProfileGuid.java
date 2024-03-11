package com.netflix.cl.model.event.session;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ProfileGuid extends ProfileIdentity {
    private String profileGuid;

    public ProfileGuid(String str) {
        addContextType("ProfileGuid");
        this.profileGuid = str;
    }

    @Override // com.netflix.cl.model.event.session.ProfileIdentity, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "profileGuid", this.profileGuid);
        return jSONObject;
    }
}
