package com.netflix.mediaclient.util;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8203dfu;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class ObservableNotificationsMap$observeNotificationsRx$$inlined$filter$1$2$1 extends ContinuationImpl {
    public int a;
    final /* synthetic */ C8203dfu.e.AnonymousClass3 c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableNotificationsMap$observeNotificationsRx$$inlined$filter$1$2$1(C8203dfu.e.AnonymousClass3 anonymousClass3, InterfaceC8585dra interfaceC8585dra) {
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
