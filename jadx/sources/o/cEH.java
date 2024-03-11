package o;

import android.content.Context;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerVideoPresenter$1;
import com.netflix.mediaclient.util.ConnectivityUtils;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.InterfaceC7303ctf;
import o.cBA;
import o.cBO;
import o.cEH;
import o.dpR;

/* loaded from: classes4.dex */
public class cEH extends AbstractC9940zU<cBA, cBO> {
    private boolean a;
    private int b;
    private String c;
    private boolean d;
    private int e;
    private boolean h;
    private final InterfaceC5732cGh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cEH(InterfaceC5732cGh interfaceC5732cGh, Observable<cBA> observable, Observable<dpR> observable2) {
        super(observable, interfaceC5732cGh);
        C8632dsu.c((Object) interfaceC5732cGh, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        this.i = interfaceC5732cGh;
        Observable<cBO> takeUntil = interfaceC5732cGh.v().takeUntil(observable2);
        final PlayerVideoPresenter$1 playerVideoPresenter$1 = new drM<cBO, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerVideoPresenter$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(cBO cbo) {
                C8632dsu.c((Object) cbo, "");
                return Boolean.valueOf(cbo instanceof cBO.C5569e);
            }
        };
        Observable<cBO> take = takeUntil.filter(new Predicate() { // from class: o.cEI
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean c;
                c = cEH.c(drM.this, obj);
                return c;
            }
        }).take(1L);
        C8632dsu.a(take, "");
        SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<cBO, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerVideoPresenter$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBO cbo) {
                b(cbo);
                return dpR.c;
            }

            public final void b(cBO cbo) {
                cEH.this.d = true;
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    @Override // o.AbstractC9940zU
    public void onEvent(cBA cba) {
        InterfaceC5160btX aE_;
        C8632dsu.c((Object) cba, "");
        if (cba instanceof cBA.C5542d) {
            cBA.C5542d c5542d = (cBA.C5542d) cba;
            if (c5542d.a()) {
                this.i.b(c5542d.c(), c5542d.b() != null, 0);
            }
        } else if (cba instanceof cBA.C5561w) {
            this.i.f();
        } else if (cba instanceof cBA.D) {
            this.i.i();
        } else if (cba instanceof cBA.ax) {
            if (this.a) {
                return;
            }
            this.a = true;
            InterfaceC5198buI c = ((cBA.ax) cba).c();
            String aH_ = (c == null || (aE_ = c.aE_()) == null) ? null : aE_.aH_();
            this.c = aH_;
            if (aH_ != null) {
                InterfaceC7303ctf.a aVar = InterfaceC7303ctf.c;
                Context d = AbstractApplicationC1040Mh.d();
                C8632dsu.a(d, "");
                InterfaceC5206buQ b = aVar.a(d).b(this.c);
                this.d = b != null ? b.aW_() : false;
            }
        } else if (cba instanceof cBA.T) {
            d();
        } else if (cba instanceof cBA.C5552n) {
            this.e = Math.max(((cBA.C5552n) cba).d(), 0);
        } else if (cba instanceof cBA.X) {
            this.b = ((cBA.X) cba).b();
            d();
        } else if (cba instanceof cBA.az) {
            if (((cBA.az) cba).c()) {
                return;
            }
            this.i.l();
        } else if (cba instanceof cBA.A) {
            this.i.b(((cBA.A) cba).e());
        }
    }

    private final void d() {
        int i = this.b;
        int i2 = this.e;
        if (1 > i2 || i2 > i) {
            return;
        }
        Context d = AbstractApplicationC1040Mh.d();
        InterfaceC7303ctf.a aVar = InterfaceC7303ctf.c;
        C8632dsu.d(d);
        InterfaceC7303ctf a = aVar.a(d);
        if (ConnectivityUtils.l(d)) {
            if (!this.h) {
                boolean c = a.c();
                boolean m = ConnectivityUtils.m(d);
                if (c && !m && !this.d) {
                    this.i.g();
                    this.h = true;
                    return;
                }
            }
            String str = this.c;
            if (str == null || !a.b(a.e(str))) {
                return;
            }
            this.i.h();
            return;
        }
        this.i.j();
    }
}
