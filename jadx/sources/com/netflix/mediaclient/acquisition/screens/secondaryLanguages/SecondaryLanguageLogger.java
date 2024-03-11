package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.action.SubmitSecondaryLanguagesResults;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import o.C8632dsu;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class SecondaryLanguageLogger implements SecondaryLanguageFragment.SecondaryLanguageInteractionListener {
    public static final int $stable = 8;
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
    public SecondaryLanguageLogger(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment.SecondaryLanguageInteractionListener
    public void logNextAction(final List<String> list) {
        Long startSession = this.signupLogger.startSession(new Focus(AppView.continueButton, null));
        this.submitId = this.signupLogger.startSession(new SubmitSecondaryLanguagesResults(AppView.secondaryLanguagesSelector, null, CommandValue.SubmitCommand, new TrackingInfo() { // from class: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageLogger$$ExternalSyntheticLambda0
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject logNextAction$lambda$0;
                logNextAction$lambda$0 = SecondaryLanguageLogger.logNextAction$lambda$0(list);
                return logNextAction$lambda$0;
            }
        }));
        if (startSession != null) {
            this.signupLogger.endSession(startSession.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject logNextAction$lambda$0(List list) {
        return new JSONObject().put("results", new JSONArray((Collection) list));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment.SecondaryLanguageInteractionListener
    public void endSessions() {
        Long l = this.submitId;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
        }
    }
}
