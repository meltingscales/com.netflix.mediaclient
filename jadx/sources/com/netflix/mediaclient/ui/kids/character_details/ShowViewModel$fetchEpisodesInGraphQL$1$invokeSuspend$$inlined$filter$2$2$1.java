package com.netflix.mediaclient.ui.kids.character_details;

import com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$2$2$1 extends ContinuationImpl {
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ ShowViewModel$fetchEpisodesInGraphQL$1.d.AnonymousClass4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$2$2$1(ShowViewModel$fetchEpisodesInGraphQL$1.d.AnonymousClass4 anonymousClass4, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
