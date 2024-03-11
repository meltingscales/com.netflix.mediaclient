package com.google.android.gms.cast.framework.media.uicontroller;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zza {
    RemoteMediaClient zza;

    private zza() {
    }

    public static zza zzf() {
        return new zza();
    }

    private final MediaMetadata zzo() {
        MediaInfo mediaInfo;
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession() || (mediaInfo = this.zza.getMediaInfo()) == null) {
            return null;
        }
        return mediaInfo.getMetadata();
    }

    public final int zza() {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession()) {
            return 0;
        }
        RemoteMediaClient remoteMediaClient2 = this.zza;
        if (remoteMediaClient2.isLiveStream() || !remoteMediaClient2.isLoadingNextItem()) {
            int approximateStreamPosition = (int) (remoteMediaClient2.getApproximateStreamPosition() - zze());
            if (remoteMediaClient2.zzq()) {
                approximateStreamPosition = CastUtils.zza(approximateStreamPosition, zzd(), zzc());
            }
            return CastUtils.zza(approximateStreamPosition, 0, zzb());
        }
        return 0;
    }

    public final int zzb() {
        MediaInfo media;
        RemoteMediaClient remoteMediaClient = this.zza;
        long j = 1;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            RemoteMediaClient remoteMediaClient2 = this.zza;
            if (!remoteMediaClient2.isLiveStream()) {
                if (remoteMediaClient2.isLoadingNextItem()) {
                    MediaQueueItem loadingItem = remoteMediaClient2.getLoadingItem();
                    if (loadingItem != null && (media = loadingItem.getMedia()) != null) {
                        j = Math.max(media.getStreamDuration(), 1L);
                    }
                } else {
                    j = Math.max(remoteMediaClient2.getStreamDuration(), 1L);
                }
            } else {
                Long zzi = zzi();
                if (zzi != null) {
                    j = zzi.longValue();
                } else {
                    Long zzg = zzg();
                    if (zzg != null) {
                        j = zzg.longValue();
                    } else {
                        j = Math.max(remoteMediaClient2.getApproximateStreamPosition(), 1L);
                    }
                }
            }
        }
        return Math.max((int) (j - zze()), 1);
    }

    public final int zzc() {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession() || !this.zza.isLiveStream()) {
            return zzb();
        }
        if (this.zza.zzq()) {
            return CastUtils.zza((int) (((Long) Preconditions.checkNotNull(zzg())).longValue() - zze()), 0, zzb());
        }
        return 0;
    }

    public final int zzd() {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && this.zza.isLiveStream() && this.zza.zzq()) {
            return CastUtils.zza((int) (((Long) Preconditions.checkNotNull(zzh())).longValue() - zze()), 0, zzb());
        }
        return 0;
    }

    public final long zze() {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && this.zza.isLiveStream()) {
            RemoteMediaClient remoteMediaClient2 = this.zza;
            Long zzj = zzj();
            if (zzj != null) {
                return zzj.longValue();
            }
            Long zzh = zzh();
            if (zzh != null) {
                return zzh.longValue();
            }
            return remoteMediaClient2.getApproximateStreamPosition();
        }
        return 0L;
    }

    final Long zzg() {
        RemoteMediaClient remoteMediaClient;
        MediaStatus mediaStatus;
        RemoteMediaClient remoteMediaClient2 = this.zza;
        if (remoteMediaClient2 == null || !remoteMediaClient2.hasMediaSession() || !this.zza.isLiveStream() || !this.zza.zzq() || (mediaStatus = (remoteMediaClient = this.zza).getMediaStatus()) == null || mediaStatus.getLiveSeekableRange() == null) {
            return null;
        }
        return Long.valueOf(remoteMediaClient.getApproximateLiveSeekableRangeEnd());
    }

    final Long zzh() {
        RemoteMediaClient remoteMediaClient;
        MediaStatus mediaStatus;
        RemoteMediaClient remoteMediaClient2 = this.zza;
        if (remoteMediaClient2 == null || !remoteMediaClient2.hasMediaSession() || !this.zza.isLiveStream() || !this.zza.zzq() || (mediaStatus = (remoteMediaClient = this.zza).getMediaStatus()) == null || mediaStatus.getLiveSeekableRange() == null) {
            return null;
        }
        return Long.valueOf(remoteMediaClient.getApproximateLiveSeekableRangeStart());
    }

    public final Long zzi() {
        MediaMetadata zzo;
        Long zzj;
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession() || !this.zza.isLiveStream() || (zzo = zzo()) == null || !zzo.containsKey("com.google.android.gms.cast.metadata.SECTION_DURATION") || (zzj = zzj()) == null) {
            return null;
        }
        return Long.valueOf(zzj.longValue() + zzo.getTimeMillis("com.google.android.gms.cast.metadata.SECTION_DURATION"));
    }

    public final Long zzj() {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && this.zza.isLiveStream()) {
            RemoteMediaClient remoteMediaClient2 = this.zza;
            MediaInfo mediaInfo = remoteMediaClient2.getMediaInfo();
            MediaMetadata zzo = zzo();
            if (mediaInfo == null || zzo == null || !zzo.containsKey("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA")) {
                return null;
            }
            if (zzo.containsKey("com.google.android.gms.cast.metadata.SECTION_DURATION") || remoteMediaClient2.zzq()) {
                return Long.valueOf(zzo.getTimeMillis("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"));
            }
            return null;
        }
        return null;
    }

    public final boolean zzm() {
        return zzn(zza() + zze());
    }

    public final boolean zzn(long j) {
        RemoteMediaClient remoteMediaClient = this.zza;
        return remoteMediaClient != null && remoteMediaClient.hasMediaSession() && this.zza.zzq() && (((long) zzc()) + zze()) - j < 10000;
    }
}
