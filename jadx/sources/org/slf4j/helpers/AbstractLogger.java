package org.slf4j.helpers;

import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.event.Level;

/* loaded from: classes5.dex */
public abstract class AbstractLogger implements Logger, Serializable {
    private static final long serialVersionUID = -2529255052481744503L;
    protected String name;

    @Override // org.slf4j.Logger
    public String getName() {
        return this.name;
    }

    protected abstract void handleNormalizedLoggingCall(Level level, Marker marker, String str, Object[] objArr, Throwable th);

    protected Object readResolve() {
        return LoggerFactory.getLogger(getName());
    }

    @Override // org.slf4j.Logger
    public void trace(String str) {
        if (isTraceEnabled()) {
            handle_0ArgsCall(Level.TRACE, null, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj) {
        if (isTraceEnabled()) {
            handle_1ArgsCall(Level.TRACE, null, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj, Object obj2) {
        if (isTraceEnabled()) {
            handle2ArgsCall(Level.TRACE, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(String str) {
        if (isDebugEnabled()) {
            handle_0ArgsCall(Level.DEBUG, null, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj) {
        if (isDebugEnabled()) {
            handle_1ArgsCall(Level.DEBUG, null, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj, Object obj2) {
        if (isDebugEnabled()) {
            handle2ArgsCall(Level.DEBUG, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object... objArr) {
        if (isDebugEnabled()) {
            handleArgArrayCall(Level.DEBUG, null, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void info(String str) {
        if (isInfoEnabled()) {
            handle_0ArgsCall(Level.INFO, null, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj) {
        if (isInfoEnabled()) {
            handle_1ArgsCall(Level.INFO, null, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void info(String str, Throwable th) {
        if (isInfoEnabled()) {
            handle_0ArgsCall(Level.INFO, null, str, th);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(String str) {
        if (isWarnEnabled()) {
            handle_0ArgsCall(Level.WARN, null, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj) {
        if (isWarnEnabled()) {
            handle_1ArgsCall(Level.WARN, null, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj, Object obj2) {
        if (isWarnEnabled()) {
            handle2ArgsCall(Level.WARN, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Throwable th) {
        if (isWarnEnabled()) {
            handle_0ArgsCall(Level.WARN, null, str, th);
        }
    }

    @Override // org.slf4j.Logger
    public void error(String str) {
        if (isErrorEnabled()) {
            handle_0ArgsCall(Level.ERROR, null, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj) {
        if (isErrorEnabled()) {
            handle_1ArgsCall(Level.ERROR, null, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void error(String str, Throwable th) {
        if (isErrorEnabled()) {
            handle_0ArgsCall(Level.ERROR, null, str, th);
        }
    }

    private void handle_0ArgsCall(Level level, Marker marker, String str, Throwable th) {
        handleNormalizedLoggingCall(level, marker, str, null, th);
    }

    private void handle_1ArgsCall(Level level, Marker marker, String str, Object obj) {
        handleNormalizedLoggingCall(level, marker, str, new Object[]{obj}, null);
    }

    private void handle2ArgsCall(Level level, Marker marker, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            handleNormalizedLoggingCall(level, marker, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            handleNormalizedLoggingCall(level, marker, str, new Object[]{obj, obj2}, null);
        }
    }

    private void handleArgArrayCall(Level level, Marker marker, String str, Object[] objArr) {
        Throwable throwableCandidate = MessageFormatter.getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            handleNormalizedLoggingCall(level, marker, str, MessageFormatter.trimmedCopy(objArr), throwableCandidate);
        } else {
            handleNormalizedLoggingCall(level, marker, str, objArr, null);
        }
    }
}
