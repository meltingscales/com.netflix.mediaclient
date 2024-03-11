package org.slf4j;

import org.slf4j.event.Level;

/* loaded from: classes5.dex */
public interface Logger {
    void debug(String str);

    void debug(String str, Object obj);

    void debug(String str, Object obj, Object obj2);

    void debug(String str, Object... objArr);

    void error(String str);

    void error(String str, Object obj);

    void error(String str, Throwable th);

    String getName();

    void info(String str);

    void info(String str, Object obj);

    void info(String str, Throwable th);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void trace(String str);

    void trace(String str, Object obj);

    void trace(String str, Object obj, Object obj2);

    void warn(String str);

    void warn(String str, Object obj);

    void warn(String str, Object obj, Object obj2);

    void warn(String str, Throwable th);

    default boolean isEnabledForLevel(Level level) {
        int i = level.toInt();
        if (i != 0) {
            if (i != 10) {
                if (i != 20) {
                    if (i != 30) {
                        if (i == 40) {
                            return isErrorEnabled();
                        }
                        throw new IllegalArgumentException("Level [" + level + "] not recognized.");
                    }
                    return isWarnEnabled();
                }
                return isInfoEnabled();
            }
            return isDebugEnabled();
        }
        return isTraceEnabled();
    }
}
