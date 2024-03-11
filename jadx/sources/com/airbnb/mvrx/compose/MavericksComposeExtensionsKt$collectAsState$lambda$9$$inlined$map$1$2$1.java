package com.airbnb.mvrx.compose;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8983gx;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class MavericksComposeExtensionsKt$collectAsState$lambda$9$$inlined$map$1$2$1 extends ContinuationImpl {
    final /* synthetic */ C8983gx.d.AnonymousClass2 a;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MavericksComposeExtensionsKt$collectAsState$lambda$9$$inlined$map$1$2$1(C8983gx.d.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.a.emit(null, this);
    }
}
