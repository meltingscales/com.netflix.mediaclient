package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.ke  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9176ke implements Application.ActivityLifecycleCallbacks {
    private final drX<String, Map<String, ? extends Object>, dpR> d;
    private final WeakHashMap<Activity, String> e = new WeakHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C9176ke(drX<? super String, ? super Map<String, ? extends Object>, dpR> drx) {
        this.d = drx;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, "onCreate()", Boolean.valueOf(bundle != null));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        b(this, activity, "onStart()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        b(this, activity, "onResume()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        b(this, activity, "onPause()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b(this, activity, "onStop()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        b(this, activity, "onSaveInstanceState()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        b(this, activity, "onDestroy()", null, 4, null);
        this.e.remove(activity);
    }

    private final String c(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    static /* synthetic */ void b(C9176ke c9176ke, Activity activity, String str, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        c9176ke.c(activity, str, bool);
    }

    private final void c(Activity activity, String str, Boolean bool) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bool != null) {
            linkedHashMap.put("hasBundle", bool);
        }
        String str2 = this.e.get(activity);
        if (str2 != null) {
            linkedHashMap.put("previous", str2);
        }
        String c = c(activity);
        drX<String, Map<String, ? extends Object>, dpR> drx = this.d;
        drx.invoke(((Object) c) + '#' + str, linkedHashMap);
        this.e.put(activity, str);
    }
}
