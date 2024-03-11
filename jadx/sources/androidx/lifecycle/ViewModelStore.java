package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.C8632dsu;

/* loaded from: classes.dex */
public class ViewModelStore {
    private final Map<String, ViewModel> map = new LinkedHashMap();

    public final void put(String str, ViewModel viewModel) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) viewModel, "");
        ViewModel put = this.map.put(str, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }

    public final ViewModel get(String str) {
        C8632dsu.c((Object) str, "");
        return this.map.get(str);
    }

    public final Set<String> keys() {
        return new HashSet(this.map.keySet());
    }

    public final void clear() {
        for (ViewModel viewModel : this.map.values()) {
            viewModel.clear();
        }
        this.map.clear();
    }
}
