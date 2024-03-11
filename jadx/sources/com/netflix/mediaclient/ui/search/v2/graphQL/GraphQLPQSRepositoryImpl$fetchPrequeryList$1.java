package com.netflix.mediaclient.ui.search.v2.graphQL;

import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6078cTd;
import o.AbstractC8997hK;
import o.C2500ahJ;
import o.C2865aoD;
import o.C3166atn;
import o.C6095cTr;
import o.C8180dfX;
import o.C8556dpz;
import o.C8569dql;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC1078Nw;
import o.InterfaceC5272bvd;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.YX;
import o.aCE;
import o.aCG;
import o.aCK;
import o.aDB;
import o.aQE;
import o.cTH;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class GraphQLPQSRepositoryImpl$fetchPrequeryList$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super AbstractC6078cTd>, Object> {
    int c;
    final /* synthetic */ C6095cTr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLPQSRepositoryImpl$fetchPrequeryList$1(C6095cTr c6095cTr, InterfaceC8585dra<? super GraphQLPQSRepositoryImpl$fetchPrequeryList$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c6095cTr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLPQSRepositoryImpl$fetchPrequeryList$1(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        return ((GraphQLPQSRepositoryImpl$fetchPrequeryList$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aDB adb;
        aDB adb2;
        aDB adb3;
        aDB adb4;
        aCG acg;
        Object d;
        e = C8586drb.e();
        int i = this.c;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                String c = C8180dfX.e.c();
                Integer num = (Integer) new AbstractC8997hK.b(C8589dre.c(3)).e();
                Integer num2 = (Integer) new AbstractC8997hK.b(C8589dre.c(51)).e();
                C3166atn g = this.d.g();
                AbstractC8997hK.b bVar = new AbstractC8997hK.b(C8589dre.e(aQE.d.a().d()));
                adb = this.d.b;
                C2865aoD i2 = adb.i();
                adb2 = this.d.b;
                adb3 = this.d.b;
                C2865aoD c2 = adb2.c(adb3.a());
                adb4 = this.d.b;
                YX yx = new YX(c, null, num, null, num2, g, i2, c2, adb4.g(), bVar);
                acg = this.d.e;
                QueryMode queryMode = QueryMode.d;
                RequestPriority requestPriority = RequestPriority.a;
                this.c = 1;
                d = aCE.d.d((aCE) acg, (InterfaceC8999hM) yx, queryMode, requestPriority, false, (InterfaceC8585dra) this, 8, (Object) null);
                if (d == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
                d = obj;
            }
            YX.b c3 = ((YX.d) aCK.e((C8954gU) d)).c();
            ArrayList arrayList = new ArrayList();
            if (c3 != null) {
                YX.c b = c3.b();
                C2500ahJ b2 = b != null ? b.b() : null;
                if (b2 != null) {
                    cTH cth = new cTH(b2, "PrequerySearch", 0L, 4, null);
                    int i3 = 0;
                    for (Object obj2 : cth.getSearchSections()) {
                        if (i3 < 0) {
                            C8569dql.h();
                        }
                        SearchSectionSummary searchSectionSummary = ((InterfaceC5272bvd) obj2).getSearchSectionSummary();
                        if (searchSectionSummary != null) {
                            arrayList.add(searchSectionSummary);
                        }
                        i3++;
                    }
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    return new AbstractC6078cTd.A(cth, arrayList, netflixImmutableStatus);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Exception unused) {
            return AbstractC6078cTd.C6079a.c;
        }
    }
}
