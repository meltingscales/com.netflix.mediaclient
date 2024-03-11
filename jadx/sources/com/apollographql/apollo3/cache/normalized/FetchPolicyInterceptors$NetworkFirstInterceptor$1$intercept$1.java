package com.apollographql.apollo3.cache.normalized;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8586drb;
import o.C8951gR;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.InterfaceC9135jq;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyS;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    private /* synthetic */ Object b;
    final /* synthetic */ InterfaceC9135jq c;
    Object d;
    final /* synthetic */ C8951gR<D> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1(InterfaceC9135jq interfaceC9135jq, C8951gR<D> c8951gR, InterfaceC8585dra<? super FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = interfaceC9135jq;
        this.e = c8951gR;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1 fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1 = new FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1(this.c, this.e, interfaceC8585dra);
        fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1.b = obj;
        return fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r9.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L34
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            o.C8556dpz.d(r10)
            goto L9b
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            java.lang.Object r1 = r9.b
            o.dyQ r1 = (o.dyQ) r1
            o.C8556dpz.d(r10)
            goto L8e
        L27:
            java.lang.Object r1 = r9.d
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r6 = r9.b
            o.dyQ r6 = (o.dyQ) r6
            o.C8556dpz.d(r10)
            r10 = r6
            goto L63
        L34:
            o.C8556dpz.d(r10)
            java.lang.Object r10 = r9.b
            o.dyQ r10 = (o.dyQ) r10
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            o.jq r6 = r9.c
            o.gR<D> r7 = r9.e
            o.dyS r6 = r6.a(r7)
            com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1 r7 = new com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1
            r7.<init>(r1, r5)
            o.dyS r6 = o.dyR.a(r6, r7)
            com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$a r7 = new com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$a
            r7.<init>(r6, r1)
            r9.b = r10
            r9.d = r1
            r9.a = r4
            java.lang.Object r6 = o.dyR.e(r10, r7, r9)
            if (r6 != r0) goto L63
            return r0
        L63:
            T r1 = r1.d
            if (r1 != 0) goto L6a
            o.dpR r10 = o.dpR.c
            return r10
        L6a:
            o.jq r1 = r9.c
            o.gR<D> r6 = r9.e
            o.gR$d r6 = r6.i()
            o.gR$d r4 = o.C9083ir.a(r6, r4)
            o.gR r4 = r4.c()
            o.dyS r1 = r1.a(r4)
            r9.b = r10
            r9.d = r5
            r9.a = r3
            java.lang.Object r1 = o.dyR.d(r1, r9)
            if (r1 != r0) goto L8b
            return r0
        L8b:
            r8 = r1
            r1 = r10
            r10 = r8
        L8e:
            o.gU r10 = (o.C8954gU) r10
            r9.b = r5
            r9.a = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L9b
            return r0
        L9b:
            o.dpR r10 = o.dpR.c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* loaded from: classes2.dex */
    public static final class a implements dyS<C8954gU<D>> {
        final /* synthetic */ Ref.ObjectRef c;
        final /* synthetic */ dyS e;

        public a(dyS dys, Ref.ObjectRef objectRef) {
            this.e = dys;
            this.c = objectRef;
        }

        @Override // o.dyS
        public Object collect(dyQ dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.e.collect(new AnonymousClass1(dyq, this.c), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$a$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1<T> implements dyQ {
            final /* synthetic */ dyQ b;
            final /* synthetic */ Ref.ObjectRef c;

            public AnonymousClass1(dyQ dyq, Ref.ObjectRef objectRef) {
                this.b = dyq;
                this.c = objectRef;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, o.InterfaceC8585dra r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$invokeSuspend$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$invokeSuspend$$inlined$map$1$2$1) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.c = r1
                    goto L18
                L13:
                    com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L54
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.b
                    o.gU r5 = (o.C8954gU) r5
                    kotlin.jvm.internal.Ref$ObjectRef r2 = r4.c
                    T r2 = r2.d
                    if (r2 == 0) goto L4b
                    o.gU$c r5 = r5.d()
                    r2 = 0
                    o.gU$c r5 = r5.a(r2)
                    o.gU r5 = r5.e()
                L4b:
                    r0.c = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L54
                    return r1
                L54:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1.a.AnonymousClass1.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}
