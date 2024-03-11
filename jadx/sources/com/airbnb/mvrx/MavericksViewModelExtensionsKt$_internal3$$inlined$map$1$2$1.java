package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8960ga;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class MavericksViewModelExtensionsKt$_internal3$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ C8960ga.c.AnonymousClass1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MavericksViewModelExtensionsKt$_internal3$$inlined$map$1$2$1(C8960ga.c.AnonymousClass1 anonymousClass1, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
