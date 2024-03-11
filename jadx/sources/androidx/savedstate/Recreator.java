package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class Recreator implements LifecycleEventObserver {
    public static final Companion Companion = new Companion(null);
    private final SavedStateRegistryOwner owner;

    public Recreator(SavedStateRegistryOwner savedStateRegistryOwner) {
        C8632dsu.c((Object) savedStateRegistryOwner, "");
        this.owner = savedStateRegistryOwner;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) event, "");
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
        Bundle consumeRestoredStateForKey = this.owner.getSavedStateRegistry().consumeRestoredStateForKey("androidx.savedstate.Restarter");
        if (consumeRestoredStateForKey == null) {
            return;
        }
        ArrayList<String> stringArrayList = consumeRestoredStateForKey.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            reflectiveNew(str);
        }
    }

    private final void reflectiveNew(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AutoRecreated.class);
            C8632dsu.a(asSubclass, "");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    C8632dsu.a(newInstance, "");
                    ((SavedStateRegistry.AutoRecreated) newInstance).onRecreated(this.owner);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SavedStateProvider implements SavedStateRegistry.SavedStateProvider {
        private final Set<String> classes;

        public SavedStateProvider(SavedStateRegistry savedStateRegistry) {
            C8632dsu.c((Object) savedStateRegistry, "");
            this.classes = new LinkedHashSet();
            savedStateRegistry.registerSavedStateProvider("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.classes));
            return bundle;
        }

        public final void add(String str) {
            C8632dsu.c((Object) str, "");
            this.classes.add(str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
