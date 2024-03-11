package com.netflix.mediaclient.acquisition.screens.verifyCard;

import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment;
import javax.inject.Inject;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VerifyCard3dsEventLogger implements VerifyCardFragment.VerifyCard3dsEventListener {
    public static final int $stable = 8;
    private final SignupLogger signupLogger;

    @Inject
    public VerifyCard3dsEventLogger(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment.VerifyCard3dsEventListener
    public void onVerifyCard3dsStart(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "verifyCard3dsStart");
        jSONObject.put(SignupConstants.Field.URL, str);
        this.signupLogger.logEvent(new DebugEvent(jSONObject));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment.VerifyCard3dsEventListener
    public void onVerifyCard3dsFinish(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "verifyCard3dsFinish");
        jSONObject.put("hasPaRes", !(str == null || str.length() == 0));
        this.signupLogger.logEvent(new DebugEvent(jSONObject));
    }
}
