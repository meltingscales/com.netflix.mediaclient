package com.netflix.cl.model.envelope;

import org.json.JSONArray;

/* loaded from: classes2.dex */
public class ComplexOperation implements Operation {
    private SimpleOperation[] simpleOperations;

    public JSONArray toJsonArray() {
        JSONArray jSONArray = new JSONArray();
        for (SimpleOperation simpleOperation : this.simpleOperations) {
            simpleOperation.addItself(jSONArray);
        }
        return jSONArray;
    }
}
