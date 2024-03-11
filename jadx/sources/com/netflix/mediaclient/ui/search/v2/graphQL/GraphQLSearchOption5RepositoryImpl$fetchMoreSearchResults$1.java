package com.netflix.mediaclient.ui.search.v2.graphQL;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6078cTd;
import o.C6087cTj;
import o.C6098cTu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class GraphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super AbstractC6078cTd>, Object> {
    int a;
    final /* synthetic */ C6098cTu b;
    final /* synthetic */ C6087cTj c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1(C6087cTj c6087cTj, C6098cTu c6098cTu, String str, InterfaceC8585dra<? super GraphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c6087cTj;
        this.b = c6098cTu;
        this.d = str;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        return ((GraphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1 graphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1 = new GraphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1(this.c, this.b, this.d, interfaceC8585dra);
        graphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1.e = obj;
        return graphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x017a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchOption5RepositoryImpl$fetchMoreSearchResults$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
