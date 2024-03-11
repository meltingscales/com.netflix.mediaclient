package com.netflix.mediaclient.ui.mylist.impl.watchers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C7014coF;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class MyListWatcherImpl$watchGamesQuery$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object b;
    final /* synthetic */ C7014coF.a.AnonymousClass3 c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListWatcherImpl$watchGamesQuery$$inlined$map$1$2$1(C7014coF.a.AnonymousClass3 anonymousClass3, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
