package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzcv;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class MediaQueue {
    long zza;
    LruCache zzd;
    private final RemoteMediaClient zzh;
    private PendingResult zzl;
    private PendingResult zzm;
    private final Set zzn = Collections.synchronizedSet(new HashSet());
    private final Logger zzg = new Logger("MediaQueue");
    private final int zzi = Math.max(20, 1);
    List zzb = new ArrayList();
    final SparseIntArray zzc = new SparseIntArray();
    final List zze = new ArrayList();
    final Deque zzf = new ArrayDeque(20);
    private final Handler zzj = new zzcv(Looper.getMainLooper());
    private final TimerTask zzk = new zzq(this);

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public void itemsInsertedInRange(int i, int i2) {
        }

        public void itemsReloaded() {
        }

        public void itemsRemovedAtIndexes(int[] iArr) {
        }

        public void itemsReorderedAtIndexes(List<Integer> list, int i) {
        }

        public void itemsUpdatedAtIndexes(int[] iArr) {
        }

        public void mediaQueueChanged() {
        }

        public void mediaQueueWillChange() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaQueue(RemoteMediaClient remoteMediaClient, int i, int i2) {
        this.zzh = remoteMediaClient;
        remoteMediaClient.registerCallback(new zzs(this));
        zzt(20);
        this.zza = zzp();
        zzo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(MediaQueue mediaQueue, int i, int i2) {
        synchronized (mediaQueue.zzn) {
            for (Callback callback : mediaQueue.zzn) {
                callback.itemsInsertedInRange(i, i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(MediaQueue mediaQueue, int[] iArr) {
        synchronized (mediaQueue.zzn) {
            for (Callback callback : mediaQueue.zzn) {
                callback.itemsRemovedAtIndexes(iArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(MediaQueue mediaQueue, List list, int i) {
        synchronized (mediaQueue.zzn) {
            for (Callback callback : mediaQueue.zzn) {
                callback.itemsReorderedAtIndexes(list, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(final MediaQueue mediaQueue) {
        if (mediaQueue.zzf.isEmpty() || mediaQueue.zzl != null || mediaQueue.zza == 0) {
            return;
        }
        PendingResult zzh = mediaQueue.zzh.zzh(CastUtils.zzi(mediaQueue.zzf));
        mediaQueue.zzl = zzh;
        zzh.setResultCallback(new ResultCallback() { // from class: com.google.android.gms.cast.framework.media.zzp
            @Override // com.google.android.gms.common.api.ResultCallback
            public final void onResult(Result result) {
                MediaQueue.this.zzn((RemoteMediaClient.MediaChannelResult) result);
            }
        });
        mediaQueue.zzf.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(MediaQueue mediaQueue) {
        mediaQueue.zzc.clear();
        for (int i = 0; i < mediaQueue.zzb.size(); i++) {
            mediaQueue.zzc.put(((Integer) mediaQueue.zzb.get(i)).intValue(), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzp() {
        MediaStatus mediaStatus = this.zzh.getMediaStatus();
        if (mediaStatus == null || mediaStatus.zzd()) {
            return 0L;
        }
        return mediaStatus.zzb();
    }

    private final void zzq() {
        this.zzj.removeCallbacks(this.zzk);
    }

    private final void zzr() {
        PendingResult pendingResult = this.zzm;
        if (pendingResult != null) {
            pendingResult.cancel();
            this.zzm = null;
        }
    }

    private final void zzs() {
        PendingResult pendingResult = this.zzl;
        if (pendingResult != null) {
            pendingResult.cancel();
            this.zzl = null;
        }
    }

    private final void zzt(int i) {
        this.zzd = new zzr(this, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        synchronized (this.zzn) {
            for (Callback callback : this.zzn) {
                callback.mediaQueueChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        synchronized (this.zzn) {
            for (Callback callback : this.zzn) {
                callback.itemsReloaded();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw(int[] iArr) {
        synchronized (this.zzn) {
            for (Callback callback : this.zzn) {
                callback.itemsUpdatedAtIndexes(iArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzx() {
        synchronized (this.zzn) {
            for (Callback callback : this.zzn) {
                callback.mediaQueueWillChange();
            }
        }
    }

    private final void zzy() {
        zzq();
        this.zzj.postDelayed(this.zzk, 500L);
    }

    public final void zzl() {
        zzx();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.evictAll();
        this.zze.clear();
        zzq();
        this.zzf.clear();
        zzr();
        zzs();
        zzv();
        zzu();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzm(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
        Status status = mediaChannelResult.getStatus();
        int statusCode = status.getStatusCode();
        if (statusCode != 0) {
            this.zzg.w(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(statusCode), status.getStatusMessage()), new Object[0]);
        }
        this.zzm = null;
        if (this.zzf.isEmpty()) {
            return;
        }
        zzy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzn(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
        Status status = mediaChannelResult.getStatus();
        int statusCode = status.getStatusCode();
        if (statusCode != 0) {
            this.zzg.w(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(statusCode), status.getStatusMessage()), new Object[0]);
        }
        this.zzl = null;
        if (this.zzf.isEmpty()) {
            return;
        }
        zzy();
    }

    public final void zzo() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (this.zza != 0 && this.zzm == null) {
            zzr();
            zzs();
            PendingResult zzg = this.zzh.zzg();
            this.zzm = zzg;
            zzg.setResultCallback(new ResultCallback() { // from class: com.google.android.gms.cast.framework.media.zzo
                @Override // com.google.android.gms.common.api.ResultCallback
                public final void onResult(Result result) {
                    MediaQueue.this.zzm((RemoteMediaClient.MediaChannelResult) result);
                }
            });
        }
    }
}
