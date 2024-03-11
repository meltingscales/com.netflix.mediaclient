package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {
    private final SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        C8632dsu.c((Object) savedStateHandlesProvider, "");
        this.provider = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) event, "");
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
        this.provider.performRestore();
    }
}
