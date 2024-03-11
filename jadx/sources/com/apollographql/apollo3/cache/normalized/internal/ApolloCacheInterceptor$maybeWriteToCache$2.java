package com.apollographql.apollo3.cache.normalized.internal;

import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8951gR;
import o.C8954gU;
import o.C9028hp;
import o.C9061iV;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* loaded from: classes2.dex */
public final class ApolloCacheInterceptor$maybeWriteToCache$2 extends SuspendLambda implements drM<InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ C8954gU<D> b;
    final /* synthetic */ Set<String> c;
    final /* synthetic */ C8951gR<D> d;
    final /* synthetic */ C9028hp e;
    final /* synthetic */ C9061iV g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCacheInterceptor$maybeWriteToCache$2(C8954gU<D> c8954gU, C8951gR<D> c8951gR, C9061iV c9061iV, C9028hp c9028hp, Set<String> set, InterfaceC8585dra<? super ApolloCacheInterceptor$maybeWriteToCache$2> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.b = c8954gU;
        this.d = c8951gR;
        this.g = c9061iV;
        this.e = c9028hp;
        this.c = set;
    }

    @Override // o.drM
    /* renamed from: a */
    public final Object invoke(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ApolloCacheInterceptor$maybeWriteToCache$2) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new ApolloCacheInterceptor$maybeWriteToCache$2(this.b, this.d, this.g, this.e, this.c, interfaceC8585dra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r11.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            o.C8556dpz.d(r12)
            goto L89
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            o.C8556dpz.d(r12)
            goto L6b
        L1f:
            o.C8556dpz.d(r12)
            o.gU<D> r12 = r11.b
            D extends o.hE$b r12 = r12.d
            if (r12 == 0) goto L6e
            o.gR<D> r12 = r11.d
            o.iE r12 = o.C9083ir.a(r12)
            o.gU<D> r1 = r11.b
            o.iE r1 = o.C9083ir.d(r1)
            o.iE r12 = r12.a(r1)
            o.gR<D> r1 = r11.d
            boolean r1 = o.C9083ir.j(r1)
            if (r1 == 0) goto L4a
            o.iV$c r1 = o.C9061iV.a
            o.iE r1 = o.C9061iV.c.d(r1)
            o.iE r12 = r12.a(r1)
        L4a:
            r8 = r12
            o.iV r12 = r11.g
            o.io r4 = r12.e()
            o.gR<D> r12 = r11.d
            o.hE r5 = r12.h()
            o.gU<D> r12 = r11.b
            D extends o.hE$b r6 = r12.d
            o.C8632dsu.d(r6)
            o.hp r7 = r11.e
            r11.a = r3
            r9 = 0
            r10 = r11
            java.lang.Object r12 = r4.d(r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L6b
            return r0
        L6b:
            java.util.Set r12 = (java.util.Set) r12
            goto L72
        L6e:
            java.util.Set r12 = o.dqL.a()
        L72:
            o.iV r1 = r11.g
            o.io r1 = r1.e()
            java.util.Set<java.lang.String> r3 = r11.c
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r12 = o.dqL.b(r12, r3)
            r11.a = r2
            java.lang.Object r12 = r1.c(r12, r11)
            if (r12 != r0) goto L89
            return r0
        L89:
            o.dpR r12 = o.dpR.c
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$maybeWriteToCache$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
