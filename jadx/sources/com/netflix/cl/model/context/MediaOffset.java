package com.netflix.cl.model.context;

import com.netflix.cl.model.Exclusive;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MediaOffset extends CLContext implements Exclusive {
    private Long mediaOffset;
    private Long playerId;

    public MediaOffset(Long l, Long l2) {
        addContextType("MediaOffset");
        this.mediaOffset = l;
        this.playerId = l2;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "mediaOffset", this.mediaOffset);
        ExtCLUtils.addObjectToJson(jSONObject, "playerId", this.playerId);
        return jSONObject;
    }
}
