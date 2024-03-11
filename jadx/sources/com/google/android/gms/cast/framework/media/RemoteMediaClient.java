package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.internal.zzap;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.cast.zzcv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class RemoteMediaClient implements Cast.MessageReceivedCallback {
    public static final String NAMESPACE = zzap.zzb;
    private final zzap zzd;
    private final zzbf zze;
    @NotOnlyInitialized
    private final MediaQueue zzf;
    private com.google.android.gms.cast.zzr zzg;
    private ParseAdsInfoCallback zzk;
    private final List zzh = new CopyOnWriteArrayList();
    @VisibleForTesting
    final List zza = new CopyOnWriteArrayList();
    private final Map zzi = new ConcurrentHashMap();
    private final Map zzj = new ConcurrentHashMap();
    private final Object zzb = new Object();
    private final Handler zzc = new zzcv(Looper.getMainLooper());

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public void onAdBreakStatusUpdated() {
        }

        public void onMediaError(MediaError mediaError) {
        }

        public void onMetadataUpdated() {
        }

        public void onPreloadStatusUpdated() {
        }

        public void onQueueStatusUpdated() {
        }

        public void onSendingRemoteMediaRequest() {
        }

        public void onStatusUpdated() {
        }

        public void zza(int[] iArr) {
        }

        public void zzb(int[] iArr, int i) {
        }

        public void zzc(MediaQueueItem[] mediaQueueItemArr) {
        }

        public void zzd(int[] iArr) {
        }

        public void zze(List list, List list2, int i) {
        }

        public void zzf(int[] iArr) {
        }

        public void zzg() {
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface Listener {
        void onAdBreakStatusUpdated();

        void onMetadataUpdated();

        void onPreloadStatusUpdated();

        void onQueueStatusUpdated();

        void onSendingRemoteMediaRequest();

        void onStatusUpdated();
    }

    /* loaded from: classes2.dex */
    public interface MediaChannelResult extends Result {
    }

    /* loaded from: classes2.dex */
    public interface ParseAdsInfoCallback {
        List<AdBreakInfo> parseAdBreaksFromMediaStatus(MediaStatus mediaStatus);

        boolean parseIsPlayingAdFromMediaStatus(MediaStatus mediaStatus);
    }

    /* loaded from: classes2.dex */
    public interface ProgressListener {
        void onProgressUpdated(long j, long j2);
    }

    public RemoteMediaClient(zzap zzapVar) {
        zzbf zzbfVar = new zzbf(this);
        this.zze = zzbfVar;
        zzap zzapVar2 = (zzap) Preconditions.checkNotNull(zzapVar);
        this.zzd = zzapVar2;
        zzapVar2.zzS(new zzbn(this, null));
        zzapVar2.zzh(zzbfVar);
        this.zzf = new MediaQueue(this, 20, 20);
    }

    public static PendingResult zzd(int i, String str) {
        zzbh zzbhVar = new zzbh();
        zzbhVar.setResult(new zzbg(zzbhVar, new Status(i, str)));
        return zzbhVar;
    }

    public static /* synthetic */ void zzl(RemoteMediaClient remoteMediaClient) {
        Set set;
        for (zzbp zzbpVar : remoteMediaClient.zzj.values()) {
            if (!remoteMediaClient.hasMediaSession() || zzbpVar.zzi()) {
                if (!remoteMediaClient.hasMediaSession() && zzbpVar.zzi()) {
                    zzbpVar.zzg();
                }
            } else {
                zzbpVar.zzf();
            }
            if (zzbpVar.zzi() && (remoteMediaClient.isBuffering() || remoteMediaClient.zzp() || remoteMediaClient.isPaused() || remoteMediaClient.isLoadingNextItem())) {
                set = zzbpVar.zzb;
                remoteMediaClient.zzr(set);
            }
        }
    }

    public final void zzr(Set set) {
        MediaInfo media;
        HashSet<ProgressListener> hashSet = new HashSet(set);
        if (isPlaying() || isPaused() || isBuffering() || zzp()) {
            for (ProgressListener progressListener : hashSet) {
                progressListener.onProgressUpdated(getApproximateStreamPosition(), getStreamDuration());
            }
        } else if (isLoadingNextItem()) {
            MediaQueueItem loadingItem = getLoadingItem();
            if (loadingItem == null || (media = loadingItem.getMedia()) == null) {
                return;
            }
            for (ProgressListener progressListener2 : hashSet) {
                progressListener2.onProgressUpdated(0L, media.getStreamDuration());
            }
        } else {
            for (ProgressListener progressListener3 : hashSet) {
                progressListener3.onProgressUpdated(0L, 0L);
            }
        }
    }

    private final boolean zzs() {
        return this.zzg != null;
    }

    private static final zzbk zzt(zzbk zzbkVar) {
        try {
            zzbkVar.zzc();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            zzbkVar.setResult(new zzbj(zzbkVar, new Status(2100)));
        }
        return zzbkVar;
    }

    @Deprecated
    public void addListener(Listener listener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (listener != null) {
            this.zzh.add(listener);
        }
    }

    public boolean addProgressListener(ProgressListener progressListener, long j) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (progressListener == null || this.zzi.containsKey(progressListener)) {
            return false;
        }
        Map map = this.zzj;
        Long valueOf = Long.valueOf(j);
        zzbp zzbpVar = (zzbp) map.get(valueOf);
        if (zzbpVar == null) {
            zzbpVar = new zzbp(this, j);
            this.zzj.put(valueOf, zzbpVar);
        }
        zzbpVar.zzd(progressListener);
        this.zzi.put(progressListener, zzbpVar);
        if (hasMediaSession()) {
            zzbpVar.zzf();
            return true;
        }
        return true;
    }

    public long getApproximateLiveSeekableRangeEnd() {
        long zzk;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzk = this.zzd.zzk();
        }
        return zzk;
    }

    public long getApproximateLiveSeekableRangeStart() {
        long zzl;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzl = this.zzd.zzl();
        }
        return zzl;
    }

    public long getApproximateStreamPosition() {
        long zzm;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzm = this.zzd.zzm();
        }
        return zzm;
    }

    public int getIdleReason() {
        int idleReason;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            MediaStatus mediaStatus = getMediaStatus();
            idleReason = mediaStatus != null ? mediaStatus.getIdleReason() : 0;
        }
        return idleReason;
    }

    public MediaQueueItem getLoadingItem() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.getQueueItemById(mediaStatus.getLoadingItemId());
    }

    public MediaInfo getMediaInfo() {
        MediaInfo zzK;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzK = this.zzd.zzK();
        }
        return zzK;
    }

    public MediaStatus getMediaStatus() {
        MediaStatus zzL;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzL = this.zzd.zzL();
        }
        return zzL;
    }

    public String getNamespace() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzd.zze();
    }

    public int getPlayerState() {
        int playerState;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            MediaStatus mediaStatus = getMediaStatus();
            playerState = mediaStatus != null ? mediaStatus.getPlayerState() : 1;
        }
        return playerState;
    }

    public long getStreamDuration() {
        long zzo;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzo = this.zzd.zzo();
        }
        return zzo;
    }

    public boolean hasMediaSession() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return isBuffering() || zzp() || isPlaying() || isPaused() || isLoadingNextItem();
    }

    public boolean isBuffering() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        return mediaStatus != null && mediaStatus.getPlayerState() == 4;
    }

    public boolean isLiveStream() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaInfo mediaInfo = getMediaInfo();
        return mediaInfo != null && mediaInfo.getStreamType() == 2;
    }

    public boolean isLoadingNextItem() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        return (mediaStatus == null || mediaStatus.getLoadingItemId() == 0) ? false : true;
    }

    public boolean isPaused() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus != null) {
            if (mediaStatus.getPlayerState() == 3) {
                return true;
            }
            if (isLiveStream() && getIdleReason() == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean isPlaying() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        return mediaStatus != null && mediaStatus.getPlayerState() == 2;
    }

    public boolean isPlayingAd() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        return mediaStatus != null && mediaStatus.isPlayingAd();
    }

    @Override // com.google.android.gms.cast.Cast.MessageReceivedCallback
    public void onMessageReceived(CastDevice castDevice, String str, String str2) {
        this.zzd.zzQ(str2);
    }

    public PendingResult<MediaChannelResult> pause() {
        return pause(null);
    }

    public PendingResult<MediaChannelResult> play() {
        return play(null);
    }

    public PendingResult<MediaChannelResult> queueNext(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzs()) {
            return zzd(17, null);
        }
        zzan zzanVar = new zzan(this, jSONObject);
        zzt(zzanVar);
        return zzanVar;
    }

    public PendingResult<MediaChannelResult> queuePrev(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzs()) {
            return zzd(17, null);
        }
        zzam zzamVar = new zzam(this, jSONObject);
        zzt(zzamVar);
        return zzamVar;
    }

    public void registerCallback(Callback callback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (callback != null) {
            this.zza.add(callback);
        }
    }

    @Deprecated
    public void removeListener(Listener listener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (listener != null) {
            this.zzh.remove(listener);
        }
    }

    public void removeProgressListener(ProgressListener progressListener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzbp zzbpVar = (zzbp) this.zzi.remove(progressListener);
        if (zzbpVar != null) {
            zzbpVar.zze(progressListener);
            if (zzbpVar.zzh()) {
                return;
            }
            this.zzj.remove(Long.valueOf(zzbpVar.zzb()));
            zzbpVar.zzg();
        }
    }

    public PendingResult<MediaChannelResult> requestStatus() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzs()) {
            return zzd(17, null);
        }
        zzac zzacVar = new zzac(this);
        zzt(zzacVar);
        return zzacVar;
    }

    @Deprecated
    public PendingResult<MediaChannelResult> seek(long j) {
        return seek(j, 0, null);
    }

    public PendingResult<MediaChannelResult> setActiveMediaTracks(long[] jArr) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzs()) {
            return zzd(17, null);
        }
        zzad zzadVar = new zzad(this, jArr);
        zzt(zzadVar);
        return zzadVar;
    }

    public void togglePlayback() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        int playerState = getPlayerState();
        if (playerState == 4 || playerState == 2) {
            pause();
        } else {
            play();
        }
    }

    public final PendingResult zzg() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzs()) {
            return zzd(17, null);
        }
        zzas zzasVar = new zzas(this, true);
        zzt(zzasVar);
        return zzasVar;
    }

    public final PendingResult zzh(int[] iArr) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzs()) {
            return zzd(17, null);
        }
        zzat zzatVar = new zzat(this, true, iArr);
        zzt(zzatVar);
        return zzatVar;
    }

    public final Task zzi(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (zzs()) {
            SessionState sessionState = null;
            if (((MediaStatus) Preconditions.checkNotNull(getMediaStatus())).isMediaCommandSupported(PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
                return this.zzd.zzN(null);
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            Log.d("RemoteMediaClient", "create SessionState with cached mediaInfo and mediaStatus");
            MediaInfo mediaInfo = getMediaInfo();
            MediaStatus mediaStatus = getMediaStatus();
            if (mediaInfo != null && mediaStatus != null) {
                MediaLoadRequestData.Builder builder = new MediaLoadRequestData.Builder();
                builder.setMediaInfo(mediaInfo);
                builder.setCurrentTime(getApproximateStreamPosition());
                builder.setQueueData(mediaStatus.getQueueData());
                builder.setPlaybackRate(mediaStatus.getPlaybackRate());
                builder.setActiveTrackIds(mediaStatus.getActiveTrackIds());
                builder.setCustomData(mediaStatus.getCustomData());
                MediaLoadRequestData build = builder.build();
                SessionState.Builder builder2 = new SessionState.Builder();
                builder2.setLoadRequestData(build);
                sessionState = builder2.build();
            }
            taskCompletionSource.setResult(sessionState);
            return taskCompletionSource.getTask();
        }
        return Tasks.forException(new com.google.android.gms.cast.internal.zzan());
    }

    public final void zzn() {
        com.google.android.gms.cast.zzr zzrVar = this.zzg;
        if (zzrVar == null) {
            return;
        }
        zzrVar.zzi(getNamespace(), this);
        requestStatus();
    }

    public final void zzo(com.google.android.gms.cast.zzr zzrVar) {
        com.google.android.gms.cast.zzr zzrVar2 = this.zzg;
        if (zzrVar2 == zzrVar) {
            return;
        }
        if (zzrVar2 != null) {
            this.zzd.zzf();
            this.zzf.zzl();
            zzrVar2.zzg(getNamespace());
            this.zze.zzc(null);
            this.zzc.removeCallbacksAndMessages(null);
        }
        this.zzg = zzrVar;
        if (zzrVar != null) {
            this.zze.zzc(zzrVar);
        }
    }

    final boolean zzp() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        return mediaStatus != null && mediaStatus.getPlayerState() == 5;
    }

    public final boolean zzq() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (isLiveStream()) {
            MediaStatus mediaStatus = getMediaStatus();
            return (mediaStatus == null || !mediaStatus.isMediaCommandSupported(2L) || mediaStatus.getLiveSeekableRange() == null) ? false : true;
        }
        return true;
    }

    public PendingResult<MediaChannelResult> pause(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzs()) {
            return zzd(17, null);
        }
        zzax zzaxVar = new zzax(this, jSONObject);
        zzt(zzaxVar);
        return zzaxVar;
    }

    public PendingResult<MediaChannelResult> play(JSONObject jSONObject) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzs()) {
            return zzd(17, null);
        }
        zzaz zzazVar = new zzaz(this, jSONObject);
        zzt(zzazVar);
        return zzazVar;
    }

    @Deprecated
    public PendingResult<MediaChannelResult> seek(long j, int i, JSONObject jSONObject) {
        MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
        builder.setPosition(j);
        builder.setResumeState(i);
        builder.setCustomData(jSONObject);
        return seek(builder.build());
    }

    public PendingResult<MediaChannelResult> seek(MediaSeekOptions mediaSeekOptions) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzs()) {
            return zzd(17, null);
        }
        zzba zzbaVar = new zzba(this, mediaSeekOptions);
        zzt(zzbaVar);
        return zzbaVar;
    }
}
