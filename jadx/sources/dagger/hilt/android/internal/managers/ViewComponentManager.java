package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes5.dex */
public final class ViewComponentManager implements GeneratedComponentManager<Object> {
    private volatile Object component;
    private final Object componentLock = new Object();
    private final boolean hasFragmentBindings;
    private final View view;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes5.dex */
    public interface ViewComponentBuilderEntryPoint {
        ViewComponentBuilder viewComponentBuilder();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    /* loaded from: classes5.dex */
    public interface ViewWithFragmentComponentBuilderEntryPoint {
        ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder();
    }

    public ViewComponentManager(View view, boolean z) {
        this.view = view;
        this.hasFragmentBindings = z;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
        if (this.component == null) {
            synchronized (this.componentLock) {
                if (this.component == null) {
                    this.component = createComponent();
                }
            }
        }
        return this.component;
    }

    private Object createComponent() {
        GeneratedComponentManager<?> parentComponentManager = getParentComponentManager(false);
        if (this.hasFragmentBindings) {
            return ((ViewWithFragmentComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewWithFragmentComponentBuilderEntryPoint.class)).viewWithFragmentComponentBuilder().view(this.view).build();
        }
        return ((ViewComponentBuilderEntryPoint) EntryPoints.get(parentComponentManager, ViewComponentBuilderEntryPoint.class)).viewComponentBuilder().view(this.view).build();
    }

    public GeneratedComponentManager<?> maybeGetParentComponentManager() {
        return getParentComponentManager(true);
    }

    private GeneratedComponentManager<?> getParentComponentManager(boolean z) {
        if (this.hasFragmentBindings) {
            Context parentContext = getParentContext(FragmentContextWrapper.class, z);
            if (parentContext instanceof FragmentContextWrapper) {
                return (GeneratedComponentManager) ((FragmentContextWrapper) parentContext).getFragment();
            }
            if (z) {
                return null;
            }
            Context parentContext2 = getParentContext(GeneratedComponentManager.class, z);
            Preconditions.checkState(!(parentContext2 instanceof GeneratedComponentManager), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.view.getClass(), parentContext2.getClass().getName());
        } else {
            Context parentContext3 = getParentContext(GeneratedComponentManager.class, z);
            if (parentContext3 instanceof GeneratedComponentManager) {
                return (GeneratedComponentManager) parentContext3;
            }
            if (z) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.view.getClass()));
    }

    private Context getParentContext(Class<?> cls, boolean z) {
        Context unwrap = unwrap(this.view.getContext(), cls);
        if (unwrap == Contexts.getApplication(unwrap.getApplicationContext())) {
            Preconditions.checkState(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.view.getClass());
            return null;
        }
        return unwrap;
    }

    private static Context unwrap(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* loaded from: classes5.dex */
    public static final class FragmentContextWrapper extends ContextWrapper {
        private LayoutInflater baseInflater;
        private Fragment fragment;
        private final LifecycleEventObserver fragmentLifecycleObserver;
        private LayoutInflater inflater;

        /* JADX INFO: Access modifiers changed from: package-private */
        public FragmentContextWrapper(Context context, Fragment fragment) {
            super((Context) Preconditions.checkNotNull(context));
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        FragmentContextWrapper.this.fragment = null;
                        FragmentContextWrapper.this.baseInflater = null;
                        FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = lifecycleEventObserver;
            this.baseInflater = null;
            Fragment fragment2 = (Fragment) Preconditions.checkNotNull(fragment);
            this.fragment = fragment2;
            fragment2.getLifecycle().addObserver(lifecycleEventObserver);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public FragmentContextWrapper(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) Preconditions.checkNotNull(((LayoutInflater) Preconditions.checkNotNull(layoutInflater)).getContext()));
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        FragmentContextWrapper.this.fragment = null;
                        FragmentContextWrapper.this.baseInflater = null;
                        FragmentContextWrapper.this.inflater = null;
                    }
                }
            };
            this.fragmentLifecycleObserver = lifecycleEventObserver;
            this.baseInflater = layoutInflater;
            Fragment fragment2 = (Fragment) Preconditions.checkNotNull(fragment);
            this.fragment = fragment2;
            fragment2.getLifecycle().addObserver(lifecycleEventObserver);
        }

        Fragment getFragment() {
            Preconditions.checkNotNull(this.fragment, "The fragment has already been destroyed.");
            return this.fragment;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if ("layout_inflater".equals(str)) {
                if (this.inflater == null) {
                    if (this.baseInflater == null) {
                        this.baseInflater = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                    }
                    this.inflater = this.baseInflater.cloneInContext(this);
                }
                return this.inflater;
            }
            return getBaseContext().getSystemService(str);
        }
    }
}
