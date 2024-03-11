package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerImmersiveModePresenter$1;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.concurrent.TimeUnit;
import o.C8632dsu;
import o.InterfaceC5706cFi;
import o.cBA;
import o.cDW;
import o.dpR;

@SuppressLint({"CheckResult"})
/* loaded from: classes4.dex */
public final class cDW extends cDE implements InterfaceC5706cFi {
    private final cFL a;
    private boolean b;
    private boolean c;
    private boolean e;

    public boolean c() {
        return this.b;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.b = z;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cDW(cFL cfl, Observable<cBA> observable) {
        super(observable, new InterfaceC5730cGf[]{cfl}, null, 4, null);
        C8632dsu.c((Object) cfl, "");
        C8632dsu.c((Object) observable, "");
        this.a = cfl;
        this.c = true;
        final PlayerImmersiveModePresenter$1 playerImmersiveModePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerImmersiveModePresenter$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(cba instanceof cBA.aB);
            }
        };
        Observable<cBA> observeOn = observable.filter(new Predicate() { // from class: o.cEb
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean c;
                c = cDW.c(drM.this, obj);
                return c;
            }
        }).debounce(2250L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        SubscribersKt.subscribeBy$default(observeOn, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerImmersiveModePresenter$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                e(cba);
                return dpR.c;
            }

            public final void e(cBA cba) {
                C8632dsu.d(cba);
                if ((((cBA.aB) cba).b() & 2048) == 0) {
                    cDW.d(cDW.this, false, false, 3, null);
                }
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    @Override // o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        if (cba instanceof cBA.ai) {
            if (c()) {
                return;
            }
            d(this, false, true, 1, null);
        } else if (C8632dsu.c(cba, cBA.C5564z.e)) {
            d(this, false, true, 1, null);
        } else if (cba instanceof cBA.C5549k) {
            d(this, ((cBA.C5549k) cba).e(), false, 2, null);
        } else if (cba instanceof cBA.C5541c) {
            d(this, false, true, 1, null);
        }
    }

    public static /* synthetic */ void d(cDW cdw, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cdw.c;
        }
        if ((i & 2) != 0) {
            z2 = cdw.e;
        }
        cdw.a(z, z2);
    }

    private final void a(boolean z, boolean z2) {
        this.c = z;
        this.e = z2;
        if (!z) {
            this.a.h();
        } else if (z2) {
            this.a.i();
        } else {
            this.a.h();
        }
    }
}
