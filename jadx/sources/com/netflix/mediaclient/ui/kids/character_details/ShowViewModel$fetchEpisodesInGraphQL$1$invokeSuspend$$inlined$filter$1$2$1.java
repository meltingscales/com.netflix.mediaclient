package com.netflix.mediaclient.ui.kids.character_details;

import com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$fetchEpisodesInGraphQL$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    int b;
    final /* synthetic */ ShowViewModel$fetchEpisodesInGraphQL$1.a.AnonymousClass2 c;
    /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowViewModel$fetchEpisodesInGraphQL$1$invokeSuspend$$inlined$filter$1$2$1(ShowViewModel$fetchEpisodesInGraphQL$1.a.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
