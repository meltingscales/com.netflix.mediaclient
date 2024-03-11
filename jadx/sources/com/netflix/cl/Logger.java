package com.netflix.cl;

import com.netflix.cl.Platform;
import com.netflix.cl.model.ContextType;
import com.netflix.cl.model.Exclusive;
import com.netflix.cl.model.Tracked;
import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.model.envelope.AddedMultipleContexs;
import com.netflix.cl.model.envelope.CompactConsolidatedLoggingEnvelope;
import com.netflix.cl.model.envelope.RemovedContext;
import com.netflix.cl.model.envelope.ReverseDelta;
import com.netflix.cl.model.event.Event;
import com.netflix.cl.model.event.discrete.DiscreteEvent;
import com.netflix.cl.model.event.discrete.LoggerInitialized;
import com.netflix.cl.model.event.session.Log;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.SessionCanceled;
import com.netflix.cl.model.event.session.SessionEnded;
import com.netflix.cl.util.ContextListener;
import com.netflix.cl.util.EventListener;
import com.netflix.cl.util.SessionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public enum Logger {
    INSTANCE;
    
    private EventSender eventSender;
    private Long logSessionId;
    private State state = State.not_initialized;
    private List<EventListener> eventListeners = Collections.synchronizedList(new ArrayList());
    private final List<SessionListener> sessionListeners = Collections.synchronizedList(new ArrayList());
    private final List<ContextListener> contextListeners = Collections.synchronizedList(new ArrayList());
    private SortedMap<Long, ContextType> currentState = Collections.synchronizedSortedMap(new TreeMap());
    private SortedMap<Long, CLContext> pendingContexts = Collections.synchronizedSortedMap(new TreeMap());
    private Map<String, CLContext> exclusiveContexts = new HashMap();
    private Map<String, Session> exclusiveSessions = new HashMap();
    private ReverseDelta currentDelta = new ReverseDelta();
    private List<ReverseDelta> snapshots = new LinkedList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum State {
        not_initialized,
        initialized,
        ready_to_deliver,
        disabled
    }

    public Long getLogSessionId() {
        return this.logSessionId;
    }

    Logger() {
    }

    public void addEventListener(EventListener eventListener) {
        synchronized (this) {
            if (!this.eventListeners.contains(eventListener)) {
                this.eventListeners.add(eventListener);
            }
        }
    }

    public void addSessionListeners(SessionListener sessionListener) {
        synchronized (this) {
            if (!this.sessionListeners.contains(sessionListener)) {
                this.sessionListeners.add(sessionListener);
            }
        }
    }

    public void start(Platform.PlatformImpl platformImpl) {
        synchronized (this) {
            if (platformImpl == null) {
                throw new IllegalArgumentException("Platform can not be null");
            }
            if (this.state != State.not_initialized) {
                return;
            }
            Platform.setImp(platformImpl);
            init();
            this.state = State.initialized;
            Platform.getLocalLogger().debug("Logger initialized...");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void init() {
        synchronized (this) {
            this.logSessionId = startSession(new Log());
            logEvent(new LoggerInitialized());
        }
    }

    public long addContext(CLContext cLContext) {
        synchronized (this) {
            if (isDisabled()) {
                return 0L;
            }
            if (cLContext == null) {
                throw new IllegalArgumentException("Context can not be null!");
            }
            cLContext.prepareForSending();
            this.pendingContexts.put(Long.valueOf(cLContext.getId()), cLContext);
            String simpleName = cLContext.getClass().getSimpleName();
            if (!this.contextListeners.isEmpty()) {
                synchronized (this.contextListeners) {
                    for (ContextListener contextListener : this.contextListeners) {
                        contextListener.onAddContext(cLContext);
                    }
                }
            }
            if (cLContext instanceof Exclusive) {
                if (Platform.getLocalLogger().isDebug()) {
                    Platform.getLocalLogger().debug("addContext:: Context %s is exclusive. Added", simpleName);
                }
                CLContext cLContext2 = this.exclusiveContexts.get(simpleName);
                if (cLContext2 == cLContext) {
                    if (Platform.getLocalLogger().isDebug()) {
                        Platform.getLocalLogger().debug("addContext:: Old context for %s same as new, do nothing", simpleName);
                    }
                    return cLContext.getId();
                }
                if (cLContext2 != null) {
                    if (Platform.getLocalLogger().isDebug()) {
                        Platform.getLocalLogger().debug("addContext:: Old context for %s found and removed", simpleName);
                    }
                    removeContext(Long.valueOf(cLContext2.getId()));
                }
                this.exclusiveContexts.put(simpleName, cLContext);
            } else if (Platform.getLocalLogger().isDebug()) {
                Platform.getLocalLogger().debug("addContext:: Context %s is NON exclusive. Added", simpleName);
            }
            return cLContext.getId();
        }
    }

    public boolean removeExclusiveContext(Class cls) {
        synchronized (this) {
            if (cls == null) {
                return false;
            }
            return removeExclusiveContext(cls.getSimpleName());
        }
    }

    public boolean removeExclusiveContext(String str) {
        synchronized (this) {
            if (isDisabled()) {
                return false;
            }
            if (str == null) {
                return false;
            }
            CLContext cLContext = this.exclusiveContexts.get(str);
            if (cLContext == null) {
                return false;
            }
            return removeContext(Long.valueOf(cLContext.getId()));
        }
    }

    public boolean removeContext(Long l) {
        synchronized (this) {
            if (isDisabled()) {
                return false;
            }
            if (l == null) {
                return false;
            }
            if (!this.contextListeners.isEmpty()) {
                synchronized (this.contextListeners) {
                    for (ContextListener contextListener : this.contextListeners) {
                        contextListener.onRemoveContext(l);
                    }
                }
            }
            CLContext remove = this.pendingContexts.remove(l);
            if (remove != null) {
                removeIfExclusiveContext(remove);
                if (Platform.getLocalLogger().isDebug()) {
                    Platform.getLocalLogger().debug("Context found in pending contexts for ID:  %d", l);
                }
                return true;
            } else if (this.currentState.get(l) instanceof Session) {
                throw new IllegalStateException("removeContext:: id is session. We are trying to remove session, instead of context!");
            } else {
                CLContext cLContext = (CLContext) this.currentState.remove(l);
                if (cLContext != null) {
                    removeIfExclusiveContext(cLContext);
                    if (Platform.getLocalLogger().isDebug()) {
                        Platform.getLocalLogger().debug("Context found in current contexts for ID:  %d", l);
                    }
                    this.currentDelta.add(new RemovedContext(cLContext));
                    return true;
                }
                if (Platform.getLocalLogger().isDebug()) {
                    Platform.getLocalLogger().debug("Context not found for ID %d.", l);
                }
                return false;
            }
        }
    }

    private void removeIfExclusiveContext(CLContext cLContext) {
        if (cLContext instanceof Exclusive) {
            this.exclusiveContexts.remove(cLContext.getClass().getSimpleName());
        }
    }

    public Session getSession(Long l) {
        synchronized (this) {
            if (l == null) {
                return null;
            }
            if (isDisabled()) {
                return null;
            }
            ContextType contextType = this.currentState.get(l);
            if (contextType instanceof Session) {
                return (Session) contextType;
            }
            return null;
        }
    }

    public void logEvent(DiscreteEvent discreteEvent) {
        synchronized (this) {
            if (!isDisabled() && discreteEvent != null) {
                if (shouldSample(discreteEvent)) {
                    return;
                }
                discreteEvent.prepareForSending();
                snapshot(discreteEvent);
                reportOnDiscreteEvent(discreteEvent);
                dumpEvent(discreteEvent);
            }
        }
    }

    private boolean shouldSample(DiscreteEvent discreteEvent) {
        EventSender eventSender = this.eventSender;
        if (eventSender == null || eventSender.canSendEvent(discreteEvent.getEventMostDerivedType())) {
            return false;
        }
        if (Platform.getLocalLogger().isDebug()) {
            Platform.getLocalLogger().debug("Sampling event %s", discreteEvent.getEventMostDerivedType());
            return true;
        }
        return true;
    }

    private void reportOnDiscreteEvent(DiscreteEvent discreteEvent) {
        if (this.eventListeners.isEmpty()) {
            return;
        }
        synchronized (this.eventListeners) {
            for (EventListener eventListener : this.eventListeners) {
                eventListener.onDiscreteEvent(discreteEvent);
            }
        }
    }

    private void dumpEvent(DiscreteEvent discreteEvent) {
        String str;
        Tracked tracked;
        if (Platform.getLocalLogger().isDebug()) {
            if (discreteEvent instanceof Tracked) {
                if (((Tracked) discreteEvent).trackingInfo() != null) {
                    try {
                        str = "trackingInfo=" + tracked.trackingInfo().toJSONObject();
                    } catch (Exception e) {
                        str = "trackingInfo=error " + e.getMessage();
                    }
                    Platform.getLocalLogger().debug("Added discrete event %s id: %d, %s", discreteEvent.getEventMostDerivedType(), Long.valueOf(discreteEvent.getId()), str);
                }
            }
            str = "";
            Platform.getLocalLogger().debug("Added discrete event %s id: %d, %s", discreteEvent.getEventMostDerivedType(), Long.valueOf(discreteEvent.getId()), str);
        }
    }

    public boolean existExclusiveSession(String str) {
        boolean z;
        synchronized (this) {
            if (str != null) {
                z = this.exclusiveSessions.get(str) != null ? true : true;
            }
            z = false;
        }
        return z;
    }

    public Long startSession(Session session) {
        synchronized (this) {
            if (isDisabled()) {
                Platform.getLocalLogger().debug("Logger disabled, can not send %s", session.getSessionName());
                return null;
            } else if (session == null) {
                throw new IllegalArgumentException("Session can not be null!");
            } else {
                EventSender eventSender = this.eventSender;
                if (eventSender != null && !eventSender.canSendEvent(session.getSessionName())) {
                    Platform.getLocalLogger().debug("Sampling event %s", session.getSessionName());
                    return null;
                }
                handleExclusiveSession(session);
                session.prepareForSending();
                this.currentState.put(Long.valueOf(session.getId()), session);
                snapshot(session);
                reportOnStartSession(session);
                dumpSession(session);
                return Long.valueOf(session.getId());
            }
        }
    }

    private void handleExclusiveSession(Session session) {
        if (session instanceof Exclusive) {
            String sessionName = session.getSessionName();
            Session session2 = this.exclusiveSessions.get(sessionName);
            if (session2 != null) {
                dumpExlusiveSessions();
                Platform.getLocalLogger().error("Session already exist %s. Cancel it!", sessionName);
                endSession(Session.createSessionCanceledEvent(Long.valueOf(session2.getSessionId())));
            }
            Platform.getLocalLogger().debug("Exclusive session added %s.", sessionName);
            this.exclusiveSessions.put(sessionName, session);
        }
    }

    private void dumpExlusiveSessions() {
        Platform.getLocalLogger().debug("Exclusive session count %d.", Integer.valueOf(this.exclusiveSessions.size()));
        for (String str : this.exclusiveSessions.keySet()) {
            Platform.getLocalLogger().debug("Exclusive session %s.", str);
        }
    }

    private void dumpSession(Session session) {
        String str;
        Tracked tracked;
        if (Platform.getLocalLogger().isDebug()) {
            if (session instanceof Tracked) {
                if (((Tracked) session).trackingInfo() != null) {
                    try {
                        str = "trackingInfo=" + tracked.trackingInfo().toJSONObject();
                    } catch (Exception e) {
                        str = "trackingInfo=error " + e.getMessage();
                    }
                    Platform.getLocalLogger().debug("Added session %s id: %d, sequence: %d, %s", session.getSessionName(), Long.valueOf(session.getId()), Long.valueOf(session.getSequence()), str);
                }
            }
            str = "";
            Platform.getLocalLogger().debug("Added session %s id: %d, sequence: %d, %s", session.getSessionName(), Long.valueOf(session.getId()), Long.valueOf(session.getSequence()), str);
        }
    }

    private void reportOnStartSession(Session session) {
        synchronized (this.sessionListeners) {
            for (SessionListener sessionListener : this.sessionListeners) {
                sessionListener.onStartSession(session);
            }
        }
    }

    public boolean endSession(SessionEnded sessionEnded) {
        synchronized (this) {
            if (isDisabled()) {
                return false;
            }
            if (sessionEnded == null) {
                return false;
            }
            EventSender eventSender = this.eventSender;
            if (eventSender != null && !eventSender.canSendEvent(sessionEnded.getSessionName())) {
                Platform.getLocalLogger().debug("Sampling event %s", sessionEnded.getSessionName());
                return false;
            }
            Session session = (Session) this.currentState.remove(Long.valueOf(sessionEnded.getSessionId()));
            if (session == null) {
                Platform.getLocalLogger().error("endSession:: session can not be found for id %d", Long.valueOf(sessionEnded.getSessionId()));
                return false;
            }
            Platform.getLocalLogger().debug("endSession:: for id %d removing session %s ", Long.valueOf(sessionEnded.getSessionId()), session.getSessionName());
            if (session instanceof Exclusive) {
                this.exclusiveSessions.remove(session.getSessionName());
            }
            sessionEnded.prepareForSending();
            snapshot(session, sessionEnded);
            synchronized (this.sessionListeners) {
                for (SessionListener sessionListener : this.sessionListeners) {
                    sessionListener.onEndSession(session, sessionEnded);
                }
            }
            if (Platform.getLocalLogger().isDebug()) {
                Platform.getLocalLogger().debug("Ending session %s id %d, with event id %d", session.getSessionName(), Long.valueOf(session.getId()), Long.valueOf(sessionEnded.getId()));
            }
            return true;
        }
    }

    public boolean cancelSession(Long l) {
        synchronized (this) {
            if (isDisabled()) {
                return false;
            }
            if (l == null) {
                return false;
            }
            SessionCanceled createSessionCanceledEvent = Session.createSessionCanceledEvent(l);
            if (createSessionCanceledEvent == null) {
                return false;
            }
            return endSession(createSessionCanceledEvent);
        }
    }

    public boolean endSession(Long l) {
        synchronized (this) {
            if (isDisabled()) {
                return false;
            }
            if (l == null) {
                return false;
            }
            SessionEnded createSessionEndedEvent = Session.createSessionEndedEvent(l);
            if (createSessionEndedEvent == null) {
                return false;
            }
            return endSession(createSessionEndedEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetState() {
        synchronized (this) {
            ArrayList<CLContext> arrayList = new ArrayList();
            ArrayList<Session> arrayList2 = new ArrayList();
            synchronized (this.pendingContexts) {
                for (CLContext cLContext : this.pendingContexts.values()) {
                    if (Platform.getLocalLogger().isDebug()) {
                        Platform.LocalLogger localLogger = Platform.getLocalLogger();
                        localLogger.debug("resetState:: add pendingContexts to pending removal " + cLContext);
                    }
                    arrayList.add(cLContext);
                }
            }
            synchronized (this.currentState) {
                for (ContextType contextType : this.currentState.values()) {
                    if (contextType instanceof CLContext) {
                        CLContext cLContext2 = (CLContext) contextType;
                        if (Platform.getLocalLogger().isDebug()) {
                            Platform.LocalLogger localLogger2 = Platform.getLocalLogger();
                            localLogger2.debug("resetState:: add currentState to pending removal " + cLContext2);
                        }
                        arrayList.add(cLContext2);
                    } else if (contextType instanceof Session) {
                        Session session = (Session) contextType;
                        if (Platform.getLocalLogger().isDebug()) {
                            Platform.LocalLogger localLogger3 = Platform.getLocalLogger();
                            localLogger3.debug("resetState:: add currentState to pending removal session " + session);
                        }
                        arrayList2.add(session);
                    } else if (Platform.getLocalLogger().isDebug()) {
                        Platform.LocalLogger localLogger4 = Platform.getLocalLogger();
                        localLogger4.error("resetState:: uknown state which is not removed " + contextType);
                    }
                }
            }
            for (Session session2 : arrayList2) {
                if (Platform.getLocalLogger().isDebug()) {
                    Platform.LocalLogger localLogger5 = Platform.getLocalLogger();
                    localLogger5.debug("resetState:: cancel session " + session2);
                }
                cancelSession(Long.valueOf(session2.getId()));
            }
            for (CLContext cLContext3 : arrayList) {
                if (Platform.getLocalLogger().isDebug()) {
                    Platform.LocalLogger localLogger6 = Platform.getLocalLogger();
                    localLogger6.debug("resetState:: removing context " + cLContext3);
                }
                removeContext(Long.valueOf(cLContext3.getId()));
            }
        }
    }

    public void flush() {
        synchronized (this) {
            if (isDisabled()) {
                return;
            }
            boolean z = this.eventSender == null;
            int size = this.snapshots.size();
            if (!z && size >= 1) {
                CompactConsolidatedLoggingEnvelope compactConsolidatedLoggingEnvelope = new CompactConsolidatedLoggingEnvelope(this.currentState, this.snapshots);
                this.snapshots.clear();
                this.currentDelta = new ReverseDelta();
                this.eventSender.send(compactConsolidatedLoggingEnvelope);
                return;
            }
            Platform.getLocalLogger().error("Unable to flush, event send is missing %b and/or snapshot size %d is less than 1!", Boolean.valueOf(z), Integer.valueOf(size));
        }
    }

    public void setEventSender(EventSender eventSender) {
        synchronized (this) {
            if (isDisabled()) {
                return;
            }
            if (eventSender == null) {
                throw new IllegalArgumentException("Event sender can not be null!");
            }
            this.eventSender = eventSender;
            this.state = State.ready_to_deliver;
        }
    }

    private void alertSender(Event event) {
        EventSender eventSender = this.eventSender;
        if (eventSender != null) {
            eventSender.eventAdded(event, this.snapshots.size());
        } else {
            Platform.getLocalLogger().debug("Event sender not set yet!");
        }
    }

    private int addPendingContexts() {
        int i;
        synchronized (this.pendingContexts) {
            i = 1;
            for (CLContext cLContext : this.pendingContexts.values()) {
                if (Platform.getLocalLogger().isDebug()) {
                    Platform.LocalLogger localLogger = Platform.getLocalLogger();
                    localLogger.debug("addPendingContexts:: Pending context: ID: " + cLContext.getId() + ", context: " + cLContext);
                }
                this.currentState.put(Long.valueOf(cLContext.getId()), cLContext);
                i++;
            }
            if (Platform.getLocalLogger().isDebug()) {
                Platform.LocalLogger localLogger2 = Platform.getLocalLogger();
                localLogger2.debug("addPendingContexts::Count: " + i);
            }
            this.currentDelta.add(new AddedMultipleContexs(i));
            this.pendingContexts.clear();
        }
        return i;
    }

    private void snapshot(Session session) {
        Platform.getLocalLogger().debug("Create snapshot for session start event...");
        addPendingContexts();
        ReverseDelta reverseDelta = new ReverseDelta();
        this.currentDelta = reverseDelta;
        this.snapshots.add(reverseDelta);
        alertSender(session);
    }

    private void snapshot(DiscreteEvent discreteEvent) {
        if (Platform.getLocalLogger().isDebug()) {
            Platform.getLocalLogger().debug("Create snapshot for discrete event %s...", discreteEvent.getEventMostDerivedType());
        }
        addPendingContexts();
        ReverseDelta reverseDelta = new ReverseDelta();
        this.currentDelta = reverseDelta;
        this.snapshots.add(reverseDelta);
        this.currentDelta.add(new RemovedContext(discreteEvent));
        alertSender(discreteEvent);
    }

    private void snapshot(Session session, SessionEnded sessionEnded) {
        Platform.getLocalLogger().debug("Create snapshot for season end...");
        addPendingContexts();
        ReverseDelta reverseDelta = new ReverseDelta();
        this.currentDelta = reverseDelta;
        this.snapshots.add(reverseDelta);
        this.currentDelta.add(new RemovedContext(sessionEnded));
        this.currentDelta.add(new RemovedContext(session));
        alertSender(sessionEnded);
    }

    public Session getExclusiveSession(String str) {
        synchronized (this) {
            if (str == null) {
                return null;
            }
            return this.exclusiveSessions.get(str);
        }
    }

    public boolean isDisabled() {
        return this.state == State.disabled;
    }
}
