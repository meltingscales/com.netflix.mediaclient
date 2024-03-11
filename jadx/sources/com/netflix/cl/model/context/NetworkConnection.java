package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class NetworkConnection extends CLContext implements Exclusive {
    public NetworkConnection() {
        addContextType("NetworkConnection");
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
