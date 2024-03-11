package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3701bHl;
import o.C8586drb;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$setThumbRating$1 extends ContinuationImpl {
    final /* synthetic */ C3701bHl a;
    public int b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$setThumbRating$1(C3701bHl c3701bHl, InterfaceC8585dra<? super DetailsPageRepositoryImpl$setThumbRating$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c3701bHl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.c = obj;
        this.b |= Integer.MIN_VALUE;
        Object a = this.a.a((String) null, (ThumbRating) null, 0, this);
        e = C8586drb.e();
        return a == e ? a : Result.b(a);
    }
}
