package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class DataTracked extends Data implements Tracked {
    private TrackingInfo trackingInfo;

    @Override // com.netflix.cl.model.Tracked
    public TrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    public DataTracked(TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addJsonSerializerToJson(jSONObject, "trackingInfo", this.trackingInfo);
        return jSONObject;
    }
}
