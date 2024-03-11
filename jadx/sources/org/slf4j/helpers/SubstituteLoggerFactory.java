package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.event.SubstituteLoggingEvent;

/* loaded from: classes5.dex */
public class SubstituteLoggerFactory implements ILoggerFactory {
    volatile boolean postInitialization = false;
    final Map<String, SubstituteLogger> loggers = new ConcurrentHashMap();
    final LinkedBlockingQueue<SubstituteLoggingEvent> eventQueue = new LinkedBlockingQueue<>();

    public LinkedBlockingQueue<SubstituteLoggingEvent> getEventQueue() {
        return this.eventQueue;
    }

    public void postInitialization() {
        this.postInitialization = true;
    }

    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        SubstituteLogger substituteLogger;
        synchronized (this) {
            substituteLogger = this.loggers.get(str);
            if (substituteLogger == null) {
                substituteLogger = new SubstituteLogger(str, this.eventQueue, this.postInitialization);
                this.loggers.put(str, substituteLogger);
            }
        }
        return substituteLogger;
    }

    public List<SubstituteLogger> getLoggers() {
        return new ArrayList(this.loggers.values());
    }

    public void clear() {
        this.loggers.clear();
        this.eventQueue.clear();
    }
}