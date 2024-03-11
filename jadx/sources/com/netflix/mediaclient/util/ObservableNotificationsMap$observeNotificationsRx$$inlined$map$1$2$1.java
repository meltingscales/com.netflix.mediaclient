package com.netflix.mediaclient.util;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8203dfu;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class ObservableNotificationsMap$observeNotificationsRx$$inlined$map$1$2$1 extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object b;
    final /* synthetic */ C8203dfu.b.AnonymousClass4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableNotificationsMap$observeNotificationsRx$$inlined$map$1$2$1(C8203dfu.b.AnonymousClass4 anonymousClass4, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.a |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
