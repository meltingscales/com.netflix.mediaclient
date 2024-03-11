package com.netflix.mediaclient.acquisition.components.regenold;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.command.SignUpCommand;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class RegenoldLogger implements RegenoldFragment.RegenoldInteractionListener {
    public static final int $stable = 8;
    private Long regenoldSession;
    private final SignupLogger signupLogger;

    public final Long getRegenoldSession() {
        return this.regenoldSession;
    }

    public final SignupLogger getSignupLogger() {
        return this.signupLogger;
    }

    public final void setRegenoldSession(Long l) {
        this.regenoldSession = l;
    }

    @Inject
    public RegenoldLogger(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    @Override // com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment.RegenoldInteractionListener
    public void logRegenoldTrayOpened() {
        Long l = this.regenoldSession;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
        }
        this.regenoldSession = this.signupLogger.startSession(new Presentation(AppView.registrationOrLogin, null));
    }

    @Override // com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment.RegenoldInteractionListener
    public void logRegenoldTrayClosed() {
        Long l = this.regenoldSession;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
        }
    }

    @Override // com.netflix.mediaclient.acquisition.components.regenold.RegenoldFragment.RegenoldInteractionListener
    public void logRegenoldTrayCtaClicked() {
        this.signupLogger.addInstantCommand(new SignUpCommand());
    }
}
