package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.graphqlrepo.api.errors.ErrorType;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1385Zj;
import o.C2567aiX;
import o.C5014bqk;
import o.C8177dfU;
import o.C8556dpz;
import o.C8572dqo;
import o.C8586drb;
import o.C8691duz;
import o.C8738dws;
import o.C8954gU;
import o.C9035hw;
import o.InterfaceC1078Nw;
import o.InterfaceC4986bqI;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.aCI;
import o.aCS;
import o.aEY;
import o.dpR;
import o.drX;
import o.dwQ;
import o.dwU;

/* loaded from: classes4.dex */
public final class UserAccountRepositoryImpl$fetchSingleProfileData$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C5014bqk a;
    int b;
    final /* synthetic */ InterfaceC4986bqI d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccountRepositoryImpl$fetchSingleProfileData$1(C5014bqk c5014bqk, String str, InterfaceC4986bqI interfaceC4986bqI, InterfaceC8585dra<? super UserAccountRepositoryImpl$fetchSingleProfileData$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c5014bqk;
        this.e = str;
        this.d = interfaceC4986bqI;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserAccountRepositoryImpl$fetchSingleProfileData$1(this.a, this.e, this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserAccountRepositoryImpl$fetchSingleProfileData$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Lazy lazy;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            lazy = this.a.j;
            aCI aci = (aCI) lazy.get();
            C1385Zj c1385Zj = new C1385Zj(this.e);
            QueryMode queryMode = QueryMode.d;
            RequestPriority requestPriority = RequestPriority.d;
            this.b = 1;
            obj = aci.e(c1385Zj, queryMode, requestPriority, true, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        dwQ dwq = this.a.g;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((C8954gU) obj, this.d, null);
        this.b = 2;
        if (C8738dws.c(dwq, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.user.UserAccountRepositoryImpl$fetchSingleProfileData$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ C8954gU<C1385Zj.e> c;
        int d;
        final /* synthetic */ InterfaceC4986bqI e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C8954gU<C1385Zj.e> c8954gU, InterfaceC4986bqI interfaceC4986bqI, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.c = c8954gU;
            this.e = interfaceC4986bqI;
        }

        @Override // o.drX
        /* renamed from: a */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.c, this.e, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList<aCS> arrayList;
            boolean z;
            boolean g;
            int d;
            C1385Zj.a e;
            C8586drb.e();
            if (this.d == 0) {
                C8556dpz.d(obj);
                C1385Zj.e eVar = this.c.d;
                C2567aiX d2 = (eVar == null || (e = eVar.e()) == null) ? null : e.d();
                List<C9035hw> list = this.c.e;
                if (list != null) {
                    d = C8572dqo.d(list, 10);
                    arrayList = new ArrayList(d);
                    for (C9035hw c9035hw : list) {
                        arrayList.add(new aCS(c9035hw));
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (aCS acs : arrayList) {
                        if (acs.b().c() != ErrorType.b) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (d2 != null) {
                    g = C8691duz.g(d2.e());
                    if (!g && !z) {
                        aEY aey = new aEY(d2, false, 2, null);
                        C8177dfU.a(aey, -1, "gqlparse");
                        this.e.e(aey, InterfaceC1078Nw.aJ);
                        return dpR.c;
                    }
                }
                this.e.e((InterfaceC5283bvo) null, InterfaceC1078Nw.ad);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
