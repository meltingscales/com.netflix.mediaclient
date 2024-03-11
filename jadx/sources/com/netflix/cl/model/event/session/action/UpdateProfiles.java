package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.ProfileSettings;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UpdateProfiles extends ActionTracked {
    private CommandValue command;
    private ProfileSettings[] desiredSettings;
    private AppView parentView;
    private AppView view;

    public UpdateProfiles(AppView appView, AppView appView2, ProfileSettings[] profileSettingsArr, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("UpdateProfiles");
        this.view = appView;
        this.parentView = appView2;
        this.desiredSettings = profileSettingsArr;
        this.command = commandValue;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addObjectToJson(jSONObject, "desiredSettings", this.desiredSettings);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        return jSONObject;
    }
}
