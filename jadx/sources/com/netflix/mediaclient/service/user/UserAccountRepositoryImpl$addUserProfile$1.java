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
import o.C2906aos;
import o.C5014bqk;
import o.C8556dpz;
import o.C8572dqo;
import o.C8586drb;
import o.C8632dsu;
import o.C8954gU;
import o.C9035hw;
import o.InterfaceC1078Nw;
import o.InterfaceC4986bqI;
import o.InterfaceC5282bvn;
import o.InterfaceC8585dra;
import o.XX;
import o.aCE;
import o.aCI;
import o.aCR;
import o.aCS;
import o.aEY;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class UserAccountRepositoryImpl$addUserProfile$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ boolean a;
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ InterfaceC4986bqI e;
    final /* synthetic */ C5014bqk j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccountRepositoryImpl$addUserProfile$1(C5014bqk c5014bqk, String str, String str2, boolean z, InterfaceC4986bqI interfaceC4986bqI, InterfaceC8585dra<? super UserAccountRepositoryImpl$addUserProfile$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.j = c5014bqk;
        this.d = str;
        this.c = str2;
        this.a = z;
        this.e = interfaceC4986bqI;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserAccountRepositoryImpl$addUserProfile$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserAccountRepositoryImpl$addUserProfile$1(this.j, this.d, this.c, this.a, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Lazy lazy;
        ArrayList arrayList;
        aCS acs;
        aCR b;
        int d;
        ArrayList arrayList2;
        int d2;
        Boolean b2;
        int d3;
        XX.d c;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            lazy = this.j.j;
            aCI aci = (aCI) lazy.get();
            C8632dsu.d(aci);
            String str = this.d;
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            XX xx = new XX(new C2906aos(str, str2, this.a));
            RequestPriority requestPriority = RequestPriority.d;
            this.b = 1;
            obj = aCE.d.c(aci, xx, null, false, requestPriority, true, this, 6, null);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        C8954gU c8954gU = (C8954gU) obj;
        XX.e eVar = (XX.e) c8954gU.d;
        InterfaceC5282bvn interfaceC5282bvn = null;
        XX.a a = eVar != null ? eVar.a() : null;
        List<XX.g> a2 = (a == null || (c = a.c()) == null) ? null : c.a();
        if ((a != null ? a.b() : null) != null) {
            this.j.c((AccountData) null, new NetflixStatus(StatusCode.PROFILE_OPERATION_ERROR), this.e);
        } else {
            boolean z = false;
            if (a2 != null && !a2.isEmpty()) {
                C5014bqk c5014bqk = this.j;
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
                    d2 = C8572dqo.d(a2, 10);
                    ArrayList arrayList3 = new ArrayList(d2);
                    for (XX.g gVar : a2) {
                        arrayList3.add(new aEY(gVar.b(), false, 2, null));
                    }
                    AccountData accountData = new AccountData(arrayList3, null);
                    InterfaceC5282bvn e2 = this.j.e();
                    if (e2 != null) {
                        XX.d c2 = a.c();
                        if (c2 != null && (b2 = c2.b()) != null) {
                            z = b2.booleanValue();
                        }
                        interfaceC5282bvn = e2.updateCanCreateUserProfile(z);
                    }
                    accountData.setUserAccount(interfaceC5282bvn);
                    C5014bqk c5014bqk2 = this.j;
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    c5014bqk2.c(accountData, netflixImmutableStatus, this.e);
                }
            }
            C5014bqk c5014bqk3 = this.j;
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
            this.j.c((AccountData) null, new NetflixStatus(c5014bqk3.b((arrayList == null || (acs = (aCS) arrayList.get(0)) == null || (b = acs.b()) == null) ? null : b.c())), this.e);
        }
        return dpR.c;
    }
}
