package o;

import com.netflix.mediaclient.graphqlrepo.impl.client.auth.UnauthenticatedErrorInterceptor$intercept$1;
import o.InterfaceC8991hE;

/* loaded from: classes3.dex */
public final class aCZ implements InterfaceC9136jr {
    private final InterfaceC1473aCp b;
    private boolean c;

    public aCZ(InterfaceC1473aCp interfaceC1473aCp) {
        C8632dsu.c((Object) interfaceC1473aCp, "");
        this.b = interfaceC1473aCp;
    }

    @Override // o.InterfaceC9136jr
    public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
        C8632dsu.c((Object) c8951gR, "");
        C8632dsu.c((Object) interfaceC9135jq, "");
        return dyR.d(new UnauthenticatedErrorInterceptor$intercept$1(interfaceC9135jq, c8951gR, this, null));
    }
}
