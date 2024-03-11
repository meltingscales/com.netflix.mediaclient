package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipPrePlayUIPresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C5692cEv;
import o.C8632dsu;
import o.InterfaceC5706cFi;
import o.InterfaceC5710cFm;
import o.InterfaceC5725cGa;
import o.cBA;
import o.cIE;
import o.dpR;

@SuppressLint({"CheckResult"})
/* renamed from: o.cEv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5692cEv extends cDE implements InterfaceC5706cFi, InterfaceC5710cFm {
    private String c;
    private final InterfaceC5725cGa d;
    private boolean e;

    @Override // o.InterfaceC5710cFm
    public void b(String str) {
        this.c = str;
    }

    public boolean b() {
        return this.e;
    }

    @Override // o.InterfaceC5710cFm
    public String c() {
        return this.c;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.e = z;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    @Override // o.InterfaceC5710cFm
    public void c(Observable<cBA> observable) {
        InterfaceC5710cFm.e.c(this, observable);
    }

    public boolean e() {
        return InterfaceC5710cFm.e.e(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5692cEv(InterfaceC5725cGa interfaceC5725cGa, Observable<cBA> observable) {
        super(observable, new InterfaceC5730cGf[]{interfaceC5725cGa}, null, 4, null);
        C8632dsu.c((Object) interfaceC5725cGa, "");
        C8632dsu.c((Object) observable, "");
        this.d = interfaceC5725cGa;
        final PlayerSkipPrePlayUIPresenter$1 playerSkipPrePlayUIPresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipPrePlayUIPresenter$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(cba instanceof cBA.ai);
            }
        };
        Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cEs
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean e;
                e = C5692cEv.e(drM.this, obj);
                return e;
            }
        });
        C8632dsu.a(filter, "");
        SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipPrePlayUIPresenter$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                a(cba);
                return dpR.c;
            }

            public final void a(cBA cba) {
                InterfaceC5725cGa interfaceC5725cGa2;
                boolean a;
                InterfaceC5725cGa interfaceC5725cGa3;
                InterfaceC5725cGa interfaceC5725cGa4;
                interfaceC5725cGa2 = C5692cEv.this.d;
                interfaceC5725cGa2.b(cIE.a.q);
                a = C5692cEv.this.a();
                if (a) {
                    interfaceC5725cGa4 = C5692cEv.this.d;
                    interfaceC5725cGa4.e(true);
                    return;
                }
                interfaceC5725cGa3 = C5692cEv.this.d;
                interfaceC5725cGa3.j();
            }
        }, 3, (Object) null);
        final drM<cBA, Boolean> drm = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipPrePlayUIPresenter$3
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(cBA cba) {
                boolean a;
                C8632dsu.c((Object) cba, "");
                a = C5692cEv.this.a();
                return Boolean.valueOf(a);
            }
        };
        Observable<cBA> filter2 = observable.filter(new Predicate() { // from class: o.cEx
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean d;
                d = C5692cEv.d(drM.this, obj);
                return d;
            }
        });
        C8632dsu.a(filter2, "");
        SubscribersKt.subscribeBy$default(filter2, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipPrePlayUIPresenter$4
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                c(cba);
                return dpR.c;
            }

            public final void c(cBA cba) {
                InterfaceC5725cGa interfaceC5725cGa2;
                InterfaceC5725cGa interfaceC5725cGa3;
                InterfaceC5725cGa interfaceC5725cGa4;
                if (cba instanceof cBA.E) {
                    interfaceC5725cGa4 = C5692cEv.this.d;
                    interfaceC5725cGa4.b(false);
                } else if (C8632dsu.c(cba, cBA.C5548j.d)) {
                    if (C5692cEv.this.b()) {
                        return;
                    }
                    interfaceC5725cGa3 = C5692cEv.this.d;
                    interfaceC5725cGa3.e(false);
                } else if (C8632dsu.c(cba, cBA.C5541c.c)) {
                    interfaceC5725cGa2 = C5692cEv.this.d;
                    interfaceC5725cGa2.b(false);
                }
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a() {
        return e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }
}
