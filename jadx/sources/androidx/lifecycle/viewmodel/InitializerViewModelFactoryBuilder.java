package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C8632dsu;
import o.InterfaceC8660dtv;
import o.drI;
import o.drM;

/* loaded from: classes2.dex */
public final class InitializerViewModelFactoryBuilder {
    private final List<ViewModelInitializer<?>> initializers = new ArrayList();

    public final <T extends ViewModel> void addInitializer(InterfaceC8660dtv<T> interfaceC8660dtv, drM<? super CreationExtras, ? extends T> drm) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) drm, "");
        this.initializers.add(new ViewModelInitializer<>(drI.e(interfaceC8660dtv), drm));
    }

    public final ViewModelProvider.Factory build() {
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) this.initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
