package com.netflix.mediaclient.ui.games.impl.gdp;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3911bPf;
import o.C8586drb;
import o.InterfaceC8585dra;

/* loaded from: classes6.dex */
public final class GameDetailRepositoryImpl$setThumbRating$1 extends ContinuationImpl {
    final /* synthetic */ C3911bPf a;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailRepositoryImpl$setThumbRating$1(C3911bPf c3911bPf, InterfaceC8585dra<? super GameDetailRepositoryImpl$setThumbRating$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c3911bPf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        Object b = this.a.b(null, null, 0, this);
        e = C8586drb.e();
        return b == e ? b : Result.b(b);
    }
}
