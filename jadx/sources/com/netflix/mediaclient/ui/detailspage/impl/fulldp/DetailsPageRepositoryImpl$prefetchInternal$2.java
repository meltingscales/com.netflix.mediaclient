package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1362Yt;
import o.C3701bHl;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.aCE;
import o.aCG;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$prefetchInternal$2 extends SuspendLambda implements drX<C1362Yt, InterfaceC8585dra<? super C8954gU<C1362Yt.C1368g>>, Object> {
    int a;
    final /* synthetic */ C1362Yt b;
    final /* synthetic */ C3701bHl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$prefetchInternal$2(C3701bHl c3701bHl, C1362Yt c1362Yt, InterfaceC8585dra<? super DetailsPageRepositoryImpl$prefetchInternal$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c3701bHl;
        this.b = c1362Yt;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(C1362Yt c1362Yt, InterfaceC8585dra<? super C8954gU<C1362Yt.C1368g>> interfaceC8585dra) {
        return ((DetailsPageRepositoryImpl$prefetchInternal$2) create(c1362Yt, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DetailsPageRepositoryImpl$prefetchInternal$2(this.e, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCG acg;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            acg = this.e.e;
            C1362Yt c1362Yt = this.b;
            QueryMode queryMode = QueryMode.b;
            this.a = 1;
            obj = aCE.d.a(acg, c1362Yt, queryMode, null, false, this, 12, null);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
