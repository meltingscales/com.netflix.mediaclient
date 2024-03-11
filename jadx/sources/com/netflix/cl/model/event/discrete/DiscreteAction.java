package com.netflix.cl.model.event.discrete;

import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class DiscreteAction extends DiscreteEventTracked {
    private CommandValue command;

    public DiscreteAction(CommandValue commandValue, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("DiscreteAction");
        this.command = commandValue;
    }

    @Override // com.netflix.cl.model.event.discrete.DiscreteEventTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "command", this.command);
        return jSONObject;
    }
}