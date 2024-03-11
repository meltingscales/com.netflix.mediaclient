package com.netflix.cl.model.event.discrete;

import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushNotificationReceived extends DiscreteEventTracked {
    private Long duration;
    private Long receivedTime;

    public PushNotificationReceived(Long l, Long l2, TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("PushNotificationReceived");
        this.duration = l;
        this.receivedTime = l2;
    }

    @Override // com.netflix.cl.model.event.discrete.DiscreteEventTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "duration", this.duration);
        ExtCLUtils.addObjectToJson(jSONObject, "receivedTime", this.receivedTime);
        return jSONObject;
    }
}
