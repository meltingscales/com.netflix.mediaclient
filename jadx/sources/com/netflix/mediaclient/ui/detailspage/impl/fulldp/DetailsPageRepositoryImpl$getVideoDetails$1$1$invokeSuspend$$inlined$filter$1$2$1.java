package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.ui.detailspage.impl.fulldp.DetailsPageRepositoryImpl$getVideoDetails$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$getVideoDetails$1$1$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    final /* synthetic */ DetailsPageRepositoryImpl$getVideoDetails$1$1.e.AnonymousClass4 a;
    /* synthetic */ Object d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$getVideoDetails$1$1$invokeSuspend$$inlined$filter$1$2$1(DetailsPageRepositoryImpl$getVideoDetails$1$1.e.AnonymousClass4 anonymousClass4, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.a.emit(null, this);
    }
}
