package com.netflix.cl.model.event.discrete.experimentation;

import com.netflix.cl.model.event.discrete.DiscreteEvent;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FlexEvent extends DiscreteEvent {
    private JSONObject dimensions;
    private String[] featureTags;
    private String flexName;
    private JSONObject metrics;

    public FlexEvent(String str, String[] strArr, JSONObject jSONObject, JSONObject jSONObject2) {
        addContextType("experimentation.FlexEvent");
        this.flexName = str;
        this.featureTags = strArr;
        this.metrics = jSONObject;
        this.dimensions = jSONObject2;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "flexName", this.flexName);
        ExtCLUtils.addStringArrayToJson(jSONObject, "featureTags", this.featureTags);
        ExtCLUtils.addJsonToJson(jSONObject, "metrics", this.metrics);
        ExtCLUtils.addJsonToJson(jSONObject, "dimensions", this.dimensions);
        return jSONObject;
    }
}
