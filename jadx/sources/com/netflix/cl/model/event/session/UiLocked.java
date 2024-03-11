package com.netflix.cl.model.event.session;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UiLocked extends Session {
    public UiLocked() {
        addContextType("UiLocked");
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
