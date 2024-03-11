package com.netflix.mediaclient.acquisition.screens.upi;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Submitted;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment;
import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.Map;
import javax.inject.Inject;
import o.C8632dsu;
import o.dpD;
import o.dqD;

/* loaded from: classes3.dex */
public final class UpiWaitingLogger implements UpiWaitingFragment.InteractionListener {
    public static final int $stable = 8;
    private final SignupLogger signupLogger;

    public final SignupLogger getSignupLogger() {
        return this.signupLogger;
    }

    @Inject
    public UpiWaitingLogger(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment.InteractionListener
    public void logContinueShown() {
        Map b;
        SignupLogger signupLogger = this.signupLogger;
        AppView appView = AppView.upiWaiting;
        CommandValue commandValue = CommandValue.SubmitCommand;
        b = dqD.b(dpD.a("displayStep", "continue"));
        signupLogger.logEvent(new Submitted(appView, null, commandValue, CLv2Utils.a(b)));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment.InteractionListener
    public void logContinueClicked() {
        Map b;
        SignupLogger signupLogger = this.signupLogger;
        AppView appView = AppView.upiWaiting;
        CommandValue commandValue = CommandValue.SubmitCommand;
        b = dqD.b(dpD.a("displayStep", "spinner"));
        signupLogger.logEvent(new Submitted(appView, null, commandValue, CLv2Utils.a(b)));
    }
}
