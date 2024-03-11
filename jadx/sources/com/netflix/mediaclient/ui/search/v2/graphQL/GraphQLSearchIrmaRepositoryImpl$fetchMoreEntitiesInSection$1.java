package com.netflix.mediaclient.ui.search.v2.graphQL;

import com.apollographql.apollo3.exception.ApolloException;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.model.leafs.SearchPageEntity;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6078cTd;
import o.AbstractC8997hK;
import o.C1596aHd;
import o.C2411afj;
import o.C2415afn;
import o.C2865aoD;
import o.C6087cTj;
import o.C6097cTt;
import o.C6100cTw;
import o.C8556dpz;
import o.C8572dqo;
import o.C8576dqs;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8954gU;
import o.C9035hw;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.YB;
import o.aCE;
import o.aCG;
import o.aCS;
import o.aDB;
import o.cTA;
import o.cTP;
import o.cTR;
import o.cTT;
import o.cTV;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class GraphQLSearchIrmaRepositoryImpl$fetchMoreEntitiesInSection$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super AbstractC6078cTd>, Object> {
    private /* synthetic */ Object a;
    final /* synthetic */ C6100cTw b;
    final /* synthetic */ C6087cTj c;
    Object d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchIrmaRepositoryImpl$fetchMoreEntitiesInSection$1(C6087cTj c6087cTj, C6100cTw c6100cTw, InterfaceC8585dra<? super GraphQLSearchIrmaRepositoryImpl$fetchMoreEntitiesInSection$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c6087cTj;
        this.b = c6100cTw;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        return ((GraphQLSearchIrmaRepositoryImpl$fetchMoreEntitiesInSection$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLSearchIrmaRepositoryImpl$fetchMoreEntitiesInSection$1 graphQLSearchIrmaRepositoryImpl$fetchMoreEntitiesInSection$1 = new GraphQLSearchIrmaRepositoryImpl$fetchMoreEntitiesInSection$1(this.c, this.b, interfaceC8585dra);
        graphQLSearchIrmaRepositoryImpl$fetchMoreEntitiesInSection$1.a = obj;
        return graphQLSearchIrmaRepositoryImpl$fetchMoreEntitiesInSection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        String str;
        int c;
        aDB adb;
        aDB adb2;
        aDB adb3;
        aDB adb4;
        aDB adb5;
        aCG acg;
        Object d;
        String str2;
        List<SearchPageEntity> list;
        String e2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Throwable th;
        int d2;
        int d3;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.a;
            SearchSectionSummary searchSectionSummary = this.c.c().h().get(this.c.a());
            C8632dsu.d(searchSectionSummary);
            String b = ((cTV) searchSectionSummary).b();
            if (this.c.e() <= 0 || (list = this.c.c().g().get(this.c.c().h().get(this.c.a()).getSectionId())) == null || list.isEmpty()) {
                str = null;
            } else {
                SearchPageEntity searchPageEntity = list.get(list.size() - 1);
                if (searchPageEntity instanceof cTP) {
                    e2 = ((cTP) searchPageEntity).e();
                } else if (searchPageEntity instanceof C6097cTt) {
                    e2 = ((C6097cTt) searchPageEntity).e();
                } else if (searchPageEntity instanceof cTR) {
                    e2 = ((cTR) searchPageEntity).e();
                } else {
                    C8632dsu.d(searchPageEntity);
                    e2 = ((cTA) searchPageEntity).e();
                }
                str = e2;
            }
            c = this.b.c(this.c.e(), this.c.i());
            Integer num = (Integer) new AbstractC8997hK.b(C8589dre.c(c)).e();
            adb = this.b.g;
            C2865aoD m = adb.m();
            adb2 = this.b.g;
            C2865aoD i2 = adb2.i();
            adb3 = this.b.g;
            adb4 = this.b.g;
            C2865aoD c2 = adb3.c(adb4.a());
            adb5 = this.b.g;
            YB yb = new YB(b, str, num, m, i2, c2, adb5.g());
            acg = this.b.i;
            QueryMode queryMode = QueryMode.b;
            RequestPriority requestPriority = RequestPriority.a;
            this.a = dwu;
            this.d = b;
            this.e = 1;
            d = aCE.d.d((aCE) acg, (InterfaceC8999hM) yb, queryMode, requestPriority, false, (InterfaceC8585dra) this, 8, (Object) null);
            if (d == e) {
                return e;
            }
            str2 = b;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dwU dwu2 = (dwU) this.a;
            C8556dpz.d(obj);
            str2 = (String) this.d;
            d = obj;
        }
        C8954gU c8954gU = (C8954gU) d;
        YB.b bVar = (YB.b) c8954gU.d;
        if (bVar != null) {
            C6087cTj c6087cTj = this.c;
            YB.a b2 = bVar.b();
            SearchSectionSummary searchSectionSummary2 = c6087cTj.c().h().get(c6087cTj.a());
            if (b2 != null) {
                C2415afn b3 = b2.b();
                C2411afj d4 = b2.d();
                if (b3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                String sectionId = searchSectionSummary2.getSectionId();
                if (sectionId != null) {
                    C8632dsu.a(sectionId, "");
                    cTT ctt = new cTT(b3, d4, Integer.parseInt(sectionId), "QuerySearch", String.valueOf(c6087cTj.d()), c6087cTj.c().h().size(), 24L, b2.e(), str2);
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    return new AbstractC6078cTd.B(ctt, netflixImmutableStatus);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        List<C9035hw> list2 = c8954gU.e;
        if (list2 != null) {
            d3 = C8572dqo.d(list2, 10);
            arrayList = new ArrayList(d3);
            for (C9035hw c9035hw : list2) {
                arrayList.add(new aCS(c9035hw));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            List<C9035hw> list3 = c8954gU.e;
            if (list3 != null) {
                d2 = C8572dqo.d(list3, 10);
                ArrayList arrayList3 = new ArrayList(d2);
                for (C9035hw c9035hw2 : list3) {
                    arrayList3.add(new aCS(c9035hw2));
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            String d5 = arrayList2 != null ? C8576dqs.d(arrayList2, "\n", null, null, 0, null, new drM<aCS, CharSequence>() { // from class: com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchIrmaRepositoryImpl$fetchMoreEntitiesInSection$1$2$1$errorMessage$1
                @Override // o.drM
                /* renamed from: e */
                public final CharSequence invoke(aCS acs) {
                    C8632dsu.c((Object) acs, "");
                    return acs.a();
                }
            }, 30, null) : null;
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ApolloException apolloException = c8954gU.a;
            C1596aHd c1596aHd = new C1596aHd(d5, new Exception((apolloException == null || (r0 = apolloException.getMessage()) == null) ? "ApolloExceptionHandler HorizontalPagination Irma handled an exception" : "ApolloExceptionHandler HorizontalPagination Irma handled an exception"), ErrorType.l, false, null, false, false, 112, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b4 = c1596aHd.b();
                if (b4 != null) {
                    c1596aHd.a(errorType.c() + " " + b4);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        return AbstractC6078cTd.C6079a.c;
    }
}
