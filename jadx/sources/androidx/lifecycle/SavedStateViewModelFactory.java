package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    private Application application;
    private Bundle defaultArgs;
    private final ViewModelProvider.Factory factory;
    private Lifecycle lifecycle;
    private SavedStateRegistry savedStateRegistry;

    public SavedStateViewModelFactory() {
        this.factory = new ViewModelProvider.AndroidViewModelFactory();
    }

    @SuppressLint({"LambdaLast"})
    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        C8632dsu.c((Object) savedStateRegistryOwner, "");
        this.savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        this.lifecycle = savedStateRegistryOwner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(application);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory();
        }
        this.factory = androidViewModelFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
        List list;
        Constructor findMatchingConstructor;
        List list2;
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) creationExtras, "");
        String str = (String) creationExtras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (creationExtras.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) == null || creationExtras.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) == null) {
            if (this.lifecycle != null) {
                return (T) create(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) creationExtras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        if (isAssignableFrom && application != null) {
            list2 = SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE;
            findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(cls, list2);
        } else {
            list = SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE;
            findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(cls, list);
        }
        if (findMatchingConstructor == null) {
            return (T) this.factory.create(cls, creationExtras);
        }
        if (isAssignableFrom && application != null) {
            return (T) SavedStateViewModelFactoryKt.newInstance(cls, findMatchingConstructor, application, SavedStateHandleSupport.createSavedStateHandle(creationExtras));
        }
        return (T) SavedStateViewModelFactoryKt.newInstance(cls, findMatchingConstructor, SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    public final <T extends ViewModel> T create(String str, Class<T> cls) {
        List list;
        Constructor findMatchingConstructor;
        T t;
        Application application;
        List list2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cls, "");
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        if (isAssignableFrom && this.application != null) {
            list2 = SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE;
            findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(cls, list2);
        } else {
            list = SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE;
            findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(cls, list);
        }
        if (findMatchingConstructor == null) {
            if (this.application != null) {
                return (T) this.factory.create(cls);
            }
            return (T) ViewModelProvider.NewInstanceFactory.Companion.getInstance().create(cls);
        }
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        C8632dsu.d(savedStateRegistry);
        SavedStateHandleController create = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, str, this.defaultArgs);
        if (isAssignableFrom && (application = this.application) != null) {
            C8632dsu.d(application);
            t = (T) SavedStateViewModelFactoryKt.newInstance(cls, findMatchingConstructor, application, create.getHandle());
        } else {
            t = (T) SavedStateViewModelFactoryKt.newInstance(cls, findMatchingConstructor, create.getHandle());
        }
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", create);
        return t;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        C8632dsu.c((Object) cls, "");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) create(canonicalName, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(ViewModel viewModel) {
        C8632dsu.c((Object) viewModel, "");
        if (this.lifecycle != null) {
            SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
            C8632dsu.d(savedStateRegistry);
            Lifecycle lifecycle = this.lifecycle;
            C8632dsu.d(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }
}
