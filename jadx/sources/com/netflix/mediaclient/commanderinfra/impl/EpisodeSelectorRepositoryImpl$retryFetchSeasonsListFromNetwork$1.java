package com.netflix.mediaclient.commanderinfra.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C1304Wn;
import o.InterfaceC8585dra;

/* loaded from: classes3.dex */
public final class EpisodeSelectorRepositoryImpl$retryFetchSeasonsListFromNetwork$1 extends ContinuationImpl {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    final /* synthetic */ C1304Wn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodeSelectorRepositoryImpl$retryFetchSeasonsListFromNetwork$1(C1304Wn c1304Wn, InterfaceC8585dra<? super EpisodeSelectorRepositoryImpl$retryFetchSeasonsListFromNetwork$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = c1304Wn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.c = obj;
        this.b |= Integer.MIN_VALUE;
        e = this.e.e(null, null, this);
        return e;
    }
}
