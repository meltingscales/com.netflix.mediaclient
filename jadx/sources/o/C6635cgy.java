package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import o.C1596aHd;
import o.C6635cgy;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.aMU;
import o.aMX;
import o.dpR;
import o.dqE;

/* renamed from: o.cgy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6635cgy {
    public static final d a = new d(null);
    private String c;
    private String d;
    private MoneyballData e;
    private final cQL b = new cQL();
    private Single<MoneyballData> h = b();

    public final boolean a() {
        return this.e != null;
    }

    public final void c(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.c = str;
        this.d = str2;
    }

    /* renamed from: o.cgy$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MemberRejoinData");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<MoneyballData> b() {
        this.e = null;
        Single<MoneyballData> cache = cQL.e(this.b, false, new drX<aMU, aMX, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinData$buildCachedInitialMoneyballRequest$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(aMU amu, aMX amx) {
                b(amu, amx);
                return dpR.c;
            }

            public final void b(aMU amu, aMX amx) {
                String str;
                String str2;
                C8632dsu.c((Object) amu, "");
                C8632dsu.c((Object) amx, "");
                C6635cgy.a.getLogTag();
                str = C6635cgy.this.c;
                if (str == null) {
                    str = SignupConstants.Flow.MOBILE_SIGNUP;
                }
                str2 = C6635cgy.this.d;
                if (str2 == null) {
                    str2 = "memberHome";
                }
                amu.c(str, str2, amx);
            }
        }, 1, null).cache();
        C8632dsu.a(cache, "");
        return cache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable d(C6635cgy c6635cgy, boolean z, drM drm, drM drm2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            drm = new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinData$loadMoneyballData$1
                public final void c(MoneyballData moneyballData) {
                    C8632dsu.c((Object) moneyballData, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                    c(moneyballData);
                    return dpR.c;
                }
            };
        }
        if ((i & 4) != 0) {
            drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinData$loadMoneyballData$2
                public final void d(Throwable th) {
                    C8632dsu.c((Object) th, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }
            };
        }
        return c6635cgy.b(z, drm, drm2);
    }

    public final void c() {
        a.getLogTag();
        this.h = b();
    }

    public final Disposable b(boolean z, final drM<? super MoneyballData, dpR> drm, final drM<? super Throwable, dpR> drm2) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drm2, "");
        a.getLogTag();
        if (z) {
            c();
        }
        return SubscribersKt.subscribeBy(this.h, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinData$loadMoneyballData$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                Single b;
                Map d2;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                C6635cgy.a.getLogTag();
                C6635cgy c6635cgy = C6635cgy.this;
                b = c6635cgy.b();
                c6635cgy.h = b;
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("Error loading the money ball data", th, null, false, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b2);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
                drm2.invoke(th);
            }
        }, new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinData$loadMoneyballData$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                a(moneyballData);
                return dpR.c;
            }

            public final void a(MoneyballData moneyballData) {
                C8632dsu.c((Object) moneyballData, "");
                C6635cgy.a.getLogTag();
                C6635cgy.this.e = moneyballData;
                drm.invoke(moneyballData);
            }
        });
    }
}
