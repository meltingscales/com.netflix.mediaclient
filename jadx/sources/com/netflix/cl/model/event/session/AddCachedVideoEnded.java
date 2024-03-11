package com.netflix.cl.model.event.session;

import com.netflix.cl.model.event.session.action.AddCachedVideo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AddCachedVideoEnded extends SessionEnded {
    private Long oxid;

    public AddCachedVideoEnded(AddCachedVideo addCachedVideo, Long l) {
        super(addCachedVideo);
        addContextType("AddCachedVideoEnded");
        this.oxid = l;
    }

    @Override // com.netflix.cl.model.event.session.SessionEnded, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "oxid", this.oxid);
        return jSONObject;
    }
}
