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
import o.C1596aHd;
import o.C2428afr;
import o.C2865aoD;
import o.C3105asf;
import o.C3165atm;
import o.C6087cTj;
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
import o.YD;
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
public final class GraphQLSearchIrmaRepositoryImpl$fetchSearchResults$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super AbstractC6078cTd>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    int c;
    final /* synthetic */ C6100cTw d;
    final /* synthetic */ C6087cTj e;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchIrmaRepositoryImpl$fetchSearchResults$1(Context context, C6100cTw c6100cTw, C6087cTj c6087cTj, String str, InterfaceC8585dra<? super GraphQLSearchIrmaRepositoryImpl$fetchSearchResults$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = context;
        this.d = c6100cTw;
        this.e = c6087cTj;
        this.a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLSearchIrmaRepositoryImpl$fetchSearchResults$1 graphQLSearchIrmaRepositoryImpl$fetchSearchResults$1 = new GraphQLSearchIrmaRepositoryImpl$fetchSearchResults$1(this.b, this.d, this.e, this.a, interfaceC8585dra);
        graphQLSearchIrmaRepositoryImpl$fetchSearchResults$1.h = obj;
        return graphQLSearchIrmaRepositoryImpl$fetchSearchResults$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        return ((GraphQLSearchIrmaRepositoryImpl$fetchSearchResults$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        int d;
        int c;
        aDB adb;
        aDB adb2;
        aDB adb3;
        aDB adb4;
        aDB adb5;
        aCG acg;
        Object d2;
        String d3;
        Throwable th;
        int d4;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            String b = SearchUtils.b(this.b);
            d = this.d.d(this.e.a(), this.e.b());
            Integer num = (Integer) new AbstractC8997hK.b(C8589dre.c(d)).e();
            c = this.d.c(this.e.e(), this.e.i());
            Integer num2 = (Integer) new AbstractC8997hK.b(C8589dre.c(c)).e();
            adb = this.d.g;
            C2865aoD m = adb.m();
            adb2 = this.d.g;
            C2865aoD i2 = adb2.i();
            adb3 = this.d.g;
            adb4 = this.d.g;
            C2865aoD c2 = adb3.c(adb4.a());
            adb5 = this.d.g;
            C2865aoD g = adb5.g();
            C3165atm b2 = this.d.b();
            C3105asf h = this.d.h();
            PinotDeviceResolution a = this.d.a();
            String str = this.a;
            C8632dsu.d((Object) b);
            YD yd = new YD(str, b, null, num, null, num2, m, i2, c2, g, b2, h, a);
            acg = this.d.i;
            QueryMode queryMode = QueryMode.b;
            RequestPriority requestPriority = RequestPriority.a;
            this.h = (dwU) this.h;
            this.c = 1;
            d2 = aCE.d.d((aCE) acg, (InterfaceC8999hM) yd, queryMode, requestPriority, false, (InterfaceC8585dra) this, 8, (Object) null);
            if (d2 == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dwU dwu = (dwU) this.h;
            C8556dpz.d(obj);
            d2 = obj;
        }
        C8954gU c8954gU = (C8954gU) d2;
        YD.b bVar = (YD.b) c8954gU.d;
        ArrayList arrayList = null;
        if (bVar != null) {
            C6087cTj c6087cTj = this.e;
            YD.e a2 = bVar.a();
            if (a2 != null) {
                YD.c b3 = a2.b();
                C2428afr c3 = b3 != null ? b3.c() : null;
                if (c3 != null) {
                    cTS cts = new cTS(c3, "QuerySearch", c6087cTj.d());
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
            d4 = C8572dqo.d(list, 10);
            arrayList = new ArrayList(d4);
            for (C9035hw c9035hw : list) {
                arrayList.add(new aCS(c9035hw));
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2 != null) {
            d3 = C8576dqs.d(arrayList2, "\n", null, null, 0, null, new drM<aCS, CharSequence>() { // from class: com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLSearchIrmaRepositoryImpl$fetchSearchResults$1$2$1$errorMessage$1
                @Override // o.drM
                /* renamed from: b */
                public final CharSequence invoke(aCS acs) {
                    C8632dsu.c((Object) acs, "");
                    return acs.a();
                }
            }, 30, null);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ApolloException apolloException = c8954gU.a;
            C1596aHd c1596aHd = new C1596aHd(d3, new Exception((apolloException == null || (r0 = apolloException.getMessage()) == null) ? "ApolloExceptionHandler Irma QuerySearchQuery handled an exception" : "ApolloExceptionHandler Irma QuerySearchQuery handled an exception"), ErrorType.l, false, null, false, false, 112, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b4 = c1596aHd.b();
                if (b4 != null) {
                    String c4 = errorType.c();
                    c1596aHd.a(c4 + " " + b4);
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
            InterfaceC1598aHf a3 = dVar.a();
            if (a3 != null) {
                a3.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        return AbstractC6078cTd.C6079a.c;
    }
}
