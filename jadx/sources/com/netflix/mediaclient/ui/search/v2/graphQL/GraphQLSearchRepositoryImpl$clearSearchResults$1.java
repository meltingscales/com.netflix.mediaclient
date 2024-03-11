package com.netflix.mediaclient.ui.search.v2.graphQL;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C6099cTv;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class GraphQLSearchRepositoryImpl$clearSearchResults$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ C6099cTv c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchRepositoryImpl$clearSearchResults$1(C6099cTv c6099cTv, InterfaceC8585dra<? super GraphQLSearchRepositoryImpl$clearSearchResults$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = c6099cTv;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
