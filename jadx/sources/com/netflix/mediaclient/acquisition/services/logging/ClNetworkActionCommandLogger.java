package com.netflix.mediaclient.acquisition.services.logging;

import com.netflix.cl.model.Error;
import com.netflix.cl.model.event.session.action.Action;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.util.log.RootCause;
import o.C8169dfM;
import o.C8627dsp;
import o.C8632dsu;
import o.drO;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ClNetworkActionCommandLogger implements NetworkRequestResponseListener {
    public static final int $stable = 8;
    private final drO<Action> createAction;
    private final drO<Command> createCommand;
    private Long openActionId;
    private final SignupLogger signupLogger;

    public final drO<Action> getCreateAction() {
        return this.createAction;
    }

    public final drO<Command> getCreateCommand() {
        return this.createCommand;
    }

    public final SignupLogger getSignupLogger() {
        return this.signupLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClNetworkActionCommandLogger(SignupLogger signupLogger, drO<? extends Action> dro, drO<? extends Command> dro2) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
        this.createAction = dro;
        this.createCommand = dro2;
    }

    public /* synthetic */ ClNetworkActionCommandLogger(SignupLogger signupLogger, drO dro, drO dro2, int i, C8627dsp c8627dsp) {
        this(signupLogger, (i & 2) != 0 ? null : dro, (i & 4) != 0 ? null : dro2);
    }

    @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
    public void onBeforeNetworkAction(Request request) {
        Command invoke;
        Action invoke2;
        C8632dsu.c((Object) request, "");
        drO<Action> dro = this.createAction;
        this.openActionId = (dro == null || (invoke2 = dro.invoke()) == null) ? null : this.signupLogger.startSession(invoke2);
        drO<Command> dro2 = this.createCommand;
        if (dro2 == null || (invoke = dro2.invoke()) == null) {
            return;
        }
        this.signupLogger.addInstantCommand(invoke);
    }

    @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
    public void onAfterNetworkAction(Response response) {
        C8632dsu.c((Object) response, "");
        Long l = this.openActionId;
        if (l != null) {
            long longValue = l.longValue();
            if (response.isValidState()) {
                this.signupLogger.endSession(longValue);
                return;
            }
            Error c = C8169dfM.c(response.getStatus());
            if (c == null) {
                c = toSuccessfulNetworkCallError(response);
            }
            this.signupLogger.failedAction(longValue, c);
        }
    }

    private final Error toSuccessfulNetworkCallError(Response response) {
        return new Error(RootCause.unknownFailure.toString(), null, new JSONObject().put(SignupConstants.Error.DEBUG_FIELD_KEY, response.getStatus().c()).put("message", response.getResErrorKey()));
    }
}
