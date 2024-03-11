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
import o.C1357Yo;
import o.C3374axl;
import o.C5016bqm;
import o.C8556dpz;
import o.C8572dqo;
import o.C8586drb;
import o.C8632dsu;
import o.C8954gU;
import o.C9035hw;
import o.InterfaceC1078Nw;
import o.InterfaceC1593aHa;
import o.InterfaceC4986bqI;
import o.InterfaceC5284bvp;
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
public final class UserAccountRepositoryV2Impl$updateUserProfileSubtitlePrefs$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C5016bqm a;
    int b;
    final /* synthetic */ InterfaceC4986bqI c;
    final /* synthetic */ InterfaceC5284bvp d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccountRepositoryV2Impl$updateUserProfileSubtitlePrefs$1(C5016bqm c5016bqm, String str, InterfaceC5284bvp interfaceC5284bvp, InterfaceC4986bqI interfaceC4986bqI, InterfaceC8585dra<? super UserAccountRepositoryV2Impl$updateUserProfileSubtitlePrefs$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c5016bqm;
        this.e = str;
        this.d = interfaceC5284bvp;
        this.c = interfaceC4986bqI;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserAccountRepositoryV2Impl$updateUserProfileSubtitlePrefs$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserAccountRepositoryV2Impl$updateUserProfileSubtitlePrefs$1(this.a, this.e, this.d, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Lazy lazy;
        C3374axl e2;
        ArrayList arrayList;
        ArrayList arrayList2;
        aCS acs;
        aCR b;
        int d;
        int d2;
        ArrayList arrayList3;
        int d3;
        int d4;
        C1357Yo.d a;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            lazy = this.a.e;
            aCI aci = (aCI) lazy.get();
            C8632dsu.d(aci);
            e2 = this.a.e(this.e, this.d);
            C1357Yo c1357Yo = new C1357Yo(e2);
            RequestPriority requestPriority = RequestPriority.d;
            this.b = 1;
            obj = aCE.d.c(aci, c1357Yo, null, false, requestPriority, true, this, 6, null);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        C8954gU c8954gU = (C8954gU) obj;
        C1357Yo.e eVar = (C1357Yo.e) c8954gU.d;
        C1357Yo.f c = eVar != null ? eVar.c() : null;
        List<C1357Yo.j> b2 = (c == null || (a = c.a()) == null) ? null : a.b();
        if ((c != null ? c.e() : null) != null) {
            InterfaceC1593aHa.c.a("guid: " + this.e + ", errors: " + c.e());
            this.a.c((AccountData) null, new NetflixStatus(StatusCode.PROFILE_OPERATION_ERROR), this.c);
        } else {
            if (b2 != null && !b2.isEmpty()) {
                C5016bqm c5016bqm = this.a;
                List<C9035hw> list = c8954gU.e;
                if (list != null) {
                    d4 = C8572dqo.d(list, 10);
                    arrayList3 = new ArrayList(d4);
                    for (C9035hw c9035hw : list) {
                        arrayList3.add(new aCS(c9035hw));
                    }
                } else {
                    arrayList3 = null;
                }
                if (!c5016bqm.b(arrayList3)) {
                    d3 = C8572dqo.d(b2, 10);
                    ArrayList arrayList4 = new ArrayList(d3);
                    for (C1357Yo.j jVar : b2) {
                        arrayList4.add(new aEY(jVar.e(), false, 2, null));
                    }
                    AccountData accountData = new AccountData(arrayList4, null);
                    C5016bqm c5016bqm2 = this.a;
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    c5016bqm2.c(accountData, netflixImmutableStatus, this.c);
                }
            }
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            String str = this.e;
            List<C9035hw> list2 = c8954gU.e;
            if (list2 != null) {
                d2 = C8572dqo.d(list2, 10);
                arrayList = new ArrayList(d2);
                for (C9035hw c9035hw2 : list2) {
                    arrayList.add(new aCS(c9035hw2));
                }
            } else {
                arrayList = null;
            }
            aVar.a("guid: " + str + ", gqlerrors: " + arrayList);
            C5016bqm c5016bqm3 = this.a;
            List<C9035hw> list3 = c8954gU.e;
            if (list3 != null) {
                d = C8572dqo.d(list3, 10);
                arrayList2 = new ArrayList(d);
                for (C9035hw c9035hw3 : list3) {
                    arrayList2.add(new aCS(c9035hw3));
                }
            } else {
                arrayList2 = null;
            }
            this.a.c((AccountData) null, new NetflixStatus(c5016bqm3.b((arrayList2 == null || (acs = (aCS) arrayList2.get(0)) == null || (b = acs.b()) == null) ? null : b.c())), this.c);
        }
        return dpR.c;
    }
}
