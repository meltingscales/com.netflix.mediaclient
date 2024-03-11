package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3701bHl;
import o.C8586drb;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$addToMyList$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int d;
    final /* synthetic */ C3701bHl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$addToMyList$1(C3701bHl c3701bHl, InterfaceC8585dra<? super DetailsPageRepositoryImpl$addToMyList$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = c3701bHl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object e;
        this.a = obj;
        this.d |= Integer.MIN_VALUE;
        c = this.e.c(null, this);
        e = C8586drb.e();
        return c == e ? c : Result.b(c);
    }
}
