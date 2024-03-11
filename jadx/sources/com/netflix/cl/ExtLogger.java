package com.netflix.cl;

import com.netflix.cl.model.Error;
import com.netflix.cl.model.context.SeveredForVppa;
import com.netflix.cl.model.event.discrete.ExceptionOccurred;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.SessionCanceled;
import com.netflix.cl.model.event.session.SessionEnded;
import com.netflix.cl.model.event.session.action.Action;
import com.netflix.cl.model.event.session.action.ActionFailed;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONException;

/* loaded from: classes.dex */
public enum ExtLogger {
    INSTANCE;

    public void reinitForVppa() {
        synchronized (this) {
            Platform.getLocalLogger().debug("reinitForVppa starts...");
            Platform.getLocalLogger().debug("vpaReset...");
            Logger logger = Logger.INSTANCE;
            long addContext = logger.addContext(new SeveredForVppa());
            logger.resetState();
            logger.removeContext(Long.valueOf(addContext));
            logger.flush();
            Platform.resetSequence();
            logger.init();
            Platform.reInit();
        }
    }

    private Action getExclusiveActionSession(String str) {
        if (str == null) {
            return null;
        }
        Session exclusiveSession = Logger.INSTANCE.getExclusiveSession(str);
        if (exclusiveSession == null) {
            Platform.getLocalLogger().error("Action %s not found!", str);
            return null;
        } else if (exclusiveSession instanceof Action) {
            return (Action) exclusiveSession;
        } else {
            Platform.getLocalLogger().error("%s is not action session instance, but %s", str, exclusiveSession.getSessionName());
            return null;
        }
    }

    private Command getCommandSession(String str) {
        if (str == null) {
            return null;
        }
        Session exclusiveSession = Logger.INSTANCE.getExclusiveSession(str);
        if (exclusiveSession == null) {
            Platform.getLocalLogger().error("Command %s not found!", str);
            return null;
        } else if (exclusiveSession instanceof Command) {
            return (Command) exclusiveSession;
        } else {
            Platform.getLocalLogger().error("%s is not command session instance, but %s", str, exclusiveSession.getSessionName());
            return null;
        }
    }

    public boolean endExclusiveAction(String str) {
        synchronized (this) {
            Logger logger = Logger.INSTANCE;
            if (logger.isDisabled()) {
                return false;
            }
            Action exclusiveActionSession = getExclusiveActionSession(str);
            if (exclusiveActionSession == null) {
                return false;
            }
            return logger.endSession(new SessionEnded(exclusiveActionSession));
        }
    }

    public boolean cancelExclusiveAction(String str) {
        synchronized (this) {
            Logger logger = Logger.INSTANCE;
            if (logger.isDisabled()) {
                return false;
            }
            Action exclusiveActionSession = getExclusiveActionSession(str);
            if (exclusiveActionSession == null) {
                return false;
            }
            return logger.endSession(new SessionCanceled(exclusiveActionSession));
        }
    }

    public boolean failedExclusiveAction(String str, String str2) {
        synchronized (this) {
            Logger logger = Logger.INSTANCE;
            if (logger.isDisabled()) {
                return false;
            }
            Action exclusiveActionSession = getExclusiveActionSession(str);
            if (exclusiveActionSession == null) {
                return false;
            }
            return logger.endSession(new ActionFailed(exclusiveActionSession, str2));
        }
    }

    public boolean failedAction(Long l, String str) {
        synchronized (this) {
            Logger logger = Logger.INSTANCE;
            if (logger.isDisabled()) {
                return false;
            }
            if (l == null) {
                return false;
            }
            ActionFailed createActionFailedEvent = Action.createActionFailedEvent(l, str);
            if (createActionFailedEvent == null) {
                return false;
            }
            return logger.endSession(createActionFailedEvent);
        }
    }

    public boolean endCommand(String str) {
        synchronized (this) {
            Logger logger = Logger.INSTANCE;
            if (logger.isDisabled()) {
                return false;
            }
            Command commandSession = getCommandSession(str);
            if (commandSession == null) {
                return false;
            }
            return logger.endSession(new SessionEnded(commandSession));
        }
    }

    public void logError(String str, Throwable th) {
        Error error;
        Logger logger = Logger.INSTANCE;
        if (logger.isDisabled() || (error = ExtCLUtils.toError(str, th)) == null) {
            return;
        }
        try {
            logger.logEvent(new ExceptionOccurred(null, error.toJSONObject().toString()));
        } catch (JSONException unused) {
        }
    }

    public void logError(Error error) {
        Logger logger = Logger.INSTANCE;
        if (logger.isDisabled() || error == null) {
            return;
        }
        try {
            logger.logEvent(new ExceptionOccurred(null, error.toJSONObject().toString()));
        } catch (JSONException unused) {
        }
    }
}
