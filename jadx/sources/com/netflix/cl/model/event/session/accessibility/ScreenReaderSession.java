package com.netflix.cl.model.event.session.accessibility;

import com.netflix.cl.model.Exclusive;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ScreenReaderSession extends AccessibilityToolSession implements Exclusive {
    public ScreenReaderSession() {
        addContextType("accessibility.ScreenReaderSession");
    }

    @Override // com.netflix.cl.model.event.session.accessibility.AccessibilityToolSession, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
