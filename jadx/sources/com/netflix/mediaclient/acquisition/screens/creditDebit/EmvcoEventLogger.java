package com.netflix.mediaclient.acquisition.screens.creditDebit;

import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import javax.inject.Inject;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class EmvcoEventLogger {
    public static final int $stable = 8;
    private final SignupLogger signupLogger;

    @Inject
    public EmvcoEventLogger(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    public final void onReceiveJwt(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "emvco3dsDeviceDataCollectionSuccess");
        this.signupLogger.logEvent(new DebugEvent(jSONObject));
    }

    public final void onReceiveFallbackData(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "emvco3dsDeviceDataCollectionFailure");
        this.signupLogger.logEvent(new DebugEvent(jSONObject));
    }
}
