package com.netflix.mediaclient.graphqlrepo.impl.client.auth;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8951gR;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.InterfaceC9135jq;
import o.aCZ;
import o.dpR;
import o.drX;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes3.dex */
public final class UnauthenticatedErrorInterceptor$intercept$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC9135jq a;
    Object b;
    final /* synthetic */ C8951gR<D> c;
    final /* synthetic */ aCZ d;
    int e;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnauthenticatedErrorInterceptor$intercept$1(InterfaceC9135jq interfaceC9135jq, C8951gR<D> c8951gR, aCZ acz, InterfaceC8585dra<? super UnauthenticatedErrorInterceptor$intercept$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = interfaceC9135jq;
        this.c = c8951gR;
        this.d = acz;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UnauthenticatedErrorInterceptor$intercept$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        UnauthenticatedErrorInterceptor$intercept$1 unauthenticatedErrorInterceptor$intercept$1 = new UnauthenticatedErrorInterceptor$intercept$1(this.a, this.c, this.d, interfaceC8585dra);
        unauthenticatedErrorInterceptor$intercept$1.j = obj;
        return unauthenticatedErrorInterceptor$intercept$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
        r0 = r20.d.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        o.InterfaceC1593aHa.c.a("Unauthenticated error received for operation: " + r20.c.h().f() + ", trying to refresh cookies");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
        r0 = r20.d.b;
        r20.j = r9;
        r20.b = r8;
        r20.e = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fd, code lost:
        if (r0.b(r20) != r2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ff, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0100, code lost:
        r5 = r8;
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0135, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.graphqlrepo.impl.client.auth.UnauthenticatedErrorInterceptor$intercept$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
