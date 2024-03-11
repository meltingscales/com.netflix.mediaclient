package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {
    public static final Companion Companion = new Companion(null);
    private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory() { // from class: androidx.navigation.NavControllerViewModel$Companion$FACTORY$1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            C8632dsu.c((Object) cls, "");
            return new NavControllerViewModel();
        }
    };
    private final Map<String, ViewModelStore> viewModelStores = new LinkedHashMap();

    public final void clear(String str) {
        C8632dsu.c((Object) str, "");
        ViewModelStore remove = this.viewModelStores.remove(str);
        if (remove != null) {
            remove.clear();
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        for (ViewModelStore viewModelStore : this.viewModelStores.values()) {
            viewModelStore.clear();
        }
        this.viewModelStores.clear();
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    public ViewModelStore getViewModelStore(String str) {
        C8632dsu.c((Object) str, "");
        ViewModelStore viewModelStore = this.viewModelStores.get(str);
        if (viewModelStore == null) {
            ViewModelStore viewModelStore2 = new ViewModelStore();
            this.viewModelStores.put(str, viewModelStore2);
            return viewModelStore2;
        }
        return viewModelStore;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final NavControllerViewModel getInstance(ViewModelStore viewModelStore) {
            C8632dsu.c((Object) viewModelStore, "");
            return (NavControllerViewModel) new ViewModelProvider(viewModelStore, NavControllerViewModel.FACTORY, null, 4, null).get(NavControllerViewModel.class);
        }
    }
}
