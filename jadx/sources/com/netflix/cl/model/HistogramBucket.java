package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class HistogramBucket extends Data {
    private Double lower;
    private Double upper;
    private Double value;

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "lower", this.lower);
        ExtCLUtils.addObjectToJson(jSONObject, "upper", this.upper);
        ExtCLUtils.addObjectToJson(jSONObject, "value", this.value);
        return jSONObject;
    }
}
