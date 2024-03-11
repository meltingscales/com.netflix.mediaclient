package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistryOwner;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.multibindings.Multibinds;
import java.io.Closeable;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import o.drM;

/* loaded from: classes5.dex */
public final class HiltViewModelFactory implements ViewModelProvider.Factory {
    public static final CreationExtras.Key<drM<Object, ViewModel>> CREATION_CALLBACK_KEY = new CreationExtras.Key<drM<Object, ViewModel>>() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.1
    };
    private final ViewModelProvider.Factory delegateFactory;
    private final ViewModelProvider.Factory hiltViewModelFactory;
    private final Set<String> hiltViewModelKeys;

    /* JADX INFO: Access modifiers changed from: package-private */
    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes5.dex */
    public interface ActivityCreatorEntryPoint {
        ViewModelComponentBuilder getViewModelComponentBuilder();

        @HiltViewModelMap.KeySet
        Set<String> getViewModelKeys();
    }

    @EntryPoint
    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes5.dex */
    public interface ViewModelFactoriesEntryPoint {
        @HiltViewModelAssistedMap
        Map<String, Object> getHiltViewModelAssistedMap();

        @HiltViewModelMap
        Map<String, Provider<ViewModel>> getHiltViewModelMap();
    }

    @Module
    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes6.dex */
    interface ViewModelModule {
        @HiltViewModelAssistedMap
        @Multibinds
        Map<String, Object> hiltViewModelAssistedMap();

        @HiltViewModelMap
        @Multibinds
        Map<String, ViewModel> hiltViewModelMap();
    }

    public HiltViewModelFactory(Set<String> set, ViewModelProvider.Factory factory, final ViewModelComponentBuilder viewModelComponentBuilder) {
        this.hiltViewModelKeys = set;
        this.delegateFactory = factory;
        this.hiltViewModelFactory = new ViewModelProvider.Factory() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.2
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
                final RetainedLifecycleImpl retainedLifecycleImpl = new RetainedLifecycleImpl();
                T t = (T) createViewModel(viewModelComponentBuilder.savedStateHandle(SavedStateHandleSupport.createSavedStateHandle(creationExtras)).viewModelLifecycle(retainedLifecycleImpl).build(), cls, creationExtras);
                t.addCloseable(new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$2$$ExternalSyntheticLambda0
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        RetainedLifecycleImpl.this.dispatchOnCleared();
                    }
                });
                return t;
            }

            private <T extends ViewModel> T createViewModel(ViewModelComponent viewModelComponent, Class<T> cls, CreationExtras creationExtras) {
                Provider<ViewModel> provider = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelMap().get(cls.getName());
                drM drm = (drM) creationExtras.get(HiltViewModelFactory.CREATION_CALLBACK_KEY);
                Object obj = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelAssistedMap().get(cls.getName());
                if (obj == null) {
                    if (drm != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    } else if (provider == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    } else {
                        return (T) provider.get();
                    }
                } else if (provider != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                } else if (drm == null) {
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                } else {
                    return (T) drm.invoke(obj);
                }
            }
        };
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
        if (this.hiltViewModelKeys.contains(cls.getName())) {
            return (T) this.hiltViewModelFactory.create(cls, creationExtras);
        }
        return (T) this.delegateFactory.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        if (this.hiltViewModelKeys.contains(cls.getName())) {
            return (T) this.hiltViewModelFactory.create(cls);
        }
        return (T) this.delegateFactory.create(cls);
    }

    public static ViewModelProvider.Factory createInternal(Activity activity, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, ViewModelProvider.Factory factory) {
        return createInternal(activity, factory);
    }

    public static ViewModelProvider.Factory createInternal(Activity activity, ViewModelProvider.Factory factory) {
        ActivityCreatorEntryPoint activityCreatorEntryPoint = (ActivityCreatorEntryPoint) EntryPoints.get(activity, ActivityCreatorEntryPoint.class);
        return new HiltViewModelFactory(activityCreatorEntryPoint.getViewModelKeys(), factory, activityCreatorEntryPoint.getViewModelComponentBuilder());
    }
}
