package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.ProfileSettings;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class EditProfile extends ActionTracked {
    private CommandValue command;
    private ProfileSettings desiredSettings;
    private AppView parentView;
    private String profileGuid;
    private AppView view;

    public EditProfile(AppView appView, String str, AppView appView2, ProfileSettings profileSettings, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("EditProfile");
        this.view = appView;
        this.profileGuid = str;
        this.parentView = appView2;
        this.desiredSettings = profileSettings;
        this.command = commandValue;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addStringToJson(jSONObject, "profileGuid", this.profileGuid);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addObjectToJson(jSONObject, "desiredSettings", this.desiredSettings);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        return jSONObject;
    }
}
