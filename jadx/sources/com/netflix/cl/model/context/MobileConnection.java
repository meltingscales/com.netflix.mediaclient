package com.netflix.cl.model.context;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MobileConnection extends NetworkConnection {
    public MobileConnection() {
        addContextType("MobileConnection");
    }

    @Override // com.netflix.cl.model.context.NetworkConnection, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
