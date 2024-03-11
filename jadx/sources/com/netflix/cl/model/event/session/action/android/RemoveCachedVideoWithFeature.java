package com.netflix.cl.model.event.session.action.android;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.android.CachedVideoRemovalFeature;
import com.netflix.cl.model.event.session.action.RemoveCachedVideo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class RemoveCachedVideoWithFeature extends RemoveCachedVideo {
    private CachedVideoRemovalFeature feature;

    public RemoveCachedVideoWithFeature(CachedVideoRemovalFeature cachedVideoRemovalFeature, Long l, AppView appView, AppView appView2, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(l, appView, appView2, commandValue, trackingInfo);
        addContextType("android.RemoveCachedVideoWithFeature");
        this.feature = cachedVideoRemovalFeature;
    }

    @Override // com.netflix.cl.model.event.session.action.RemoveCachedVideo, com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "feature", this.feature);
        return jSONObject;
    }
}
