package o;

import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import o.AbstractC5594cBe;
import o.C8632dsu;
import o.cDE;
import o.dpR;

/* loaded from: classes4.dex */
public class cDE extends AbstractC9940zU<cBA, cBO> {
    private final Observable<AbstractC5594cBe> c;

    public void d(AbstractC5594cBe abstractC5594cBe) {
        C8632dsu.c((Object) abstractC5594cBe, "");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
    }

    public /* synthetic */ cDE(Observable observable, InterfaceC5730cGf[] interfaceC5730cGfArr, Observable observable2, int i, C8627dsp c8627dsp) {
        this(observable, interfaceC5730cGfArr, (i & 4) != 0 ? null : observable2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cDE(Observable<cBA> observable, InterfaceC5730cGf[] interfaceC5730cGfArr, Observable<AbstractC5594cBe> observable2) {
        super(observable, (InterfaceC9939zT[]) Arrays.copyOf(interfaceC5730cGfArr, interfaceC5730cGfArr.length));
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interfaceC5730cGfArr, "");
        this.c = observable2;
        if (this instanceof InterfaceC5706cFi) {
            ((InterfaceC5706cFi) this).a(observable);
        }
        if (this instanceof cEW) {
            ((cEW) this).e(observable);
        }
        if (this instanceof cEX) {
            ((cEX) this).d(observable);
        }
        if (this instanceof InterfaceC5698cFa) {
            ((InterfaceC5698cFa) this).h(observable);
        }
        if (this instanceof InterfaceC5710cFm) {
            ((InterfaceC5710cFm) this).c(observable);
        }
        if (this instanceof cET) {
            ((cET) this).a_(observable);
        }
        if (this instanceof InterfaceC5704cFg) {
            ((InterfaceC5704cFg) this).i(observable);
        }
        if (this instanceof cEO) {
            ((cEO) this).i(observable);
        }
        if (this instanceof InterfaceC5709cFl) {
            ((InterfaceC5709cFl) this).j(observable);
        }
        if (this instanceof cER) {
            ((cER) this).d(observable);
        }
        if (this instanceof cES) {
            ((cES) this).c(observable);
        }
        if (this instanceof InterfaceC5699cFb) {
            ((InterfaceC5699cFb) this).d(observable);
        }
        if (this instanceof InterfaceC5701cFd) {
            ((InterfaceC5701cFd) this).b(observable);
        }
        if (this instanceof InterfaceC5717cFt) {
            ((InterfaceC5717cFt) this).f(observable);
        }
        if (this instanceof InterfaceC5703cFf) {
            ((InterfaceC5703cFf) this).g(observable);
        }
        if (observable2 != null) {
            final drM<AbstractC5594cBe, dpR> drm = new drM<AbstractC5594cBe, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.BasePlayerPresenter$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(AbstractC5594cBe abstractC5594cBe) {
                    e(abstractC5594cBe);
                    return dpR.c;
                }

                public final void e(AbstractC5594cBe abstractC5594cBe) {
                    cDE cde = cDE.this;
                    C8632dsu.d(abstractC5594cBe);
                    cde.d(abstractC5594cBe);
                }
            };
            Consumer<? super AbstractC5594cBe> consumer = new Consumer() { // from class: o.cDD
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    cDE.e(drM.this, obj);
                }
            };
            final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.BasePlayerPresenter$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    cDE cde = cDE.this;
                    C8632dsu.d(th);
                    cde.c(th);
                }
            };
            observable2.subscribe(consumer, new Consumer() { // from class: o.cDG
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    cDE.a(drM.this, obj);
                }
            }, new Action() { // from class: o.cDF
                @Override // io.reactivex.functions.Action
                public final void run() {
                    cDE.a(cDE.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cDE cde) {
        C8632dsu.c((Object) cde, "");
        cde.h();
    }
}
