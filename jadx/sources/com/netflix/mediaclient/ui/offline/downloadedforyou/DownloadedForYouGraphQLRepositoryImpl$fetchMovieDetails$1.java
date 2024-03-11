package com.netflix.mediaclient.ui.offline.downloadedforyou;

import android.content.Context;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractApplicationC1040Mh;
import o.C1332Xp;
import o.C1529aEr;
import o.C6004cQk;
import o.C8126deW;
import o.C8556dpz;
import o.C8566dqi;
import o.C8576dqs;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC1078Nw;
import o.InterfaceC5238buw;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.YI;
import o.aCE;
import o.aCG;
import o.aDB;
import o.aGD;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DownloadedForYouGraphQLRepositoryImpl$fetchMovieDetails$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C6004cQk.b<InterfaceC5238buw>>, Object> {
    final /* synthetic */ String a;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadedForYouGraphQLRepositoryImpl$fetchMovieDetails$1(String str, InterfaceC8585dra<? super DownloadedForYouGraphQLRepositoryImpl$fetchMovieDetails$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = str;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C6004cQk.b<InterfaceC5238buw>> interfaceC8585dra) {
        return ((DownloadedForYouGraphQLRepositoryImpl$fetchMovieDetails$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DownloadedForYouGraphQLRepositoryImpl$fetchMovieDetails$1(this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        List e2;
        Object d;
        YI.b bVar;
        Object y;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            InterfaceC5283bvo b = C8126deW.b();
            Context d2 = AbstractApplicationC1040Mh.d();
            C8632dsu.a(d2, "");
            aDB d3 = aGD.d(d2);
            aCG.e eVar = aCG.b;
            C1332Xp c1332Xp = C1332Xp.b;
            Context context = (Context) C1332Xp.b(Context.class);
            if (b != null) {
                aCG e3 = eVar.e(context, b);
                e2 = C8566dqi.e(C8589dre.c(Integer.parseInt(this.a)));
                YI yi = new YI(e2, aDB.b(d3, d3.t(), null, 2, null), d3.c(d3.n()), aDB.c(d3, d3.d(), null, 2, null));
                this.e = 1;
                d = aCE.d.d((aCE) e3, (InterfaceC8999hM) yi, (QueryMode) null, (RequestPriority) null, false, (InterfaceC8585dra) this, 14, (Object) null);
                if (d == e) {
                    return e;
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
            d = obj;
        }
        YI.a aVar = (YI.a) ((C8954gU) d).d;
        if (aVar != null) {
            List<YI.b> b2 = aVar.b();
            if (b2 != null) {
                y = C8576dqs.y(b2);
                bVar = (YI.b) y;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                C1529aEr c1529aEr = new C1529aEr(bVar.e().b(), bVar.e(), bVar.d(), bVar.a(), bVar.c());
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                C8632dsu.a(netflixImmutableStatus, "");
                return new C6004cQk.b(c1529aEr, netflixImmutableStatus);
            }
            NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.ad;
            C8632dsu.a(netflixImmutableStatus2, "");
            return new C6004cQk.b(null, netflixImmutableStatus2);
        }
        NetflixImmutableStatus netflixImmutableStatus3 = InterfaceC1078Nw.ad;
        C8632dsu.a(netflixImmutableStatus3, "");
        return new C6004cQk.b(null, netflixImmutableStatus3);
    }
}
