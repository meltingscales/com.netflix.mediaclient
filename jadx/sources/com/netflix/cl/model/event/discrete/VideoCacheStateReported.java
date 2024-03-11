package com.netflix.cl.model.event.discrete;

import com.netflix.cl.model.CachedVideoInfo;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class VideoCacheStateReported extends DiscreteEvent {
    private CachedVideoInfo[] videos;

    public VideoCacheStateReported(CachedVideoInfo[] cachedVideoInfoArr) {
        addContextType("VideoCacheStateReported");
        this.videos = cachedVideoInfoArr;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, SignupConstants.Field.VIDEOS, this.videos);
        return jSONObject;
    }
}
