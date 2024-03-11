package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SelectPlan extends ActionTracked {
    private CommandValue command;
    private AppView parentView;
    private String planId;
    private AppView view;

    public SelectPlan(AppView appView, AppView appView2, String str, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("SelectPlan");
        this.view = appView;
        this.parentView = appView2;
        this.planId = str;
        this.command = commandValue;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addStringToJson(jSONObject, SignupConstants.Field.PLAN_ID, this.planId);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        return jSONObject;
    }
}
