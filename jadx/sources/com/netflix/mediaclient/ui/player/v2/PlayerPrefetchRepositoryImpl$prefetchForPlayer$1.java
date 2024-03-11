package com.netflix.mediaclient.ui.player.v2;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C5600cBk;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class PlayerPrefetchRepositoryImpl$prefetchForPlayer$1 extends ContinuationImpl {
    final /* synthetic */ C5600cBk a;
    public Object c;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerPrefetchRepositoryImpl$prefetchForPlayer$1(C5600cBk c5600cBk, InterfaceC8585dra<? super PlayerPrefetchRepositoryImpl$prefetchForPlayer$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c5600cBk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.a.d((List<Integer>) null, this);
    }
}
