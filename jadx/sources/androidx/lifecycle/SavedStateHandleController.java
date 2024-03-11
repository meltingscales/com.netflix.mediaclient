package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class SavedStateHandleController implements LifecycleEventObserver {
    private final SavedStateHandle handle;
    private boolean isAttached;
    private final String key;

    public final SavedStateHandle getHandle() {
        return this.handle;
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) savedStateHandle, "");
        this.key = str;
        this.handle = savedStateHandle;
    }

    public final void attachToLifecycle(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        C8632dsu.c((Object) savedStateRegistry, "");
        C8632dsu.c((Object) lifecycle, "");
        if (!(!this.isAttached)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.isAttached = true;
        lifecycle.addObserver(this);
        savedStateRegistry.registerSavedStateProvider(this.key, this.handle.savedStateProvider());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) event, "");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.isAttached = false;
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
