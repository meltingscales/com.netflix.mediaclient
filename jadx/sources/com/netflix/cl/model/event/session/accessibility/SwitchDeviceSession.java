package com.netflix.cl.model.event.session.accessibility;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SwitchDeviceSession extends AccessibilityToolSession {
    public SwitchDeviceSession() {
        addContextType("accessibility.SwitchDeviceSession");
    }

    @Override // com.netflix.cl.model.event.session.accessibility.AccessibilityToolSession, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
