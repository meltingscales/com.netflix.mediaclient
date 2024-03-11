package com.netflix.mediaclient.ui.common.episodes.list;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.bDU;

/* loaded from: classes4.dex */
public final class EpisodeListSelectorGraphQLRepositoryImpl$retryFetchSeasonsListFromNetwork$1 extends ContinuationImpl {
    final /* synthetic */ bDU a;
    public /* synthetic */ Object b;
    public Object c;
    public Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodeListSelectorGraphQLRepositoryImpl$retryFetchSeasonsListFromNetwork$1(bDU bdu, InterfaceC8585dra<? super EpisodeListSelectorGraphQLRepositoryImpl$retryFetchSeasonsListFromNetwork$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = bdu;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        this.b = obj;
        this.e |= Integer.MIN_VALUE;
        d = this.a.d(null, null, this);
        return d;
    }
}
