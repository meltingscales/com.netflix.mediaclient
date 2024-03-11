package com.netflix.cl.model.context;

import com.netflix.cl.model.Tracked;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Xid extends CLContext implements Tracked {
    private Long playerId;
    private TrackingInfo trackingInfo;
    private String xid;

    @Override // com.netflix.cl.model.Tracked
    public TrackingInfo trackingInfo() {
        return this.trackingInfo;
    }

    public Xid(String str, Long l, TrackingInfo trackingInfo) {
        addContextType("Xid");
        this.xid = str;
        this.playerId = l;
        this.trackingInfo = trackingInfo;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "xid", this.xid);
        ExtCLUtils.addObjectToJson(jSONObject, "playerId", this.playerId);
        addJsonSerializerToJson(jSONObject, "trackingInfo", this.trackingInfo);
        return jSONObject;
    }
}
