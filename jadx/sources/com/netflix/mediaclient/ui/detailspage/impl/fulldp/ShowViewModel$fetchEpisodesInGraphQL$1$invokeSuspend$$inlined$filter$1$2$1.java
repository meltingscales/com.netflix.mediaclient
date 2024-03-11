package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.ui.detailspage.impl.fulldp.ShowViewModel$fetchEpisodesInGraphQL$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    /* synthetic */ Object a;
    final /* synthetic */ ShowViewModel$fetchEpisodesInGraphQL$1.d.AnonymousClass4 b;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$1$2$1(ShowViewModel$fetchEpisodesInGraphQL$1.d.AnonymousClass4 anonymousClass4, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.d |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
