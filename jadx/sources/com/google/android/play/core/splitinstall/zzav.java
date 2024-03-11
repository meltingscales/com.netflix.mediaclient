package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzav extends zzbb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(zzbc zzbcVar, TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzd(Bundle bundle) {
        super.zzd(bundle);
        this.zza.trySetResult(null);
    }
}
