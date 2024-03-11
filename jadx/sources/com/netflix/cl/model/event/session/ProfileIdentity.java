package com.netflix.cl.model.event.session;

import com.netflix.cl.model.Exclusive;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ProfileIdentity extends Session implements Exclusive {
    public ProfileIdentity() {
        addContextType("ProfileIdentity");
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
