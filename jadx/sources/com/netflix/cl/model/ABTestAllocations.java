package com.netflix.cl.model;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ABTestAllocations implements JsonSerializer {
    private ABTest[] tests;

    public ABTestAllocations(ABTest[] aBTestArr) {
        this.tests = aBTestArr;
    }

    @Override // com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        String str;
        JSONObject jSONObject = new JSONObject();
        ABTest[] aBTestArr = this.tests;
        if (aBTestArr != null) {
            for (ABTest aBTest : aBTestArr) {
                if (aBTest != null && (str = aBTest.testId) != null) {
                    jSONObject.put(str, aBTest.cell);
                }
            }
        }
        return jSONObject;
    }
}
