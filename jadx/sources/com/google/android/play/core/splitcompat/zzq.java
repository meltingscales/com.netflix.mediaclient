package com.google.android.play.core.splitcompat;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzq implements Runnable {
    final /* synthetic */ SplitCompat zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(SplitCompat splitCompat) {
        this.zza = splitCompat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zze zzeVar;
        try {
            zzeVar = this.zza.zzc;
            zzeVar.zzk();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
