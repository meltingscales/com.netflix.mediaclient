package com.netflix.mediaclient.ui.home.impl.repository.graphql;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import io.reactivex.Completable;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1596aHd;
import o.C4116bWv;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC8585dra;
import o.aSC;
import o.dAU;
import o.dpR;
import o.dqE;
import o.drX;
import o.dwU;
import o.dwY;

/* loaded from: classes4.dex */
public final class GraphQLLolomoRepositoryImpl$handleBackgroundListRefresh$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ C4116bWv b;
    final /* synthetic */ String c;
    int d;
    final /* synthetic */ String e;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoRepositoryImpl$handleBackgroundListRefresh$1(String str, C4116bWv c4116bWv, String str2, String str3, InterfaceC8585dra<? super GraphQLLolomoRepositoryImpl$handleBackgroundListRefresh$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = str;
        this.b = c4116bWv;
        this.c = str2;
        this.e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLLolomoRepositoryImpl$handleBackgroundListRefresh$1 graphQLLolomoRepositoryImpl$handleBackgroundListRefresh$1 = new GraphQLLolomoRepositoryImpl$handleBackgroundListRefresh$1(this.a, this.b, this.c, this.e, interfaceC8585dra);
        graphQLLolomoRepositoryImpl$handleBackgroundListRefresh$1.g = obj;
        return graphQLLolomoRepositoryImpl$handleBackgroundListRefresh$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLLolomoRepositoryImpl$handleBackgroundListRefresh$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dwU dwu;
        Map d;
        Map k;
        Throwable th;
        Context context;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            dwu = (dwU) this.g;
            LoMoType a = LoMoType.a(this.a);
            if (a == LoMoType.STANDARD) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String str = "Ignoring request to refresh standard row, listContext=" + this.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
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
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                return dpR.c;
            }
            C4116bWv c4116bWv = this.b;
            String a3 = a.a();
            C8632dsu.a(a3, "");
            this.g = dwu;
            this.d = 1;
            obj = c4116bWv.b(a3, this);
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
            dwu = (dwU) this.g;
            C8556dpz.d(obj);
        }
        C4116bWv.e eVar = (C4116bWv.e) obj;
        if (eVar == null || !eVar.a() || eVar.c().length() == 0 || eVar.b().length() == 0) {
            String str2 = this.a;
            if (str2 != null) {
                C4116bWv c4116bWv2 = this.b;
                String str3 = this.c;
                if (C8632dsu.c((Object) str2, (Object) LoMoType.MY_GAMES.a()) || C8632dsu.c((Object) str2, (Object) LoMoType.INSTANT_QUEUE.a())) {
                    context = c4116bWv2.e;
                    aSC.a(context, str2, str3);
                }
            }
            dwY.a(dwu, "Could not find listId for " + this.a, null, 2, null);
            return dpR.c;
        }
        Completable c = this.b.c(eVar.c(), eVar.b(), eVar.e(), C8589dre.c(eVar.d()), this.c, this.e, C8589dre.c(this.b.a()));
        this.g = null;
        this.d = 2;
        if (dAU.b(c, this) == e) {
            return e;
        }
        return dpR.c;
    }
}
