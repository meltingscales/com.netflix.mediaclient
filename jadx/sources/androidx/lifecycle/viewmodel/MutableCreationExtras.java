package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras() {
        this(null, 1, null);
    }

    public MutableCreationExtras(CreationExtras creationExtras) {
        C8632dsu.c((Object) creationExtras, "");
        getMap$lifecycle_viewmodel_release().putAll(creationExtras.getMap$lifecycle_viewmodel_release());
    }

    public /* synthetic */ MutableCreationExtras(CreationExtras creationExtras, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(CreationExtras.Key<T> key, T t) {
        C8632dsu.c((Object) key, "");
        getMap$lifecycle_viewmodel_release().put(key, t);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public <T> T get(CreationExtras.Key<T> key) {
        C8632dsu.c((Object) key, "");
        return (T) getMap$lifecycle_viewmodel_release().get(key);
    }
}
