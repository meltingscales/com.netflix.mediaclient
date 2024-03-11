package com.netflix.cl.model.event.session.ftl;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfigChangedSession extends Session {
    public ConfigChangedSession(Long l, String[] strArr) {
        super(l, strArr);
        addContextType("ftl.ConfigChangedSession");
    }

    @Override // com.netflix.cl.model.event.session.ftl.Session, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
