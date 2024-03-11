package com.netflix.mediaclient.ui.mylist.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C6914cmL;
import o.InterfaceC8585dra;

/* loaded from: classes6.dex */
public final class GraphQLMyListRepositoryImpl$getMyList$1 extends ContinuationImpl {
    public Object b;
    final /* synthetic */ C6914cmL c;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLMyListRepositoryImpl$getMyList$1(C6914cmL c6914cmL, InterfaceC8585dra<? super GraphQLMyListRepositoryImpl$getMyList$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = c6914cmL;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.c(0, null, null, null, null, this);
    }
}
