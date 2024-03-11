package com.netflix.cl.model.event.discrete;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Submitted extends DiscreteAction {
    private AppView parentView;
    private AppView view;

    public Submitted(AppView appView, AppView appView2, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(commandValue, trackingInfo);
        addContextType("Submitted");
        this.view = appView;
        this.parentView = appView2;
    }

    @Override // com.netflix.cl.model.event.discrete.DiscreteAction, com.netflix.cl.model.event.discrete.DiscreteEventTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "parentView", this.parentView);
        return jSONObject;
    }
}
