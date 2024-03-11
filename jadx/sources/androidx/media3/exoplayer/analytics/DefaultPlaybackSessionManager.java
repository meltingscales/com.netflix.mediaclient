package androidx.media3.exoplayer.analytics;

import android.util.Base64;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.base.Supplier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes2.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final Supplier<String> DEFAULT_SESSION_ID_GENERATOR = new Supplier() { // from class: androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Supplier
        public final Object get() {
            String generateDefaultSessionId;
            generateDefaultSessionId = DefaultPlaybackSessionManager.generateDefaultSessionId();
            return generateDefaultSessionId;
        }
    };
    private static final Random RANDOM = new Random();
    private String currentSessionId;
    private Timeline currentTimeline;
    private long lastRemovedCurrentWindowSequenceNumber;
    private PlaybackSessionManager.Listener listener;
    private final Timeline.Period period;
    private final Supplier<String> sessionIdGenerator;
    private final HashMap<String, SessionDescriptor> sessions;
    private final Timeline.Window window;

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }

    public DefaultPlaybackSessionManager(Supplier<String> supplier) {
        this.sessionIdGenerator = supplier;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.sessions = new HashMap<>();
        this.currentTimeline = Timeline.EMPTY;
        this.lastRemovedCurrentWindowSequenceNumber = -1L;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        String str;
        synchronized (this) {
            str = getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).sessionId;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[Catch: all -> 0x0112, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:10:0x0018, B:15:0x0024, B:17:0x0030, B:19:0x003a, B:23:0x0044, B:25:0x0050, B:26:0x0056, B:28:0x005b, B:30:0x0061, B:32:0x007a, B:34:0x00d5, B:36:0x00db, B:38:0x00f1, B:40:0x00fd, B:42:0x0103), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateSessions(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime r25) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.updateSessions(androidx.media3.exoplayer.analytics.AnalyticsListener$EventTime):void");
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
        synchronized (this) {
            Assertions.checkNotNull(this.listener);
            Timeline timeline = this.currentTimeline;
            this.currentTimeline = eventTime.timeline;
            Iterator<SessionDescriptor> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                SessionDescriptor next = it.next();
                if (!next.tryResolvingToNewTimeline(timeline, this.currentTimeline) || next.isFinishedAtEventTime(eventTime)) {
                    it.remove();
                    if (next.isCreated) {
                        if (next.sessionId.equals(this.currentSessionId)) {
                            clearCurrentSession(next);
                        }
                        this.listener.onSessionFinished(eventTime, next.sessionId, false);
                    }
                }
            }
            updateCurrentSession(eventTime);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void updateSessionsWithDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        synchronized (this) {
            Assertions.checkNotNull(this.listener);
            boolean z = i == 0;
            Iterator<SessionDescriptor> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                SessionDescriptor next = it.next();
                if (next.isFinishedAtEventTime(eventTime)) {
                    it.remove();
                    if (next.isCreated) {
                        boolean equals = next.sessionId.equals(this.currentSessionId);
                        boolean z2 = z && equals && next.isActive;
                        if (equals) {
                            clearCurrentSession(next);
                        }
                        this.listener.onSessionFinished(eventTime, next.sessionId, z2);
                    }
                }
            }
            updateCurrentSession(eventTime);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public String getActiveSessionId() {
        String str;
        synchronized (this) {
            str = this.currentSessionId;
        }
        return str;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void finishAllSessions(AnalyticsListener.EventTime eventTime) {
        PlaybackSessionManager.Listener listener;
        synchronized (this) {
            String str = this.currentSessionId;
            if (str != null) {
                clearCurrentSession((SessionDescriptor) Assertions.checkNotNull(this.sessions.get(str)));
            }
            Iterator<SessionDescriptor> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                SessionDescriptor next = it.next();
                it.remove();
                if (next.isCreated && (listener = this.listener) != null) {
                    listener.onSessionFinished(eventTime, next.sessionId, false);
                }
            }
        }
    }

    @RequiresNonNull({"listener"})
    private void updateCurrentSession(AnalyticsListener.EventTime eventTime) {
        if (eventTime.timeline.isEmpty()) {
            String str = this.currentSessionId;
            if (str != null) {
                clearCurrentSession((SessionDescriptor) Assertions.checkNotNull(this.sessions.get(str)));
                return;
            }
            return;
        }
        SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
        SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        this.currentSessionId = orAddSession.sessionId;
        updateSessions(eventTime);
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
            return;
        }
        if (sessionDescriptor != null && sessionDescriptor.windowSequenceNumber == eventTime.mediaPeriodId.windowSequenceNumber && sessionDescriptor.adMediaPeriodId != null && sessionDescriptor.adMediaPeriodId.adGroupIndex == eventTime.mediaPeriodId.adGroupIndex && sessionDescriptor.adMediaPeriodId.adIndexInAdGroup == eventTime.mediaPeriodId.adIndexInAdGroup) {
            return;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
        this.listener.onAdPlaybackStarted(eventTime, getOrAddSession(eventTime.windowIndex, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber)).sessionId, orAddSession.sessionId);
    }

    private void clearCurrentSession(SessionDescriptor sessionDescriptor) {
        if (sessionDescriptor.windowSequenceNumber != -1) {
            this.lastRemovedCurrentWindowSequenceNumber = sessionDescriptor.windowSequenceNumber;
        }
        this.currentSessionId = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMinWindowSequenceNumber() {
        SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
        return (sessionDescriptor == null || sessionDescriptor.windowSequenceNumber == -1) ? this.lastRemovedCurrentWindowSequenceNumber + 1 : sessionDescriptor.windowSequenceNumber;
    }

    private SessionDescriptor getOrAddSession(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        int i2;
        SessionDescriptor sessionDescriptor = null;
        long j = Long.MAX_VALUE;
        for (SessionDescriptor sessionDescriptor2 : this.sessions.values()) {
            sessionDescriptor2.maybeSetWindowSequenceNumber(i, mediaPeriodId);
            if (sessionDescriptor2.belongsToSession(i, mediaPeriodId)) {
                long j2 = sessionDescriptor2.windowSequenceNumber;
                if (j2 == -1 || j2 < j) {
                    sessionDescriptor = sessionDescriptor2;
                    j = j2;
                } else if (i2 == 0 && ((SessionDescriptor) Util.castNonNull(sessionDescriptor)).adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId != null) {
                    sessionDescriptor = sessionDescriptor2;
                }
            }
        }
        if (sessionDescriptor == null) {
            String str = this.sessionIdGenerator.get();
            SessionDescriptor sessionDescriptor3 = new SessionDescriptor(str, i, mediaPeriodId);
            this.sessions.put(str, sessionDescriptor3);
            return sessionDescriptor3;
        }
        return sessionDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class SessionDescriptor {
        private MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final String sessionId;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(String str, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.sessionId = str;
            this.windowIndex = i;
            this.windowSequenceNumber = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.adMediaPeriodId = mediaPeriodId;
        }

        public boolean tryResolvingToNewTimeline(Timeline timeline, Timeline timeline2) {
            int resolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(timeline, timeline2, this.windowIndex);
            this.windowIndex = resolveWindowIndexToNewTimeline;
            if (resolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = this.adMediaPeriodId;
            return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }

        public boolean belongsToSession(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (mediaPeriodId == null) {
                return i == this.windowIndex;
            }
            MediaSource.MediaPeriodId mediaPeriodId2 = this.adMediaPeriodId;
            return mediaPeriodId2 == null ? !mediaPeriodId.isAd() && mediaPeriodId.windowSequenceNumber == this.windowSequenceNumber : mediaPeriodId.windowSequenceNumber == mediaPeriodId2.windowSequenceNumber && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup;
        }

        public void maybeSetWindowSequenceNumber(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.windowSequenceNumber != -1 || i != this.windowIndex || mediaPeriodId == null || mediaPeriodId.windowSequenceNumber < DefaultPlaybackSessionManager.this.getMinWindowSequenceNumber()) {
                return;
            }
            this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
        }

        public boolean isFinishedAtEventTime(AnalyticsListener.EventTime eventTime) {
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId == null) {
                return this.windowIndex != eventTime.windowIndex;
            }
            long j = this.windowSequenceNumber;
            if (j == -1) {
                return false;
            }
            if (mediaPeriodId.windowSequenceNumber > j) {
                return true;
            }
            if (this.adMediaPeriodId == null) {
                return false;
            }
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
            int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.adMediaPeriodId.periodUid);
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            if (mediaPeriodId2.windowSequenceNumber < this.adMediaPeriodId.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (mediaPeriodId2.isAd()) {
                MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
                int i = mediaPeriodId3.adGroupIndex;
                int i2 = mediaPeriodId3.adIndexInAdGroup;
                MediaSource.MediaPeriodId mediaPeriodId4 = this.adMediaPeriodId;
                int i3 = mediaPeriodId4.adGroupIndex;
                return i > i3 || (i == i3 && i2 > mediaPeriodId4.adIndexInAdGroup);
            }
            int i4 = eventTime.mediaPeriodId.nextAdGroupIndex;
            return i4 == -1 || i4 > this.adMediaPeriodId.adGroupIndex;
        }

        private int resolveWindowIndexToNewTimeline(Timeline timeline, Timeline timeline2, int i) {
            if (i < timeline.getWindowCount()) {
                timeline.getWindow(i, DefaultPlaybackSessionManager.this.window);
                for (int i2 = DefaultPlaybackSessionManager.this.window.firstPeriodIndex; i2 <= DefaultPlaybackSessionManager.this.window.lastPeriodIndex; i2++) {
                    int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
                    if (indexOfPeriod != -1) {
                        return timeline2.getPeriod(indexOfPeriod, DefaultPlaybackSessionManager.this.period).windowIndex;
                    }
                }
                return -1;
            } else if (i < timeline2.getWindowCount()) {
                return i;
            } else {
                return -1;
            }
        }
    }
}
