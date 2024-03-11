package com.netflix.mediaclient.ui.search.v2.graphQL;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6078cTd;
import o.C6087cTj;
import o.C6100cTw;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class GraphQLSearchIrmaRepositoryImpl$fetchMoreSearchResults$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super AbstractC6078cTd>, Object> {
    private /* synthetic */ Object a;
    final /* synthetic */ C6100cTw b;
    final /* synthetic */ String c;
    final /* synthetic */ C6087cTj d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchIrmaRepositoryImpl$fetchMoreSearchResults$1(C6087cTj c6087cTj, C6100cTw c6100cTw, String str, InterfaceC8585dra<? super GraphQLSearchIrmaRepositoryImpl$fetchMoreSearchResults$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c6087cTj;
        this.b = c6100cTw;
        this.c = str;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        return ((GraphQLSearchIrmaRepositoryImpl$fetchMoreSearchResults$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLSearchIrmaRepositoryImpl$fetchMoreSearchResults$1 graphQLSearchIrmaRepositoryImpl$fetchMoreSearchResults$1 = new GraphQLSearchIrmaRepositoryImpl$fetchMoreSearchResults$1(this.d, this.b, this.c, interfaceC8585dra);
        graphQLSearchIrmaRepositoryImpl$fetchMoreSearchResults$1.a = obj;
        return graphQLSearchIrmaRepositoryImpl$fetchMoreSearchResults$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0185 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchIrmaRepositoryImpl$fetchMoreSearchResults$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
