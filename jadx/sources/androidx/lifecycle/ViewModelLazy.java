package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.InterfaceC8660dtv;
import o.drI;
import o.drO;

/* loaded from: classes2.dex */
public final class ViewModelLazy<VM extends ViewModel> implements InterfaceC8554dpx<VM> {
    private VM cached;
    private final drO<CreationExtras> extrasProducer;
    private final drO<ViewModelProvider.Factory> factoryProducer;
    private final drO<ViewModelStore> storeProducer;
    private final InterfaceC8660dtv<VM> viewModelClass;

    @Override // o.InterfaceC8554dpx
    public boolean isInitialized() {
        return this.cached != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(InterfaceC8660dtv<VM> interfaceC8660dtv, drO<? extends ViewModelStore> dro, drO<? extends ViewModelProvider.Factory> dro2, drO<? extends CreationExtras> dro3) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        C8632dsu.c((Object) dro3, "");
        this.viewModelClass = interfaceC8660dtv;
        this.storeProducer = dro;
        this.factoryProducer = dro2;
        this.extrasProducer = dro3;
    }

    @Override // o.InterfaceC8554dpx
    public VM getValue() {
        VM vm = this.cached;
        if (vm == null) {
            VM vm2 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(drI.e(this.viewModelClass));
            this.cached = vm2;
            return vm2;
        }
        return vm;
    }
}
