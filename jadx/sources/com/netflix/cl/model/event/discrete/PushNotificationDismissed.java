package com.netflix.cl.model.event.discrete;

import com.netflix.cl.model.TrackingInfo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushNotificationDismissed extends PushNotificationAcknowledged {
    public PushNotificationDismissed(Long l, TrackingInfo trackingInfo) {
        super(l, trackingInfo);
        addContextType("PushNotificationDismissed");
    }

    @Override // com.netflix.cl.model.event.discrete.PushNotificationAcknowledged, com.netflix.cl.model.event.discrete.PushNotificationResolved, com.netflix.cl.model.event.discrete.DiscreteEventTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
