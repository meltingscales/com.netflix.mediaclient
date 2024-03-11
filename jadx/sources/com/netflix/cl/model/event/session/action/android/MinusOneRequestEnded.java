package com.netflix.cl.model.event.session.action.android;

import com.netflix.cl.model.Tracked;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.SessionEnded;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MinusOneRequestEnded extends SessionEnded implements Tracked {
    private JSONObject cardToPresent;
    private TrackingInfo trackingInfo;

    @Override // com.netflix.cl.model.Tracked
    public TrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    public MinusOneRequestEnded(MinusOneRequest minusOneRequest, TrackingInfo trackingInfo, JSONObject jSONObject) {
        super(minusOneRequest);
        addContextType("android.MinusOneRequestEnded");
        this.trackingInfo = trackingInfo;
        this.cardToPresent = jSONObject;
    }

    @Override // com.netflix.cl.model.event.session.SessionEnded, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        try {
            addJsonSerializerToJson(jSONObject, "trackingInfo", this.trackingInfo);
            jSONObject.putOpt("cardToPresent", this.cardToPresent);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
