package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.Tracked;
import com.netflix.cl.model.TrackingInfo;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ActionTracked extends Action implements Tracked {
    private TrackingInfo trackingInfo;

    @Override // com.netflix.cl.model.Tracked
    public TrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    public ActionTracked(TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        addJsonSerializerToJson(jSONObject, "trackingInfo", this.trackingInfo);
        return jSONObject;
    }
}
