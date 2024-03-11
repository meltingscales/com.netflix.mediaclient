package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import o.C8632dsu;

/* loaded from: classes5.dex */
public class EmptyActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
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
