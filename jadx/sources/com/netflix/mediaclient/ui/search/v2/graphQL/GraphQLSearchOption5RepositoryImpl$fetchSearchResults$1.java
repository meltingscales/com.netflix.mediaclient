package com.netflix.mediaclient.ui.search.v2.graphQL;

import android.content.Context;
import com.apollographql.apollo3.exception.ApolloException;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.graphql.models.type.PinotUnifiedEntityKind;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.ui.search.SearchUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6078cTd;
import o.AbstractC8997hK;
import o.C1596aHd;
import o.C2508ahR;
import o.C2865aoD;
import o.C3105asf;
import o.C3165atm;
import o.C6087cTj;
import o.C6098cTu;
import o.C8153dex;
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
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.YZ;
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
public final class GraphQLSearchOption5RepositoryImpl$fetchSearchResults$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super AbstractC6078cTd>, Object> {
    int a;
    final /* synthetic */ Context b;
    final /* synthetic */ C6087cTj c;
    final /* synthetic */ C6098cTu d;
    final /* synthetic */ String e;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchOption5RepositoryImpl$fetchSearchResults$1(Context context, C6098cTu c6098cTu, C6087cTj c6087cTj, String str, InterfaceC8585dra<? super GraphQLSearchOption5RepositoryImpl$fetchSearchResults$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = context;
        this.d = c6098cTu;
        this.c = c6087cTj;
        this.e = str;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        return ((GraphQLSearchOption5RepositoryImpl$fetchSearchResults$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLSearchOption5RepositoryImpl$fetchSearchResults$1 graphQLSearchOption5RepositoryImpl$fetchSearchResults$1 = new GraphQLSearchOption5RepositoryImpl$fetchSearchResults$1(this.b, this.d, this.c, this.e, interfaceC8585dra);
        graphQLSearchOption5RepositoryImpl$fetchSearchResults$1.g = obj;
        return graphQLSearchOption5RepositoryImpl$fetchSearchResults$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        int d;
        int e2;
        aDB adb;
        aDB adb2;
        aDB adb3;
        aDB adb4;
        aDB adb5;
        aCG acg;
        Object d2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Throwable th;
        int d3;
        int d4;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.g;
            if (C8153dex.y()) {
                C8569dql.j(PinotUnifiedEntityKind.e, PinotUnifiedEntityKind.g, PinotUnifiedEntityKind.b, PinotUnifiedEntityKind.c);
            } else {
                C8569dql.j(PinotUnifiedEntityKind.e, PinotUnifiedEntityKind.g, PinotUnifiedEntityKind.c);
            }
            String b = SearchUtils.b(this.b);
            d = this.d.d(this.c.a(), this.c.b());
            Integer num = (Integer) new AbstractC8997hK.b(C8589dre.c(d)).e();
            e2 = this.d.e(this.c.e(), this.c.i());
            Integer num2 = (Integer) new AbstractC8997hK.b(C8589dre.c(e2)).e();
            adb = this.d.d;
            C2865aoD m = adb.m();
            adb2 = this.d.d;
            C2865aoD i2 = adb2.i();
            adb3 = this.d.d;
            adb4 = this.d.d;
            C2865aoD c = adb3.c(adb4.a());
            adb5 = this.d.d;
            C2865aoD g = adb5.g();
            C3165atm b2 = this.d.b();
            C3105asf h = this.d.h();
            String str = this.e;
            C8632dsu.d((Object) b);
            YZ yz = new YZ(str, b, null, num, null, num2, m, i2, c, g, b2, h);
            acg = this.d.f;
            QueryMode queryMode = QueryMode.b;
            RequestPriority requestPriority = RequestPriority.a;
            this.g = dwu;
            this.a = 1;
            d2 = aCE.d.d((aCE) acg, (InterfaceC8999hM) yz, queryMode, requestPriority, false, (InterfaceC8585dra) this, 8, (Object) null);
            if (d2 == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dwU dwu2 = (dwU) this.g;
            C8556dpz.d(obj);
            d2 = obj;
        }
        C8954gU c8954gU = (C8954gU) d2;
        YZ.e eVar = (YZ.e) c8954gU.d;
        if (eVar != null) {
            C6087cTj c6087cTj = this.c;
            YZ.b b3 = eVar.b();
            if (b3 != null) {
                YZ.c e3 = b3.e();
                C2508ahR b4 = e3 != null ? e3.b() : null;
                if (b4 != null) {
                    cTG ctg = new cTG(b4, "QuerySearch", c6087cTj.d());
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    return new AbstractC6078cTd.C(ctg, netflixImmutableStatus);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        List<C9035hw> list = c8954gU.e;
        if (list != null) {
            d4 = C8572dqo.d(list, 10);
            arrayList = new ArrayList(d4);
            for (C9035hw c9035hw : list) {
                arrayList.add(new aCS(c9035hw));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            List<C9035hw> list2 = c8954gU.e;
            if (list2 != null) {
                d3 = C8572dqo.d(list2, 10);
                ArrayList arrayList3 = new ArrayList(d3);
                for (C9035hw c9035hw2 : list2) {
                    arrayList3.add(new aCS(c9035hw2));
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            String d5 = arrayList2 != null ? C8576dqs.d(arrayList2, "\n", null, null, 0, null, new drM<aCS, CharSequence>() { // from class: com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchOption5RepositoryImpl$fetchSearchResults$1$2$1$errorMessage$1
                @Override // o.drM
                /* renamed from: c */
                public final CharSequence invoke(aCS acs) {
                    C8632dsu.c((Object) acs, "");
                    return acs.a();
                }
            }, 30, null) : null;
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ApolloException apolloException = c8954gU.a;
            C1596aHd c1596aHd = new C1596aHd(d5, new Exception((apolloException == null || (r0 = apolloException.getMessage()) == null) ? "ApolloExceptionHandler QuerySearch handled an exception" : "ApolloExceptionHandler QuerySearch handled an exception"), ErrorType.l, false, null, false, false, 112, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b5 = c1596aHd.b();
                if (b5 != null) {
                    c1596aHd.a(errorType.c() + " " + b5);
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
