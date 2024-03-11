package com.netflix.cl.model.event.session.accessibility;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ClosedCaptionsRequestedSession extends AccessibilityToolSession {
    public ClosedCaptionsRequestedSession() {
        addContextType("accessibility.ClosedCaptionsRequestedSession");
    }

    @Override // com.netflix.cl.model.event.session.accessibility.AccessibilityToolSession, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
