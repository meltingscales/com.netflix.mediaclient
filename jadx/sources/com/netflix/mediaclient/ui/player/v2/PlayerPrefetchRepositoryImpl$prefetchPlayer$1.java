package com.netflix.mediaclient.ui.player.v2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C5600cBk;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class PlayerPrefetchRepositoryImpl$prefetchPlayer$1 extends ContinuationImpl {
    public int a;
    final /* synthetic */ C5600cBk b;
    public /* synthetic */ Object c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerPrefetchRepositoryImpl$prefetchPlayer$1(C5600cBk c5600cBk, InterfaceC8585dra<? super PlayerPrefetchRepositoryImpl$prefetchPlayer$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = c5600cBk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        this.c = obj;
        this.a |= Integer.MIN_VALUE;
        b = this.b.b(null, this);
        return b;
    }
}
