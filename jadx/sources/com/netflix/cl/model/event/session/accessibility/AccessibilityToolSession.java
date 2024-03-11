package com.netflix.cl.model.event.session.accessibility;

import com.netflix.cl.model.event.session.Session;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AccessibilityToolSession extends Session {
    public AccessibilityToolSession() {
        addContextType("accessibility.AccessibilityToolSession");
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
