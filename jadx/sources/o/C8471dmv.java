package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.dmv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8471dmv extends ViewModel {
    private final Map<String, ViewModelStore> d = new LinkedHashMap();

    public final ViewModelStore a(String str) {
        C8632dsu.c((Object) str, "");
        return this.d.remove(str);
    }

    /* renamed from: o.dmv$e */
    /* loaded from: classes5.dex */
    public static final class e implements ViewModelProvider.Factory {
        public static final e d = new e();

        private e() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            C8632dsu.c((Object) cls, "");
            return new C8471dmv();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
            C8632dsu.c((Object) cls, "");
            C8632dsu.c((Object) creationExtras, "");
            return (T) create(cls);
        }
    }

    public final ViewModelStore b(String str) {
        C8632dsu.c((Object) str, "");
        Map<String, ViewModelStore> map = this.d;
        ViewModelStore viewModelStore = map.get(str);
        if (viewModelStore == null) {
            viewModelStore = new ViewModelStore();
            map.put(str, viewModelStore);
        }
        return viewModelStore;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        for (Map.Entry<String, ViewModelStore> entry : this.d.entrySet()) {
            entry.getValue().clear();
        }
    }
}
