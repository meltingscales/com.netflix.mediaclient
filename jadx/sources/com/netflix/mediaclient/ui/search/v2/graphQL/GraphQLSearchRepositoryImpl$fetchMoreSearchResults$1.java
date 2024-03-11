package com.netflix.mediaclient.ui.search.v2.graphQL;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6078cTd;
import o.C6087cTj;
import o.C6099cTv;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class GraphQLSearchRepositoryImpl$fetchMoreSearchResults$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super AbstractC6078cTd>, Object> {
    final /* synthetic */ C6087cTj b;
    final /* synthetic */ String c;
    int d;
    final /* synthetic */ C6099cTv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchRepositoryImpl$fetchMoreSearchResults$1(C6087cTj c6087cTj, C6099cTv c6099cTv, String str, InterfaceC8585dra<? super GraphQLSearchRepositoryImpl$fetchMoreSearchResults$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = c6087cTj;
        this.e = c6099cTv;
        this.c = str;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        return ((GraphQLSearchRepositoryImpl$fetchMoreSearchResults$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLSearchRepositoryImpl$fetchMoreSearchResults$1(this.b, this.e, this.c, interfaceC8585dra);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0169 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchRepositoryImpl$fetchMoreSearchResults$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
