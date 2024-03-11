package com.netflix.mediaclient.commanderinfra.impl;

import com.netflix.mediaclient.commanderinfra.impl.EpisodeSelectorRepositoryImpl$fetchData$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes3.dex */
public final class EpisodeSelectorRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    final /* synthetic */ EpisodeSelectorRepositoryImpl$fetchData$1.d.AnonymousClass5 a;
    int c;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodeSelectorRepositoryImpl$fetchData$1$invokeSuspend$$inlined$filter$1$2$1(EpisodeSelectorRepositoryImpl$fetchData$1.d.AnonymousClass5 anonymousClass5, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = anonymousClass5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.c |= Integer.MIN_VALUE;
        return this.a.emit(null, this);
    }
}
