package com.netflix.mediaclient.acquisition.lib.services.logging;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.event.discrete.DiscreteEvent;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.SessionEnded;
import com.netflix.cl.model.event.session.ValidateInputRejected;
import com.netflix.cl.model.event.session.action.ValidateInput;
import com.netflix.cl.model.event.session.command.Command;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class SignupLogger {
    private final ExtLogger extlogger;
    private final Logger logger;

    @Inject
    public SignupLogger(Logger logger, ExtLogger extLogger) {
        C8632dsu.c((Object) logger, "");
        C8632dsu.c((Object) extLogger, "");
        this.logger = logger;
        this.extlogger = extLogger;
    }

    public final boolean addInstantCommand(Command command) {
        C8632dsu.c((Object) command, "");
        Long startSession = startSession(command);
        if (startSession != null) {
            startSession.longValue();
            return endSession(startSession.longValue());
        }
        return false;
    }

    public final void reportFocusAndCommandSession(Focus focus, Command command) {
        C8632dsu.c((Object) focus, "");
        C8632dsu.c((Object) command, "");
        Long startSession = this.logger.startSession(focus);
        Long startSession2 = this.logger.startSession(command);
        if (startSession2 != null) {
            this.logger.endSession(Long.valueOf(startSession2.longValue()));
        }
        if (startSession != null) {
            this.logger.endSession(Long.valueOf(startSession.longValue()));
        }
    }

    public final void logEvent(DiscreteEvent discreteEvent) {
        C8632dsu.c((Object) discreteEvent, "");
        this.logger.logEvent(discreteEvent);
    }

    public final Long startSession(Session session) {
        C8632dsu.c((Object) session, "");
        return this.logger.startSession(session);
    }

    public final boolean cancelSession(long j) {
        return this.logger.cancelSession(Long.valueOf(j));
    }

    public final boolean endSession(long j) {
        return this.logger.endSession(Long.valueOf(j));
    }

    public final boolean endSession(SessionEnded sessionEnded) {
        C8632dsu.c((Object) sessionEnded, "");
        return this.logger.endSession(sessionEnded);
    }

    public final boolean failedAction(long j, Error error) {
        C8632dsu.c((Object) error, "");
        return this.extlogger.failedAction(Long.valueOf(j), error.toJSONObject().toString());
    }

    public final void logError(Error error) {
        C8632dsu.c((Object) error, "");
        this.extlogger.logError(error);
    }

    public final void logError(String str, Throwable th) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) th, "");
        this.extlogger.logError(str, th);
    }

    public final ValidateInputRejected createValidateInputRejected(Long l) {
        Session session = Logger.INSTANCE.getSession(l);
        if (session instanceof ValidateInput) {
            return new ValidateInputRejected((ValidateInput) session, null);
        }
        return null;
    }
}
