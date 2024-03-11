package o;

import com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1;
import com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$interceptQuery$1;
import com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$interceptSubscription$1;
import com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$maybeAsync$2;
import com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$maybeWriteToCache$2;
import com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$2;
import java.util.Set;
import o.C9044iE;
import o.InterfaceC8990hD;
import o.InterfaceC8991hE;
import o.InterfaceC8999hM;
import o.InterfaceC9032ht;

/* renamed from: o.iV  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9061iV implements InterfaceC9136jr {
    public static final c a = new c(null);
    private final InterfaceC9080io c;

    public final InterfaceC9080io e() {
        return this.c;
    }

    public C9061iV(InterfaceC9080io interfaceC9080io) {
        C8632dsu.c((Object) interfaceC9080io, "");
        this.c = interfaceC9080io;
    }

    private final <D extends InterfaceC8991hE.b> Object d(C8951gR<D> c8951gR, drM<? super InterfaceC8585dra<? super dpR>, ? extends Object> drm, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        if (C9083ir.f(c8951gR)) {
            InterfaceC9032ht.e d2 = c8951gR.b().d(C8945gL.e);
            C8632dsu.d(d2);
            C8737dwr.c(((C8945gL) d2).e(), null, null, new ApolloCacheInterceptor$maybeAsync$2(drm, null), 3, null);
            return dpR.c;
        }
        Object invoke = drm.invoke(interfaceC8585dra);
        e = C8586drb.e();
        return invoke == e ? invoke : dpR.c;
    }

    public static /* synthetic */ Object b(C9061iV c9061iV, C8951gR c8951gR, C8954gU c8954gU, C9028hp c9028hp, Set set, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        Set e;
        Set set2 = set;
        if ((i & 8) != 0) {
            e = dqN.e();
            set2 = e;
        }
        return c9061iV.e(c8951gR, c8954gU, c9028hp, set2, interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC8991hE.b> Object e(C8951gR<D> c8951gR, C8954gU<D> c8954gU, C9028hp c9028hp, Set<String> set, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        if (C9083ir.c(c8951gR)) {
            return dpR.c;
        }
        if (c8954gU.d == null) {
            return dpR.c;
        }
        if (c8954gU.a() && !C9083ir.i(c8951gR)) {
            return dpR.c;
        }
        Object d2 = d(c8951gR, new ApolloCacheInterceptor$maybeWriteToCache$2(c8954gU, c8951gR, this, c9028hp, set, null), interfaceC8585dra);
        e = C8586drb.e();
        return d2 == e ? d2 : dpR.c;
    }

    @Override // o.InterfaceC9136jr
    public <D extends InterfaceC8991hE.b> dyS<C8954gU<D>> c(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
        dyS a2;
        C8632dsu.c((Object) c8951gR, "");
        C8632dsu.c((Object) interfaceC9135jq, "");
        InterfaceC8991hE<D> h = c8951gR.h();
        if (h instanceof InterfaceC8995hI) {
            a2 = e(c8951gR, interfaceC9135jq);
            C8632dsu.d(a2);
        } else if (h instanceof InterfaceC8990hD) {
            a2 = b(c8951gR, interfaceC9135jq);
            C8632dsu.d(a2);
        } else if (h instanceof InterfaceC8999hM) {
            a2 = a(c8951gR, interfaceC9135jq);
            C8632dsu.d(a2);
        } else {
            throw new IllegalStateException(("Unknown operation " + c8951gR.h()).toString());
        }
        InterfaceC9032ht.e d2 = c8951gR.b().d(C8945gL.e);
        C8632dsu.d(d2);
        return dyR.a(a2, ((C8945gL) d2).c());
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* renamed from: o.iV$d */
    /* loaded from: classes2.dex */
    public static final class d<D> implements dyS<C8954gU<D>> {
        final /* synthetic */ long a;
        final /* synthetic */ dyS c;

        public d(dyS dys, long j) {
            this.c = dys;
            this.a = j;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.c.collect(new AnonymousClass5(dyq, this.a), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.iV$d$5  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass5<T> implements dyQ {
            final /* synthetic */ dyQ b;
            final /* synthetic */ long d;

            public AnonymousClass5(dyQ dyq, long j) {
                this.b = dyq;
                this.d = j;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, o.InterfaceC8585dra r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2$1 r0 = (com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2$1 r0 = new com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2$1
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.d
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r9)
                    goto L6a
                L29:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L31:
                    o.C8556dpz.d(r9)
                    o.dyQ r9 = r7.b
                    o.gU r8 = (o.C8954gU) r8
                    o.gU$c r2 = r8.d()
                    o.im$b r4 = new o.im$b
                    r4.<init>()
                    long r5 = r7.d
                    o.im$b r4 = r4.b(r5)
                    long r5 = o.C9094jB.e()
                    o.im$b r4 = r4.d(r5)
                    com.apollographql.apollo3.exception.ApolloException r8 = r8.a
                    o.im$b r8 = r4.c(r8)
                    o.im r8 = r8.b()
                    o.gU$c r8 = o.C9083ir.c(r2, r8)
                    o.gU r8 = r8.e()
                    r0.c = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L6a
                    return r1
                L6a:
                    o.dpR r8 = o.dpR.c
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C9061iV.d.AnonymousClass5.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    private final <D> dyS<C8954gU<D>> e(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
        return dyR.a(interfaceC9135jq.a(c8951gR), (drX) new ApolloCacheInterceptor$interceptSubscription$1(this, c8951gR, c(c8951gR), null));
    }

    public final <D extends InterfaceC8991hE.b> C9028hp c(C8951gR<D> c8951gR) {
        C8632dsu.c((Object) c8951gR, "");
        InterfaceC9032ht.e d2 = c8951gR.b().d(C9028hp.b);
        C8632dsu.d(d2);
        return (C9028hp) d2;
    }

    private final <D extends InterfaceC8990hD.b> dyS<C8954gU<D>> b(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
        return dyR.d(new ApolloCacheInterceptor$interceptMutation$1(c8951gR, this, c(c8951gR), interfaceC9135jq, null));
    }

    private final <D extends InterfaceC8999hM.c> dyS<C8954gU<D>> a(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq) {
        return dyR.d(new ApolloCacheInterceptor$interceptQuery$1(C9083ir.b(c8951gR), this, c8951gR, c(c8951gR), interfaceC9135jq, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <D extends o.InterfaceC8999hM.c> java.lang.Object a(o.C8951gR<D> r8, o.C9028hp r9, o.InterfaceC8585dra<? super o.C8954gU<D>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromCache$1
            if (r0 == 0) goto L13
            r0 = r10
            com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromCache$1 r0 = (com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromCache$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromCache$1 r0 = new com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromCache$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.a
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            long r8 = r0.d
            java.lang.Object r1 = r0.c
            o.hE r1 = (o.InterfaceC8991hE) r1
            java.lang.Object r0 = r0.e
            o.gR r0 = (o.C8951gR) r0
            o.C8556dpz.d(r10)     // Catch: com.apollographql.apollo3.exception.CacheMissException -> L35
            r4 = r8
            r8 = r0
            goto L63
        L35:
            r10 = move-exception
            r4 = r8
            r8 = r0
            goto La5
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            o.C8556dpz.d(r10)
            o.hE r10 = r8.h()
            long r4 = o.C9094jB.e()
            o.io r2 = r7.c     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            o.iE r6 = o.C9083ir.a(r8)     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            r0.e = r8     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            r0.c = r10     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            r0.d = r4     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            r0.a = r3     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            java.lang.Object r9 = r2.b(r10, r9, r6, r0)     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La2
            if (r9 != r1) goto L61
            return r1
        L61:
            r1 = r10
            r10 = r9
        L63:
            o.hM$c r10 = (o.InterfaceC8999hM.c) r10     // Catch: com.apollographql.apollo3.exception.CacheMissException -> La0
            java.util.UUID r9 = r8.j()
            o.gU$c r0 = new o.gU$c
            r0.<init>(r1, r9)
            o.gU$c r9 = r0.e(r10)
            o.ht r8 = r8.b()
            o.gU$c r8 = r9.a(r8)
            o.im$b r9 = new o.im$b
            r9.<init>()
            o.im$b r9 = r9.c(r4)
            long r0 = o.C9094jB.e()
            o.im$b r9 = r9.e(r0)
            o.im$b r9 = r9.e(r3)
            o.im r9 = r9.b()
            o.gU$c r8 = o.C9083ir.c(r8, r9)
            o.gU$c r8 = r8.a(r3)
            o.gU r8 = r8.e()
            return r8
        La0:
            r10 = move-exception
            goto La5
        La2:
            r9 = move-exception
            r1 = r10
            r10 = r9
        La5:
            java.util.UUID r9 = r8.j()
            o.gU$c r0 = new o.gU$c
            r0.<init>(r1, r9)
            o.gU$c r9 = r0.c(r10)
            o.ht r8 = r8.b()
            o.gU$c r8 = r9.a(r8)
            o.im$b r9 = new o.im$b
            r9.<init>()
            o.im$b r9 = r9.c(r4)
            long r0 = o.C9094jB.e()
            o.im$b r9 = r9.e(r0)
            r0 = 0
            o.im$b r9 = r9.e(r0)
            o.im$b r9 = r9.e(r10)
            o.im r9 = r9.b()
            o.gU$c r8 = o.C9083ir.c(r8, r9)
            o.gU$c r8 = r8.a(r3)
            o.gU r8 = r8.e()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9061iV.a(o.gR, o.hp, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC8991hE.b> Object b(C8951gR<D> c8951gR, InterfaceC9135jq interfaceC9135jq, C9028hp c9028hp, InterfaceC8585dra<? super dyS<C8954gU<D>>> interfaceC8585dra) {
        return new d(dyR.a((dyS) interfaceC9135jq.a(c8951gR), (drX) new ApolloCacheInterceptor$readFromNetwork$2(this, c8951gR, c9028hp, null)), C9094jB.e());
    }

    /* renamed from: o.iV$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C9044iE b() {
            return new C9044iE.b().d("apollo-date", String.valueOf(C9094jB.e() / 1000)).e();
        }
    }
}
