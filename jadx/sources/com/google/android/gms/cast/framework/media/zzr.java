package com.google.android.gms.cast.framework.media;

import android.util.LruCache;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
final class zzr extends LruCache {
    final /* synthetic */ MediaQueue zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(MediaQueue mediaQueue, int i) {
        super(i);
        this.zza = mediaQueue;
    }

    @Override // android.util.LruCache
    protected final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj2;
        MediaQueueItem mediaQueueItem2 = (MediaQueueItem) obj3;
        if (z) {
            Preconditions.checkNotNull(this.zza.zze);
            this.zza.zze.add(num);
        }
    }
}
