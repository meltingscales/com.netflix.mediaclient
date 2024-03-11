package com.netflix.mediaclient.acquisition.screens.addProfiles;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.cl.model.ProfileSettings;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.action.UpdateProfiles;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextInteractionListenerFactory;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment;
import java.util.List;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class AddProfilesLogger implements AddProfilesFragment.AddProfilesInteractionListener {
    public static final int $stable = 8;
    private final FormViewEditText.FormViewEditTextInteractionListener profileInputLogger;
    private final SignupLogger signupLogger;
    private Long submitId;

    public final SignupLogger getSignupLogger() {
        return this.signupLogger;
    }

    public final Long getSubmitId() {
        return this.submitId;
    }

    public final void setSubmitId(Long l) {
        this.submitId = l;
    }

    @Inject
    public AddProfilesLogger(FormViewEditTextInteractionListenerFactory formViewEditTextInteractionListenerFactory, SignupLogger signupLogger) {
        C8632dsu.c((Object) formViewEditTextInteractionListenerFactory, "");
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
        this.profileInputLogger = formViewEditTextInteractionListenerFactory.createTextLogger(AppView.profileNameInput, InputKind.profileName);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment.AddProfilesInteractionListener
    public void logProfileFocusChange(boolean z) {
        FormViewEditText.FormViewEditTextInteractionListener formViewEditTextInteractionListener = this.profileInputLogger;
        if (formViewEditTextInteractionListener != null) {
            formViewEditTextInteractionListener.onFocusChange(z);
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment.AddProfilesInteractionListener
    public void logContinueAction(List<? extends ProfileSettings> list) {
        C8632dsu.c((Object) list, "");
        Long startSession = this.signupLogger.startSession(new Focus(AppView.continueButton, null));
        this.submitId = this.signupLogger.startSession(new UpdateProfiles(null, null, (ProfileSettings[]) list.toArray(new ProfileSettings[0]), null, null));
        if (startSession != null) {
            this.signupLogger.endSession(startSession.longValue());
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment.AddProfilesInteractionListener
    public void endSessions() {
        FormViewEditText.FormViewEditTextInteractionListener formViewEditTextInteractionListener = this.profileInputLogger;
        if (formViewEditTextInteractionListener != null) {
            formViewEditTextInteractionListener.onFocusChange(false);
        }
        Long l = this.submitId;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
        }
    }
}
