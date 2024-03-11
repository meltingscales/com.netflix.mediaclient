package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3701bHl;
import o.C8586drb;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$setInRemindMeQueue$1 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ C3701bHl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$setInRemindMeQueue$1(C3701bHl c3701bHl, InterfaceC8585dra<? super DetailsPageRepositoryImpl$setInRemindMeQueue$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = c3701bHl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        Object a = this.d.a((String) null, (TrackingInfoHolder) null, false, (InterfaceC8585dra<? super Result<Boolean>>) this);
        e = C8586drb.e();
        return a == e ? a : Result.b(a);
    }
}
