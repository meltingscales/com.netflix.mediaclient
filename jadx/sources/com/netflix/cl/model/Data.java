package com.netflix.cl.model;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Data implements JsonSerializer {
    @Override // com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return new JSONObject();
    }
}
