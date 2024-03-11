package com.netflix.cl.model.context;

import com.netflix.cl.model.Tracked;
import com.netflix.cl.model.TrackingInfo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class DataModel extends CLContext implements Tracked {
    private TrackingInfo trackingInfo;

    @Override // com.netflix.cl.model.Tracked
    public TrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    public DataModel(TrackingInfo trackingInfo) {
        addContextType("DataModel");
        this.trackingInfo = trackingInfo;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        addJsonSerializerToJson(jSONObject, "trackingInfo", this.trackingInfo);
        return jSONObject;
    }
}
