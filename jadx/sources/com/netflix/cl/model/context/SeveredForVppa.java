package com.netflix.cl.model.context;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SeveredForVppa extends Severed {
    public SeveredForVppa() {
        addContextType("SeveredForVppa");
    }

    @Override // com.netflix.cl.model.context.Severed, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
