package com.netflix.mediaclient.ui.mylist.impl.watchers;

import com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchGamesQuery$3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    int a;
    final /* synthetic */ MyListWatcherImpl$watchGamesQuery$3.a.AnonymousClass5 b;
    /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListWatcherImpl$watchGamesQuery$3$invokeSuspend$$inlined$filter$1$2$1(MyListWatcherImpl$watchGamesQuery$3.a.AnonymousClass5 anonymousClass5, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
