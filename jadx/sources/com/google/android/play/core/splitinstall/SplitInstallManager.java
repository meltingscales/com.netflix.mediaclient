package com.google.android.play.core.splitinstall;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public interface SplitInstallManager {
    Task<Void> deferredInstall(List<String> list);

    Task<Void> deferredLanguageInstall(List<Locale> list);

    Set<String> getInstalledLanguages();

    Set<String> getInstalledModules();

    void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i);

    Task<Integer> startInstall(SplitInstallRequest splitInstallRequest);
}
