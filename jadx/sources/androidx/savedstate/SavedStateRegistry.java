package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {
    private static final Companion Companion = new Companion(null);
    private boolean attached;
    private final SafeIterableMap<String, SavedStateProvider> components = new SafeIterableMap<>();
    private boolean isAllowingSavingState = true;
    private boolean isRestored;
    private Recreator.SavedStateProvider recreatorProvider;
    private Bundle restoredState;

    /* loaded from: classes2.dex */
    public interface AutoRecreated {
        void onRecreated(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    /* loaded from: classes.dex */
    public interface SavedStateProvider {
        Bundle saveState();
    }

    public final boolean isRestored() {
        return this.isRestored;
    }

    public final Bundle consumeRestoredStateForKey(String str) {
        C8632dsu.c((Object) str, "");
        if (this.isRestored) {
            Bundle bundle = this.restoredState;
            if (bundle != null) {
                Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
                Bundle bundle3 = this.restoredState;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.restoredState;
                if (bundle4 == null || bundle4.isEmpty()) {
                    this.restoredState = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final void registerSavedStateProvider(String str, SavedStateProvider savedStateProvider) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) savedStateProvider, "");
        if (this.components.putIfAbsent(str, savedStateProvider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final SavedStateProvider getSavedStateProvider(String str) {
        C8632dsu.c((Object) str, "");
        Iterator<Map.Entry<String, SavedStateProvider>> it = this.components.iterator();
        while (it.hasNext()) {
            Map.Entry<String, SavedStateProvider> next = it.next();
            C8632dsu.a(next, "");
            SavedStateProvider value = next.getValue();
            if (C8632dsu.c((Object) next.getKey(), (Object) str)) {
                return value;
            }
        }
        return null;
    }

    public final void unregisterSavedStateProvider(String str) {
        C8632dsu.c((Object) str, "");
        this.components.remove(str);
    }

    public final void runOnNextRecreation(Class<? extends AutoRecreated> cls) {
        C8632dsu.c((Object) cls, "");
        if (!this.isAllowingSavingState) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.SavedStateProvider savedStateProvider = this.recreatorProvider;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.recreatorProvider = savedStateProvider;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.SavedStateProvider savedStateProvider2 = this.recreatorProvider;
            if (savedStateProvider2 != null) {
                String name = cls.getName();
                C8632dsu.a(name, "");
                savedStateProvider2.add(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final void performAttach$savedstate_release(Lifecycle lifecycle) {
        C8632dsu.c((Object) lifecycle, "");
        if (!(!this.attached)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SavedStateRegistry.m2751performAttach$lambda4(SavedStateRegistry.this, lifecycleOwner, event);
            }
        });
        this.attached = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performAttach$lambda-4  reason: not valid java name */
    public static final void m2751performAttach$lambda4(SavedStateRegistry savedStateRegistry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C8632dsu.c((Object) savedStateRegistry, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) event, "");
        if (event == Lifecycle.Event.ON_START) {
            savedStateRegistry.isAllowingSavingState = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            savedStateRegistry.isAllowingSavingState = false;
        }
    }

    public final void performRestore$savedstate_release(Bundle bundle) {
        if (!this.attached) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.isRestored)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.restoredState = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.isRestored = true;
    }

    public final void performSave(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        SafeIterableMap<String, SavedStateProvider>.IteratorWithAdditions iteratorWithAdditions = this.components.iteratorWithAdditions();
        C8632dsu.a(iteratorWithAdditions, "");
        while (iteratorWithAdditions.hasNext()) {
            Map.Entry next = iteratorWithAdditions.next();
            bundle2.putBundle((String) next.getKey(), ((SavedStateProvider) next.getValue()).saveState());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* loaded from: classes2.dex */
    static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
