package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {
    private final ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(ViewModelInitializer<?>... viewModelInitializerArr) {
        C8632dsu.c((Object) viewModelInitializerArr, "");
        this.initializers = viewModelInitializerArr;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
        ViewModelInitializer<?>[] viewModelInitializerArr;
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) creationExtras, "");
        T t = null;
        for (ViewModelInitializer<?> viewModelInitializer : this.initializers) {
            if (C8632dsu.c(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), cls)) {
                Object invoke = viewModelInitializer.getInitializer$lifecycle_viewmodel_release().invoke(creationExtras);
                t = invoke instanceof ViewModel ? (T) invoke : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
