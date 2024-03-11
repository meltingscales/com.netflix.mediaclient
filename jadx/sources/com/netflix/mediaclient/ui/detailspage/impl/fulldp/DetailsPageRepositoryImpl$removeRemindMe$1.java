package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3701bHl;
import o.C8586drb;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$removeRemindMe$1 extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object b;
    final /* synthetic */ C3701bHl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$removeRemindMe$1(C3701bHl c3701bHl, InterfaceC8585dra<? super DetailsPageRepositoryImpl$removeRemindMe$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = c3701bHl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object e2;
        this.b = obj;
        this.a |= Integer.MIN_VALUE;
        e = this.d.e((String) null, (TrackingInfoHolder) null, this);
        e2 = C8586drb.e();
        return e == e2 ? e : Result.b(e);
    }
}
