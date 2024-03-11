package o;

import com.apollographql.apollo3.cache.normalized.FetchPolicyRouterInterceptor$intercept$1;
import o.InterfaceC8991hE;

/* renamed from: o.iu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9086iu implements InterfaceC9136jr {
    public static final C9086iu d = new C9086iu();

    private C9086iu() {
    }

    @Override // o.InterfaceC9136jr
    public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
        C8632dsu.c((Object) c8951gR, "");
        C8632dsu.c((Object) interfaceC9135jq, "");
        if (!(c8951gR.h() instanceof InterfaceC8999hM)) {
            return interfaceC9135jq.a(c8951gR);
        }
        if (!C8947gN.a(c8951gR)) {
            return C9083ir.e(c8951gR).c(c8951gR, interfaceC9135jq);
        }
        return dyR.d(new FetchPolicyRouterInterceptor$intercept$1(c8951gR, interfaceC9135jq, null));
    }
}
