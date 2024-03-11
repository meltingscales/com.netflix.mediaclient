package o;

import androidx.activity.ComponentActivity;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.hilt.EntryPoints;
import o.AbstractC8899fS;
import o.InterfaceC8888fH;
import o.InterfaceC8906fZ;

/* renamed from: o.aIy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1644aIy<VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> implements InterfaceC8906fZ<VM, S> {
    private final Class<? extends AbstractC8899fS<S>> c;

    public C1644aIy(Class<? extends AbstractC8899fS<S>> cls) {
        C8632dsu.c((Object) cls, "");
        this.c = cls;
    }

    public S initialState(AbstractC8979gt abstractC8979gt) {
        return (S) InterfaceC8906fZ.b.d(this, abstractC8979gt);
    }

    public VM create(AbstractC8979gt abstractC8979gt, S s) {
        C8632dsu.c((Object) abstractC8979gt, "");
        C8632dsu.c((Object) s, "");
        ComponentActivity c = abstractC8979gt.c();
        C8632dsu.d(c);
        InterfaceC8985gz<?, ?> interfaceC8985gz = ((InterfaceC1630aIk) EntryPoints.get(((InterfaceC1628aIi) C1642aIw.b((NetflixActivityBase) c, InterfaceC1628aIi.class)).q().d(), InterfaceC1630aIk.class)).b().get(this.c);
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
