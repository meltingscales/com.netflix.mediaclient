package com.netflix.mediaclient.ui.mylist.impl.watchers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C7014coF;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class MyListWatcherImpl$watchVideosQuery$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ C7014coF.h.AnonymousClass2 b;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListWatcherImpl$watchVideosQuery$$inlined$map$1$2$1(C7014coF.h.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.d |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
