package com.netflix.cl.model.event.discrete.secondscreen;

import com.netflix.cl.model.event.discrete.game.cloud.ControllerGameplayEvent;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SSICError extends ControllerGameplayEvent {
    private String[] breadcrumbs;
    private String code;
    private String errorString;
    private Boolean isFatal;
    private String stackTrace;
    private Boolean userVisible;

    public SSICError(String str, Boolean bool, String str2, Boolean bool2, String str3, String[] strArr, String str4, Long l, String str5, String str6, String str7) {
        super(str4, l, str5, str6, str7);
        addContextType("secondscreen.SSICError");
        this.code = str;
        this.isFatal = bool;
        this.errorString = str2;
        this.userVisible = bool2;
        this.stackTrace = str3;
        this.breadcrumbs = strArr;
    }

    @Override // com.netflix.cl.model.event.discrete.game.cloud.ControllerGameplayEvent, com.netflix.cl.model.event.discrete.game.GameplayEvent, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "code", this.code);
        ExtCLUtils.addObjectToJson(jSONObject, "isFatal", this.isFatal);
        ExtCLUtils.addStringToJson(jSONObject, "errorString", this.errorString);
        ExtCLUtils.addObjectToJson(jSONObject, "userVisible", this.userVisible);
        ExtCLUtils.addStringToJson(jSONObject, SignupConstants.Error.DEBUG_FIELD_STACK_TRACE, this.stackTrace);
        ExtCLUtils.addStringArrayToJson(jSONObject, "breadcrumbs", this.breadcrumbs);
        return jSONObject;
    }
}
