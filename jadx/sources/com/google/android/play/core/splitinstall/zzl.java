package com.google.android.play.core.splitinstall;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.internal.zzby;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzl implements SplitInstallManager {
    private final zzby zza;
    private final zzby zzb;
    private final zzby zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(zzby zzbyVar, zzby zzbyVar2, zzby zzbyVar3) {
        this.zza = zzbyVar;
        this.zzb = zzbyVar2;
        this.zzc = zzbyVar3;
    }

    private final SplitInstallManager zzc() {
        if (this.zzc.zza() == null) {
            return (SplitInstallManager) this.zza.zza();
        }
        return (SplitInstallManager) this.zzb.zza();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        return zzc().deferredInstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return zzc().deferredLanguageInstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        return zzc().getInstalledLanguages();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        return zzc().getInstalledModules();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzc().registerListener(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) {
        return zzc().startConfirmationDialogForResult(splitInstallSessionState, activity, i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Integer> startInstall(SplitInstallRequest splitInstallRequest) {
        return zzc().startInstall(splitInstallRequest);
    }
}
