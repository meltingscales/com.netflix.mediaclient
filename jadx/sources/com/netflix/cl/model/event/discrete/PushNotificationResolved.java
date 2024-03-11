package com.netflix.cl.model.event.discrete;

import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushNotificationResolved extends DiscreteEventTracked {
    private Long resolvedTime;

    public PushNotificationResolved(Long l, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("PushNotificationResolved");
        this.resolvedTime = l;
    }

    @Override // com.netflix.cl.model.event.discrete.DiscreteEventTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "resolvedTime", this.resolvedTime);
        return jSONObject;
    }
}
