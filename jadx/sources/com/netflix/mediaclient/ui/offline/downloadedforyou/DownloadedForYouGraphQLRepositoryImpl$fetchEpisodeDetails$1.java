package com.netflix.mediaclient.ui.offline.downloadedforyou;

import android.content.Context;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.model.leafs.Bookmark;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractApplicationC1040Mh;
import o.C1332Xp;
import o.C1358Yp;
import o.C1528aEq;
import o.C2363aeo;
import o.C2410afi;
import o.C2514ahX;
import o.C2539ahw;
import o.C2547aiD;
import o.C2572aic;
import o.C2576aig;
import o.C6004cQk;
import o.C7408cve;
import o.C8126deW;
import o.C8556dpz;
import o.C8566dqi;
import o.C8576dqs;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC1078Nw;
import o.InterfaceC5227bul;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.aCE;
import o.aCG;
import o.aDB;
import o.aGD;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DownloadedForYouGraphQLRepositoryImpl$fetchEpisodeDetails$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C6004cQk.b<InterfaceC5227bul>>, Object> {
    Object b;
    int c;
    final /* synthetic */ C7408cve d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadedForYouGraphQLRepositoryImpl$fetchEpisodeDetails$1(String str, C7408cve c7408cve, InterfaceC8585dra<? super DownloadedForYouGraphQLRepositoryImpl$fetchEpisodeDetails$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = str;
        this.d = c7408cve;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C6004cQk.b<InterfaceC5227bul>> interfaceC8585dra) {
        return ((DownloadedForYouGraphQLRepositoryImpl$fetchEpisodeDetails$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DownloadedForYouGraphQLRepositoryImpl$fetchEpisodeDetails$1(this.e, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC5283bvo b;
        List e2;
        Object d;
        C6004cQk.b bVar;
        C1358Yp.i iVar;
        BookmarkStore c;
        C1358Yp.j e3;
        C1358Yp.e b2;
        Object y;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            b = C8126deW.b();
            Context d2 = AbstractApplicationC1040Mh.d();
            C8632dsu.a(d2, "");
            aDB d3 = aGD.d(d2);
            e2 = C8566dqi.e(C8589dre.c(Integer.parseInt(this.e)));
            C1358Yp c1358Yp = new C1358Yp(e2, aDB.b(d3, d3.t(), null, 2, null), d3.c(d3.n()), aDB.c(d3, d3.d(), null, 2, null), aDB.c(d3, d3.c(), null, 2, null));
            aCG.e eVar = aCG.b;
            C1332Xp c1332Xp = C1332Xp.b;
            Context context = (Context) C1332Xp.b(Context.class);
            if (b != null) {
                aCG e4 = eVar.e(context, b);
                QueryMode queryMode = QueryMode.b;
                RequestPriority requestPriority = RequestPriority.a;
                this.b = b;
                this.c = 1;
                d = aCE.d.d((aCE) e4, (InterfaceC8999hM) c1358Yp, queryMode, requestPriority, false, (InterfaceC8585dra) this, 8, (Object) null);
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
            b = (InterfaceC5283bvo) this.b;
            d = obj;
        }
        C1358Yp.b bVar2 = (C1358Yp.b) ((C8954gU) d).d;
        if (bVar2 != null) {
            List<C1358Yp.i> d4 = bVar2.d();
            if (d4 != null) {
                y = C8576dqs.y(d4);
                iVar = (C1358Yp.i) y;
            } else {
                iVar = null;
            }
            if (iVar != null) {
                C2539ahw.d a = iVar.c().a();
                C2363aeo d5 = a != null ? a.d() : null;
                C2539ahw.d a2 = iVar.c().a();
                C2572aic j = a2 != null ? a2.j() : null;
                C1358Yp.a a3 = iVar.a();
                C2547aiD c2 = (a3 == null || (b2 = a3.b()) == null) ? null : b2.c();
                C1358Yp.a a4 = iVar.a();
                C2576aig d6 = (a4 == null || (e3 = a4.e()) == null) ? null : e3.d();
                C2410afi e5 = iVar.e();
                C1358Yp.c b3 = iVar.b();
                C2514ahX d7 = iVar.d();
                C2539ahw c3 = iVar.c();
                if (d5 != null && c2 != null) {
                    C1528aEq c1528aEq = new C1528aEq(d5, j, d6, c2, null, e5, b3 != null ? b3.e() : null, d7, c3);
                    c = this.d.c();
                    c.updateBookmarkIfExists(c1528aEq.aE_().aH_(), new Bookmark(c1528aEq) { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouGraphQLRepositoryImpl$fetchEpisodeDetails$1.1
                        private long c;
                        private long e;

                        @Override // com.netflix.model.leafs.Bookmark
                        public long getBookmarkPositionMs() {
                            return this.e;
                        }

                        @Override // com.netflix.model.leafs.Bookmark
                        public long getLastModified() {
                            return this.c;
                        }

                        @Override // com.netflix.model.leafs.Bookmark
                        public void setBookmarkPositionMs(long j2) {
                            this.e = j2;
                        }

                        @Override // com.netflix.model.leafs.Bookmark
                        public void setLastModified(long j2) {
                            this.c = j2;
                        }

                        {
                            this.e = c1528aEq.aq_();
                            this.c = c1528aEq.ay();
                        }

                        @Override // com.netflix.model.leafs.Bookmark
                        public Integer getInteractiveProgress() {
                            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                        }
                    }, b.getProfileGuid());
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    return new C6004cQk.b(c1528aEq, netflixImmutableStatus);
                }
                NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.ad;
                C8632dsu.a(netflixImmutableStatus2, "");
                bVar = new C6004cQk.b(null, netflixImmutableStatus2);
            } else {
                NetflixImmutableStatus netflixImmutableStatus3 = InterfaceC1078Nw.ad;
                C8632dsu.a(netflixImmutableStatus3, "");
                bVar = new C6004cQk.b(null, netflixImmutableStatus3);
            }
        } else {
            NetflixImmutableStatus netflixImmutableStatus4 = InterfaceC1078Nw.ad;
            C8632dsu.a(netflixImmutableStatus4, "");
            bVar = new C6004cQk.b(null, netflixImmutableStatus4);
        }
        return bVar;
    }
}
