package com.netflix.cl.model.event.session.iko;

import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.SessionTracked;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class VideoSegment extends SessionTracked {
    public VideoSegment(TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("iko.VideoSegment");
    }

    @Override // com.netflix.cl.model.event.session.SessionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
