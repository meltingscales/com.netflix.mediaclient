package com.netflix.cl.model.event.discrete;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ExceptionOccurred extends DiscreteEvent {
    private String error;
    private Boolean userVisible;

    public ExceptionOccurred(Boolean bool, String str) {
        addContextType("ExceptionOccurred");
        this.userVisible = bool;
        this.error = str;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "userVisible", this.userVisible);
        ExtCLUtils.addStringToJson(jSONObject, UmaAlert.ICON_ERROR, this.error);
        return jSONObject;
    }
}
