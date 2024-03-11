package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes5.dex */
public interface ModuleInstallClient {
    @ResultIgnorabilityUnspecified
    Task<ModuleInstallResponse> installModules(ModuleInstallRequest moduleInstallRequest);

    @ResultIgnorabilityUnspecified
    Task<Boolean> unregisterListener(InstallStatusListener installStatusListener);
}
