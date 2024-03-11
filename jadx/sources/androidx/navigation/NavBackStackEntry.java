package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes5.dex */
public final class NavBackStackEntry implements ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {
    public static final Companion Companion = new Companion(null);
    private final Bundle arguments;
    private final Context context;
    private final InterfaceC8554dpx defaultFactory$delegate;
    private NavDestination destination;
    private Lifecycle.State hostLifecycleState;
    private final String id;
    private LifecycleRegistry lifecycle;
    private Lifecycle.State maxLifecycle;
    private final Bundle savedState;
    private final InterfaceC8554dpx savedStateHandle$delegate;
    private boolean savedStateRegistryAttached;
    private final SavedStateRegistryController savedStateRegistryController;
    private final NavViewModelStoreProvider viewModelStoreProvider;

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, C8627dsp c8627dsp) {
        this(context, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
    }

    public final Bundle getArguments() {
        return this.arguments;
    }

    public final NavDestination getDestination() {
        return this.destination;
    }

    public final String getId() {
        return this.id;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    public final void setDestination(NavDestination navDestination) {
        C8632dsu.c((Object) navDestination, "");
        this.destination = navDestination;
    }

    private NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        this.context = context;
        this.destination = navDestination;
        this.arguments = bundle;
        this.hostLifecycleState = state;
        this.viewModelStoreProvider = navViewModelStoreProvider;
        this.id = str;
        this.savedState = bundle2;
        this.lifecycle = new LifecycleRegistry(this);
        this.savedStateRegistryController = SavedStateRegistryController.Companion.create(this);
        b = dpB.b(new drO<SavedStateViewModelFactory>() { // from class: androidx.navigation.NavBackStackEntry$defaultFactory$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final SavedStateViewModelFactory invoke() {
                Context context2;
                context2 = NavBackStackEntry.this.context;
                Context applicationContext = context2 != null ? context2.getApplicationContext() : null;
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                NavBackStackEntry navBackStackEntry = NavBackStackEntry.this;
                return new SavedStateViewModelFactory(application, navBackStackEntry, navBackStackEntry.getArguments());
            }
        });
        this.defaultFactory$delegate = b;
        b2 = dpB.b(new drO<SavedStateHandle>() { // from class: androidx.navigation.NavBackStackEntry$savedStateHandle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final SavedStateHandle invoke() {
                boolean z;
                LifecycleRegistry lifecycleRegistry;
                z = NavBackStackEntry.this.savedStateRegistryAttached;
                if (z) {
                    lifecycleRegistry = NavBackStackEntry.this.lifecycle;
                    if (lifecycleRegistry.getCurrentState() == Lifecycle.State.DESTROYED) {
                        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
                    }
                    return ((NavBackStackEntry.SavedStateViewModel) new ViewModelProvider(NavBackStackEntry.this, new NavBackStackEntry.NavResultSavedStateFactory(NavBackStackEntry.this)).get(NavBackStackEntry.SavedStateViewModel.class)).getHandle();
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
            }
        });
        this.savedStateHandle$delegate = b2;
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle) {
        this(navBackStackEntry.context, navBackStackEntry.destination, bundle, navBackStackEntry.hostLifecycleState, navBackStackEntry.viewModelStoreProvider, navBackStackEntry.id, navBackStackEntry.savedState);
        C8632dsu.c((Object) navBackStackEntry, "");
        this.hostLifecycleState = navBackStackEntry.hostLifecycleState;
        setMaxLifecycle(navBackStackEntry.maxLifecycle);
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ NavBackStackEntry create$default(Companion companion, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i, Object obj) {
            String str2;
            Bundle bundle3 = (i & 4) != 0 ? null : bundle;
            Lifecycle.State state2 = (i & 8) != 0 ? Lifecycle.State.CREATED : state;
            NavViewModelStoreProvider navViewModelStoreProvider2 = (i & 16) != 0 ? null : navViewModelStoreProvider;
            if ((i & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                C8632dsu.a(uuid, "");
                str2 = uuid;
            } else {
                str2 = str;
            }
            return companion.create(context, navDestination, bundle3, state2, navViewModelStoreProvider2, str2, (i & 64) != 0 ? null : bundle2);
        }

        public final NavBackStackEntry create(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
            C8632dsu.c((Object) navDestination, "");
            C8632dsu.c((Object) state, "");
            C8632dsu.c((Object) str, "");
            return new NavBackStackEntry(context, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2, null);
        }
    }

    private final SavedStateViewModelFactory getDefaultFactory() {
        return (SavedStateViewModelFactory) this.defaultFactory$delegate.getValue();
    }

    public final void setMaxLifecycle(Lifecycle.State state) {
        C8632dsu.c((Object) state, "");
        this.maxLifecycle = state;
        updateState();
    }

    public final void handleLifecycleEvent(Lifecycle.Event event) {
        C8632dsu.c((Object) event, "");
        Lifecycle.State targetState = event.getTargetState();
        C8632dsu.a(targetState, "");
        this.hostLifecycleState = targetState;
        updateState();
    }

    public final void updateState() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.performAttach();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this);
            }
            this.savedStateRegistryController.performRestore(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this.lifecycle.setCurrentState(this.hostLifecycleState);
        } else {
            this.lifecycle.setCurrentState(this.maxLifecycle);
        }
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (this.lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            NavViewModelStoreProvider navViewModelStoreProvider = this.viewModelStoreProvider;
            if (navViewModelStoreProvider == null) {
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            return navViewModelStoreProvider.getViewModelStore(this.id);
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return getDefaultFactory();
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        Context context = this.context;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? applicationContext : null;
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundle);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    public final void saveState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        this.savedStateRegistryController.performSave(bundle);
    }

    public boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof NavBackStackEntry)) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (C8632dsu.c((Object) this.id, (Object) navBackStackEntry.id) && C8632dsu.c(this.destination, navBackStackEntry.destination) && C8632dsu.c(this.lifecycle, navBackStackEntry.lifecycle) && C8632dsu.c(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
                if (!C8632dsu.c(this.arguments, navBackStackEntry.arguments)) {
                    Bundle bundle = this.arguments;
                    if (bundle != null && (keySet = bundle.keySet()) != null) {
                        Set<String> set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Object obj2 = this.arguments.get(str);
                                Bundle bundle2 = navBackStackEntry.arguments;
                                if (!C8632dsu.c(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = (this.id.hashCode() * 31) + this.destination.hashCode();
        Bundle bundle = this.arguments;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                Object obj = this.arguments.get(str);
                hashCode = (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((hashCode * 31) + this.lifecycle.hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    /* loaded from: classes5.dex */
    static final class NavResultSavedStateFactory extends AbstractSavedStateViewModelFactory {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavResultSavedStateFactory(SavedStateRegistryOwner savedStateRegistryOwner) {
            super(savedStateRegistryOwner, null);
            C8632dsu.c((Object) savedStateRegistryOwner, "");
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        public <T extends ViewModel> T create(String str, Class<T> cls, SavedStateHandle savedStateHandle) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) cls, "");
            C8632dsu.c((Object) savedStateHandle, "");
            return new SavedStateViewModel(savedStateHandle);
        }
    }

    /* loaded from: classes5.dex */
    static final class SavedStateViewModel extends ViewModel {
        private final SavedStateHandle handle;

        public final SavedStateHandle getHandle() {
            return this.handle;
        }

        public SavedStateViewModel(SavedStateHandle savedStateHandle) {
            C8632dsu.c((Object) savedStateHandle, "");
            this.handle = savedStateHandle;
        }
    }
}
