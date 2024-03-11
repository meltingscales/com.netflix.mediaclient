package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3726bIj;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class FullDpViewModel$fetchVideoDetails$lambda$3$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ C3726bIj.a.AnonymousClass2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullDpViewModel$fetchVideoDetails$lambda$3$$inlined$map$1$2$1(C3726bIj.a.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
