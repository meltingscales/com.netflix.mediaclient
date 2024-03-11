package com.apollographql.apollo3.network.http;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.network.http.HttpNetworkTransport;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8576dqs;
import o.C8586drb;
import o.C8632dsu;
import o.C8951gR;
import o.C8954gU;
import o.C9008hV;
import o.C9009hW;
import o.C9028hp;
import o.C9094jB;
import o.C9098jF;
import o.C9144jz;
import o.InterfaceC8585dra;
import o.InterfaceC8991hE;
import o.InterfaceC9103jK;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class HttpNetworkTransport$execute$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C9028hp a;
    long b;
    int c;
    final /* synthetic */ C9008hV d;
    final /* synthetic */ C8951gR<D> e;
    private /* synthetic */ Object f;
    final /* synthetic */ HttpNetworkTransport g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpNetworkTransport$execute$1(HttpNetworkTransport httpNetworkTransport, C9008hV c9008hV, C8951gR<D> c8951gR, C9028hp c9028hp, InterfaceC8585dra<? super HttpNetworkTransport$execute$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.g = httpNetworkTransport;
        this.d = c9008hV;
        this.e = c8951gR;
        this.a = c9028hp;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((HttpNetworkTransport$execute$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        HttpNetworkTransport$execute$1 httpNetworkTransport$execute$1 = new HttpNetworkTransport$execute$1(this.g, this.d, this.e, this.a, interfaceC8585dra);
        httpNetworkTransport$execute$1.f = obj;
        return httpNetworkTransport$execute$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.dyQ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o.dyQ] */
    /* JADX WARN: Type inference failed for: r1v7, types: [o.dyQ] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        C9009hW c9009hW;
        ?? r1;
        dyS a;
        long e2;
        HttpNetworkTransport.a aVar;
        List b;
        e = C8586drb.e();
        int i = this.c;
        try {
        } catch (ApolloException e3) {
            e = e3;
            c9009hW = null;
            r1 = i;
        }
        if (i == 0) {
            C8556dpz.d(obj);
            ?? r12 = (dyQ) this.f;
            e2 = C9094jB.e();
            List<InterfaceC9103jK> b2 = this.g.b();
            aVar = this.g.d;
            b = C8576dqs.b((Collection<? extends HttpNetworkTransport.a>) ((Collection<? extends Object>) b2), aVar);
            C9098jF c9098jF = new C9098jF(b, 0);
            C9008hV c9008hV = this.d;
            this.f = r12;
            this.b = e2;
            this.c = 1;
            obj = c9098jF.a(c9008hV, this);
            i = r12;
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            e2 = this.b;
            ?? r13 = (dyQ) this.f;
            C8556dpz.d(obj);
            i = r13;
        }
        c9009hW = (C9009hW) obj;
        e = null;
        r1 = i;
        long j = e2;
        if (c9009hW == null) {
            HttpNetworkTransport httpNetworkTransport = this.g;
            InterfaceC8991hE<D> h = this.e.h();
            C8632dsu.d(e);
            a = dyR.c(httpNetworkTransport.c(h, e));
        } else {
            int d = c9009hW.d();
            a = (200 > d || d >= 300) ? this.g.a(this.e.h(), c9009hW) : C9144jz.e(c9009hW) ? this.g.b(this.e.h(), this.a, c9009hW) : this.g.e(this.e.h(), this.a, c9009hW);
        }
        c cVar = new c(a, this.g, this.e, c9009hW, j);
        this.f = null;
        this.c = 2;
        if (dyR.e((dyQ) r1, cVar, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* loaded from: classes2.dex */
    public static final class c implements dyS<C8954gU<D>> {
        final /* synthetic */ long a;
        final /* synthetic */ HttpNetworkTransport b;
        final /* synthetic */ C9009hW c;
        final /* synthetic */ dyS d;
        final /* synthetic */ C8951gR e;

        public c(dyS dys, HttpNetworkTransport httpNetworkTransport, C8951gR c8951gR, C9009hW c9009hW, long j) {
            this.d = dys;
            this.b = httpNetworkTransport;
            this.e = c8951gR;
            this.c = c9009hW;
            this.a = j;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.d.collect(new AnonymousClass2(dyq, this.b, this.e, this.c, this.a), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1$c$2  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass2<T> implements dyQ {
            final /* synthetic */ HttpNetworkTransport a;
            final /* synthetic */ C8951gR b;
            final /* synthetic */ C9009hW c;
            final /* synthetic */ long d;
            final /* synthetic */ dyQ e;

            public AnonymousClass2(dyQ dyq, HttpNetworkTransport httpNetworkTransport, C8951gR c8951gR, C9009hW c9009hW, long j) {
                this.e = dyq;
                this.a = httpNetworkTransport;
                this.b = c8951gR;
                this.c = c9009hW;
                this.d = j;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r11, o.InterfaceC8585dra r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r12
                    com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r10, r12)
                L18:
                    java.lang.Object r12 = r0.b
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r12)
                    goto L52
                L29:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L31:
                    o.C8556dpz.d(r12)
                    o.dyQ r12 = r10.e
                    r5 = r11
                    o.gU r5 = (o.C8954gU) r5
                    com.apollographql.apollo3.network.http.HttpNetworkTransport r4 = r10.a
                    o.gR r11 = r10.b
                    java.util.UUID r6 = r11.j()
                    o.hW r7 = r10.c
                    long r8 = r10.d
                    o.gU r11 = com.apollographql.apollo3.network.http.HttpNetworkTransport.b(r4, r5, r6, r7, r8)
                    r0.c = r3
                    java.lang.Object r11 = r12.emit(r11, r0)
                    if (r11 != r1) goto L52
                    return r1
                L52:
                    o.dpR r11 = o.dpR.c
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1.c.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}
