package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.DefaultMediaClock;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.ConnectionSubtype;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {
    private final long backBufferDurationUs;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final HandlerWrapper handler;
    private final HandlerThread internalPlaybackThread;
    private boolean isRebuffering;
    private final LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private final MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    private ExoPlaybackException pendingRecoverableRendererError;
    private final Timeline.Period period;
    private PlaybackInfo playbackInfo;
    private PlaybackInfoUpdate playbackInfoUpdate;
    private final PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private final MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionUs;
    private final Renderer[] renderers;
    private final Set<Renderer> renderersToReset;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;
    private long playbackMaybeBecameStuckAtMs = -9223372036854775807L;
    private long lastRebufferRealtimeMs = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final ShuffleOrder shuffleOrder;
        public final int toIndex;
    }

    /* loaded from: classes2.dex */
    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfoUpdate);
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.setForegroundModeTimeoutMs = j;
    }

    public Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    /* loaded from: classes2.dex */
    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public boolean hasPlayWhenReadyChangeReason;
        public int operationAcks;
        public int playWhenReadyChangeReason;
        public PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public void incrementPendingOperationAcks(int i) {
            this.hasPendingChange |= i > 0;
            this.operationAcks += i;
        }

        public void setPlayWhenReadyChangeReason(int i) {
            this.hasPendingChange = true;
            this.hasPlayWhenReadyChangeReason = true;
            this.playWhenReadyChangeReason = i;
        }

        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int i) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                Assertions.checkArgument(i == 5);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i;
        }
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i, boolean z, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j, boolean z2, Looper looper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener, PlayerId playerId, Looper looper2) {
        this.playbackInfoUpdateListener = playbackInfoUpdateListener;
        this.renderers = rendererArr;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.bandwidthMeter = bandwidthMeter;
        this.repeatMode = i;
        this.shuffleModeEnabled = z;
        this.seekParameters = seekParameters;
        this.livePlaybackSpeedControl = livePlaybackSpeedControl;
        this.releaseTimeoutMs = j;
        this.setForegroundModeTimeoutMs = j;
        this.pauseAtEndOfWindow = z2;
        this.clock = clock;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs();
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe();
        PlaybackInfo createDummy = PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = createDummy;
        this.playbackInfoUpdate = new PlaybackInfoUpdate(createDummy);
        this.rendererCapabilities = new RendererCapabilities[rendererArr.length];
        RendererCapabilities.Listener rendererCapabilitiesListener = trackSelector.getRendererCapabilitiesListener();
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].init(i2, playerId, clock);
            this.rendererCapabilities[i2] = rendererArr[i2].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.rendererCapabilities[i2].setListener(rendererCapabilitiesListener);
            }
        }
        this.mediaClock = new DefaultMediaClock(this, clock);
        this.pendingMessages = new ArrayList<>();
        this.renderersToReset = Sets.newIdentityHashSet();
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.deliverPendingMessageAtStartPositionRequired = true;
        HandlerWrapper createHandler = clock.createHandler(looper, null);
        this.queue = new MediaPeriodQueue(analyticsCollector, createHandler);
        this.mediaSourceList = new MediaSourceList(this, analyticsCollector, createHandler, playerId);
        if (looper2 != null) {
            this.internalPlaybackThread = null;
            this.playbackLooper = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.internalPlaybackThread = handlerThread;
            handlerThread.start();
            this.playbackLooper = handlerThread.getLooper();
        }
        this.handler = clock.createHandler(this.playbackLooper, this);
    }

    public void prepare() {
        this.handler.obtainMessage(0).sendToTarget();
    }

    public void setPlayWhenReady(boolean z, int i) {
        this.handler.obtainMessage(1, z ? 1 : 0, i).sendToTarget();
    }

    public void setRepeatMode(int i) {
        this.handler.obtainMessage(11, i, 0).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z) {
        this.handler.obtainMessage(12, z ? 1 : 0, 0).sendToTarget();
    }

    public void seekTo(Timeline timeline, int i, long j) {
        this.handler.obtainMessage(3, new SeekPosition(timeline, i, j)).sendToTarget();
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setSeekParameters(SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void stop() {
        this.handler.obtainMessage(6).sendToTarget();
    }

    public void setMediaSources(List<MediaSourceList.MediaSourceHolder> list, int i, long j, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(17, new MediaSourceListUpdateMessage(list, shuffleOrder, i, j)).sendToTarget();
    }

    public void addMediaSources(int i, List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(18, i, 0, new MediaSourceListUpdateMessage(list, shuffleOrder, -1, -9223372036854775807L)).sendToTarget();
    }

    public void removeMediaSources(int i, int i2, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(20, i, i2, shuffleOrder).sendToTarget();
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Sender
    public void sendMessage(PlayerMessage playerMessage) {
        synchronized (this) {
            if (!this.released && this.playbackLooper.getThread().isAlive()) {
                this.handler.obtainMessage(14, playerMessage).sendToTarget();
                return;
            }
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            playerMessage.markAsProcessed(false);
        }
    }

    public boolean release() {
        synchronized (this) {
            if (!this.released && this.playbackLooper.getThread().isAlive()) {
                this.handler.sendEmptyMessage(7);
                waitUninterruptibly(new Supplier() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        Boolean lambda$release$0;
                        lambda$release$0 = ExoPlayerImplInternal.this.lambda$release$0();
                        return lambda$release$0;
                    }
                }, this.releaseTimeoutMs);
                return this.released;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$release$0() {
        return Boolean.valueOf(this.released);
    }

    @Override // androidx.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.handler.sendEmptyMessage(22);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(10);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        this.handler.sendEmptyMessage(26);
    }

    @Override // androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(16, playbackParameters).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        MediaPeriodHolder readingPeriod;
        int i;
        int i2 = 1000;
        try {
            switch (message.what) {
                case 0:
                    prepareInternal();
                    break;
                case 1:
                    setPlayWhenReadyInternal(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                case 26:
                    reselectTracksInternalAndSeek();
                    break;
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                    updateMediaSourcesWithMediaItemsInternal(message.arg1, message.arg2, (List) message.obj);
                    break;
            }
        } catch (ParserException e) {
            int i3 = e.dataType;
            if (i3 == 1) {
                i = e.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i3 == 4) {
                    i = e.contentIsMalformed ? 3002 : 3004;
                }
                handleIoException(e, i2);
            }
            i2 = i;
            handleIoException(e, i2);
        } catch (DataSourceException e2) {
            handleIoException(e2, e2.reason);
        } catch (ExoPlaybackException e3) {
            e = e3;
            if (e.type == 1 && (readingPeriod = this.queue.getReadingPeriod()) != null) {
                e = e.copyWithMediaPeriodId(readingPeriod.info.id);
            }
            if (e.isRecoverable && (this.pendingRecoverableRendererError == null || e.errorCode == 5003)) {
                Log.w("ExoPlayerImplInternal", "Recoverable renderer error", e);
                ExoPlaybackException exoPlaybackException = this.pendingRecoverableRendererError;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.pendingRecoverableRendererError;
                } else {
                    this.pendingRecoverableRendererError = e;
                }
                HandlerWrapper handlerWrapper = this.handler;
                handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(25, e));
            } else {
                ExoPlaybackException exoPlaybackException2 = this.pendingRecoverableRendererError;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(e);
                    e = this.pendingRecoverableRendererError;
                }
                Log.e("ExoPlayerImplInternal", "Playback error", e);
                if (e.type == 1 && this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                    while (this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                        this.queue.advancePlayingPeriod();
                    }
                    MediaPeriodInfo mediaPeriodInfo = ((MediaPeriodHolder) Assertions.checkNotNull(this.queue.getPlayingPeriod())).info;
                    MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
                    long j = mediaPeriodInfo.startPositionUs;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j, mediaPeriodInfo.requestedContentPositionUs, j, true, 0);
                }
                stopInternal(true, false);
                this.playbackInfo = this.playbackInfo.copyWithPlaybackError(e);
            }
        } catch (DrmSession.DrmSessionException e4) {
            handleIoException(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            handleIoException(e5, 1002);
        } catch (IOException e6) {
            handleIoException(e6, 2000);
        } catch (RuntimeException e7) {
            ExoPlaybackException createForUnexpected = ExoPlaybackException.createForUnexpected(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1004);
            Log.e("ExoPlayerImplInternal", "Playback error", createForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForUnexpected);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    private void handleIoException(IOException iOException, int i) {
        ExoPlaybackException createForSource = ExoPlaybackException.createForSource(iOException, i);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            createForSource = createForSource.copyWithMediaPeriodId(playingPeriod.info.id);
        }
        Log.e("ExoPlayerImplInternal", "Playback error", createForSource);
        stopInternal(false, false);
        this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForSource);
    }

    private void waitUninterruptibly(Supplier<Boolean> supplier, long j) {
        synchronized (this) {
            long elapsedRealtime = this.clock.elapsedRealtime();
            boolean z = false;
            long j2 = j;
            while (!supplier.get().booleanValue() && j2 > 0) {
                try {
                    this.clock.onThreadBlocked();
                    wait(j2);
                } catch (InterruptedException unused) {
                    z = true;
                }
                j2 = (elapsedRealtime + j) - this.clock.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void setState(int i) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i) {
            if (i != 2) {
                this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
            }
            this.playbackInfo = playbackInfo.copyWithPlaybackState(i);
        }
    }

    private void maybeNotifyPlaybackInfoChanged() {
        this.playbackInfoUpdate.setPlaybackInfo(this.playbackInfo);
        if (this.playbackInfoUpdate.hasPendingChange) {
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(this.playbackInfoUpdate);
            this.playbackInfoUpdate = new PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private void prepareInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared();
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        this.mediaSourceList.prepare(this.bandwidthMeter.getTransferListener());
        this.handler.sendEmptyMessage(2);
    }

    private void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new SeekPosition(new PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void addMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i == -1) {
            i = mediaSourceList.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void moveMediaItemsInternal(MoveMediaItemsMessage moveMediaItemsMessage) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder), false);
    }

    private void removeMediaItemsInternal(int i, int i2, ShuffleOrder shuffleOrder) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i, i2, shuffleOrder), false);
    }

    private void mediaSourceListUpdateRequestedInternal() {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline(), true);
    }

    private void setShuffleOrderInternal(ShuffleOrder shuffleOrder) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder), false);
    }

    private void updateMediaSourcesWithMediaItemsInternal(int i, int i2, List<MediaItem> list) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.updateMediaSourcesWithMediaItems(i, i2, list), false);
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z) {
        ExoTrackSelection[] exoTrackSelectionArr;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z);
                }
            }
        }
    }

    private void setPlayWhenReadyInternal(boolean z, int i, boolean z2, int i2) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.playbackInfoUpdate.setPlayWhenReadyChangeReason(i2);
        this.playbackInfo = this.playbackInfo.copyWithPlayWhenReady(z, i);
        updateRebufferingState(false, false);
        notifyTrackSelectionPlayWhenReadyChanged(z);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            return;
        }
        int i3 = this.playbackInfo.playbackState;
        if (i3 == 3) {
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (i3 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void setPauseAtEndOfWindowInternal(boolean z) {
        this.pauseAtEndOfWindow = z;
        resetPendingPauseAtEndOfPeriod();
        if (!this.pendingPauseAtEndOfPeriod || this.queue.getReadingPeriod() == this.queue.getPlayingPeriod()) {
            return;
        }
        seekToCurrentPosition(true);
        handleLoadingMediaPeriodChanged(false);
    }

    private void setOffloadSchedulingEnabled(boolean z) {
        if (z == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z;
        if (z || !this.playbackInfo.sleepingForOffload) {
            return;
        }
        this.handler.sendEmptyMessage(2);
    }

    private void setRepeatModeInternal(int i) {
        this.repeatMode = i;
        if (!this.queue.updateRepeatMode(this.playbackInfo.timeline, i)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleModeEnabledInternal(boolean z) {
        this.shuffleModeEnabled = z;
        if (!this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void seekToCurrentPosition(boolean z) {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.id;
        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (seekToPeriodPosition != this.playbackInfo.positionUs) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, seekToPeriodPosition, playbackInfo.requestedContentPositionUs, playbackInfo.discontinuityStartPositionUs, z, 5);
        }
    }

    private void startRenderers() {
        Renderer[] rendererArr;
        updateRebufferingState(false, false);
        this.mediaClock.start();
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.start();
            }
        }
    }

    private void stopRenderers() {
        Renderer[] rendererArr;
        this.mediaClock.stop();
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                ensureStopped(renderer);
            }
        }
    }

    private void attemptRendererErrorRecovery() {
        reselectTracksInternalAndSeek();
    }

    private void updatePlaybackPositions() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long readDiscontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != -9223372036854775807L) {
            if (!playingPeriod.isFullyBuffered()) {
                this.queue.removeAfter(playingPeriod);
                handleLoadingMediaPeriodChanged(false);
                maybeContinueLoading();
            }
            resetRendererPosition(readDiscontinuity);
            if (readDiscontinuity != this.playbackInfo.positionUs) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo.periodId, readDiscontinuity, playbackInfo.requestedContentPositionUs, readDiscontinuity, true, 5);
            }
        } else {
            long syncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
            this.rendererPositionUs = syncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(syncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            this.playbackInfo.updatePositionUs(periodTime);
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        if (playbackInfo2.playWhenReady && playbackInfo2.playbackState == 3 && shouldUseLivePlaybackSpeedControl(playbackInfo2.timeline, playbackInfo2.periodId) && this.playbackInfo.playbackParameters.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), getTotalBufferedDurationUs());
            if (this.mediaClock.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                setMediaClockPlaybackParameters(this.playbackInfo.playbackParameters.withSpeed(adjustedPlaybackSpeed));
                handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void setMediaClockPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.removeMessages(16);
        this.mediaClock.setPlaybackParameters(playbackParameters);
    }

    private void notifyTrackSelectionRebuffer() {
        ExoTrackSelection[] exoTrackSelectionArr;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doSomeWork() {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.doSomeWork():void");
    }

    private long getCurrentLiveOffsetUs() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return getLiveOffsetUs(playbackInfo.timeline, playbackInfo.periodId.periodUid, playbackInfo.positionUs);
    }

    private long getLiveOffsetUs(Timeline timeline, Object obj, long j) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window);
        Timeline.Window window = this.window;
        if (window.windowStartTimeMs != -9223372036854775807L && window.isLive()) {
            Timeline.Window window2 = this.window;
            if (window2.isDynamic) {
                return Util.msToUs(window2.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - (j + this.period.getPositionInWindowUs());
            }
        }
        return -9223372036854775807L;
    }

    private boolean shouldUseLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.isAd() && !timeline.isEmpty()) {
            timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
            if (this.window.isLive()) {
                Timeline.Window window = this.window;
                if (window.isDynamic && window.windowStartTimeMs != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private void scheduleNextWork(long j, long j2) {
        this.handler.sendEmptyMessageAtTime(2, j + j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5 A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:21:0x00a3, B:23:0x00ad, B:26:0x00b3, B:28:0x00b9, B:29:0x00bc, B:31:0x00c3, B:33:0x00cf, B:35:0x00d7, B:39:0x00df, B:46:0x00f5, B:53:0x010b, B:57:0x0114, B:47:0x00f9, B:51:0x0107), top: B:73:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9 A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:21:0x00a3, B:23:0x00ad, B:26:0x00b3, B:28:0x00b9, B:29:0x00bc, B:31:0x00c3, B:33:0x00cf, B:35:0x00d7, B:39:0x00df, B:46:0x00f5, B:53:0x010b, B:57:0x0114, B:47:0x00f9, B:51:0x0107), top: B:73:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void seekToInternal(androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition r21) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.seekToInternal(androidx.media3.exoplayer.ExoPlayerImplInternal$SeekPosition):void");
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) {
        return seekToPeriodPosition(mediaPeriodId, j, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(), z);
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z, boolean z2) {
        stopRenderers();
        updateRebufferingState(false, true);
        if (z2 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder mediaPeriodHolder = playingPeriod;
        while (mediaPeriodHolder != null && !mediaPeriodId.equals(mediaPeriodHolder.info.id)) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        if (z || playingPeriod != mediaPeriodHolder || (mediaPeriodHolder != null && mediaPeriodHolder.toRendererTime(j) < 0)) {
            for (Renderer renderer : this.renderers) {
                disableRenderer(renderer);
            }
            if (mediaPeriodHolder != null) {
                while (this.queue.getPlayingPeriod() != mediaPeriodHolder) {
                    this.queue.advancePlayingPeriod();
                }
                this.queue.removeAfter(mediaPeriodHolder);
                mediaPeriodHolder.setRendererOffset(1000000000000L);
                enableRenderers();
            }
        }
        if (mediaPeriodHolder != null) {
            this.queue.removeAfter(mediaPeriodHolder);
            if (!mediaPeriodHolder.prepared) {
                mediaPeriodHolder.info = mediaPeriodHolder.info.copyWithStartPositionUs(j);
            } else if (mediaPeriodHolder.hasEnabledTracks) {
                long seekToUs = mediaPeriodHolder.mediaPeriod.seekToUs(j);
                mediaPeriodHolder.mediaPeriod.discardBuffer(seekToUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
                j = seekToUs;
            }
            resetRendererPosition(j);
            maybeContinueLoading();
        } else {
            this.queue.clear();
            resetRendererPosition(j);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j;
    }

    private void resetRendererPosition(long j) {
        Renderer[] rendererArr;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j + 1000000000000L : playingPeriod.toRendererTime(j);
        this.rendererPositionUs = rendererTime;
        this.mediaClock.resetPosition(rendererTime);
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.resetPosition(this.rendererPositionUs);
            }
        }
        notifyTrackSelectionDiscontinuity();
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) {
        setMediaClockPlaybackParameters(playbackParameters);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setForegroundModeInternal(boolean z, AtomicBoolean atomicBoolean) {
        Renderer[] rendererArr;
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (!z) {
                for (Renderer renderer : this.renderers) {
                    if (!isRendererEnabled(renderer) && this.renderersToReset.remove(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void stopInternal(boolean z, boolean z2) {
        resetInternal(z || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.loadControl.onStopped();
        setState(1);
    }

    private void releaseInternal() {
        resetInternal(true, false, true, false);
        releaseRenderers();
        this.loadControl.onReleased();
        setState(1);
        HandlerThread handlerThread = this.internalPlaybackThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.released = true;
            notifyAll();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
        if (r5.equals(r32.playbackInfo.periodId) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void resetInternal(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.resetInternal(boolean, boolean, boolean, boolean):void");
    }

    private Pair<MediaSource.MediaPeriodId, Long> getPlaceholderFirstMediaPeriodPositionUs(Timeline timeline) {
        long j = 0;
        if (timeline.isEmpty()) {
            return Pair.create(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, timeline.getFirstWindowIndex(this.shuffleModeEnabled), -9223372036854775807L);
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, periodPositionUs.first, 0L);
        long longValue = ((Long) periodPositionUs.second).longValue();
        if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
            if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == this.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex)) {
                j = this.period.getAdResumePositionUs();
            }
        } else {
            j = longValue;
        }
        return Pair.create(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, Long.valueOf(j));
    }

    private void sendMessageInternal(PlayerMessage playerMessage) {
        if (playerMessage.getPositionMs() == -9223372036854775807L) {
            sendMessageToTarget(playerMessage);
        } else if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new PendingMessageInfo(playerMessage));
        } else {
            PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
            Timeline timeline = this.playbackInfo.timeline;
            if (resolvePendingMessagePosition(pendingMessageInfo, timeline, timeline, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.add(pendingMessageInfo);
                Collections.sort(this.pendingMessages);
                return;
            }
            playerMessage.markAsProcessed(false);
        }
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) {
        if (playerMessage.getLooper() == this.playbackLooper) {
            deliverMessage(playerMessage);
            int i = this.playbackInfo.playbackState;
            if (i == 3 || i == 2) {
                this.handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.handler.obtainMessage(15, playerMessage).sendToTarget();
    }

    private void sendMessageToTargetThread(final PlayerMessage playerMessage) {
        Looper looper = playerMessage.getLooper();
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
            return;
        }
        this.clock.createHandler(looper, null).post(new Runnable() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ExoPlayerImplInternal.this.lambda$sendMessageToTargetThread$1(playerMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessageToTargetThread$1(PlayerMessage playerMessage) {
        try {
            deliverMessage(playerMessage);
        } catch (ExoPlaybackException e) {
            Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private void deliverMessage(PlayerMessage playerMessage) {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void resolvePendingMessagePositions(Timeline timeline, Timeline timeline2) {
        if (timeline.isEmpty() && timeline2.isEmpty()) {
            return;
        }
        for (int size = this.pendingMessages.size() - 1; size >= 0; size--) {
            if (!resolvePendingMessagePosition(this.pendingMessages.get(size), timeline, timeline2, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
        }
        Collections.sort(this.pendingMessages);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0095 A[LOOP:1: B:29:0x0079->B:39:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0078 -> B:29:0x0079). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void maybeTriggerPendingMessages(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.maybeTriggerPendingMessages(long, long):void");
    }

    private void ensureStopped(Renderer renderer) {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private void disableRenderer(Renderer renderer) {
        if (isRendererEnabled(renderer)) {
            this.mediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
            this.enabledRendererCount--;
        }
    }

    private void reselectTracksInternalAndSeek() {
        reselectTracksInternal();
        seekToCurrentPosition(true);
    }

    private void reselectTracksInternal() {
        float f = this.mediaClock.getPlaybackParameters().speed;
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z = true;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null && playingPeriod.prepared; playingPeriod = playingPeriod.getNext()) {
            TrackSelectorResult selectTracks = playingPeriod.selectTracks(f, this.playbackInfo.timeline);
            if (selectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (playingPeriod == readingPeriod) {
                    z = false;
                }
            } else {
                if (z) {
                    MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    boolean removeAfter = this.queue.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.renderers.length];
                    long applyTrackSelection = playingPeriod2.applyTrackSelection(selectTracks, this.playbackInfo.positionUs, removeAfter, zArr);
                    PlaybackInfo playbackInfo = this.playbackInfo;
                    boolean z2 = (playbackInfo.playbackState == 4 || applyTrackSelection == playbackInfo.positionUs) ? false : true;
                    PlaybackInfo playbackInfo2 = this.playbackInfo;
                    this.playbackInfo = handlePositionDiscontinuity(playbackInfo2.periodId, applyTrackSelection, playbackInfo2.requestedContentPositionUs, playbackInfo2.discontinuityStartPositionUs, z2, 5);
                    if (z2) {
                        resetRendererPosition(applyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i = 0;
                    while (true) {
                        Renderer[] rendererArr = this.renderers;
                        if (i >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i];
                        boolean isRendererEnabled = isRendererEnabled(renderer);
                        zArr2[i] = isRendererEnabled;
                        SampleStream sampleStream = playingPeriod2.sampleStreams[i];
                        if (isRendererEnabled) {
                            if (sampleStream != renderer.getStream()) {
                                disableRenderer(renderer);
                            } else if (zArr[i]) {
                                renderer.resetPosition(this.rendererPositionUs);
                            }
                        }
                        i++;
                    }
                    enableRenderers(zArr2, this.rendererPositionUs);
                } else {
                    this.queue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        playingPeriod.applyTrackSelection(selectTracks, Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs)), false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
        }
    }

    private void updateTrackSelectionPlaybackSpeed(float f) {
        ExoTrackSelection[] exoTrackSelectionArr;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f);
                }
            }
        }
    }

    private void notifyTrackSelectionDiscontinuity() {
        ExoTrackSelection[] exoTrackSelectionArr;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private boolean shouldTransitionToReadyState(boolean z) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        if (z) {
            if (this.playbackInfo.isLoading) {
                MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
                long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, playingPeriod.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : -9223372036854775807L;
                MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
                return (loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal) || (loadingPeriod.info.id.isAd() && !loadingPeriod.prepared) || this.loadControl.shouldStartPlayback(this.playbackInfo.timeline, playingPeriod.info.id, getTotalBufferedDurationUs(), this.mediaClock.getPlaybackParameters().speed, this.isRebuffering, targetLiveOffsetUs);
            }
            return true;
        }
        return false;
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = playingPeriod.info.durationUs;
        return playingPeriod.prepared && (j == -9223372036854775807L || this.playbackInfo.positionUs < j || !shouldPlayWhenReady());
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void handleMediaSourceListInfoRefreshed(androidx.media3.common.Timeline r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.handleMediaSourceListInfoRefreshed(androidx.media3.common.Timeline, boolean):void");
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j, boolean z) {
        if (!shouldUseLivePlaybackSpeedControl(timeline, mediaPeriodId)) {
            PlaybackParameters playbackParameters = mediaPeriodId.isAd() ? PlaybackParameters.DEFAULT : this.playbackInfo.playbackParameters;
            if (this.mediaClock.getPlaybackParameters().equals(playbackParameters)) {
                return;
            }
            setMediaClockPlaybackParameters(playbackParameters);
            handlePlaybackParameters(this.playbackInfo.playbackParameters, playbackParameters.speed, false, false);
            return;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        this.livePlaybackSpeedControl.setLiveConfiguration((MediaItem.LiveConfiguration) Util.castNonNull(this.window.liveConfiguration));
        if (j != -9223372036854775807L) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(timeline, mediaPeriodId.periodUid, j));
            return;
        }
        if (!Util.areEqual(!timeline2.isEmpty() ? timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period).windowIndex, this.window).uid : null, this.window.uid) || z) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(-9223372036854775807L);
        }
    }

    private long getMaxRendererReadPositionUs() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return 0L;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.prepared) {
            return rendererOffset;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return rendererOffset;
            }
            if (isRendererEnabled(rendererArr[i]) && this.renderers[i].getStream() == readingPeriod.sampleStreams[i]) {
                long readingPositionUs = this.renderers[i].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i++;
        }
    }

    private void updatePeriods() {
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared()) {
            return;
        }
        maybeUpdateLoadingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
    }

    private void maybeUpdateLoadingPeriod() {
        MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            MediaPeriodHolder enqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(this.rendererCapabilities, this.trackSelector, this.loadControl.getAllocator(), this.mediaSourceList, nextMediaPeriodInfo, this.emptyTrackSelectorResult);
            enqueueNextMediaPeriodHolder.mediaPeriod.prepare(this, nextMediaPeriodInfo.startPositionUs);
            if (this.queue.getPlayingPeriod() == enqueueNextMediaPeriodHolder) {
                resetRendererPosition(nextMediaPeriodInfo.startPositionUs);
            }
            handleLoadingMediaPeriodChanged(false);
        }
        if (this.shouldContinueLoading) {
            this.shouldContinueLoading = isLoadingPossible();
            updateIsLoading();
            return;
        }
        maybeContinueLoading();
    }

    private void maybeUpdateReadingPeriod() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i = 0;
        if (readingPeriod.getNext() == null || this.pendingPauseAtEndOfPeriod) {
            if (!readingPeriod.info.isFinal && !this.pendingPauseAtEndOfPeriod) {
                return;
            }
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i >= rendererArr.length) {
                    return;
                }
                Renderer renderer = rendererArr[i];
                SampleStream sampleStream = readingPeriod.sampleStreams[i];
                if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd() && shouldAllowSettingCurrentStreamFinal(renderer)) {
                    long j = readingPeriod.info.durationUs;
                    setCurrentStreamFinal(renderer, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.info.durationUs);
                }
                i++;
            }
        } else if (hasReadingPeriodFinishedReading()) {
            if (readingPeriod.getNext().prepared || this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime()) {
                TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                MediaPeriodHolder advanceReadingPeriod = this.queue.advanceReadingPeriod();
                TrackSelectorResult trackSelectorResult2 = advanceReadingPeriod.getTrackSelectorResult();
                Timeline timeline = this.playbackInfo.timeline;
                updatePlaybackSpeedSettingsForNewPeriod(timeline, advanceReadingPeriod.info.id, timeline, readingPeriod.info.id, -9223372036854775807L, false);
                if (advanceReadingPeriod.prepared && advanceReadingPeriod.mediaPeriod.readDiscontinuity() != -9223372036854775807L) {
                    setAllRendererStreamsFinal(advanceReadingPeriod.getStartPositionRendererTime());
                    if (advanceReadingPeriod.isFullyBuffered()) {
                        return;
                    }
                    this.queue.removeAfter(advanceReadingPeriod);
                    handleLoadingMediaPeriodChanged(false);
                    maybeContinueLoading();
                    return;
                }
                for (int i2 = 0; i2 < this.renderers.length; i2++) {
                    boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i2);
                    boolean isRendererEnabled2 = trackSelectorResult2.isRendererEnabled(i2);
                    if (isRendererEnabled && !this.renderers[i2].isCurrentStreamFinal()) {
                        boolean z = this.rendererCapabilities[i2].getTrackType() == -2;
                        RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i2];
                        RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i2];
                        if (!isRendererEnabled2 || !rendererConfiguration2.equals(rendererConfiguration) || z) {
                            setCurrentStreamFinal(this.renderers[i2], advanceReadingPeriod.getStartPositionRendererTime());
                        }
                    }
                }
            }
        }
    }

    private void maybeUpdateReadingRenderers() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null || this.queue.getPlayingPeriod() == readingPeriod || readingPeriod.allRenderersInCorrectState || !replaceStreamsOrDisableRendererForTransition()) {
            return;
        }
        enableRenderers();
    }

    private boolean replaceStreamsOrDisableRendererForTransition() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i = 0;
        boolean z = false;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return !z;
            }
            Renderer renderer = rendererArr[i];
            if (isRendererEnabled(renderer)) {
                boolean z2 = renderer.getStream() != readingPeriod.sampleStreams[i];
                if (!trackSelectorResult.isRendererEnabled(i) || z2) {
                    if (!renderer.isCurrentStreamFinal()) {
                        renderer.replaceStream(getFormats(trackSelectorResult.selections[i]), readingPeriod.sampleStreams[i], readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset(), readingPeriod.info.id);
                        if (this.offloadSchedulingEnabled) {
                            setOffloadSchedulingEnabled(false);
                        }
                    } else if (renderer.isEnded()) {
                        disableRenderer(renderer);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    private void maybeUpdatePlayingPeriod() {
        boolean z;
        boolean z2 = false;
        while (shouldAdvancePlayingPeriod()) {
            if (z2) {
                maybeNotifyPlaybackInfoChanged();
            }
            MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.advancePlayingPeriod());
            if (this.playbackInfo.periodId.periodUid.equals(mediaPeriodHolder.info.id.periodUid)) {
                MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
                if (mediaPeriodId.adGroupIndex == -1) {
                    MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodHolder.info.id;
                    if (mediaPeriodId2.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex != mediaPeriodId2.nextAdGroupIndex) {
                        z = true;
                        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
                        MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodInfo.id;
                        long j = mediaPeriodInfo.startPositionUs;
                        this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId3, j, mediaPeriodInfo.requestedContentPositionUs, j, !z, 0);
                        resetPendingPauseAtEndOfPeriod();
                        updatePlaybackPositions();
                        allowRenderersToRenderStartOfStreams();
                        z2 = true;
                    }
                }
            }
            z = false;
            MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.info;
            MediaSource.MediaPeriodId mediaPeriodId32 = mediaPeriodInfo2.id;
            long j2 = mediaPeriodInfo2.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId32, j2, mediaPeriodInfo2.requestedContentPositionUs, j2, !z, 0);
            resetPendingPauseAtEndOfPeriod();
            updatePlaybackPositions();
            allowRenderersToRenderStartOfStreams();
            z2 = true;
        }
    }

    private void maybeUpdateOffloadScheduling() {
        boolean z;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            while (true) {
                if (i >= this.renderers.length) {
                    z = true;
                    break;
                }
                if (trackSelectorResult.isRendererEnabled(i)) {
                    if (this.renderers[i].getTrackType() != 1) {
                        z = false;
                        break;
                    } else if (trackSelectorResult.rendererConfigurations[i].offloadModePreferred != 0) {
                        z3 = true;
                    }
                }
                i++;
            }
            if (z3 && z) {
                z2 = true;
            }
            setOffloadSchedulingEnabled(z2);
        }
    }

    private void allowRenderersToRenderStartOfStreams() {
        TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (trackSelectorResult.isRendererEnabled(i)) {
                this.renderers[i].enableMayRenderStartOfStream();
            }
        }
    }

    private void resetPendingPauseAtEndOfPeriod() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private boolean shouldAdvancePlayingPeriod() {
        MediaPeriodHolder playingPeriod;
        MediaPeriodHolder next;
        return shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (playingPeriod = this.queue.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.rendererPositionUs >= next.getStartPositionRendererTime() && next.allRenderersInCorrectState;
    }

    private boolean hasReadingPeriodFinishedReading() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod.prepared) {
            int i = 0;
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i >= rendererArr.length) {
                    return true;
                }
                Renderer renderer = rendererArr[i];
                SampleStream sampleStream = readingPeriod.sampleStreams[i];
                if (renderer.getStream() != sampleStream || (sampleStream != null && !renderer.hasReadStreamToEnd() && !hasReachedServerSideInsertedAdsTransition(renderer, readingPeriod))) {
                    break;
                }
                i++;
            }
            return false;
        }
        return false;
    }

    private boolean hasReachedServerSideInsertedAdsTransition(Renderer renderer, MediaPeriodHolder mediaPeriodHolder) {
        MediaPeriodHolder next = mediaPeriodHolder.getNext();
        return mediaPeriodHolder.info.isFollowedByTransitionToSameStream && next.prepared && ((renderer instanceof TextRenderer) || (renderer instanceof MetadataRenderer) || renderer.getReadingPositionUs() >= next.getStartPositionRendererTime());
    }

    private void setAllRendererStreamsFinal(long j) {
        Renderer[] rendererArr;
        for (Renderer renderer : this.renderers) {
            if (renderer.getStream() != null) {
                setCurrentStreamFinal(renderer, j);
            }
        }
    }

    private void setCurrentStreamFinal(Renderer renderer, long j) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(j);
        }
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.handlePrepared(this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.timeline);
            updateLoadControlTrackSelection(loadingPeriod.info.id, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
            if (loadingPeriod == this.queue.getPlayingPeriod()) {
                resetRendererPosition(loadingPeriod.info.startPositionUs);
                enableRenderers();
                PlaybackInfo playbackInfo = this.playbackInfo;
                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
                long j = loadingPeriod.info.startPositionUs;
                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j, playbackInfo.requestedContentPositionUs, j, false, 5);
            }
            maybeContinueLoading();
        }
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        }
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, boolean z) {
        handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, z);
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, float f, boolean z, boolean z2) {
        Renderer[] rendererArr;
        if (z) {
            if (z2) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (Renderer renderer : this.renderers) {
            if (renderer != null) {
                renderer.setPlaybackSpeed(f, playbackParameters.speed);
            }
        }
    }

    private void maybeContinueLoading() {
        maybeSeekToInitialPosition();
        boolean shouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = shouldContinueLoading;
        if (shouldContinueLoading) {
            this.queue.getLoadingPeriod().continueLoading(this.rendererPositionUs, this.mediaClock.getPlaybackParameters().speed, this.lastRebufferRealtimeMs);
        }
        updateIsLoading();
    }

    private void maybeSeekToInitialPosition() {
        Pair<Object, Long> resolveSeekPositionUs;
        SeekPosition seekPosition = this.pendingInitialSeekPosition;
        if (seekPosition == null || (resolveSeekPositionUs = resolveSeekPositionUs(this.playbackInfo.timeline, seekPosition, false, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) == null) {
            return;
        }
        Long l = (Long) resolveSeekPositionUs.second;
        if (l != null && l.longValue() > 0) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            if (!loadingPeriod.prepared) {
                return;
            }
            long adjustedSeekPositionUs = loadingPeriod.mediaPeriod.getAdjustedSeekPositionUs(l.longValue(), this.seekParameters);
            if (adjustedSeekPositionUs == -1) {
                return;
            }
            Log.d("NFLX", "resetRendererPosition to initialSeekPosition " + l + " => " + adjustedSeekPositionUs);
            if (l.longValue() != adjustedSeekPositionUs) {
                loadingPeriod.mediaPeriod.seekToUs(adjustedSeekPositionUs);
                resetRendererPosition(adjustedSeekPositionUs);
            }
        }
        this.pendingInitialSeekPosition = null;
    }

    private boolean shouldAllowSettingCurrentStreamFinal(Renderer renderer) {
        if (renderer == null || renderer.getTrackType() != 3) {
            return true;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return false;
            }
            Renderer renderer2 = rendererArr[i];
            if (renderer2 != null && isRendererEnabled(renderer2) && this.renderers[i].isCurrentStreamFinal()) {
                return true;
            }
            i++;
        }
    }

    private boolean shouldContinueLoading() {
        long periodTime;
        if (isLoadingPossible()) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
            if (loadingPeriod == this.queue.getPlayingPeriod()) {
                periodTime = loadingPeriod.toPeriodTime(this.rendererPositionUs);
            } else {
                periodTime = loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs;
            }
            long j = periodTime;
            boolean shouldContinueLoading = this.loadControl.shouldContinueLoading(j, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed);
            if (shouldContinueLoading || totalBufferedDurationUs >= 500000) {
                return shouldContinueLoading;
            }
            if (this.backBufferDurationUs > 0 || this.retainBackBufferFromKeyframe) {
                this.queue.getPlayingPeriod().mediaPeriod.discardBuffer(this.playbackInfo.positionUs, false);
                return this.loadControl.shouldContinueLoading(j, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed);
            }
            return shouldContinueLoading;
        }
        return false;
    }

    private boolean isLoadingPossible() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        return (loadingPeriod == null || loadingPeriod.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private void updateIsLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (z != playbackInfo.isLoading) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PlaybackInfo handlePositionDiscontinuity(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, boolean z, int i) {
        List list;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        TrackGroupArray trackGroups;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j == this.playbackInfo.positionUs && mediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        PlaybackInfo playbackInfo = this.playbackInfo;
        TrackGroupArray trackGroupArray2 = playbackInfo.trackGroups;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        List list2 = playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod == null) {
                trackGroups = TrackGroupArray.EMPTY;
            } else {
                trackGroups = playingPeriod.getTrackGroups();
            }
            TrackSelectorResult trackSelectorResult3 = playingPeriod == null ? this.emptyTrackSelectorResult : playingPeriod.getTrackSelectorResult();
            List extractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult3.selections);
            if (playingPeriod != null) {
                MediaPeriodInfo mediaPeriodInfo = playingPeriod.info;
                if (mediaPeriodInfo.requestedContentPositionUs != j2) {
                    playingPeriod.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(j2);
                }
            }
            maybeUpdateOffloadScheduling();
            trackGroupArray = trackGroups;
            trackSelectorResult = trackSelectorResult3;
            list = extractMetadataFromTrackSelectionArray;
        } else if (mediaPeriodId.equals(this.playbackInfo.periodId)) {
            list = list2;
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult2;
        } else {
            trackGroupArray = TrackGroupArray.EMPTY;
            trackSelectorResult = this.emptyTrackSelectorResult;
            list = ImmutableList.of();
        }
        if (z) {
            this.playbackInfoUpdate.setPositionDiscontinuity(i);
        }
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j, j2, j3, getTotalBufferedDurationUs(), trackGroupArray, trackSelectorResult, list);
    }

    private ImmutableList<Metadata> extractMetadataFromTrackSelectionArray(ExoTrackSelection[] exoTrackSelectionArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        boolean z = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                Metadata metadata = exoTrackSelection.getFormat(0).metadata;
                if (metadata == null) {
                    builder.add((ImmutableList.Builder) new Metadata(new Metadata.Entry[0]));
                } else {
                    builder.add((ImmutableList.Builder) metadata);
                    z = true;
                }
            }
        }
        return z ? builder.build() : ImmutableList.of();
    }

    private void enableRenderers() {
        enableRenderers(new boolean[this.renderers.length], this.queue.getReadingPeriod().getStartPositionRendererTime());
    }

    private void enableRenderers(boolean[] zArr, long j) {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (!trackSelectorResult.isRendererEnabled(i) && this.renderersToReset.remove(this.renderers[i])) {
                this.renderers[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.renderers.length; i2++) {
            if (trackSelectorResult.isRendererEnabled(i2)) {
                enableRenderer(i2, zArr[i2], j);
            }
        }
        readingPeriod.allRenderersInCorrectState = true;
    }

    private void enableRenderer(int i, boolean z, long j) {
        Renderer renderer = this.renderers[i];
        if (isRendererEnabled(renderer)) {
            return;
        }
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z2 = readingPeriod == this.queue.getPlayingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i];
        Format[] formats = getFormats(trackSelectorResult.selections[i]);
        boolean z3 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z4 = !z && z3;
        this.enabledRendererCount++;
        this.renderersToReset.add(renderer);
        renderer.enable(rendererConfiguration, formats, readingPeriod.sampleStreams[i], this.rendererPositionUs, z4, z2, j, readingPeriod.getRendererOffset(), readingPeriod.info.id);
        renderer.handleMessage(11, new Renderer.WakeupListener() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal.1
            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onSleep() {
                ExoPlayerImplInternal.this.requestForRendererSleep = true;
            }

            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onWakeup() {
                ExoPlayerImplInternal.this.handler.sendEmptyMessage(2);
            }
        });
        this.mediaClock.onRendererEnabled(renderer);
        if (z3) {
            renderer.start();
        }
    }

    private void releaseRenderers() {
        for (int i = 0; i < this.renderers.length; i++) {
            this.rendererCapabilities[i].clearListener();
            this.renderers[i].release();
        }
    }

    private void handleLoadingMediaPeriodChanged(boolean z) {
        long bufferedPositionUs;
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.id;
        boolean z2 = !this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (z2) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (loadingPeriod == null) {
            bufferedPositionUs = playbackInfo.positionUs;
        } else {
            bufferedPositionUs = loadingPeriod.getBufferedPositionUs();
        }
        playbackInfo.bufferedPositionUs = bufferedPositionUs;
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((z2 || z) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.info.id, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private long getTotalBufferedDurationUs(long j) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void updateLoadControlTrackSelection(MediaSource.MediaPeriodId mediaPeriodId, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this.loadControl.onTracksSelected(this.playbackInfo.timeline, mediaPeriodId, this.renderers, trackGroupArray, trackSelectorResult.selections);
    }

    private boolean shouldPlayWhenReady() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.playWhenReady && playbackInfo.playbackSuppressionReason == 0;
    }

    private static PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(Timeline timeline, PlaybackInfo playbackInfo, SeekPosition seekPosition, MediaPeriodQueue mediaPeriodQueue, int i, boolean z, Timeline.Window window, Timeline.Period period) {
        long j;
        MediaSource.MediaPeriodId mediaPeriodId;
        int i2;
        MediaSource.MediaPeriodId mediaPeriodId2;
        int i3;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        MediaPeriodQueue mediaPeriodQueue2;
        long j3;
        int i6;
        if (timeline.isEmpty()) {
            return new PositionUpdateForPlaylistChange(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L, -9223372036854775807L, false, true, false);
        }
        MediaSource.MediaPeriodId mediaPeriodId3 = playbackInfo.periodId;
        Object obj = mediaPeriodId3.periodUid;
        boolean isUsingPlaceholderPeriod = isUsingPlaceholderPeriod(playbackInfo, period);
        if (playbackInfo.periodId.isAd() || isUsingPlaceholderPeriod) {
            j = playbackInfo.requestedContentPositionUs;
        } else {
            j = playbackInfo.positionUs;
        }
        long j4 = j;
        boolean z8 = false;
        if (seekPosition != null) {
            mediaPeriodId = mediaPeriodId3;
            i2 = -1;
            Pair<Object, Long> resolveSeekPositionUs = resolveSeekPositionUs(timeline, seekPosition, true, i, z, window, period);
            if (resolveSeekPositionUs == null) {
                i5 = timeline.getFirstWindowIndex(z);
                j2 = j4;
                z5 = true;
                z6 = false;
                z7 = false;
                z4 = z6;
                z2 = z7;
                z3 = z5;
                i3 = i5;
                mediaPeriodId2 = mediaPeriodId;
            } else {
                if (seekPosition.windowPositionUs == -9223372036854775807L) {
                    i5 = timeline.getPeriodByUid(resolveSeekPositionUs.first, period).windowIndex;
                    j2 = j4;
                    z6 = false;
                } else {
                    obj = resolveSeekPositionUs.first;
                    j2 = ((Long) resolveSeekPositionUs.second).longValue();
                    i5 = -1;
                    z6 = true;
                }
                z7 = playbackInfo.playbackState == 4;
                z5 = false;
                z4 = z6;
                z2 = z7;
                z3 = z5;
                i3 = i5;
                mediaPeriodId2 = mediaPeriodId;
            }
        } else {
            mediaPeriodId = mediaPeriodId3;
            i2 = -1;
            if (playbackInfo.timeline.isEmpty()) {
                i4 = timeline.getFirstWindowIndex(z);
            } else if (timeline.getIndexOfPeriod(obj) == -1) {
                Object resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i, z, obj, playbackInfo.timeline, timeline);
                if (resolveSubsequentPeriod == null) {
                    i5 = timeline.getFirstWindowIndex(z);
                    z5 = true;
                } else {
                    i5 = timeline.getPeriodByUid(resolveSubsequentPeriod, period).windowIndex;
                    z5 = false;
                }
                j2 = j4;
                z6 = false;
                z7 = false;
                z4 = z6;
                z2 = z7;
                z3 = z5;
                i3 = i5;
                mediaPeriodId2 = mediaPeriodId;
            } else if (j4 == -9223372036854775807L) {
                i4 = timeline.getPeriodByUid(obj, period).windowIndex;
            } else if (isUsingPlaceholderPeriod) {
                mediaPeriodId2 = mediaPeriodId;
                playbackInfo.timeline.getPeriodByUid(mediaPeriodId2.periodUid, period);
                if (playbackInfo.timeline.getWindow(period.windowIndex, window).firstPeriodIndex == playbackInfo.timeline.getIndexOfPeriod(mediaPeriodId2.periodUid)) {
                    Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(obj, period).windowIndex, j4 + period.getPositionInWindowUs());
                    obj = periodPositionUs.first;
                    j2 = ((Long) periodPositionUs.second).longValue();
                } else {
                    j2 = j4;
                }
                i3 = -1;
                z4 = true;
                z2 = false;
                z3 = false;
            } else {
                mediaPeriodId2 = mediaPeriodId;
                i3 = -1;
                j2 = j4;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            i5 = i4;
            j2 = j4;
            z6 = false;
            z7 = false;
            z5 = false;
            z4 = z6;
            z2 = z7;
            z3 = z5;
            i3 = i5;
            mediaPeriodId2 = mediaPeriodId;
        }
        if (i3 != i2) {
            Pair<Object, Long> periodPositionUs2 = timeline.getPeriodPositionUs(window, period, i3, -9223372036854775807L);
            obj = periodPositionUs2.first;
            j2 = ((Long) periodPositionUs2.second).longValue();
            mediaPeriodQueue2 = mediaPeriodQueue;
            j3 = -9223372036854775807L;
        } else {
            mediaPeriodQueue2 = mediaPeriodQueue;
            j3 = j2;
        }
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue2.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, obj, j2);
        int i7 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex;
        boolean z9 = i7 == i2 || ((i6 = mediaPeriodId2.nextAdGroupIndex) != i2 && i7 >= i6);
        if (mediaPeriodId2.periodUid.equals(obj) && !mediaPeriodId2.isAd() && !resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd() && z9) {
            z8 = true;
        }
        Object obj2 = mediaPeriodId2;
        boolean isIgnorableServerSideAdInsertionPeriodChange = isIgnorableServerSideAdInsertionPeriodChange(isUsingPlaceholderPeriod, mediaPeriodId2, j4, resolveMediaPeriodIdForAdsAfterPeriodPositionChange, timeline.getPeriodByUid(obj, period), j3);
        if (z8 || isIgnorableServerSideAdInsertionPeriodChange) {
            resolveMediaPeriodIdForAdsAfterPeriodPositionChange = obj2;
        }
        if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(obj2)) {
                j2 = playbackInfo.positionUs;
            } else {
                timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, period);
                j2 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) ? period.getAdResumePositionUs() : 0L;
            }
        }
        return new PositionUpdateForPlaylistChange(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, j2, j3, z2, z3, z4);
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z, MediaSource.MediaPeriodId mediaPeriodId, long j, MediaSource.MediaPeriodId mediaPeriodId2, Timeline.Period period, long j2) {
        if (!z && j == j2 && mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid)) {
            return (mediaPeriodId.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex)) ? (period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 4 || period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 2) ? false : true : mediaPeriodId2.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId2.adGroupIndex);
        }
        return false;
    }

    private static boolean isUsingPlaceholderPeriod(PlaybackInfo playbackInfo, Timeline.Period period) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        Timeline timeline = playbackInfo.timeline;
        return timeline.isEmpty() || timeline.getPeriodByUid(mediaPeriodId.periodUid, period).isPlaceholder;
    }

    private void updateRebufferingState(boolean z, boolean z2) {
        this.isRebuffering = z;
        this.lastRebufferRealtimeMs = z2 ? -9223372036854775807L : this.clock.elapsedRealtime();
    }

    private static boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo, Timeline timeline, Timeline timeline2, int i, boolean z, Timeline.Window window, Timeline.Period period) {
        Object obj = pendingMessageInfo.resolvedPeriodUid;
        if (obj == null) {
            Pair<Object, Long> resolveSeekPositionUs = resolveSeekPositionUs(timeline, new SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getMediaItemIndex(), pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE ? -9223372036854775807L : Util.msToUs(pendingMessageInfo.message.getPositionMs())), false, i, z, window, period);
            if (resolveSeekPositionUs == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(resolveSeekPositionUs.first), ((Long) resolveSeekPositionUs.second).longValue(), resolveSeekPositionUs.first);
            if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            }
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            return true;
        }
        pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        timeline2.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period);
        if (period.isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(pendingMessageInfo.resolvedPeriodUid)) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, pendingMessageInfo.resolvedPeriodTimeUs + period.getPositionInWindowUs());
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(periodPositionUs.first), ((Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    private static void resolvePendingMessageEndOfStreamPosition(Timeline timeline, PendingMessageInfo pendingMessageInfo, Timeline.Window window, Timeline.Period period) {
        int i = timeline.getWindow(timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, window).lastPeriodIndex;
        Object obj = timeline.getPeriod(i, period, true).uid;
        long j = period.durationUs;
        pendingMessageInfo.setResolvedPosition(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    private static Pair<Object, Long> resolveSeekPositionUs(Timeline timeline, SeekPosition seekPosition, boolean z, int i, boolean z2, Timeline.Window window, Timeline.Period period) {
        Pair<Object, Long> periodPositionUs;
        Object resolveSubsequentPeriod;
        Timeline timeline2 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        Timeline timeline3 = timeline2.isEmpty() ? timeline : timeline2;
        try {
            periodPositionUs = timeline3.getPeriodPositionUs(window, period, seekPosition.windowIndex, seekPosition.windowPositionUs);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (timeline.equals(timeline3)) {
            return periodPositionUs;
        }
        if (timeline.getIndexOfPeriod(periodPositionUs.first) != -1) {
            return (timeline3.getPeriodByUid(periodPositionUs.first, period).isPlaceholder && timeline3.getWindow(period.windowIndex, window).firstPeriodIndex == timeline3.getIndexOfPeriod(periodPositionUs.first)) ? timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(periodPositionUs.first, period).windowIndex, seekPosition.windowPositionUs) : periodPositionUs;
        }
        if (z && (resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i, z2, periodPositionUs.first, timeline3, timeline)) != null) {
            return timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(resolveSubsequentPeriod, period).windowIndex, -9223372036854775807L);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object resolveSubsequentPeriod(Timeline.Window window, Timeline.Period period, int i, boolean z, Object obj, Timeline timeline, Timeline timeline2) {
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int i2 = indexOfPeriod;
        int i3 = -1;
        for (int i4 = 0; i4 < periodCount && i3 == -1; i4++) {
            i2 = timeline.getNextPeriodIndex(i2, period, window, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return timeline2.getUidOfPeriod(i3);
    }

    private static Format[] getFormats(ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = exoTrackSelection.getFormat(i);
        }
        return formatArr;
    }

    private static boolean isRendererEnabled(Renderer renderer) {
        return renderer.getState() != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i, long j) {
            this.timeline = timeline;
            this.windowIndex = i;
            this.windowPositionUs = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j;
            this.requestedContentPositionUs = j2;
            this.forceBufferingState = z;
            this.endPlayback = z2;
            this.setTargetLiveOffset = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public Object resolvedPeriodUid;

        public void setResolvedPosition(int i, long j, Object obj) {
            this.resolvedPeriodIndex = i;
            this.resolvedPeriodTimeUs = j;
            this.resolvedPeriodUid = obj;
        }

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        @Override // java.lang.Comparable
        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
                return i != 0 ? i : Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MediaSourceListUpdateMessage {
        private final List<MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder, int i, long j) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder;
            this.windowIndex = i;
            this.positionUs = j;
        }
    }
}