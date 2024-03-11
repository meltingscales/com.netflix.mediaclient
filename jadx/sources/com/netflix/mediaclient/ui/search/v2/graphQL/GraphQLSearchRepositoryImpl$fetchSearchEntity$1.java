package com.netflix.mediaclient.ui.search.v2.graphQL;

import android.content.Context;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.ui.search.SearchUtils;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6078cTd;
import o.AbstractC8997hK;
import o.C2500ahJ;
import o.C2865aoD;
import o.C3166atn;
import o.C6099cTv;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC1078Nw;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.YS;
import o.aCE;
import o.aCG;
import o.aCK;
import o.aDB;
import o.cTH;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class GraphQLSearchRepositoryImpl$fetchSearchEntity$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super AbstractC6078cTd>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    int c;
    final /* synthetic */ Context d;
    final /* synthetic */ C6099cTv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchRepositoryImpl$fetchSearchEntity$1(Context context, C6099cTv c6099cTv, String str, long j, InterfaceC8585dra<? super GraphQLSearchRepositoryImpl$fetchSearchEntity$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = context;
        this.e = c6099cTv;
        this.a = str;
        this.b = j;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        return ((GraphQLSearchRepositoryImpl$fetchSearchEntity$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLSearchRepositoryImpl$fetchSearchEntity$1(this.d, this.e, this.a, this.b, interfaceC8585dra);
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
                String b = SearchUtils.b(this.d);
                Integer num = (Integer) new AbstractC8997hK.b(C8589dre.c(6)).e();
                Integer num2 = (Integer) new AbstractC8997hK.b(C8589dre.c(51)).e();
                C3166atn g = this.e.g();
                adb = this.e.b;
                C2865aoD i2 = adb.i();
                adb2 = this.e.b;
                adb3 = this.e.b;
                C2865aoD c = adb2.c(adb3.a());
                adb4 = this.e.b;
                C2865aoD g2 = adb4.g();
                String str = this.a;
                C8632dsu.d((Object) b);
                YS ys = new YS(str, b, null, num, null, num2, g, i2, c, g2);
                acg = this.e.h;
                QueryMode queryMode = QueryMode.b;
                RequestPriority requestPriority = RequestPriority.a;
                this.c = 1;
                d = aCE.d.d((aCE) acg, (InterfaceC8999hM) ys, queryMode, requestPriority, false, (InterfaceC8585dra) this, 8, (Object) null);
                if (d == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
                d = obj;
            }
            YS.d c2 = ((YS.a) aCK.e((C8954gU) d)).c();
            if (c2 != null) {
                YS.c e2 = c2.e();
                C2500ahJ a = e2 != null ? e2.a() : null;
                if (a != null) {
                    cTH cth = new cTH(a, "EntitySearch", this.b);
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    return new AbstractC6078cTd.C(cth, netflixImmutableStatus);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Exception unused) {
            return AbstractC6078cTd.C6079a.c;
        }
    }
}
