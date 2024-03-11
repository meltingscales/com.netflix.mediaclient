package com.apollographql.apollo3.interceptor;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8951gR;
import o.C8954gU;
import o.C9134jp;
import o.InterfaceC8585dra;
import o.InterfaceC9135jq;
import o.dpR;
import o.drX;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class AutoPersistedQueryInterceptor$intercept$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC9135jq a;
    final /* synthetic */ boolean b;
    final /* synthetic */ C9134jp c;
    int d;
    final /* synthetic */ C8951gR<D> e;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPersistedQueryInterceptor$intercept$1(InterfaceC9135jq interfaceC9135jq, C8951gR<D> c8951gR, C9134jp c9134jp, boolean z, InterfaceC8585dra<? super AutoPersistedQueryInterceptor$intercept$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = interfaceC9135jq;
        this.e = c8951gR;
        this.c = c9134jp;
        this.b = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        AutoPersistedQueryInterceptor$intercept$1 autoPersistedQueryInterceptor$intercept$1 = new AutoPersistedQueryInterceptor$intercept$1(this.a, this.e, this.c, this.b, interfaceC8585dra);
        autoPersistedQueryInterceptor$intercept$1.i = obj;
        return autoPersistedQueryInterceptor$intercept$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AutoPersistedQueryInterceptor$intercept$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.interceptor.AutoPersistedQueryInterceptor$intercept$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
