package com.netflix.mediaclient.acquisition.services.logging;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes6.dex */
public final class PresentationListener {
    public static final int $stable = 8;
    private Long presentationSessionId;
    private final SignupLogger signupLogger;

    @Inject
    public PresentationListener(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    public final void onStartPresentation(TrackingInfo trackingInfo, AppView appView) {
        C8632dsu.c((Object) appView, "");
        this.presentationSessionId = this.signupLogger.startSession(new Presentation(appView, trackingInfo));
    }

    public final void onEndPresentation() {
        Long l = this.presentationSessionId;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
        }
    }
}
