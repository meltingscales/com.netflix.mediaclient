package o;

import androidx.lifecycle.ViewModel;
import o.AbstractC8899fS;
import o.InterfaceC8888fH;

/* renamed from: o.gd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8963gd<VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> extends ViewModel {
    private final VM c;

    public final VM e() {
        return this.c;
    }

    public C8963gd(VM vm) {
        C8632dsu.c((Object) vm, "");
        this.c = vm;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.c.d();
    }
}
