package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchEpisodesInGraphQL$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$2$2$1 extends ContinuationImpl {
    final /* synthetic */ ShowViewModel$fetchEpisodesInGraphQL$1.a.AnonymousClass1 b;
    int c;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$2$2$1(ShowViewModel$fetchEpisodesInGraphQL$1.a.AnonymousClass1 anonymousClass1, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
