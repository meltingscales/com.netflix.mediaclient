package com.netflix.mediaclient.ui.mylist.impl.watchers;

import com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ MyListWatcherImpl$watchGamesQuery$3.d.AnonymousClass2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$map$1$2$1(MyListWatcherImpl$watchGamesQuery$3.d.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
