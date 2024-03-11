package com.netflix.cl.model.event.discrete;

import com.netflix.cl.model.AppView;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class InputDuration extends DiscreteEvent {
    private Long duration;
    private Boolean pasted;
    private AppView view;

    public InputDuration(Long l, AppView appView, Boolean bool) {
        addContextType("InputDuration");
        this.duration = l;
        this.view = appView;
        this.pasted = bool;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "duration", this.duration);
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "pasted", this.pasted);
        return jSONObject;
    }
}
