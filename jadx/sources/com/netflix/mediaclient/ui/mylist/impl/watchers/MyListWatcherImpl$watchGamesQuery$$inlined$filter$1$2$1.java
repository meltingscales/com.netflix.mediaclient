package com.netflix.mediaclient.ui.mylist.impl.watchers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C7014coF;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class MyListWatcherImpl$watchGamesQuery$$inlined$filter$1$2$1 extends ContinuationImpl {
    public int a;
    final /* synthetic */ C7014coF.d.AnonymousClass2 b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListWatcherImpl$watchGamesQuery$$inlined$filter$1$2$1(C7014coF.d.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.a |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
