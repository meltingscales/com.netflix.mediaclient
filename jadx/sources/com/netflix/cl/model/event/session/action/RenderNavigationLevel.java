package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppStartType;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RenderNavigationLevel extends ActionTracked implements Exclusive {
    private Long actualTime;
    private AppStartType appStartType;
    private CommandValue command;
    private AppView parentView;
    private Boolean switchedProfile;
    private AppView view;

    public RenderNavigationLevel(Long l, AppView appView, AppView appView2, AppStartType appStartType, CommandValue commandValue, Boolean bool, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("RenderNavigationLevel");
        this.actualTime = l;
        this.view = appView;
        this.parentView = appView2;
        this.appStartType = appStartType;
        this.command = commandValue;
        this.switchedProfile = bool;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "actualTime", this.actualTime);
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addObjectToJson(jSONObject, "appStartType", this.appStartType);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        ExtCLUtils.addObjectToJson(jSONObject, "switchedProfile", this.switchedProfile);
        return jSONObject;
    }
}
