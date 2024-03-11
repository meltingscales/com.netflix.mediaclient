package com.netflix.mediaclient.ui.home.impl.games;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C4037bTx;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes4.dex */
public final class GameHandleViewModel$fetchConfigRequest$1 extends ContinuationImpl {
    public int a;
    public Object b;
    final /* synthetic */ C4037bTx c;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameHandleViewModel$fetchConfigRequest$1(C4037bTx c4037bTx, InterfaceC8585dra<? super GameHandleViewModel$fetchConfigRequest$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = c4037bTx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        this.e = obj;
        this.a |= Integer.MIN_VALUE;
        a = this.c.a(false, (InterfaceC8585dra<? super dpR>) this);
        return a;
    }
}
