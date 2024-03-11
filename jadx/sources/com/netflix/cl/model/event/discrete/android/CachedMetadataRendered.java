package com.netflix.cl.model.event.discrete.android;

import com.netflix.cl.model.event.discrete.MetadataRendered;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CachedMetadataRendered extends MetadataRendered {
    public CachedMetadataRendered(Long l) {
        super(l);
        addContextType("android.CachedMetadataRendered");
    }

    @Override // com.netflix.cl.model.event.discrete.MetadataRendered, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
