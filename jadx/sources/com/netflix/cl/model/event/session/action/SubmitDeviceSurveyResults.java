package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SubmitDeviceSurveyResults extends ActionTracked {
    private CommandValue command;
    private AppView parentView;
    private String[] selectedDevices;
    private AppView view;

    public SubmitDeviceSurveyResults(AppView appView, AppView appView2, CommandValue commandValue, String[] strArr, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("SubmitDeviceSurveyResults");
        this.view = appView;
        this.parentView = appView2;
        this.command = commandValue;
        this.selectedDevices = strArr;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        ExtCLUtils.addStringArrayToJson(jSONObject, "selectedDevices", this.selectedDevices);
        return jSONObject;
    }
}
