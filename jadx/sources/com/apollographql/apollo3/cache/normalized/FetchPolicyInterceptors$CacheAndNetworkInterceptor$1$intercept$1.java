package com.apollographql.apollo3.cache.normalized;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8951gR;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.InterfaceC9135jq;
import o.dpR;
import o.drX;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C8951gR<D> b;
    int c;
    final /* synthetic */ InterfaceC9135jq d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1(InterfaceC9135jq interfaceC9135jq, C8951gR<D> c8951gR, InterfaceC8585dra<? super FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = interfaceC9135jq;
        this.b = c8951gR;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1 fetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1 = new FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1(this.d, this.b, interfaceC8585dra);
        fetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1.e = obj;
        return fetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            o.C8556dpz.d(r8)
            goto L84
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r1 = r7.e
            o.dyQ r1 = (o.dyQ) r1
            o.C8556dpz.d(r8)
            goto L70
        L25:
            java.lang.Object r1 = r7.e
            o.dyQ r1 = (o.dyQ) r1
            o.C8556dpz.d(r8)
            goto L56
        L2d:
            o.C8556dpz.d(r8)
            java.lang.Object r8 = r7.e
            o.dyQ r8 = (o.dyQ) r8
            o.jq r1 = r7.d
            o.gR<D> r5 = r7.b
            o.gR$d r5 = r5.i()
            o.gR$d r5 = o.C9083ir.a(r5, r4)
            o.gR r5 = r5.c()
            o.dyS r1 = r1.a(r5)
            r7.e = r8
            r7.c = r4
            java.lang.Object r1 = o.dyR.d(r1, r7)
            if (r1 != r0) goto L53
            return r0
        L53:
            r6 = r1
            r1 = r8
            r8 = r6
        L56:
            o.gU r8 = (o.C8954gU) r8
            o.gU$c r8 = r8.d()
            r4 = 0
            o.gU$c r8 = r8.a(r4)
            o.gU r8 = r8.e()
            r7.e = r1
            r7.c = r3
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L70
            return r0
        L70:
            o.jq r8 = r7.d
            o.gR<D> r3 = r7.b
            o.dyS r8 = r8.a(r3)
            r3 = 0
            r7.e = r3
            r7.c = r2
            java.lang.Object r8 = o.dyR.e(r1, r8, r7)
            if (r8 != r0) goto L84
            return r0
        L84:
            o.dpR r8 = o.dpR.c
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$CacheAndNetworkInterceptor$1$intercept$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
