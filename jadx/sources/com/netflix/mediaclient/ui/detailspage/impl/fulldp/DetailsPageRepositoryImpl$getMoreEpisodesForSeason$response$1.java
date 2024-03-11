package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1361Ys;
import o.C3701bHl;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.aCE;
import o.aCG;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$getMoreEpisodesForSeason$response$1 extends SuspendLambda implements drX<C1361Ys, InterfaceC8585dra<? super C8954gU<C1361Ys.a>>, Object> {
    int a;
    final /* synthetic */ C3701bHl c;
    final /* synthetic */ C1361Ys e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$getMoreEpisodesForSeason$response$1(C3701bHl c3701bHl, C1361Ys c1361Ys, InterfaceC8585dra<? super DetailsPageRepositoryImpl$getMoreEpisodesForSeason$response$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c3701bHl;
        this.e = c1361Ys;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DetailsPageRepositoryImpl$getMoreEpisodesForSeason$response$1(this.c, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(C1361Ys c1361Ys, InterfaceC8585dra<? super C8954gU<C1361Ys.a>> interfaceC8585dra) {
        return ((DetailsPageRepositoryImpl$getMoreEpisodesForSeason$response$1) create(c1361Ys, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCG acg;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            acg = this.c.e;
            C1361Ys c1361Ys = this.e;
            QueryMode queryMode = QueryMode.d;
            this.a = 1;
            obj = aCE.d.d((aCE) acg, (InterfaceC8999hM) c1361Ys, queryMode, (RequestPriority) null, false, (InterfaceC8585dra) this, 12, (Object) null);
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
