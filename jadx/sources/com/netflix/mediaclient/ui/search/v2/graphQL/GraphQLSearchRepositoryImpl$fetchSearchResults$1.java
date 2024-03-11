package com.netflix.mediaclient.ui.search.v2.graphQL;

import android.content.Context;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.graphql.models.type.PinotUnifiedEntityKind;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.ui.search.SearchUtils;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6078cTd;
import o.AbstractC8997hK;
import o.C2500ahJ;
import o.C2865aoD;
import o.C3166atn;
import o.C6087cTj;
import o.C6099cTv;
import o.C8153dex;
import o.C8556dpz;
import o.C8569dql;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8954gU;
import o.InterfaceC1078Nw;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.YW;
import o.aCE;
import o.aCG;
import o.aCK;
import o.aDB;
import o.cTH;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class GraphQLSearchRepositoryImpl$fetchSearchResults$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super AbstractC6078cTd>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ C6099cTv b;
    int c;
    final /* synthetic */ C6087cTj d;
    final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLSearchRepositoryImpl$fetchSearchResults$1(Context context, C6099cTv c6099cTv, C6087cTj c6087cTj, String str, InterfaceC8585dra<? super GraphQLSearchRepositoryImpl$fetchSearchResults$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = context;
        this.b = c6099cTv;
        this.d = c6087cTj;
        this.a = str;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super AbstractC6078cTd> interfaceC8585dra) {
        return ((GraphQLSearchRepositoryImpl$fetchSearchResults$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLSearchRepositoryImpl$fetchSearchResults$1(this.e, this.b, this.d, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        List j;
        int d;
        int a;
        aDB adb;
        aDB adb2;
        aDB adb3;
        aDB adb4;
        aCG acg;
        Object d2;
        e = C8586drb.e();
        int i = this.c;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                if (C8153dex.y()) {
                    j = C8569dql.j(PinotUnifiedEntityKind.e, PinotUnifiedEntityKind.g, PinotUnifiedEntityKind.b, PinotUnifiedEntityKind.c);
                } else {
                    j = C8569dql.j(PinotUnifiedEntityKind.e, PinotUnifiedEntityKind.g, PinotUnifiedEntityKind.c);
                }
                List list = j;
                String b = SearchUtils.b(this.e);
                d = this.b.d(this.d.a(), this.d.b());
                Integer num = (Integer) new AbstractC8997hK.b(C8589dre.c(d)).e();
                a = this.b.a(this.d.e(), this.d.i());
                Integer num2 = (Integer) new AbstractC8997hK.b(C8589dre.c(a)).e();
                C3166atn g = this.b.g();
                adb = this.b.b;
                C2865aoD i2 = adb.i();
                adb2 = this.b.b;
                adb3 = this.b.b;
                C2865aoD c = adb2.c(adb3.a());
                adb4 = this.b.b;
                C2865aoD g2 = adb4.g();
                String str = this.a;
                C8632dsu.d((Object) b);
                YW yw = new YW(str, b, null, num, null, num2, g, i2, c, g2, list);
                acg = this.b.h;
                QueryMode queryMode = QueryMode.b;
                RequestPriority requestPriority = RequestPriority.a;
                this.c = 1;
                d2 = aCE.d.d((aCE) acg, (InterfaceC8999hM) yw, queryMode, requestPriority, false, (InterfaceC8585dra) this, 8, (Object) null);
                if (d2 == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
                d2 = obj;
            }
            YW.b b2 = ((YW.c) aCK.e((C8954gU) d2)).b();
            if (b2 != null) {
                YW.a e2 = b2.e();
                C2500ahJ e3 = e2 != null ? e2.e() : null;
                if (e3 != null) {
                    cTH cth = new cTH(e3, "QuerySearch", this.d.d());
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
