package o;

import com.apollographql.apollo3.api.http.HttpMethod;
import java.util.Collection;
import java.util.List;
import o.C8951gR;
import o.InterfaceC8991hE;
import o.InterfaceC8991hE.b;

/* renamed from: o.gI  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8942gI<D extends InterfaceC8991hE.b> implements InterfaceC9038hz<C8942gI<D>> {
    private InterfaceC9032ht a;
    private Boolean c;
    private Boolean d;
    private final C8944gK e;
    private final InterfaceC8991hE<D> f;
    private Boolean g;
    private List<C9006hT> h;
    private HttpMethod i;
    private Boolean j;
    private Boolean l;

    public List<C9006hT> a() {
        return this.h;
    }

    public C8942gI<D> a(Boolean bool) {
        this.j = bool;
        return this;
    }

    public C8942gI<D> b(Boolean bool) {
        this.c = bool;
        return this;
    }

    @Override // o.InterfaceC8988hB
    public InterfaceC9032ht b() {
        return this.a;
    }

    public Boolean c() {
        return this.c;
    }

    public C8942gI<D> c(HttpMethod httpMethod) {
        this.i = httpMethod;
        return this;
    }

    public final C8942gI<D> c(Boolean bool) {
        this.g = bool;
        return this;
    }

    public Boolean d() {
        return this.d;
    }

    public C8942gI<D> d(Boolean bool) {
        this.l = bool;
        return this;
    }

    public C8942gI<D> d(List<C9006hT> list) {
        this.h = list;
        return this;
    }

    public C8942gI<D> e(Boolean bool) {
        this.d = bool;
        return this;
    }

    public final InterfaceC8991hE<D> f() {
        return this.f;
    }

    public Boolean g() {
        return this.j;
    }

    public HttpMethod h() {
        return this.i;
    }

    public Boolean j() {
        return this.l;
    }

    public C8942gI(C8944gK c8944gK, InterfaceC8991hE<D> interfaceC8991hE) {
        C8632dsu.c((Object) c8944gK, "");
        C8632dsu.c((Object) interfaceC8991hE, "");
        this.e = c8944gK;
        this.f = interfaceC8991hE;
        this.a = InterfaceC9032ht.h;
    }

    @Override // o.InterfaceC9038hz
    /* renamed from: a */
    public C8942gI<D> e(InterfaceC9032ht interfaceC9032ht) {
        C8632dsu.c((Object) interfaceC9032ht, "");
        this.a = b().d(interfaceC9032ht);
        return this;
    }

    public C8942gI<D> e(String str, String str2) {
        List<C9006hT> b;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        List<C9006hT> a = a();
        if (a == null) {
            a = C8569dql.i();
        }
        b = C8576dqs.b((Collection<? extends C9006hT>) ((Collection<? extends Object>) a), new C9006hT(str, str2));
        this.h = b;
        return this;
    }

    public final C8942gI<D> e() {
        return new C8942gI(this.e, this.f).e(b()).c(h()).d(a()).c(this.g).a(g()).d(j()).b(c()).e(d());
    }

    public final dyS<C8954gU<D>> i() {
        return this.e.d(k(), C8632dsu.c(this.g, Boolean.TRUE), false);
    }

    private final C8951gR<D> k() {
        return new C8951gR.d(this.f).d(b()).e(h()).e(a()).d(g()).c(j()).e(c()).a(d()).c();
    }

    public final Object e(InterfaceC8585dra<? super C8954gU<D>> interfaceC8585dra) {
        return b(i(), interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(o.dyS<o.C8954gU<D>> r6, o.InterfaceC8585dra<? super o.C8954gU<D>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.apollographql.apollo3.ApolloCall$singleSuccessOrException$1
            if (r0 == 0) goto L13
            r0 = r7
            com.apollographql.apollo3.ApolloCall$singleSuccessOrException$1 r0 = (com.apollographql.apollo3.ApolloCall$singleSuccessOrException$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            com.apollographql.apollo3.ApolloCall$singleSuccessOrException$1 r0 = new com.apollographql.apollo3.ApolloCall$singleSuccessOrException$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            o.C8556dpz.d(r7)
            goto L3e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            o.C8556dpz.d(r7)
            r0.d = r4
            java.lang.Object r7 = o.dyR.c(r6, r3, r0, r4, r3)
            if (r7 != r1) goto L3e
            return r1
        L3e:
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L4e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r7.next()
            r2 = r1
            o.gU r2 = (o.C8954gU) r2
            com.apollographql.apollo3.exception.ApolloException r2 = r2.a
            if (r2 == 0) goto L63
            r6.add(r1)
            goto L4e
        L63:
            r0.add(r1)
            goto L4e
        L67:
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r6, r0)
            java.lang.Object r6 = r7.b()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r7.c()
            java.util.List r7 = (java.util.List) r7
            int r0 = r7.size()
            r1 = 2
            if (r0 == 0) goto L90
            if (r0 != r4) goto L88
            java.lang.Object r6 = o.C8570dqm.b(r7)
            o.gU r6 = (o.C8954gU) r6
            goto Ld3
        L88:
            com.apollographql.apollo3.exception.DefaultApolloException r6 = new com.apollographql.apollo3.exception.DefaultApolloException
            java.lang.String r7 = "The operation returned multiple items, use .toFlow() instead of .execute()"
            r6.<init>(r7, r3, r1, r3)
            throw r6
        L90:
            int r7 = r6.size()
            if (r7 == 0) goto Ld4
            if (r7 == r4) goto Lcd
            java.lang.Object r7 = o.C8570dqm.b(r6)
            o.gU r7 = (o.C8954gU) r7
            o.gU$c r0 = r7.d()
            java.util.List r6 = o.C8570dqm.c(r6, r4)
            com.apollographql.apollo3.exception.ApolloException r7 = r7.a
            o.C8632dsu.d(r7)
            java.util.Iterator r6 = r6.iterator()
        Laf:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lc4
            java.lang.Object r1 = r6.next()
            o.gU r1 = (o.C8954gU) r1
            com.apollographql.apollo3.exception.ApolloException r1 = r1.a
            o.C8632dsu.d(r1)
            o.C8549dps.e(r7, r1)
            goto Laf
        Lc4:
            o.gU$c r6 = r0.c(r7)
            o.gU r6 = r6.e()
            goto Ld3
        Lcd:
            java.lang.Object r6 = o.C8570dqm.b(r6)
            o.gU r6 = (o.C8954gU) r6
        Ld3:
            return r6
        Ld4:
            com.apollographql.apollo3.exception.DefaultApolloException r6 = new com.apollographql.apollo3.exception.DefaultApolloException
            java.lang.String r7 = "The operation did not emit any item, check your interceptor chain"
            r6.<init>(r7, r3, r1, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8942gI.b(o.dyS, o.dra):java.lang.Object");
    }
}
