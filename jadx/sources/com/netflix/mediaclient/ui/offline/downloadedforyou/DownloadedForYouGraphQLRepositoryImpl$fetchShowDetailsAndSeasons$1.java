package com.netflix.mediaclient.ui.offline.downloadedforyou;

import android.content.Context;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractApplicationC1040Mh;
import o.C1332Xp;
import o.C1536aEy;
import o.C2410afi;
import o.C2514ahX;
import o.C2538ahv;
import o.C2539ahw;
import o.C2553aiJ;
import o.C6004cQk;
import o.C8126deW;
import o.C8556dpz;
import o.C8566dqi;
import o.C8569dql;
import o.C8576dqs;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC1078Nw;
import o.InterfaceC5194buE;
import o.InterfaceC5195buF;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.ZB;
import o.aCE;
import o.aCG;
import o.aDB;
import o.aGD;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DownloadedForYouGraphQLRepositoryImpl$fetchShowDetailsAndSeasons$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>>, Object> {
    final /* synthetic */ String c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadedForYouGraphQLRepositoryImpl$fetchShowDetailsAndSeasons$1(String str, InterfaceC8585dra<? super DownloadedForYouGraphQLRepositoryImpl$fetchShowDetailsAndSeasons$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = str;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>> interfaceC8585dra) {
        return ((DownloadedForYouGraphQLRepositoryImpl$fetchShowDetailsAndSeasons$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DownloadedForYouGraphQLRepositoryImpl$fetchShowDetailsAndSeasons$1(this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        List e2;
        Object d;
        List i;
        ZB.e eVar;
        List i2;
        ZB.c b;
        ZB.c b2;
        ZB.c b3;
        Object y;
        e = C8586drb.e();
        int i3 = this.d;
        if (i3 == 0) {
            C8556dpz.d(obj);
            InterfaceC5283bvo b4 = C8126deW.b();
            Context d2 = AbstractApplicationC1040Mh.d();
            C8632dsu.a(d2, "");
            aDB d3 = aGD.d(d2);
            e2 = C8566dqi.e(C8589dre.c(Integer.parseInt(this.c)));
            ZB zb = new ZB(e2, d3.c(d3.n()), aDB.c(d3, d3.d(), null, 2, null), aDB.b(d3, d3.t(), null, 2, null));
            aCG.e eVar2 = aCG.b;
            C1332Xp c1332Xp = C1332Xp.b;
            Context context = (Context) C1332Xp.b(Context.class);
            if (b4 != null) {
                aCG e3 = eVar2.e(context, b4);
                RequestPriority requestPriority = RequestPriority.a;
                this.d = 1;
                d = aCE.d.d((aCE) e3, (InterfaceC8999hM) zb, (QueryMode) null, requestPriority, false, (InterfaceC8585dra) this, 10, (Object) null);
                if (d == e) {
                    return e;
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
            d = obj;
        }
        ZB.d dVar = (ZB.d) ((C8954gU) d).d;
        if (dVar != null) {
            List<ZB.e> c = dVar.c();
            if (c != null) {
                y = C8576dqs.y(c);
                eVar = (ZB.e) y;
            } else {
                eVar = null;
            }
            C2553aiJ d4 = eVar != null ? eVar.d() : null;
            C2410afi a = eVar != null ? eVar.a() : null;
            C2514ahX a2 = (eVar == null || (b3 = eVar.b()) == null) ? null : b3.a();
            C2539ahw b5 = (eVar == null || (b2 = eVar.b()) == null) ? null : b2.b();
            C2538ahv e4 = (eVar == null || (b = eVar.b()) == null) ? null : b.e();
            if (d4 == null || a2 == null || b5 == null) {
                i2 = C8569dql.i();
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ai;
                C8632dsu.a(netflixImmutableStatus, "");
                return new C6004cQk.c(null, i2, netflixImmutableStatus);
            }
            C1536aEy c1536aEy = new C1536aEy(d4, a, a2, b5, e4);
            List<InterfaceC5195buF> at = c1536aEy.at();
            if (at == null) {
                at = C8569dql.i();
            }
            NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.aJ;
            C8632dsu.a(netflixImmutableStatus2, "");
            return new C6004cQk.c(c1536aEy, at, netflixImmutableStatus2);
        }
        i = C8569dql.i();
        NetflixImmutableStatus netflixImmutableStatus3 = InterfaceC1078Nw.ad;
        C8632dsu.a(netflixImmutableStatus3, "");
        return new C6004cQk.c(null, i, netflixImmutableStatus3);
    }
}
