package com.netflix.cl.model.event.session;

import com.netflix.cl.model.ShareInfo;
import com.netflix.cl.model.event.session.action.Share;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ShareEnded extends SessionEnded {
    private ShareInfo[] shares;

    public ShareEnded(Share share, ShareInfo[] shareInfoArr) {
        super(share);
        addContextType("ShareEnded");
        this.shares = shareInfoArr;
    }

    @Override // com.netflix.cl.model.event.session.SessionEnded, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "shares", this.shares);
        return jSONObject;
    }
}
