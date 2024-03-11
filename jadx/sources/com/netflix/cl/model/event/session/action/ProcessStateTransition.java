package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ProcessStateTransition extends ActionTracked implements Exclusive {
    private Long actualTime;
    private CommandValue command;
    private AppView parentView;
    private AppView view;

    public ProcessStateTransition(Long l, AppView appView, AppView appView2, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("ProcessStateTransition");
        this.actualTime = l;
        this.view = appView;
        this.parentView = appView2;
        this.command = commandValue;
    }

    @Override // com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "actualTime", this.actualTime);
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        return jSONObject;
    }
}
