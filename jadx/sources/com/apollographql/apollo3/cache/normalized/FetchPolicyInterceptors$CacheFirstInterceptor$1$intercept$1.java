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
public final class FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    final /* synthetic */ C8951gR<D> b;
    Object c;
    int d;
    final /* synthetic */ InterfaceC9135jq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1(InterfaceC9135jq interfaceC9135jq, C8951gR<D> c8951gR, InterfaceC8585dra<? super FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = interfaceC9135jq;
        this.b = c8951gR;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1 fetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1 = new FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1(this.e, this.b, interfaceC8585dra);
        fetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1.a = obj;
        return fetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r8.d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            o.C8556dpz.d(r9)
            goto L9b
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.c
            o.gU r1 = (o.C8954gU) r1
            java.lang.Object r3 = r8.a
            o.dyQ r3 = (o.dyQ) r3
            o.C8556dpz.d(r9)
            goto L7e
        L2a:
            java.lang.Object r1 = r8.a
            o.dyQ r1 = (o.dyQ) r1
            o.C8556dpz.d(r9)
            goto L5b
        L32:
            o.C8556dpz.d(r9)
            java.lang.Object r9 = r8.a
            o.dyQ r9 = (o.dyQ) r9
            o.jq r1 = r8.e
            o.gR<D> r5 = r8.b
            o.gR$d r5 = r5.i()
            o.gR$d r5 = o.C9083ir.a(r5, r4)
            o.gR r5 = r5.c()
            o.dyS r1 = r1.a(r5)
            r8.a = r9
            r8.d = r4
            java.lang.Object r1 = o.dyR.d(r1, r8)
            if (r1 != r0) goto L58
            return r0
        L58:
            r7 = r1
            r1 = r9
            r9 = r7
        L5b:
            o.gU r9 = (o.C8954gU) r9
            o.gU$c r5 = r9.d()
            com.apollographql.apollo3.exception.ApolloException r6 = r9.a
            if (r6 != 0) goto L66
            goto L67
        L66:
            r4 = 0
        L67:
            o.gU$c r4 = r5.a(r4)
            o.gU r4 = r4.e()
            r8.a = r1
            r8.c = r9
            r8.d = r3
            java.lang.Object r3 = r1.emit(r4, r8)
            if (r3 != r0) goto L7c
            return r0
        L7c:
            r3 = r1
            r1 = r9
        L7e:
            com.apollographql.apollo3.exception.ApolloException r9 = r1.a
            if (r9 != 0) goto L85
            o.dpR r9 = o.dpR.c
            return r9
        L85:
            o.jq r9 = r8.e
            o.gR<D> r1 = r8.b
            o.dyS r9 = r9.a(r1)
            r1 = 0
            r8.a = r1
            r8.c = r1
            r8.d = r2
            java.lang.Object r9 = o.dyR.e(r3, r9, r8)
            if (r9 != r0) goto L9b
            return r0
        L9b:
            o.dpR r9 = o.dpR.c
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$CacheFirstInterceptor$1$intercept$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
