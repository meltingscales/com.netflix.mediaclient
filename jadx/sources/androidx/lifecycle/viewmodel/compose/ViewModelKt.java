package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class ViewModelKt {
    public static final <VM extends ViewModel> VM viewModel(Class<VM> cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i, int i2) {
        C8632dsu.c((Object) cls, "");
        composer.startReplaceableGroup(-1439476281);
        if ((i2 & 2) == 0 || (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) != null) {
            if ((i2 & 4) != 0) {
                str = null;
            }
            if ((i2 & 8) != 0) {
                factory = null;
            }
            if ((i2 & 16) != 0) {
                if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                    creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
                } else {
                    creationExtras = CreationExtras.Empty.INSTANCE;
                }
            }
            VM vm = (VM) get(viewModelStoreOwner, cls, str, factory, creationExtras);
            composer.endReplaceableGroup();
            return vm;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    private static final <VM extends ViewModel> VM get(ViewModelStoreOwner viewModelStoreOwner, Class<VM> cls, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        ViewModelProvider viewModelProvider;
        if (factory != null) {
            viewModelProvider = new ViewModelProvider(viewModelStoreOwner.getViewModelStore(), factory, creationExtras);
        } else if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            viewModelProvider = new ViewModelProvider(viewModelStoreOwner.getViewModelStore(), ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory(), creationExtras);
        } else {
            viewModelProvider = new ViewModelProvider(viewModelStoreOwner);
        }
        if (str != null) {
            return (VM) viewModelProvider.get(str, cls);
        }
        return (VM) viewModelProvider.get(cls);
    }
}
