package com.google.android.gms.cast.framework.media;

import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzq extends TimerTask {
    final /* synthetic */ MediaQueue zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(MediaQueue mediaQueue) {
        this.zza = mediaQueue;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        MediaQueue.zzj(this.zza);
    }
}
