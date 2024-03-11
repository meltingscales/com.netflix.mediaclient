package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3701bHl;
import o.C8586drb;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$setInMyListQueue$1 extends ContinuationImpl {
    public int a;
    final /* synthetic */ C3701bHl b;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$setInMyListQueue$1(C3701bHl c3701bHl, InterfaceC8585dra<? super DetailsPageRepositoryImpl$setInMyListQueue$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = c3701bHl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        Object c = this.b.c((String) null, (TrackingInfoHolder) null, false, (InterfaceC8585dra<? super Result<Boolean>>) this);
        e = C8586drb.e();
        return c == e ? c : Result.b(c);
    }
}
