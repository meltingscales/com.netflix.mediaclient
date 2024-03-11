package com.google.android.gms.cast;

import android.os.Bundle;
import com.google.android.gms.cast.internal.zzac;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzbi extends zzac {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbi(zzbr zzbrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.cast.internal.zzad
    public final void zzb(Bundle bundle) {
        this.zza.setResult(bundle);
    }
}
