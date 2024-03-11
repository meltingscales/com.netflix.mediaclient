package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzba extends zzbb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(zzbc zzbcVar, TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzi(int i, Bundle bundle) {
        super.zzi(i, bundle);
        this.zza.trySetResult(Integer.valueOf(i));
    }
}
