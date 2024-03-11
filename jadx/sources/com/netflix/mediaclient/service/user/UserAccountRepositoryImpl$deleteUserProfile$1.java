package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1395Zt;
import o.C1596aHd;
import o.C3207auc;
import o.C5014bqk;
import o.C8556dpz;
import o.C8572dqo;
import o.C8576dqs;
import o.C8586drb;
import o.C8632dsu;
import o.C8954gU;
import o.C9035hw;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4986bqI;
import o.InterfaceC5282bvn;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.aCE;
import o.aCI;
import o.aCR;
import o.aCS;
import o.dpR;
import o.dqE;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class UserAccountRepositoryImpl$deleteUserProfile$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ InterfaceC4986bqI b;
    final /* synthetic */ C5014bqk c;
    int d;
    Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccountRepositoryImpl$deleteUserProfile$1(C5014bqk c5014bqk, InterfaceC4986bqI interfaceC4986bqI, String str, InterfaceC8585dra<? super UserAccountRepositoryImpl$deleteUserProfile$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c5014bqk;
        this.b = interfaceC4986bqI;
        this.a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserAccountRepositoryImpl$deleteUserProfile$1(this.c, this.b, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserAccountRepositoryImpl$deleteUserProfile$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Map d;
        Map k;
        Throwable th;
        Lazy lazy;
        List<InterfaceC5283bvo> list;
        List G;
        C1395Zt.a d2;
        Boolean e2;
        ArrayList arrayList;
        aCS acs;
        aCR b;
        int d3;
        e = C8586drb.e();
        int i = this.d;
        InterfaceC5282bvn interfaceC5282bvn = null;
        if (i == 0) {
            C8556dpz.d(obj);
            List<InterfaceC5283bvo> c = this.c.c();
            if (c != null && !c.isEmpty()) {
                String str = this.a;
                if (!(c instanceof Collection) || !c.isEmpty()) {
                    for (InterfaceC5283bvo interfaceC5283bvo : c) {
                        if (C8632dsu.c((Object) (interfaceC5283bvo != null ? interfaceC5283bvo.getProfileGuid() : null), (Object) str)) {
                            lazy = this.c.j;
                            aCI aci = (aCI) lazy.get();
                            C8632dsu.d(aci);
                            C1395Zt c1395Zt = new C1395Zt(new C3207auc(this.a));
                            RequestPriority requestPriority = RequestPriority.d;
                            this.e = c;
                            this.d = 1;
                            Object c2 = aCE.d.c(aci, c1395Zt, null, false, requestPriority, false, this, 6, null);
                            if (c2 == e) {
                                return e;
                            }
                            list = c;
                            obj = c2;
                        }
                    }
                }
            }
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Called deleteUserProfile with bad state", null, null, true, k, false, false, 96, null);
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
            this.c.c((AccountData) null, new NetflixStatus(StatusCode.NO_PROFILES_FOUND), this.b);
            return dpR.c;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            list = (List) this.e;
            C8556dpz.d(obj);
        }
        C8954gU c8954gU = (C8954gU) obj;
        C1395Zt.c cVar2 = (C1395Zt.c) c8954gU.d;
        C1395Zt.g c3 = cVar2 != null ? cVar2.c() : null;
        if ((c3 != null ? c3.e() : null) != null) {
            this.c.c((AccountData) null, new NetflixStatus(StatusCode.PROFILE_OPERATION_ERROR), this.b);
        } else {
            List<C9035hw> list2 = c8954gU.e;
            boolean z = false;
            if (list2 == null || list2.isEmpty()) {
                G = C8576dqs.G(list);
                String str2 = this.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : G) {
                    if (!C8632dsu.c((Object) ((InterfaceC5283bvo) obj2).getProfileGuid(), (Object) str2)) {
                        arrayList2.add(obj2);
                    }
                }
                AccountData accountData = new AccountData(arrayList2, null);
                InterfaceC5282bvn e3 = this.c.e();
                if (e3 != null) {
                    if (c3 != null && (d2 = c3.d()) != null && (e2 = d2.e()) != null) {
                        z = e2.booleanValue();
                    }
                    interfaceC5282bvn = e3.updateCanCreateUserProfile(z);
                }
                accountData.setUserAccount(interfaceC5282bvn);
                C5014bqk c5014bqk = this.c;
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                C8632dsu.a(netflixImmutableStatus, "");
                c5014bqk.c(accountData, netflixImmutableStatus, this.b);
            } else {
                C5014bqk c5014bqk2 = this.c;
                List<C9035hw> list3 = c8954gU.e;
                if (list3 != null) {
                    d3 = C8572dqo.d(list3, 10);
                    arrayList = new ArrayList(d3);
                    for (C9035hw c9035hw : list3) {
                        arrayList.add(new aCS(c9035hw));
                    }
                } else {
                    arrayList = null;
                }
                this.c.c((AccountData) null, new NetflixStatus(c5014bqk2.b((arrayList == null || (acs = (aCS) arrayList.get(0)) == null || (b = acs.b()) == null) ? null : b.c())), this.b);
            }
        }
        return dpR.c;
    }
}
