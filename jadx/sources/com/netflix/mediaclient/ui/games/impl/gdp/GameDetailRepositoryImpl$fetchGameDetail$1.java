package com.netflix.mediaclient.ui.games.impl.gdp;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3911bPf;
import o.InterfaceC8585dra;

/* loaded from: classes6.dex */
public final class GameDetailRepositoryImpl$fetchGameDetail$1 extends ContinuationImpl {
    public Object a;
    public int b;
    public /* synthetic */ Object d;
    final /* synthetic */ C3911bPf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailRepositoryImpl$fetchGameDetail$1(C3911bPf c3911bPf, InterfaceC8585dra<? super GameDetailRepositoryImpl$fetchGameDetail$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = c3911bPf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.e(null, false, this);
    }
}
