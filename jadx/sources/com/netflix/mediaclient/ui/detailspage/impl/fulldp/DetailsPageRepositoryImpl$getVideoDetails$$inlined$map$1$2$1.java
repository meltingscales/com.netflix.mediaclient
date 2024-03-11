package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3701bHl;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$getVideoDetails$$inlined$map$1$2$1 extends ContinuationImpl {
    final /* synthetic */ C3701bHl.c.AnonymousClass2 a;
    public int b;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$getVideoDetails$$inlined$map$1$2$1(C3701bHl.c.AnonymousClass2 anonymousClass2, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.b |= Integer.MIN_VALUE;
        return this.a.emit(null, this);
    }
}
