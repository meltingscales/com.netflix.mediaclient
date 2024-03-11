package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SignInWithGoogleSmartLock extends SignIn {
    private String smartLockVersion;

    public SignInWithGoogleSmartLock(String str, AppView appView, AppView appView2, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(appView, appView2, commandValue, trackingInfo);
        addContextType("SignInWithGoogleSmartLock");
        this.smartLockVersion = str;
    }

    @Override // com.netflix.cl.model.event.session.action.SignIn, com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "smartLockVersion", this.smartLockVersion);
        return jSONObject;
    }
}
