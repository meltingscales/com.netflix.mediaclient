package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballCallData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import o.C1596aHd;
import o.C6752cjI;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.aMU;
import o.aMX;
import o.dpR;
import o.dqE;

/* renamed from: o.cjI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6752cjI {
    public static final c a = new c(null);
    private final cQL d = new cQL();
    private MoneyballData e;

    /* renamed from: o.cjI$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("MultihouseholdData");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<MoneyballData> b(final MoneyballCallData moneyballCallData) {
        return cQL.e(this.d, false, new drX<aMU, aMX, dpR>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeData$moneyballNextModeRequest$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(aMU amu, aMX amx) {
                a(amu, amx);
                return dpR.c;
            }

            public final void a(aMU amu, aMX amx) {
                C8632dsu.c((Object) amu, "");
                C8632dsu.c((Object) amx, "");
                C6752cjI.a.getLogTag();
                amu.a(MoneyballCallData.this, amx);
            }
        }, 1, null);
    }

    public final Disposable a(final MoneyballCallData moneyballCallData, final drM<? super MoneyballData, dpR> drm, final drM<? super Throwable, dpR> drm2) {
        C8632dsu.c((Object) moneyballCallData, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drm2, "");
        return SubscribersKt.subscribeBy(b(moneyballCallData), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeData$loadMoneyballData$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                Map d;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                C6752cjI.a.getLogTag();
                C6752cjI.this.b(moneyballCallData);
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Error loading the money ball data", th, null, false, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b);
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
        }, new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeData$loadMoneyballData$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                e(moneyballData);
                return dpR.c;
            }

            public final void e(MoneyballData moneyballData) {
                C8632dsu.c((Object) moneyballData, "");
                C6752cjI.a.getLogTag();
                C6752cjI.this.e = moneyballData;
                drm.invoke(moneyballData);
            }
        });
    }
}
