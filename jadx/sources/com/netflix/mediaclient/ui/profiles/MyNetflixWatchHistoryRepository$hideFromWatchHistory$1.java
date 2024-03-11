package com.netflix.mediaclient.ui.profiles;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.cMK;

/* loaded from: classes4.dex */
public final class MyNetflixWatchHistoryRepository$hideFromWatchHistory$1 extends ContinuationImpl {
    public Object a;
    final /* synthetic */ cMK c;
    public int d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyNetflixWatchHistoryRepository$hideFromWatchHistory$1(cMK cmk, InterfaceC8585dra<? super MyNetflixWatchHistoryRepository$hideFromWatchHistory$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = cmk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
