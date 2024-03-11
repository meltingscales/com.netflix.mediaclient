package com.netflix.mediaclient.ui.search.v2.graphQL;

import com.apollographql.apollo3.exception.ApolloException;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6078cTd;
import o.AbstractC8997hK;
import o.C1596aHd;
import o.C2508ahR;
import o.C2865aoD;
import o.C6096cTs;
import o.C8180dfX;
import o.C8556dpz;
import o.C8569dql;
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
import o.InterfaceC5272bvd;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.YU;
import o.aCE;
import o.aCG;
import o.aCS;
import o.aDB;
import o.cTG;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class GraphQLPQSOption5RepositoryImpl$fetchPrequeryList$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super AbstractC6078cTd>, Object> {
    int a;
    final /* synthetic */ C6096cTs c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLPQSOption5RepositoryImpl$fetchPrequeryList$1(C6096cTs c6096cTs, InterfaceC8585dra<? super GraphQLPQSOption5RepositoryImpl$fetchPrequeryList$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c6096cTs;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        return ((GraphQLPQSOption5RepositoryImpl$fetchPrequeryList$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLPQSOption5RepositoryImpl$fetchPrequeryList$1 graphQLPQSOption5RepositoryImpl$fetchPrequeryList$1 = new GraphQLPQSOption5RepositoryImpl$fetchPrequeryList$1(this.c, interfaceC8585dra);
        graphQLPQSOption5RepositoryImpl$fetchPrequeryList$1.d = obj;
        return graphQLPQSOption5RepositoryImpl$fetchPrequeryList$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aDB adb;
        aDB adb2;
        aDB adb3;
        aDB adb4;
        aDB adb5;
        aCG acg;
        Object d;
        ArrayList arrayList;
        ArrayList arrayList2;
        Throwable th;
        int d2;
        int d3;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            String c = C8180dfX.e.c();
            Integer num = (Integer) new AbstractC8997hK.b(C8589dre.c(3)).e();
            Integer num2 = (Integer) new AbstractC8997hK.b(C8589dre.c(51)).e();
            adb = this.c.e;
            C2865aoD m = adb.m();
            adb2 = this.c.e;
            C2865aoD i2 = adb2.i();
            adb3 = this.c.e;
            adb4 = this.c.e;
            C2865aoD c2 = adb3.c(adb4.a());
            adb5 = this.c.e;
            YU yu = new YU(c, null, num, null, num2, m, i2, c2, adb5.g(), this.c.b(), this.c.h());
            acg = this.c.d;
            QueryMode queryMode = QueryMode.d;
            RequestPriority requestPriority = RequestPriority.a;
            this.d = (dwU) this.d;
            this.a = 1;
            d = aCE.d.d((aCE) acg, (InterfaceC8999hM) yu, queryMode, requestPriority, false, (InterfaceC8585dra) this, 8, (Object) null);
            if (d == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dwU dwu = (dwU) this.d;
            C8556dpz.d(obj);
            d = obj;
        }
        C8954gU c8954gU = (C8954gU) d;
        YU.c cVar = (YU.c) c8954gU.d;
        if (cVar != null) {
            YU.e d4 = cVar.d();
            ArrayList arrayList3 = new ArrayList();
            if (d4 != null) {
                YU.a b = d4.b();
                C2508ahR c3 = b != null ? b.c() : null;
                if (c3 != null) {
                    cTG ctg = new cTG(c3, "PrequerySearch", 0L, 4, null);
                    int i3 = 0;
                    for (Object obj2 : ctg.getSearchSections()) {
                        if (i3 < 0) {
                            C8569dql.h();
                        }
                        SearchSectionSummary searchSectionSummary = ((InterfaceC5272bvd) obj2).getSearchSectionSummary();
                        if (searchSectionSummary != null) {
                            arrayList3.add(searchSectionSummary);
                        }
                        i3++;
                    }
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    return new AbstractC6078cTd.A(ctg, arrayList3, netflixImmutableStatus);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        List<C9035hw> list = c8954gU.e;
        if (list != null) {
            d3 = C8572dqo.d(list, 10);
            arrayList = new ArrayList(d3);
            for (C9035hw c9035hw : list) {
                arrayList.add(new aCS(c9035hw));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            List<C9035hw> list2 = c8954gU.e;
            if (list2 != null) {
                d2 = C8572dqo.d(list2, 10);
                ArrayList arrayList4 = new ArrayList(d2);
                for (C9035hw c9035hw2 : list2) {
                    arrayList4.add(new aCS(c9035hw2));
                }
                arrayList2 = arrayList4;
            } else {
                arrayList2 = null;
            }
            String d5 = arrayList2 != null ? C8576dqs.d(arrayList2, "\n", null, null, 0, null, new drM<aCS, CharSequence>() { // from class: com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLPQSOption5RepositoryImpl$fetchPrequeryList$1$2$1$errorMessage$1
                @Override // o.drM
                /* renamed from: b */
                public final CharSequence invoke(aCS acs) {
                    C8632dsu.c((Object) acs, "");
                    return acs.a();
                }
            }, 30, null) : null;
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            ApolloException apolloException = c8954gU.a;
            C1596aHd c1596aHd = new C1596aHd(d5, new Exception((apolloException == null || (r0 = apolloException.getMessage()) == null) ? "ApolloExceptionHandler handled an exception" : "ApolloExceptionHandler handled an exception"), ErrorType.l, false, null, false, false, 112, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
