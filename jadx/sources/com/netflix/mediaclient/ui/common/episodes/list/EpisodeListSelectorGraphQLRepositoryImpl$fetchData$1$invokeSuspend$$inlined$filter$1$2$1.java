package com.netflix.mediaclient.ui.common.episodes.list;

import com.netflix.mediaclient.ui.common.episodes.list.EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    int b;
    final /* synthetic */ EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1.b.AnonymousClass2 d;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1(EpisodeListSelectorGraphQLRepositoryImpl$fetchData$1.b.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
