package com.netflix.mediaclient.acquisition.screens.verifyCardContext;

import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment;
import java.util.Map;
import javax.inject.Inject;
import o.C8632dsu;
import o.dpD;
import o.dqD;
import o.dqE;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VerifyCardContextEventLogger implements VerifyCardContextFragment.EventListener {
    public static final int $stable = 8;
    private final SignupLogger signupLogger;

    public final SignupLogger getSignupLogger() {
        return this.signupLogger;
    }

    @Inject
    public VerifyCardContextEventLogger(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment.EventListener
    public void onContinue(long j, boolean z) {
        Map c;
        SignupLogger signupLogger = this.signupLogger;
        c = dqE.c(dpD.a("name", "verifyCardContextContinue"), dpD.a("timeSinceMountMs", Long.valueOf(j)), dpD.a(SignupConstants.Field.AUTO_SUBMIT, Boolean.valueOf(z)));
        signupLogger.logEvent(new DebugEvent(new JSONObject(c)));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment.EventListener
    public void onAutoSubmit() {
        Map b;
        SignupLogger signupLogger = this.signupLogger;
        b = dqD.b(dpD.a("name", "verifyCardContextAutoSubmit"));
        signupLogger.logEvent(new DebugEvent(new JSONObject(b)));
    }
}
