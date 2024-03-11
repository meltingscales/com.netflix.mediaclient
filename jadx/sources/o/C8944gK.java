package o;

import com.apollographql.apollo3.ApolloClient$executeAsFlow$1$1;
import com.apollographql.apollo3.api.http.HttpMethod;
import com.apollographql.apollo3.network.http.HttpNetworkTransport;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.AbstractC9107jO;
import o.C8951gR;
import o.C9028hp;
import o.C9110jR;
import o.InterfaceC8990hD;
import o.InterfaceC8991hE;
import o.InterfaceC8999hM;

/* renamed from: o.gK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8944gK implements InterfaceC8988hB, Closeable {
    public static final b c = new b(null);
    private final C8945gL a;
    private final e d;
    private final Boolean e;
    private final dwQ f;
    private final Boolean g;
    private final InterfaceC9032ht h;
    private final C9028hp i;
    private final List<C9006hT> j;
    private final List<InterfaceC9136jr> k;
    private final HttpMethod l;
    private final C9139ju m;
    private final Boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC9095jC f13869o;
    private final Boolean p;
    private final InterfaceC9095jC s;

    public /* synthetic */ C8944gK(InterfaceC9095jC interfaceC9095jC, C9028hp c9028hp, InterfaceC9095jC interfaceC9095jC2, List list, InterfaceC9032ht interfaceC9032ht, dwQ dwq, HttpMethod httpMethod, List list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, e eVar, C8627dsp c8627dsp) {
        this(interfaceC9095jC, c9028hp, interfaceC9095jC2, list, interfaceC9032ht, dwq, httpMethod, list2, bool, bool2, bool3, bool4, eVar);
    }

    public HttpMethod a() {
        return this.l;
    }

    @Override // o.InterfaceC8988hB
    public InterfaceC9032ht b() {
        return this.h;
    }

    public Boolean c() {
        return this.g;
    }

    public List<C9006hT> d() {
        return this.j;
    }

    public final List<InterfaceC9136jr> e() {
        return this.k;
    }

    public Boolean i() {
        return this.n;
    }

    public Boolean j() {
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8944gK(InterfaceC9095jC interfaceC9095jC, C9028hp c9028hp, InterfaceC9095jC interfaceC9095jC2, List<? extends InterfaceC9136jr> list, InterfaceC9032ht interfaceC9032ht, dwQ dwq, HttpMethod httpMethod, List<C9006hT> list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, e eVar) {
        this.f13869o = interfaceC9095jC;
        this.i = c9028hp;
        this.s = interfaceC9095jC2;
        this.k = list;
        this.h = interfaceC9032ht;
        this.f = dwq;
        this.l = httpMethod;
        this.j = list2;
        this.n = bool;
        this.p = bool2;
        this.g = bool3;
        this.e = bool4;
        this.d = eVar;
        dwq = dwq == null ? C9141jw.a() : dwq;
        C8945gL c8945gL = new C8945gL(dwq, dwY.c(dwq));
        this.a = c8945gL;
        this.m = new C9139ju(interfaceC9095jC, interfaceC9095jC2, c8945gL.c());
    }

    public final <D extends InterfaceC8999hM.c> C8942gI<D> d(InterfaceC8999hM<D> interfaceC8999hM) {
        C8632dsu.c((Object) interfaceC8999hM, "");
        return new C8942gI<>(this, interfaceC8999hM);
    }

    public final <D extends InterfaceC8990hD.b> C8942gI<D> c(InterfaceC8990hD<D> interfaceC8990hD) {
        C8632dsu.c((Object) interfaceC8990hD, "");
        return new C8942gI<>(this, interfaceC8990hD);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dwY.d(this.a.e(), null, 1, null);
        this.f13869o.a();
        this.s.a();
    }

    public final <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> d(C8951gR<D> c8951gR, boolean z, boolean z2) {
        List b2;
        C8632dsu.c((Object) c8951gR, "");
        C8951gR.d<D> e2 = new C8951gR.d(c8951gR.h()).e(this.a).e(this.i).e(this.a.d(this.i).d(b()).d(c8951gR.b())).e(c8951gR.b()).e(a()).d(i()).c(j()).e(c());
        if (c8951gR.d() != null) {
            e2.e(c8951gR.d());
        }
        List<C9006hT> c2 = c8951gR.c();
        if (c2 == null) {
            c2 = C8569dql.i();
        }
        if (!z) {
            List<C9006hT> d = d();
            if (d == null) {
                d = C8569dql.i();
            }
            c2 = C8576dqs.g((Collection) d, (Iterable) c2);
        }
        e2.e(c2);
        if (c8951gR.f() != null) {
            e2.d(c8951gR.f());
        }
        if (c8951gR.g() != null) {
            e2.c(c8951gR.g());
        }
        if (c8951gR.e() != null) {
            e2.e(c8951gR.e());
        }
        if (c8951gR.a() != null) {
            e2.d("X-APOLLO-CAN-BE-BATCHED", String.valueOf(c8951gR.a()));
        }
        C8951gR<D> c3 = e2.c();
        b2 = C8576dqs.b((Collection<? extends C9139ju>) ((Collection<? extends Object>) this.k), this.m);
        dyS<C8954gU<D>> a = new C9138jt(b2, 0).a(c3);
        return z2 ? dyR.a((dyS) a, (drX) new ApolloClient$executeAsFlow$1$1(null)) : a;
    }

    /* renamed from: o.gK$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC9038hz<e> {
        private InterfaceC9095jC a;
        private Boolean c;
        private final C9028hp.d d = new C9028hp.d();
        private final List<InterfaceC9136jr> e;
        private InterfaceC9101jI f;
        private Boolean g;
        private dwQ h;
        private InterfaceC9032ht i;
        private Boolean j;
        private HttpMethod k;
        private final List<InterfaceC9103jK> l;
        private List<C9006hT> m;
        private String n;

        /* renamed from: o  reason: collision with root package name */
        private final List<InterfaceC9136jr> f13870o;
        private Boolean p;
        private Boolean q;
        private Long r;
        private InterfaceC9095jC s;
        private InterfaceC9111jS t;
        private String u;
        private drM<? super InterfaceC8585dra<? super String>, ? extends Object> v;
        private AbstractC9107jO.c x;
        private InterfaceC8612dsa<? super Throwable, ? super Long, ? super InterfaceC8585dra<? super Boolean>, ? extends Object> y;

        public Boolean a() {
            return this.j;
        }

        public final e b(InterfaceC9095jC interfaceC9095jC) {
            C8632dsu.c((Object) interfaceC9095jC, "");
            this.a = interfaceC9095jC;
            return this;
        }

        @Override // o.InterfaceC8988hB
        public InterfaceC9032ht b() {
            return this.i;
        }

        public Boolean c() {
            return this.c;
        }

        public final e c(dwQ dwq) {
            this.h = dwq;
            return this;
        }

        public List<C9006hT> e() {
            return this.m;
        }

        public HttpMethod g() {
            return this.k;
        }

        public Boolean h() {
            return this.p;
        }

        public Boolean i() {
            return this.q;
        }

        public final List<InterfaceC9136jr> j() {
            return this.f13870o;
        }

        public e() {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            this.f13870o = arrayList;
            this.l = new ArrayList();
            this.i = InterfaceC9032ht.h;
        }

        public e b(String str, String str2) {
            List<C9006hT> b;
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            List<C9006hT> e = e();
            if (e == null) {
                e = C8569dql.i();
            }
            b = C8576dqs.b((Collection<? extends C9006hT>) ((Collection<? extends Object>) e), new C9006hT(str, str2));
            this.m = b;
            return this;
        }

        public final e b(InterfaceC9136jr interfaceC9136jr) {
            C8632dsu.c((Object) interfaceC9136jr, "");
            this.e.add(interfaceC9136jr);
            return this;
        }

        @Override // o.InterfaceC9038hz
        /* renamed from: d */
        public e e(InterfaceC9032ht interfaceC9032ht) {
            C8632dsu.c((Object) interfaceC9032ht, "");
            this.i = b().d(interfaceC9032ht);
            return this;
        }

        public final C8944gK d() {
            InterfaceC9095jC b;
            InterfaceC9095jC interfaceC9095jC;
            if (this.a != null) {
                if (this.n != null) {
                    throw new IllegalStateException("Apollo: 'httpServerUrl' has no effect if 'networkTransport' is set".toString());
                }
                if (this.f != null) {
                    throw new IllegalStateException("Apollo: 'httpEngine' has no effect if 'networkTransport' is set".toString());
                }
                if (!this.l.isEmpty()) {
                    throw new IllegalStateException("Apollo: 'addHttpInterceptor' has no effect if 'networkTransport' is set".toString());
                }
                if (this.g != null) {
                    throw new IllegalStateException("Apollo: 'httpExposeErrorBody' has no effect if 'networkTransport' is set".toString());
                }
                b = this.a;
                C8632dsu.d(b);
            } else if (this.n == null) {
                throw new IllegalStateException("Apollo: 'serverUrl' is required".toString());
            } else {
                HttpNetworkTransport.d dVar = new HttpNetworkTransport.d();
                String str = this.n;
                C8632dsu.d((Object) str);
                HttpNetworkTransport.d e = dVar.e(str);
                InterfaceC9101jI interfaceC9101jI = this.f;
                if (interfaceC9101jI != null) {
                    C8632dsu.d(interfaceC9101jI);
                    e.a(interfaceC9101jI);
                }
                Boolean bool = this.g;
                if (bool != null) {
                    C8632dsu.d(bool);
                    e.d(bool.booleanValue());
                }
                b = e.a(this.l).b();
            }
            InterfaceC9095jC interfaceC9095jC2 = b;
            InterfaceC9095jC interfaceC9095jC3 = this.s;
            if (interfaceC9095jC3 == null) {
                String str2 = this.u;
                if (str2 == null) {
                    str2 = this.n;
                }
                if (str2 != null) {
                    C9110jR.c c = new C9110jR.c().c(str2);
                    InterfaceC9111jS interfaceC9111jS = this.t;
                    if (interfaceC9111jS != null) {
                        C8632dsu.d(interfaceC9111jS);
                        c.a(interfaceC9111jS);
                    }
                    Long l = this.r;
                    if (l != null) {
                        C8632dsu.d(l);
                        c.c(l.longValue());
                    }
                    AbstractC9107jO.c cVar = this.x;
                    if (cVar != null) {
                        C8632dsu.d(cVar);
                        c.e(cVar);
                    }
                    InterfaceC8612dsa<? super Throwable, ? super Long, ? super InterfaceC8585dra<? super Boolean>, ? extends Object> interfaceC8612dsa = this.y;
                    if (interfaceC8612dsa != null) {
                        c.b(interfaceC8612dsa);
                    }
                    drM<? super InterfaceC8585dra<? super String>, ? extends Object> drm = this.v;
                    if (drm != null) {
                        c.d(drm);
                    }
                    interfaceC9095jC3 = c.c();
                } else {
                    interfaceC9095jC = interfaceC9095jC2;
                    return new C8944gK(interfaceC9095jC2, this.d.e(), interfaceC9095jC, this.e, b(), this.h, g(), e(), i(), h(), a(), c(), this, null);
                }
            } else if (this.u != null) {
                throw new IllegalStateException("Apollo: 'webSocketServerUrl' has no effect if 'subscriptionNetworkTransport' is set".toString());
            } else {
                if (this.t != null) {
                    throw new IllegalStateException("Apollo: 'webSocketEngine' has no effect if 'subscriptionNetworkTransport' is set".toString());
                }
                if (this.r != null) {
                    throw new IllegalStateException("Apollo: 'webSocketIdleTimeoutMillis' has no effect if 'subscriptionNetworkTransport' is set".toString());
                }
                if (this.x != null) {
                    throw new IllegalStateException("Apollo: 'wsProtocolFactory' has no effect if 'subscriptionNetworkTransport' is set".toString());
                }
                if (this.y != null) {
                    throw new IllegalStateException("Apollo: 'webSocketReopenWhen' has no effect if 'subscriptionNetworkTransport' is set".toString());
                }
                if (this.v != null) {
                    throw new IllegalStateException("Apollo: 'webSocketReopenServerUrl' has no effect if 'subscriptionNetworkTransport' is set".toString());
                }
                C8632dsu.d(interfaceC9095jC3);
            }
            interfaceC9095jC = interfaceC9095jC3;
            return new C8944gK(interfaceC9095jC2, this.d.e(), interfaceC9095jC, this.e, b(), this.h, g(), e(), i(), h(), a(), c(), this, null);
        }
    }

    /* renamed from: o.gK$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
