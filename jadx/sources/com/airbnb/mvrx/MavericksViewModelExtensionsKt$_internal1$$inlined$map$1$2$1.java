package com.airbnb.mvrx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8960ga;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class MavericksViewModelExtensionsKt$_internal1$$inlined$map$1$2$1 extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object b;
    final /* synthetic */ C8960ga.d.AnonymousClass5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MavericksViewModelExtensionsKt$_internal1$$inlined$map$1$2$1(C8960ga.d.AnonymousClass5 anonymousClass5, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = anonymousClass5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.a |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
