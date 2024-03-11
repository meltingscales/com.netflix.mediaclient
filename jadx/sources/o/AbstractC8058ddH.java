package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: o.ddH  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8058ddH implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C8632dsu.c((Object) activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C8632dsu.c((Object) activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C8632dsu.c((Object) activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C8632dsu.c((Object) activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C8632dsu.c((Object) activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C8632dsu.c((Object) activity, "");
    }
}
