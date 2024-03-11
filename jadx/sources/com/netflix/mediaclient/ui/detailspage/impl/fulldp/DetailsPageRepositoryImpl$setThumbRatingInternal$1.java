package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3701bHl;
import o.C8586drb;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$setThumbRatingInternal$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ C3701bHl b;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$setThumbRatingInternal$1(C3701bHl c3701bHl, InterfaceC8585dra<? super DetailsPageRepositoryImpl$setThumbRatingInternal$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = c3701bHl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        Object e;
        this.a = obj;
        this.d |= Integer.MIN_VALUE;
        d = this.b.d(null, null, 0, this);
        e = C8586drb.e();
        return d == e ? d : Result.b(d);
    }
}
