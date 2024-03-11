package com.google.android.gms.internal.tflite;

import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
final class zzj implements InstallStatusListener {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ ModuleInstallClient zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(TaskCompletionSource taskCompletionSource, ModuleInstallClient moduleInstallClient) {
        this.zza = taskCompletionSource;
        this.zzb = moduleInstallClient;
    }

    @Override // com.google.android.gms.common.moduleinstall.InstallStatusListener
    public final void onInstallStatusUpdated(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        int installState = moduleInstallStatusUpdate.getInstallState();
        if (installState != 3) {
            if (installState == 4) {
                this.zza.trySetResult(Boolean.TRUE);
                this.zzb.unregisterListener(this);
                return;
            } else if (installState != 5) {
                return;
            }
        }
        this.zza.trySetResult(Boolean.FALSE);
        this.zzb.unregisterListener(this);
    }
}
