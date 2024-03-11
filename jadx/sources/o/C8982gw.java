package o;

import dagger.hilt.EntryPoints;
import o.AbstractC8899fS;
import o.InterfaceC8888fH;
import o.InterfaceC8906fZ;

/* renamed from: o.gw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8982gw<VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> implements InterfaceC8906fZ<VM, S> {
    private final Class<? extends AbstractC8899fS<S>> b;

    public C8982gw(Class<? extends AbstractC8899fS<S>> cls) {
        C8632dsu.c((Object) cls, "");
        this.b = cls;
    }

    public S initialState(AbstractC8979gt abstractC8979gt) {
        return (S) InterfaceC8906fZ.b.d(this, abstractC8979gt);
    }

    public VM create(AbstractC8979gt abstractC8979gt, S s) {
        C8632dsu.c((Object) abstractC8979gt, "");
        C8632dsu.c((Object) s, "");
        InterfaceC8985gz<?, ?> interfaceC8985gz = ((InterfaceC8981gv) EntryPoints.get(((InterfaceC8984gy) EntryPoints.get(abstractC8979gt.j(), InterfaceC8984gy.class)).d().a(), InterfaceC8981gv.class)).c().get(this.b);
        VM vm = null;
        if (interfaceC8985gz == null) {
            interfaceC8985gz = null;
        }
        if (interfaceC8985gz != null) {
            vm = (VM) interfaceC8985gz.d(s);
        }
        C8632dsu.d(vm);
        return vm;
    }
}
