package com.netflix.cl.model.event.discrete;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class VolumeChanged extends DiscreteEvent {
    public VolumeChanged() {
        addContextType("VolumeChanged");
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
