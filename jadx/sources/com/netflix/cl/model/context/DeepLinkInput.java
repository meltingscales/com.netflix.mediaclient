package com.netflix.cl.model.context;

import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeepLinkInput extends UserInput {
    private Boolean qrCodeDetected;
    private String url;

    public DeepLinkInput(Boolean bool, String str, Double d) {
        super(d);
        addContextType("DeepLinkInput");
        this.qrCodeDetected = bool;
        this.url = str;
    }

    @Override // com.netflix.cl.model.context.UserInput, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "qrCodeDetected", this.qrCodeDetected);
        ExtCLUtils.addStringToJson(jSONObject, SignupConstants.Field.URL, this.url);
        return jSONObject;
    }
}
