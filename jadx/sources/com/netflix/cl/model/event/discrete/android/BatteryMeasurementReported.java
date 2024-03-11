package com.netflix.cl.model.event.discrete.android;

import com.netflix.cl.model.event.discrete.DiscreteEvent;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BatteryMeasurementReported extends DiscreteEvent {
    private Object data;

    public BatteryMeasurementReported(Object obj) {
        addContextType("android.BatteryMeasurementReported");
        this.data = obj;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, NotificationFactory.DATA, this.data);
        return jSONObject;
    }
}
