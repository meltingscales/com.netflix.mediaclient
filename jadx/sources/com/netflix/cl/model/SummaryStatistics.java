package com.netflix.cl.model;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SummaryStatistics extends Data {
    private Long count;
    private Double max;
    private Double min;
    private Long sos;
    private Double sum;

    public Double getMax() {
        return this.max;
    }

    public SummaryStatistics(Double d, Double d2, Long l, Long l2, Double d3) {
        this.min = d;
        this.max = d2;
        this.sos = l;
        this.count = l2;
        this.sum = d3;
    }

    @Override // com.netflix.cl.model.Data, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "min", this.min);
        ExtCLUtils.addObjectToJson(jSONObject, "max", this.max);
        ExtCLUtils.addObjectToJson(jSONObject, "sos", this.sos);
        ExtCLUtils.addObjectToJson(jSONObject, "count", this.count);
        ExtCLUtils.addObjectToJson(jSONObject, "sum", this.sum);
        return jSONObject;
    }
}
