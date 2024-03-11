package com.netflix.cl.model.event.session;

import com.netflix.cl.model.ProfileSettings;
import com.netflix.cl.model.event.session.action.AddProfile;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AddProfileEnded extends SessionEnded {
    private ProfileSettings actualSettings;
    private String profileGuid;

    public AddProfileEnded(AddProfile addProfile, String str, ProfileSettings profileSettings) {
        super(addProfile);
        addContextType("AddProfileEnded");
        this.profileGuid = str;
        this.actualSettings = profileSettings;
    }

    @Override // com.netflix.cl.model.event.session.SessionEnded, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "profileGuid", this.profileGuid);
        ExtCLUtils.addObjectToJson(jSONObject, "actualSettings", this.actualSettings);
        return jSONObject;
    }
}
