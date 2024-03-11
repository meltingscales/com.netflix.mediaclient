package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5014bqk;
import o.C8177dfU;
import o.C8556dpz;
import o.C8569dql;
import o.C8572dqo;
import o.C8586drb;
import o.C8738dws;
import o.C8954gU;
import o.InterfaceC1078Nw;
import o.InterfaceC1593aHa;
import o.InterfaceC4986bqI;
import o.InterfaceC8585dra;
import o.XP;
import o.aCI;
import o.aEU;
import o.aEY;
import o.dpR;
import o.drX;
import o.dwQ;
import o.dwU;

/* loaded from: classes4.dex */
public final class UserAccountRepositoryImpl$fetchAccountAndProfileDataUsingGraphQL$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ C5014bqk c;
    final /* synthetic */ InterfaceC4986bqI e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccountRepositoryImpl$fetchAccountAndProfileDataUsingGraphQL$1(C5014bqk c5014bqk, InterfaceC4986bqI interfaceC4986bqI, InterfaceC8585dra<? super UserAccountRepositoryImpl$fetchAccountAndProfileDataUsingGraphQL$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c5014bqk;
        this.e = interfaceC4986bqI;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserAccountRepositoryImpl$fetchAccountAndProfileDataUsingGraphQL$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserAccountRepositoryImpl$fetchAccountAndProfileDataUsingGraphQL$1(this.c, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Lazy lazy;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            lazy = this.c.j;
            XP xp = new XP();
            QueryMode queryMode = QueryMode.d;
            RequestPriority requestPriority = RequestPriority.d;
            this.a = 1;
            obj = ((aCI) lazy.get()).e(xp, queryMode, requestPriority, true, this);
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
        dwQ dwq = this.c.g;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((C8954gU) obj, this.e, this.c, null);
        this.a = 2;
        if (C8738dws.c(dwq, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.user.UserAccountRepositoryImpl$fetchAccountAndProfileDataUsingGraphQL$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        int a;
        final /* synthetic */ C5014bqk b;
        final /* synthetic */ C8954gU<XP.e> c;
        final /* synthetic */ InterfaceC4986bqI d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C8954gU<XP.e> c8954gU, InterfaceC4986bqI interfaceC4986bqI, C5014bqk c5014bqk, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.c = c8954gU;
            this.d = interfaceC4986bqI;
            this.b = c5014bqk;
        }

        @Override // o.drX
        /* renamed from: c */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.c, this.d, this.b, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean b;
            int d;
            C8586drb.e();
            if (this.a == 0) {
                C8556dpz.d(obj);
                XP.e eVar = this.c.d;
                XP.d c = eVar != null ? eVar.c() : null;
                List<XP.h> i = c != null ? c.i() : null;
                if (i != null && !i.isEmpty()) {
                    b = this.b.b(this.c);
                    if (b) {
                        if (!(i instanceof Collection) || !i.isEmpty()) {
                            for (XP.h hVar : i) {
                                if (hVar.a().e().length() == 0) {
                                    InterfaceC1593aHa.c.a("A profile is missing GUID");
                                    break;
                                }
                            }
                        }
                        InterfaceC1593aHa.c.a("Profile response errors " + this.c.e);
                        this.d.c(null, InterfaceC1078Nw.ad);
                    } else {
                        d = C8572dqo.d(i, 10);
                        ArrayList arrayList = new ArrayList(d);
                        int i2 = 0;
                        for (Object obj2 : i) {
                            if (i2 < 0) {
                                C8569dql.h();
                            }
                            aEY aey = new aEY(((XP.h) obj2).a(), false, 2, null);
                            C8177dfU.a(aey, i2, "gqlparse");
                            arrayList.add(aey);
                            i2++;
                        }
                        AccountData accountData = new AccountData(arrayList, null);
                        accountData.setUserAccount(new aEU(c));
                        this.d.c(accountData, InterfaceC1078Nw.aJ);
                    }
                } else {
                    InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                    aVar.a("Profile response was null or empty");
                    if (this.c.a()) {
                        aVar.a("Profile response errors " + this.c.e);
                    }
                    this.d.c(null, InterfaceC1078Nw.ad);
                }
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
