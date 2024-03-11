package o;

import com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1;
import com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1;
import com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1;
import o.C8951gR;
import o.InterfaceC8991hE;

/* renamed from: o.it  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9085it {
    private static final InterfaceC9136jr d = new a();
    private static final InterfaceC9136jr e = new d();
    private static final InterfaceC9136jr c = new b();
    private static final InterfaceC9136jr a = new e();
    private static final InterfaceC9136jr b = new c();

    public static final InterfaceC9136jr a() {
        return c;
    }

    public static final InterfaceC9136jr b() {
        return e;
    }

    public static final InterfaceC9136jr c() {
        return a;
    }

    public static final InterfaceC9136jr d() {
        return b;
    }

    public static final InterfaceC9136jr e() {
        return d;
    }

    /* renamed from: o.it$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC9136jr {
        a() {
        }

        @Override // o.InterfaceC9136jr
        public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
            C8632dsu.c((Object) c8951gR, "");
            C8632dsu.c((Object) interfaceC9135jq, "");
            return interfaceC9135jq.a(C9083ir.a((C8951gR.d) c8951gR.i(), true).c());
        }
    }

    /* renamed from: o.it$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC9136jr {
        d() {
        }

        @Override // o.InterfaceC9136jr
        public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
            C8632dsu.c((Object) c8951gR, "");
            C8632dsu.c((Object) interfaceC9135jq, "");
            return interfaceC9135jq.a(c8951gR);
        }
    }

    /* renamed from: o.it$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC9136jr {
        b() {
        }

        @Override // o.InterfaceC9136jr
        public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
            C8632dsu.c((Object) c8951gR, "");
            C8632dsu.c((Object) interfaceC9135jq, "");
            return dyR.d(new FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1(interfaceC9135jq, c8951gR, null));
        }
    }

    /* renamed from: o.it$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC9136jr {
        e() {
        }

        @Override // o.InterfaceC9136jr
        public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
            C8632dsu.c((Object) c8951gR, "");
            C8632dsu.c((Object) interfaceC9135jq, "");
            return dyR.d(new FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1(interfaceC9135jq, c8951gR, null));
        }
    }

    /* renamed from: o.it$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC9136jr {
        c() {
        }

        @Override // o.InterfaceC9136jr
        public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
            C8632dsu.c((Object) c8951gR, "");
            C8632dsu.c((Object) interfaceC9135jq, "");
            return dyR.d(new FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1(interfaceC9135jq, c8951gR, null));
        }
    }
}
