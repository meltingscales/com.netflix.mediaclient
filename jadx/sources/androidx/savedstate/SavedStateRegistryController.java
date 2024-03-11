package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class SavedStateRegistryController {
    public static final Companion Companion = new Companion(null);
    private boolean attached;
    private final SavedStateRegistryOwner owner;
    private final SavedStateRegistry savedStateRegistry;

    public /* synthetic */ SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner, C8627dsp c8627dsp) {
        this(savedStateRegistryOwner);
    }

    public static final SavedStateRegistryController create(SavedStateRegistryOwner savedStateRegistryOwner) {
        return Companion.create(savedStateRegistryOwner);
    }

    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    private SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.owner = savedStateRegistryOwner;
        this.savedStateRegistry = new SavedStateRegistry();
    }

    public final void performAttach() {
        Lifecycle lifecycle = this.owner.getLifecycle();
        C8632dsu.a(lifecycle, "");
        if (lifecycle.getCurrentState() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.addObserver(new Recreator(this.owner));
        this.savedStateRegistry.performAttach$savedstate_release(lifecycle);
        this.attached = true;
    }

    public final void performRestore(Bundle bundle) {
        if (!this.attached) {
            performAttach();
        }
        Lifecycle lifecycle = this.owner.getLifecycle();
        C8632dsu.a(lifecycle, "");
        if (!(!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getCurrentState()).toString());
        }
        this.savedStateRegistry.performRestore$savedstate_release(bundle);
    }

    public final void performSave(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        this.savedStateRegistry.performSave(bundle);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final SavedStateRegistryController create(SavedStateRegistryOwner savedStateRegistryOwner) {
            C8632dsu.c((Object) savedStateRegistryOwner, "");
            return new SavedStateRegistryController(savedStateRegistryOwner, null);
        }
    }
}
