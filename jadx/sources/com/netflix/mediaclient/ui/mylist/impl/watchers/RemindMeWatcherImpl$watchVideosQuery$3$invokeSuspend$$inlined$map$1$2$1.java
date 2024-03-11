package com.netflix.mediaclient.ui.mylist.impl.watchers;

import com.netflix.mediaclient.ui.mylist.impl.watchers.RemindMeWatcherImpl$watchVideosQuery$3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class RemindMeWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    int a;
    final /* synthetic */ RemindMeWatcherImpl$watchVideosQuery$3.b.AnonymousClass3 c;
    /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemindMeWatcherImpl$watchVideosQuery$3$invokeSuspend$$inlined$map$1$2$1(RemindMeWatcherImpl$watchVideosQuery$3.b.AnonymousClass3 anonymousClass3, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
