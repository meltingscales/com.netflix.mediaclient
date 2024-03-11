package com.netflix.cl.model.event.discrete;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LastAppCrashed extends DiscreteEvent {
    private String error;

    public LastAppCrashed(String str) {
        addContextType("LastAppCrashed");
        this.error = str;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, UmaAlert.ICON_ERROR, this.error);
        return jSONObject;
    }
}
