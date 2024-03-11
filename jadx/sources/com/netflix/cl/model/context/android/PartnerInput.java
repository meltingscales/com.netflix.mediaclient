package com.netflix.cl.model.context.android;

import com.netflix.cl.model.android.PartnerInputSource;
import com.netflix.cl.model.context.UserInput;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PartnerInput extends UserInput {
    private String channelId;
    private PartnerInputSource source;

    public PartnerInput(PartnerInputSource partnerInputSource, String str, Double d) {
        super(d);
        addContextType("android.PartnerInput");
        this.source = partnerInputSource;
        this.channelId = str;
    }

    @Override // com.netflix.cl.model.context.UserInput, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, NetflixActivity.EXTRA_SOURCE, this.source);
        ExtCLUtils.addStringToJson(jSONObject, "channelId", this.channelId);
        return jSONObject;
    }
}
