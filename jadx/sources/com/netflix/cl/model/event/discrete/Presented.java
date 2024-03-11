package com.netflix.cl.model.event.discrete;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Presented extends DiscreteEventTracked {
    private Boolean contentMissing;
    private AppView view;

    public Presented(AppView appView, Boolean bool, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("Presented");
        this.view = appView;
        this.contentMissing = bool;
    }

    @Override // com.netflix.cl.model.event.discrete.DiscreteEventTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "view", this.view);
        ExtCLUtils.addObjectToJson(jSONObject, "contentMissing", this.contentMissing);
        return jSONObject;
    }
}
