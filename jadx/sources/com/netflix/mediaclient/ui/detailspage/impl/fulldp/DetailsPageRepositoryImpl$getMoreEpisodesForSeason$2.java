package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C1361Ys;
import o.C3701bHl;
import o.C8586drb;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$getMoreEpisodesForSeason$2 extends ContinuationImpl {
    final /* synthetic */ C3701bHl a;
    public Object b;
    public int d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$getMoreEpisodesForSeason$2(C3701bHl c3701bHl, InterfaceC8585dra<? super DetailsPageRepositoryImpl$getMoreEpisodesForSeason$2> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = c3701bHl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object e;
        this.e = obj;
        this.d |= Integer.MIN_VALUE;
        a = this.a.a((C1361Ys) null, (String) null, this);
        e = C8586drb.e();
        return a == e ? a : Result.b(a);
    }
}
