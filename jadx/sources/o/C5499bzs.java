package o;

import androidx.lifecycle.Lifecycle;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C1596aHd;
import o.C5496bzp;
import o.C5499bzs;
import o.C8632dsu;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC5283bvo;
import o.aMU;
import o.aMX;
import o.dpR;
import o.dqE;
import o.drM;

/* renamed from: o.bzs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5499bzs extends AbstractC8899fS<C5496bzp> {
    private final cQQ a;
    private final CompositeDisposable c;
    private final cQL d;

    /* renamed from: o.bzs$d */
    /* loaded from: classes4.dex */
    public interface d {
        void b(MoneyballData moneyballData);

        void e(Throwable th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5499bzs(C5496bzp c5496bzp) {
        super(c5496bzp, null, 2, null);
        C8632dsu.c((Object) c5496bzp, "");
        this.d = new cQL();
        this.a = new cQQ();
        this.c = new CompositeDisposable();
    }

    @Override // o.AbstractC8899fS
    public void d() {
        super.d();
        this.c.clear();
    }

    public final void a(final d dVar) {
        C8632dsu.c((Object) dVar, "");
        DisposableKt.plusAssign(this.c, SubscribersKt.subscribeBy(this.d.e(true, (drX<? super aMU, ? super aMX, dpR>) new drX<aMU, aMX, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$fetchMoneyballData$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(aMU amu, aMX amx) {
                b(amu, amx);
                return dpR.c;
            }

            public final void b(aMU amu, aMX amx) {
                C8632dsu.c((Object) amu, "");
                C8632dsu.c((Object) amx, "");
                amu.c(SignupConstants.Flow.DEMOGRAPHIC_SIMPLICITY, SignupConstants.Mode.DEMOGRAPHIC_INTERSTITIAL_LANDING, amx);
            }
        }), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$fetchMoneyballData$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C8632dsu.c((Object) th, "");
                C5499bzs.d.this.e(th);
            }
        }, new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$fetchMoneyballData$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                b(moneyballData);
                return dpR.c;
            }

            public final void b(MoneyballData moneyballData) {
                C8632dsu.c((Object) moneyballData, "");
                C5499bzs.d.this.b(moneyballData);
            }
        }));
        e(new drM<C5496bzp, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$fetchMoneyballData$4
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5496bzp c5496bzp) {
                b(c5496bzp);
                return dpR.c;
            }

            public final void b(C5496bzp c5496bzp) {
                C8632dsu.c((Object) c5496bzp, "");
                C5499bzs.this.b(new drM<C5496bzp, C5496bzp>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$fetchMoneyballData$4.1
                    @Override // o.drM
                    /* renamed from: c */
                    public final C5496bzp invoke(C5496bzp c5496bzp2) {
                        C5496bzp d2;
                        C8632dsu.c((Object) c5496bzp2, "");
                        d2 = c5496bzp2.d((r20 & 1) != 0 ? c5496bzp2.b : true, (r20 & 2) != 0 ? c5496bzp2.a : false, (r20 & 4) != 0 ? c5496bzp2.c : null, (r20 & 8) != 0 ? c5496bzp2.e : null, (r20 & 16) != 0 ? c5496bzp2.d : null, (r20 & 32) != 0 ? c5496bzp2.f : null, (r20 & 64) != 0 ? c5496bzp2.h : false, (r20 & 128) != 0 ? c5496bzp2.i : false, (r20 & JSONzip.end) != 0 ? c5496bzp2.j : null);
                        return d2;
                    }
                });
            }
        });
    }

    public final void d(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        CompositeDisposable compositeDisposable = this.c;
        Single<InterfaceC5283bvo> e = this.a.e();
        AndroidLifecycleScopeProvider a = AndroidLifecycleScopeProvider.a(netflixActivity, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a, "");
        Object as = e.as(AutoDispose.b(a));
        C8632dsu.b(as, "");
        DisposableKt.plusAssign(compositeDisposable, C9725vn.d((SingleSubscribeProxy) as, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$fetchProfileData$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                k = dqE.k(new LinkedHashMap());
                C1596aHd c1596aHd = new C1596aHd("Failed to get profile data in demo collection", th, null, true, k, false, false, 96, null);
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
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1597aHe c3 = dVar2.c();
                if (c3 != null) {
                    c3.d(c1596aHd, th2);
                } else {
                    dVar2.e().b(c1596aHd, th2);
                }
            }
        }, new drM<InterfaceC5283bvo, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$fetchProfileData$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC5283bvo interfaceC5283bvo) {
                c(interfaceC5283bvo);
                return dpR.c;
            }

            public final void c(final InterfaceC5283bvo interfaceC5283bvo) {
                C8632dsu.c((Object) interfaceC5283bvo, "");
                final C5499bzs c5499bzs = C5499bzs.this;
                c5499bzs.e(new drM<C5496bzp, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$fetchProfileData$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C5496bzp c5496bzp) {
                        e(c5496bzp);
                        return dpR.c;
                    }

                    public final void e(C5496bzp c5496bzp) {
                        C8632dsu.c((Object) c5496bzp, "");
                        C5499bzs c5499bzs2 = C5499bzs.this;
                        final InterfaceC5283bvo interfaceC5283bvo2 = interfaceC5283bvo;
                        c5499bzs2.b(new drM<C5496bzp, C5496bzp>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel.fetchProfileData.2.1.1
                            {
                                super(1);
                            }

                            @Override // o.drM
                            /* renamed from: c */
                            public final C5496bzp invoke(C5496bzp c5496bzp2) {
                                C5496bzp d2;
                                C8632dsu.c((Object) c5496bzp2, "");
                                d2 = c5496bzp2.d((r20 & 1) != 0 ? c5496bzp2.b : false, (r20 & 2) != 0 ? c5496bzp2.a : false, (r20 & 4) != 0 ? c5496bzp2.c : null, (r20 & 8) != 0 ? c5496bzp2.e : null, (r20 & 16) != 0 ? c5496bzp2.d : InterfaceC5283bvo.this.getAvatarUrl(), (r20 & 32) != 0 ? c5496bzp2.f : InterfaceC5283bvo.this.getProfileName(), (r20 & 64) != 0 ? c5496bzp2.h : false, (r20 & 128) != 0 ? c5496bzp2.i : false, (r20 & JSONzip.end) != 0 ? c5496bzp2.j : null);
                                return d2;
                            }
                        });
                    }
                });
            }
        }));
    }

    public final void b(final String str) {
        C8632dsu.c((Object) str, "");
        b(new drM<C5496bzp, C5496bzp>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$updateBirthDate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C5496bzp invoke(C5496bzp c5496bzp) {
                C5496bzp d2;
                C8632dsu.c((Object) c5496bzp, "");
                d2 = c5496bzp.d((r20 & 1) != 0 ? c5496bzp.b : false, (r20 & 2) != 0 ? c5496bzp.a : false, (r20 & 4) != 0 ? c5496bzp.c : null, (r20 & 8) != 0 ? c5496bzp.e : str, (r20 & 16) != 0 ? c5496bzp.d : null, (r20 & 32) != 0 ? c5496bzp.f : null, (r20 & 64) != 0 ? c5496bzp.h : false, (r20 & 128) != 0 ? c5496bzp.i : false, (r20 & JSONzip.end) != 0 ? c5496bzp.j : null);
                return d2;
            }
        });
    }

    public final void c(final String str) {
        C8632dsu.c((Object) str, "");
        b(new drM<C5496bzp, C5496bzp>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$updateGender$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final C5496bzp invoke(C5496bzp c5496bzp) {
                C5496bzp d2;
                C8632dsu.c((Object) c5496bzp, "");
                d2 = c5496bzp.d((r20 & 1) != 0 ? c5496bzp.b : false, (r20 & 2) != 0 ? c5496bzp.a : false, (r20 & 4) != 0 ? c5496bzp.c : str, (r20 & 8) != 0 ? c5496bzp.e : null, (r20 & 16) != 0 ? c5496bzp.d : null, (r20 & 32) != 0 ? c5496bzp.f : null, (r20 & 64) != 0 ? c5496bzp.h : false, (r20 & 128) != 0 ? c5496bzp.i : false, (r20 & JSONzip.end) != 0 ? c5496bzp.j : null);
                return d2;
            }
        });
    }

    public final void c(final boolean z) {
        b(new drM<C5496bzp, C5496bzp>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$updateCtaEnabled$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final C5496bzp invoke(C5496bzp c5496bzp) {
                C5496bzp d2;
                C8632dsu.c((Object) c5496bzp, "");
                d2 = c5496bzp.d((r20 & 1) != 0 ? c5496bzp.b : false, (r20 & 2) != 0 ? c5496bzp.a : z, (r20 & 4) != 0 ? c5496bzp.c : null, (r20 & 8) != 0 ? c5496bzp.e : null, (r20 & 16) != 0 ? c5496bzp.d : null, (r20 & 32) != 0 ? c5496bzp.f : null, (r20 & 64) != 0 ? c5496bzp.h : false, (r20 & 128) != 0 ? c5496bzp.i : false, (r20 & JSONzip.end) != 0 ? c5496bzp.j : null);
                return d2;
            }
        });
    }

    public final void b(final boolean z, final boolean z2, final Integer num) {
        e(new drM<C5496bzp, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$initState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5496bzp c5496bzp) {
                a(c5496bzp);
                return dpR.c;
            }

            public final void a(C5496bzp c5496bzp) {
                C8632dsu.c((Object) c5496bzp, "");
                C5499bzs c5499bzs = C5499bzs.this;
                final boolean z3 = z;
                final boolean z4 = z2;
                final Integer num2 = num;
                c5499bzs.b(new drM<C5496bzp, C5496bzp>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$initState$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: b */
                    public final C5496bzp invoke(C5496bzp c5496bzp2) {
                        C5496bzp d2;
                        C8632dsu.c((Object) c5496bzp2, "");
                        d2 = c5496bzp2.d((r20 & 1) != 0 ? c5496bzp2.b : false, (r20 & 2) != 0 ? c5496bzp2.a : false, (r20 & 4) != 0 ? c5496bzp2.c : null, (r20 & 8) != 0 ? c5496bzp2.e : null, (r20 & 16) != 0 ? c5496bzp2.d : null, (r20 & 32) != 0 ? c5496bzp2.f : null, (r20 & 64) != 0 ? c5496bzp2.h : z3, (r20 & 128) != 0 ? c5496bzp2.i : z4, (r20 & JSONzip.end) != 0 ? c5496bzp2.j : num2);
                        return d2;
                    }
                });
            }
        });
    }

    public final void j() {
        e(new drM<C5496bzp, dpR>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$setLoadingTrue$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5496bzp c5496bzp) {
                e(c5496bzp);
                return dpR.c;
            }

            public final void e(C5496bzp c5496bzp) {
                C8632dsu.c((Object) c5496bzp, "");
                C5499bzs.this.b(new drM<C5496bzp, C5496bzp>() { // from class: com.netflix.mediaclient.ui.cfourintersitialsurvey.impl.DemographicCollectionViewModel$setLoadingTrue$1.1
                    @Override // o.drM
                    /* renamed from: a */
                    public final C5496bzp invoke(C5496bzp c5496bzp2) {
                        C5496bzp d2;
                        C8632dsu.c((Object) c5496bzp2, "");
                        d2 = c5496bzp2.d((r20 & 1) != 0 ? c5496bzp2.b : true, (r20 & 2) != 0 ? c5496bzp2.a : false, (r20 & 4) != 0 ? c5496bzp2.c : null, (r20 & 8) != 0 ? c5496bzp2.e : null, (r20 & 16) != 0 ? c5496bzp2.d : null, (r20 & 32) != 0 ? c5496bzp2.f : null, (r20 & 64) != 0 ? c5496bzp2.h : false, (r20 & 128) != 0 ? c5496bzp2.i : false, (r20 & JSONzip.end) != 0 ? c5496bzp2.j : null);
                        return d2;
                    }
                });
            }
        });
    }
}
