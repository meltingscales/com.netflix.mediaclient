package com.netflix.mediaclient.ui.mylist.impl.watchers;

import com.netflix.mediaclient.ui.mylist.impl.watchers.MyListWatcherImpl$watchVideosQuery$3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    final /* synthetic */ MyListWatcherImpl$watchVideosQuery$3.a.AnonymousClass3 a;
    /* synthetic */ Object b;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$map$1$2$1(MyListWatcherImpl$watchVideosQuery$3.a.AnonymousClass3 anonymousClass3, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.a.emit(null, this);
    }
}
