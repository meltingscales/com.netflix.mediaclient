package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class ViewModelProviderGetKt {
    public static final CreationExtras defaultCreationExtras(ViewModelStoreOwner viewModelStoreOwner) {
        C8632dsu.c((Object) viewModelStoreOwner, "");
        if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            return ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
        }
        return CreationExtras.Empty.INSTANCE;
    }
}
