package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class LifecycleDispatcher {
    public static final LifecycleDispatcher INSTANCE = new LifecycleDispatcher();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    private LifecycleDispatcher() {
    }

    public static final void init(Context context) {
        C8632dsu.c((Object) context, "");
        if (initialized.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C8632dsu.d(applicationContext);
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
    }

    /* loaded from: classes5.dex */
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C8632dsu.c((Object) activity, "");
            ReportFragment.Companion.injectIfNeededIn(activity);
        }
    }
}
