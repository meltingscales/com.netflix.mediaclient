package com.netflix.cl.model.envelope;

import org.json.JSONArray;

/* loaded from: classes.dex */
public final class AddedMultipleContexs implements SimpleOperation {
    private int numberOfAddedContexts;

    public AddedMultipleContexs(int i) {
        this.numberOfAddedContexts = i;
    }

    @Override // com.netflix.cl.model.envelope.SimpleOperation
    public JSONArray addItself(JSONArray jSONArray) {
        jSONArray.put(this.numberOfAddedContexts);
        return jSONArray;
    }
}
