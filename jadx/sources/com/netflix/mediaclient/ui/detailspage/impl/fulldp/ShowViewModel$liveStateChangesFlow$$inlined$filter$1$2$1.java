package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3732bIp;
import o.InterfaceC8585dra;

/* loaded from: classes6.dex */
public final class ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1 extends ContinuationImpl {
    final /* synthetic */ C3732bIp.c.AnonymousClass3 a;
    public int b;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowViewModel$liveStateChangesFlow$$inlined$filter$1$2$1(C3732bIp.c.AnonymousClass3 anonymousClass3, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        return this.a.emit(null, this);
    }
}
