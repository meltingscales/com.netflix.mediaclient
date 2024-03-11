package com.netflix.mediaclient.ui.search.v2.graphQL;

import android.content.Context;
import com.apollographql.apollo3.exception.ApolloException;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.graphql.models.type.PinotDeviceResolution;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.ui.search.SearchUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6078cTd;
import o.AbstractC8997hK;
import o.C1374Yy;
import o.C1596aHd;
import o.C2428afr;
import o.C2865aoD;
import o.C3105asf;
import o.C3165atm;
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
import o.aCE;
import o.aCG;
import o.aCS;
import o.aDB;
import o.cTS;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class GraphQLSearchIrmaRepositoryImpl$fetchSearchEntity$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super AbstractC6078cTd>, Object> {
    final /* synthetic */ C6100cTw a;
    final /* synthetic */ Context b;
    final /* synthetic */ long c;
    final /* synthetic */ String d;
    int e;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchIrmaRepositoryImpl$fetchSearchEntity$1(Context context, C6100cTw c6100cTw, String str, long j, InterfaceC8585dra<? super GraphQLSearchIrmaRepositoryImpl$fetchSearchEntity$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = context;
        this.a = c6100cTw;
        this.d = str;
        this.c = j;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        return ((GraphQLSearchIrmaRepositoryImpl$fetchSearchEntity$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLSearchIrmaRepositoryImpl$fetchSearchEntity$1 graphQLSearchIrmaRepositoryImpl$fetchSearchEntity$1 = new GraphQLSearchIrmaRepositoryImpl$fetchSearchEntity$1(this.b, this.a, this.d, this.c, interfaceC8585dra);
        graphQLSearchIrmaRepositoryImpl$fetchSearchEntity$1.j = obj;
        return graphQLSearchIrmaRepositoryImpl$fetchSearchEntity$1;
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
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            String b = SearchUtils.b(this.b);
            Integer num = (Integer) new AbstractC8997hK.b(C8589dre.c(6)).e();
            Integer num2 = (Integer) new AbstractC8997hK.b(C8589dre.c(51)).e();
            adb = this.a.g;
            C2865aoD m = adb.m();
            adb2 = this.a.g;
            C2865aoD i2 = adb2.i();
            adb3 = this.a.g;
            adb4 = this.a.g;
            C2865aoD c = adb3.c(adb4.a());
            adb5 = this.a.g;
            C2865aoD g = adb5.g();
            C3165atm b2 = this.a.b();
            C3105asf h = this.a.h();
            PinotDeviceResolution a = this.a.a();
            String str = this.d;
            C8632dsu.d((Object) b);
            C1374Yy c1374Yy = new C1374Yy(str, b, null, num, null, num2, m, i2, c, g, b2, h, a);
            acg = this.a.i;
            QueryMode queryMode = QueryMode.b;
            RequestPriority requestPriority = RequestPriority.a;
            this.j = (dwU) this.j;
            this.e = 1;
            d = aCE.d.d((aCE) acg, (InterfaceC8999hM) c1374Yy, queryMode, requestPriority, false, (InterfaceC8585dra) this, 8, (Object) null);
            if (d == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dwU dwu = (dwU) this.j;
            C8556dpz.d(obj);
            d = obj;
        }
        C8954gU c8954gU = (C8954gU) d;
        C1374Yy.d dVar = (C1374Yy.d) c8954gU.d;
        if (dVar != null) {
            long j = this.c;
            C1374Yy.a c2 = dVar.c();
            if (c2 != null) {
                C1374Yy.c c3 = c2.c();
                C2428afr a2 = c3 != null ? c3.a() : null;
                if (a2 != null) {
                    cTS cts = new cTS(a2, "EntitySearch", j);
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    return new AbstractC6078cTd.C(cts, netflixImmutableStatus);
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
                ArrayList arrayList3 = new ArrayList(d2);
                for (C9035hw c9035hw2 : list2) {
                    arrayList3.add(new aCS(c9035hw2));
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            String d4 = arrayList2 != null ? C8576dqs.d(arrayList2, "\n", null, null, 0, null, new drM<aCS, CharSequence>() { // from class: com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchIrmaRepositoryImpl$fetchSearchEntity$1$2$1$errorMessage$1
                @Override // o.drM
                /* renamed from: e */
                public final CharSequence invoke(aCS acs) {
                    C8632dsu.c((Object) acs, "");
                    return acs.a();
                }
            }, 30, null) : null;
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ApolloException apolloException = c8954gU.a;
            C1596aHd c1596aHd = new C1596aHd(d4, new Exception((apolloException == null || (r0 = apolloException.getMessage()) == null) ? "ApolloExceptionHandler SearchIrma handled an exception" : "ApolloExceptionHandler SearchIrma handled an exception"), ErrorType.l, false, null, false, false, 112, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b3 = c1596aHd.b();
                if (b3 != null) {
                    c1596aHd.a(errorType.c() + " " + b3);
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
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a3 = dVar2.a();
            if (a3 != null) {
                a3.e(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
        return AbstractC6078cTd.C6079a.c;
    }
}
