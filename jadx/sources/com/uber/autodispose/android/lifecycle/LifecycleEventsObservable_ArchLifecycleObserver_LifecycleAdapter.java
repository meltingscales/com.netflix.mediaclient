package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import com.uber.autodispose.android.lifecycle.LifecycleEventsObservable;

/* loaded from: classes6.dex */
public class LifecycleEventsObservable_ArchLifecycleObserver_LifecycleAdapter implements GeneratedAdapter {
    final LifecycleEventsObservable.ArchLifecycleObserver a;

    LifecycleEventsObservable_ArchLifecycleObserver_LifecycleAdapter(LifecycleEventsObservable.ArchLifecycleObserver archLifecycleObserver) {
        this.a = archLifecycleObserver;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z) {
            if (!z2 || methodCallsLogger.approveCall("onStateChange", 4)) {
                this.a.onStateChange(lifecycleOwner, event);
            }
        }
    }
}
