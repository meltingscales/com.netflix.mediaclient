package com.netflix.mediaclient.ui.mylist.impl.watchers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C7012coD;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class RemindMeWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1 extends ContinuationImpl {
    public int a;
    final /* synthetic */ C7012coD.a.AnonymousClass3 c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemindMeWatcherImpl$watchVideosQuery$$inlined$filter$1$2$1(C7012coD.a.AnonymousClass3 anonymousClass3, InterfaceC8585dra interfaceC8585dra) {
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
