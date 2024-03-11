package com.netflix.cl.model.context;

import com.netflix.cl.model.CohortType;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Cohort extends CLContext {
    private CohortType cohortType;

    public Cohort(CohortType cohortType) {
        addContextType("Cohort");
        this.cohortType = cohortType;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "cohortType", this.cohortType);
        return jSONObject;
    }
}
