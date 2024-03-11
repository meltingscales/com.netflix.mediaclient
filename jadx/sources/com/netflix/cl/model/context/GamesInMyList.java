package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.TrackingInfo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class GamesInMyList extends DataModel implements Exclusive {
    public GamesInMyList(TrackingInfo trackingInfo) {
        super(trackingInfo);
        addContextType("GamesInMyList");
    }

    @Override // com.netflix.cl.model.context.DataModel, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
