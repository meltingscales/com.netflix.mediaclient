package com.netflix.cl.model.event.session.action;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SignInWithAutoLoginToken extends SignIn {
    public SignInWithAutoLoginToken(AppView appView, AppView appView2, CommandValue commandValue, TrackingInfo trackingInfo) {
        super(appView, appView2, commandValue, trackingInfo);
        addContextType("SignInWithAutoLoginToken");
    }

    @Override // com.netflix.cl.model.event.session.action.SignIn, com.netflix.cl.model.event.session.action.ActionTracked, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
