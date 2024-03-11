package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TestAllocations extends CLContext implements Exclusive {
    private JSONObject cells;

    public TestAllocations(JSONObject jSONObject) {
        addContextType("TestAllocations");
        this.cells = jSONObject;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addJsonToJson(jSONObject, "cells", this.cells);
        return jSONObject;
    }
}
