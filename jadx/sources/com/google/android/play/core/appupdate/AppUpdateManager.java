package com.google.android.play.core.appupdate;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public interface AppUpdateManager {
    Task<Void> completeUpdate();

    Task<AppUpdateInfo> getAppUpdateInfo();

    @Deprecated
    boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, int i, Activity activity, int i2);
}
