package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3701bHl;
import o.C8586drb;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$addRemindMe$1 extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object b;
    final /* synthetic */ C3701bHl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$addRemindMe$1(C3701bHl c3701bHl, InterfaceC8585dra<? super DetailsPageRepositoryImpl$addRemindMe$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = c3701bHl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object e;
        this.b = obj;
        this.a |= Integer.MIN_VALUE;
        a = this.c.a((String) null, (TrackingInfoHolder) null, this);
        e = C8586drb.e();
        return a == e ? a : Result.b(a);
    }
}
