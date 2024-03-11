package com.netflix.mediaclient.acquisition.services.logging;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.screens.AbstractSignupFragment2;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class SignupFragmentLifecycleLogger extends FragmentManager.FragmentLifecycleCallbacks {
    public static final int $stable = 8;
    private Long presentationSessionId;
    private final SignupLogger signupLogger;

    @Inject
    public SignupFragmentLifecycleLogger(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        AbstractSignupFragment2 abstractSignupFragment2;
        TrackingInfo presentationTrackingInfo;
        C8632dsu.c((Object) fragmentManager, "");
        C8632dsu.c((Object) fragment, "");
        if ((fragment instanceof AbstractSignupFragment2) && (presentationTrackingInfo = (abstractSignupFragment2 = (AbstractSignupFragment2) fragment).getPresentationTrackingInfo()) != null) {
            this.presentationSessionId = this.signupLogger.startSession(new Presentation(abstractSignupFragment2.getAppView(), presentationTrackingInfo));
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        Long l;
        C8632dsu.c((Object) fragmentManager, "");
        C8632dsu.c((Object) fragment, "");
        if ((fragment instanceof AbstractSignupFragment2) && (l = this.presentationSessionId) != null) {
            this.signupLogger.endSession(l.longValue());
        }
    }
}
