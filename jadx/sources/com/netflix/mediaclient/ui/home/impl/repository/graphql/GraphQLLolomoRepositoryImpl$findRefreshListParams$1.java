package com.netflix.mediaclient.ui.home.impl.repository.graphql;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C4116bWv;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class GraphQLLolomoRepositoryImpl$findRefreshListParams$1 extends ContinuationImpl {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public int e;
    final /* synthetic */ C4116bWv f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoRepositoryImpl$findRefreshListParams$1(C4116bWv c4116bWv, InterfaceC8585dra<? super GraphQLLolomoRepositoryImpl$findRefreshListParams$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.f = c4116bWv;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        this.g = obj;
        this.e |= Integer.MIN_VALUE;
        b = this.f.b((String) null, this);
        return b;
    }
}
