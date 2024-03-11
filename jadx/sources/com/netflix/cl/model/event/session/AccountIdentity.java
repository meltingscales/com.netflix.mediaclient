package com.netflix.cl.model.event.session;

import com.netflix.cl.model.Exclusive;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AccountIdentity extends Session implements Exclusive {
    public AccountIdentity() {
        addContextType("AccountIdentity");
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
