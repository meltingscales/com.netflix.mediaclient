package com.netflix.mediaclient.ui.search.v2.graphQL;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C6100cTw;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class GraphQLSearchIrmaRepositoryImpl$clearSearchResults$1 extends ContinuationImpl {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    final /* synthetic */ C6100cTw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchIrmaRepositoryImpl$clearSearchResults$1(C6100cTw c6100cTw, InterfaceC8585dra<? super GraphQLSearchIrmaRepositoryImpl$clearSearchResults$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = c6100cTw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.c(this);
    }
}
