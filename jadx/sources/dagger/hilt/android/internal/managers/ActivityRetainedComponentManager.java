package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponentManager;

/* loaded from: classes5.dex */
final class ActivityRetainedComponentManager implements GeneratedComponentManager<ActivityRetainedComponent> {
    private volatile ActivityRetainedComponent component;
    private final Object componentLock = new Object();
    private final Context context;
    private final ViewModelStoreOwner viewModelStoreOwner;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes5.dex */
    public interface ActivityRetainedComponentBuilderEntryPoint {
        ActivityRetainedComponentBuilder retainedComponentBuilder();
    }

    @EntryPoint
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes5.dex */
    public interface ActivityRetainedLifecycleEntryPoint {
        ActivityRetainedLifecycle getActivityRetainedLifecycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class ActivityRetainedComponentViewModel extends ViewModel {
        private final ActivityRetainedComponent component;
        private final SavedStateHandleHolder savedStateHandleHolder;

        ActivityRetainedComponent getComponent() {
            return this.component;
        }

        SavedStateHandleHolder getSavedStateHandleHolder() {
            return this.savedStateHandleHolder;
        }

        ActivityRetainedComponentViewModel(ActivityRetainedComponent activityRetainedComponent, SavedStateHandleHolder savedStateHandleHolder) {
            this.component = activityRetainedComponent;
            this.savedStateHandleHolder = savedStateHandleHolder;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            ((RetainedLifecycleImpl) ((ActivityRetainedLifecycleEntryPoint) EntryPoints.get(this.component, ActivityRetainedLifecycleEntryPoint.class)).getActivityRetainedLifecycle()).dispatchOnCleared();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityRetainedComponentManager(ComponentActivity componentActivity) {
        this.viewModelStoreOwner = componentActivity;
        this.context = componentActivity;
    }

    private ViewModelProvider getViewModelProvider(ViewModelStoreOwner viewModelStoreOwner, final Context context) {
        return new ViewModelProvider(viewModelStoreOwner, new ViewModelProvider.Factory() { // from class: dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
                SavedStateHandleHolder savedStateHandleHolder = new SavedStateHandleHolder(creationExtras);
                return new ActivityRetainedComponentViewModel(((ActivityRetainedComponentBuilderEntryPoint) EntryPointAccessors.fromApplication(context, ActivityRetainedComponentBuilderEntryPoint.class)).retainedComponentBuilder().savedStateHandleHolder(savedStateHandleHolder).build(), savedStateHandleHolder);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // dagger.hilt.internal.GeneratedComponentManager
    public ActivityRetainedComponent generatedComponent() {
        if (this.component == null) {
            synchronized (this.componentLock) {
                if (this.component == null) {
                    this.component = createComponent();
                }
            }
        }
        return this.component;
    }

    public SavedStateHandleHolder getSavedStateHandleHolder() {
        return ((ActivityRetainedComponentViewModel) getViewModelProvider(this.viewModelStoreOwner, this.context).get(ActivityRetainedComponentViewModel.class)).getSavedStateHandleHolder();
    }

    private ActivityRetainedComponent createComponent() {
        return ((ActivityRetainedComponentViewModel) getViewModelProvider(this.viewModelStoreOwner, this.context).get(ActivityRetainedComponentViewModel.class)).getComponent();
    }

    @Module
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes5.dex */
    static abstract class LifecycleModule {
        LifecycleModule() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Provides
        @ActivityRetainedScoped
        public static ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
            return new RetainedLifecycleImpl();
        }
    }
}
