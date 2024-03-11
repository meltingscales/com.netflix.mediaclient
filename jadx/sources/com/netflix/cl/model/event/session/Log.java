package com.netflix.cl.model.event.session;

import com.netflix.cl.Platform;
import com.netflix.cl.model.Exclusive;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Log extends Session implements Exclusive {
    public Log() {
        addContextType("Log");
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        jSONObject.put(NetflixActivity.EXTRA_SOURCE, Platform.getLoggingSource().name());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("schema", jSONObject2);
        jSONObject2.put("name", Platform.getLoggingSchema().name());
        jSONObject2.put("version", Platform.getPlatform().getSchemaVersion());
        return jSONObject;
    }
}
