package com.netflix.mediaclient.acquisition.screens.passwordOnly;

import com.netflix.cl.model.event.session.command.SignInCommand;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class PasswordOnlyLogger implements PasswordOnlyFragment.PasswordOnlyInteractionListener {
    public static final int $stable = 8;
    private final SignupLogger signupLogger;

    public final SignupLogger getSignupLogger() {
        return this.signupLogger;
    }

    @Inject
    public PasswordOnlyLogger(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment.PasswordOnlyInteractionListener
    public void logCtaClicked() {
        this.signupLogger.addInstantCommand(new SignInCommand());
    }
}
