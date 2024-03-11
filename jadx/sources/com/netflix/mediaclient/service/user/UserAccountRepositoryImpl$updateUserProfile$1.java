package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8997hK;
import o.C1360Yr;
import o.C2880aoS;
import o.C5014bqk;
import o.C8556dpz;
import o.C8572dqo;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8954gU;
import o.C9035hw;
import o.InterfaceC1078Nw;
import o.InterfaceC4986bqI;
import o.InterfaceC8585dra;
import o.aCE;
import o.aCI;
import o.aCR;
import o.aCS;
import o.aEY;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class UserAccountRepositoryImpl$updateUserProfile$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC4986bqI a;
    final /* synthetic */ String b;
    final /* synthetic */ List<String> c;
    final /* synthetic */ Boolean d;
    final /* synthetic */ Boolean e;
    final /* synthetic */ String f;
    final /* synthetic */ String g;
    final /* synthetic */ Boolean h;
    final /* synthetic */ String i;
    final /* synthetic */ Integer j;
    final /* synthetic */ C5014bqk l;

    /* renamed from: o  reason: collision with root package name */
    int f13229o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccountRepositoryImpl$updateUserProfile$1(Boolean bool, C5014bqk c5014bqk, String str, String str2, Integer num, Boolean bool2, Boolean bool3, String str3, List<String> list, String str4, InterfaceC4986bqI interfaceC4986bqI, InterfaceC8585dra<? super UserAccountRepositoryImpl$updateUserProfile$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = bool;
        this.l = c5014bqk;
        this.f = str;
        this.b = str2;
        this.j = num;
        this.h = bool2;
        this.d = bool3;
        this.i = str3;
        this.c = list;
        this.g = str4;
        this.a = interfaceC4986bqI;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserAccountRepositoryImpl$updateUserProfile$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserAccountRepositoryImpl$updateUserProfile$1(this.e, this.l, this.f, this.b, this.j, this.h, this.d, this.i, this.c, this.g, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Boolean bool;
        Lazy lazy;
        Object c;
        ArrayList arrayList;
        aCS acs;
        aCR b;
        int d;
        ArrayList arrayList2;
        int d2;
        int d3;
        C1360Yr.e b2;
        e = C8586drb.e();
        int i = this.f13229o;
        if (i == 0) {
            C8556dpz.d(obj);
            Boolean e2 = this.e == null ? null : C8589dre.e(!bool.booleanValue());
            lazy = this.l.j;
            aCI aci = (aCI) lazy.get();
            C8632dsu.d(aci);
            AbstractC8997hK.c cVar = AbstractC8997hK.d;
            C1360Yr c1360Yr = new C1360Yr(new C2880aoS(this.g, cVar.b(this.b), cVar.b(this.f), cVar.b(this.j), cVar.b(this.h), cVar.b(this.d), cVar.b(e2), cVar.b(this.i), cVar.b(this.c)));
            RequestPriority requestPriority = RequestPriority.d;
            this.f13229o = 1;
            c = aCE.d.c(aci, c1360Yr, null, false, requestPriority, true, this, 6, null);
            if (c == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
            c = obj;
        }
        C8954gU c8954gU = (C8954gU) c;
        C1360Yr.a aVar = (C1360Yr.a) c8954gU.d;
        C1360Yr.c a = aVar != null ? aVar.a() : null;
        List<C1360Yr.j> e3 = (a == null || (b2 = a.b()) == null) ? null : b2.e();
        if ((a != null ? a.a() : null) != null) {
            this.l.c((AccountData) null, new NetflixStatus(StatusCode.PROFILE_OPERATION_ERROR), this.a);
        } else {
            if (e3 != null && !e3.isEmpty()) {
                C5014bqk c5014bqk = this.l;
                List<C9035hw> list = c8954gU.e;
                if (list != null) {
                    d3 = C8572dqo.d(list, 10);
                    arrayList2 = new ArrayList(d3);
                    for (C9035hw c9035hw : list) {
                        arrayList2.add(new aCS(c9035hw));
                    }
                } else {
                    arrayList2 = null;
                }
                if (!c5014bqk.b(arrayList2)) {
                    d2 = C8572dqo.d(e3, 10);
                    ArrayList arrayList3 = new ArrayList(d2);
                    for (C1360Yr.j jVar : e3) {
                        arrayList3.add(new aEY(jVar.b(), false, 2, null));
                    }
                    AccountData accountData = new AccountData(arrayList3, null);
                    C5014bqk c5014bqk2 = this.l;
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    c5014bqk2.c(accountData, netflixImmutableStatus, this.a);
                }
            }
            C5014bqk c5014bqk3 = this.l;
            List<C9035hw> list2 = c8954gU.e;
            if (list2 != null) {
                d = C8572dqo.d(list2, 10);
                arrayList = new ArrayList(d);
                for (C9035hw c9035hw2 : list2) {
                    arrayList.add(new aCS(c9035hw2));
                }
            } else {
                arrayList = null;
            }
            this.l.c((AccountData) null, new NetflixStatus(c5014bqk3.b((arrayList == null || (acs = (aCS) arrayList.get(0)) == null || (b = acs.b()) == null) ? null : b.c())), this.a);
        }
        return dpR.c;
    }
}
