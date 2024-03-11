package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import o.C8632dsu;
import o.drM;

/* loaded from: classes2.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final Class<T> clazz;
    private final drM<CreationExtras, T> initializer;

    public final Class<T> getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final drM<CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelInitializer(Class<T> cls, drM<? super CreationExtras, ? extends T> drm) {
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) drm, "");
        this.clazz = cls;
        this.initializer = drm;
    }
}
