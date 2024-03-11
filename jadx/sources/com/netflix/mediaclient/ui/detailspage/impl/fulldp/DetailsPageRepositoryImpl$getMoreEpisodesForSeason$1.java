package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C3701bHl;
import o.C5239bux;
import o.C8586drb;
import o.InterfaceC8585dra;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$getMoreEpisodesForSeason$1 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public Object c;
    public Object d;
    public int e;
    final /* synthetic */ C3701bHl i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$getMoreEpisodesForSeason$1(C3701bHl c3701bHl, InterfaceC8585dra<? super DetailsPageRepositoryImpl$getMoreEpisodesForSeason$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.i = c3701bHl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.b = obj;
        this.e |= Integer.MIN_VALUE;
        Object e2 = this.i.e((String) null, (C5239bux) null, this);
        e = C8586drb.e();
        return e2 == e ? e2 : Result.b(e2);
    }
}
