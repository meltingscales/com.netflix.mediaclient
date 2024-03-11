package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Map;
import o.AbstractC9940zU;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;

@SuppressLint({"CheckResult"})
/* renamed from: o.zU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9940zU<STE, UIE> {
    public void h() {
    }

    public abstract void onEvent(STE ste);

    public AbstractC9940zU(Observable<STE> observable, InterfaceC9939zT<UIE>... interfaceC9939zTArr) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interfaceC9939zTArr, "");
        final drM<STE, dpR> drm = new drM<STE, dpR>(this) { // from class: com.netflix.arch.UIPresenter$1
            final /* synthetic */ AbstractC9940zU<STE, UIE> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drM
            public /* synthetic */ dpR invoke(Object obj) {
                a(obj);
                return dpR.c;
            }

            public final void a(STE ste) {
                this.c.onEvent(ste);
            }
        };
        Consumer<? super STE> consumer = new Consumer() { // from class: o.zR
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC9940zU.e(drM.this, obj);
            }
        };
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>(this) { // from class: com.netflix.arch.UIPresenter$2
            final /* synthetic */ AbstractC9940zU<STE, UIE> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.a = this;
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                AbstractC9940zU<STE, UIE> abstractC9940zU = this.a;
                C8632dsu.d(th);
                abstractC9940zU.c(th);
            }
        };
        observable.subscribe(consumer, new Consumer() { // from class: o.zZ
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC9940zU.d(drM.this, obj);
            }
        }, new Action() { // from class: o.zW
            @Override // io.reactivex.functions.Action
            public final void run() {
                AbstractC9940zU.d(AbstractC9940zU.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC9940zU abstractC9940zU) {
        C8632dsu.c((Object) abstractC9940zU, "");
        abstractC9940zU.h();
    }

    public void c(Throwable th) {
        Map d;
        Map k;
        Throwable th2;
        C8632dsu.c((Object) th, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        String str = getClass().getName() + "#onError";
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd(str, th, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                c1596aHd.a(errorType.c() + " " + b);
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
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th2);
        } else {
            dVar.e().b(c1596aHd, th2);
        }
    }
}
