package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.action.SubmitDeviceSurveyResults;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment;
import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.List;
import javax.inject.Inject;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class DeviceSurveyLogger implements DeviceSurveyFragment.DeviceSurveyInteractionListener {
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
    public DeviceSurveyLogger(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment.DeviceSurveyInteractionListener
    public void logSelectedDevices(List<String> list) {
        C8632dsu.c((Object) list, "");
        CLv2Utils.d(new ChangeValueCommand(getDevicesJson(list)));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment.DeviceSurveyInteractionListener
    public void logContinueAction(List<String> list) {
        C8632dsu.c((Object) list, "");
        Long startSession = this.signupLogger.startSession(new Focus(AppView.continueButton, null));
        this.submitId = this.signupLogger.startSession(new SubmitDeviceSurveyResults(null, null, null, (String[]) list.toArray(new String[0]), null));
        if (startSession != null) {
            this.signupLogger.endSession(startSession.longValue());
        }
    }

    public final JSONObject getDevicesJson(List<String> list) {
        C8632dsu.c((Object) list, "");
        JSONObject jSONObject = new JSONObject();
        ExtCLUtils.addStringArrayToJson(jSONObject, "selectedDevices", (String[]) list.toArray(new String[0]));
        return jSONObject;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment.DeviceSurveyInteractionListener
    public void endSessions() {
        Long l = this.submitId;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
        }
    }
}
