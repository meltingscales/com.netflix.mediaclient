package com.netflix.cl.model.event.session;

import com.netflix.cl.model.event.session.action.ValidateInput;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ValidateInputRejected extends SessionEnded {
    private String error;

    public ValidateInputRejected(ValidateInput validateInput, String str) {
        super(validateInput);
        addContextType("ValidateInputRejected");
        this.error = str;
    }

    @Override // com.netflix.cl.model.event.session.SessionEnded, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, UmaAlert.ICON_ERROR, this.error);
        return jSONObject;
    }
}
