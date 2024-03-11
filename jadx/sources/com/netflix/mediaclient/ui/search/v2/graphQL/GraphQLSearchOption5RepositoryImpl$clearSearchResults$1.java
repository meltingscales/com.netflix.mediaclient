package com.netflix.mediaclient.ui.search.v2.graphQL;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C6098cTu;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class GraphQLSearchOption5RepositoryImpl$clearSearchResults$1 extends ContinuationImpl {
    final /* synthetic */ C6098cTu a;
    public /* synthetic */ Object b;
    public Object c;
    public Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchOption5RepositoryImpl$clearSearchResults$1(C6098cTu c6098cTu, InterfaceC8585dra<? super GraphQLSearchOption5RepositoryImpl$clearSearchResults$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c6098cTu;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.e |= Integer.MIN_VALUE;
        return C6098cTu.c(this.a, this);
    }
}
