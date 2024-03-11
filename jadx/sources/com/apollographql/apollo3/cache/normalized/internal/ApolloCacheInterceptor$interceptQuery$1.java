package com.apollographql.apollo3.cache.normalized.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8951gR;
import o.C8954gU;
import o.C9028hp;
import o.C9061iV;
import o.InterfaceC8585dra;
import o.InterfaceC9135jq;
import o.dpR;
import o.drX;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class ApolloCacheInterceptor$interceptQuery$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C8951gR<D> a;
    final /* synthetic */ boolean b;
    int c;
    final /* synthetic */ C9028hp d;
    final /* synthetic */ InterfaceC9135jq e;
    private /* synthetic */ Object i;
    final /* synthetic */ C9061iV j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCacheInterceptor$interceptQuery$1(boolean z, C9061iV c9061iV, C8951gR<D> c8951gR, C9028hp c9028hp, InterfaceC9135jq interfaceC9135jq, InterfaceC8585dra<? super ApolloCacheInterceptor$interceptQuery$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = z;
        this.j = c9061iV;
        this.a = c8951gR;
        this.d = c9028hp;
        this.e = interfaceC9135jq;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ApolloCacheInterceptor$interceptQuery$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ApolloCacheInterceptor$interceptQuery$1 apolloCacheInterceptor$interceptQuery$1 = new ApolloCacheInterceptor$interceptQuery$1(this.b, this.j, this.a, this.d, this.e, interfaceC8585dra);
        apolloCacheInterceptor$interceptQuery$1.i = obj;
        return apolloCacheInterceptor$interceptQuery$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r8.c
            r2 = 4
            r3 = 0
            r4 = 2
            r5 = 3
            r6 = 1
            if (r1 == 0) goto L32
            if (r1 == r6) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r5) goto L1e
            if (r1 != r2) goto L16
            goto L26
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.i
            o.dyQ r1 = (o.dyQ) r1
            o.C8556dpz.d(r9)
            goto L6d
        L26:
            o.C8556dpz.d(r9)
            goto L7a
        L2a:
            java.lang.Object r1 = r8.i
            o.dyQ r1 = (o.dyQ) r1
            o.C8556dpz.d(r9)
            goto L4f
        L32:
            o.C8556dpz.d(r9)
            java.lang.Object r9 = r8.i
            r1 = r9
            o.dyQ r1 = (o.dyQ) r1
            boolean r9 = r8.b
            if (r9 == 0) goto L5a
            o.iV r9 = r8.j
            o.gR<D> r2 = r8.a
            o.hp r5 = r8.d
            r8.i = r1
            r8.c = r6
            java.lang.Object r9 = o.C9061iV.a(r9, r2, r5, r8)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            r8.i = r3
            r8.c = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L7a
            return r0
        L5a:
            o.iV r9 = r8.j
            o.gR<D> r4 = r8.a
            o.jq r6 = r8.e
            o.hp r7 = r8.d
            r8.i = r1
            r8.c = r5
            java.lang.Object r9 = o.C9061iV.a(r9, r4, r6, r7, r8)
            if (r9 != r0) goto L6d
            return r0
        L6d:
            o.dyS r9 = (o.dyS) r9
            r8.i = r3
            r8.c = r2
            java.lang.Object r9 = o.dyR.e(r1, r9, r8)
            if (r9 != r0) goto L7a
            return r0
        L7a:
            o.dpR r9 = o.dpR.c
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$interceptQuery$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
