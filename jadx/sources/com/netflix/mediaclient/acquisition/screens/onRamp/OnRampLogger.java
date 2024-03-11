package com.netflix.mediaclient.acquisition.screens.onRamp;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.action.SubmitOnrampResults;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.List;
import javax.inject.Inject;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class OnRampLogger implements OnRampFragment.OnRampInteractionListener {
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
    public OnRampLogger(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject logSelectTitle$lambda$0(String str) {
        C8632dsu.c((Object) str, "");
        return new JSONObject().put(SignupConstants.Field.VIDEO_ID, str);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment.OnRampInteractionListener
    public void logSelectTitle(final String str, boolean z) {
        C8632dsu.c((Object) str, "");
        Long startSession = this.signupLogger.startSession(new Focus(AppView.boxArt, new TrackingInfo() { // from class: com.netflix.mediaclient.acquisition.screens.onRamp.OnRampLogger$$ExternalSyntheticLambda0
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject logSelectTitle$lambda$0;
                logSelectTitle$lambda$0 = OnRampLogger.logSelectTitle$lambda$0(str);
                return logSelectTitle$lambda$0;
            }
        }));
        Long startSession2 = this.signupLogger.startSession(new SelectCommand());
        this.signupLogger.addInstantCommand(new ChangeValueCommand(new JSONObject().put(VisualStateDefinition.ELEMENT_STATE.SELECTED, z)));
        if (startSession2 != null) {
            this.signupLogger.endSession(startSession2.longValue());
        }
        if (startSession != null) {
            this.signupLogger.endSession(startSession.longValue());
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment.OnRampInteractionListener
    public void endSessions() {
        Long l = this.submitId;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment.OnRampInteractionListener
    public void logContinueAction(List<String> list) {
        String[] strArr;
        if (list == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
            strArr = new String[0];
        }
        this.submitId = this.signupLogger.startSession(new SubmitOnrampResults(null, null, strArr, null, null));
    }
}
