package com.netflix.cl.model.context;

import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class VoiceInput extends UserInput {
    private String phrase;

    public VoiceInput(String str, Double d) {
        super(d);
        addContextType("VoiceInput");
        this.phrase = str;
    }

    @Override // com.netflix.cl.model.context.UserInput, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "phrase", this.phrase);
        return jSONObject;
    }
}
