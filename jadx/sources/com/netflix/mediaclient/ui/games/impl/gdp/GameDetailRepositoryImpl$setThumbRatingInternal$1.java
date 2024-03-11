package com.netflix.mediaclient.ui.games.impl.gdp;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3911bPf;
import o.InterfaceC8585dra;

/* loaded from: classes6.dex */
public final class GameDetailRepositoryImpl$setThumbRatingInternal$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ C3911bPf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailRepositoryImpl$setThumbRatingInternal$1(C3911bPf c3911bPf, InterfaceC8585dra<? super GameDetailRepositoryImpl$setThumbRatingInternal$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = c3911bPf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        a = this.d.a(null, null, 0, this);
        return a;
    }
}
