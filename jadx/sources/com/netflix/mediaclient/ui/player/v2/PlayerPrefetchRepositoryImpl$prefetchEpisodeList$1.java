package com.netflix.mediaclient.ui.player.v2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C1359Yq;
import o.C5600cBk;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class PlayerPrefetchRepositoryImpl$prefetchEpisodeList$1 extends ContinuationImpl {
    final /* synthetic */ C5600cBk a;
    public /* synthetic */ Object b;
    public int c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerPrefetchRepositoryImpl$prefetchEpisodeList$1(C5600cBk c5600cBk, InterfaceC8585dra<? super PlayerPrefetchRepositoryImpl$prefetchEpisodeList$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c5600cBk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        d = this.a.d((C1359Yq) null, this);
        return d;
    }
}
