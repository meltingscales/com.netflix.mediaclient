package com.netflix.cl.model.event.discrete;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MetadataRendered extends DiscreteEvent {
    private Long contextId;

    public MetadataRendered(Long l) {
        addContextType("MetadataRendered");
        this.contextId = l;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "contextId", this.contextId);
        return jSONObject;
    }
}
