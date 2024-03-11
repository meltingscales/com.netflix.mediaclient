package com.netflix.cl.model.context;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MediaPlayer extends CLContext {
    public MediaPlayer() {
        addContextType("MediaPlayer");
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
