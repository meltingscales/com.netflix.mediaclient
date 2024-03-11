package o;

import android.app.Application;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

@Singleton
/* renamed from: o.dgg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8242dgg {
    private final aCN a;
    private final Application c;

    @Inject
    public C8242dgg(Application application, aCN acn) {
        C8632dsu.c((Object) application, "");
        C8632dsu.c((Object) acn, "");
        this.c = application;
        this.a = acn;
    }

    public final Completable c() {
        C8166dfJ.e("CacheHelper.clearAllCaches() wasn't called from the Main Thread", false, 2, null);
        final AbstractApplicationC1040Mh abstractApplicationC1040Mh = (AbstractApplicationC1040Mh) C9737vz.e(this.c, AbstractApplicationC1040Mh.class);
        Completable subscribeOn = Completable.create(new CompletableOnSubscribe() { // from class: o.dgh
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(CompletableEmitter completableEmitter) {
                C8242dgg.b(AbstractApplicationC1040Mh.this, this, completableEmitter);
            }
        }).mergeWith(this.a.e()).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
        C8632dsu.a(subscribeOn, "");
        return subscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final AbstractApplicationC1040Mh abstractApplicationC1040Mh, final C8242dgg c8242dgg, final CompletableEmitter completableEmitter) {
        C8632dsu.c((Object) abstractApplicationC1040Mh, "");
        C8632dsu.c((Object) c8242dgg, "");
        C8632dsu.c((Object) completableEmitter, "");
        abstractApplicationC1040Mh.i().b(new Runnable() { // from class: o.dgj
            @Override // java.lang.Runnable
            public final void run() {
                C8242dgg.d(AbstractApplicationC1040Mh.this, c8242dgg, completableEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractApplicationC1040Mh abstractApplicationC1040Mh, C8242dgg c8242dgg, CompletableEmitter completableEmitter) {
        dpR dpr;
        C8632dsu.c((Object) abstractApplicationC1040Mh, "");
        C8632dsu.c((Object) c8242dgg, "");
        C8632dsu.c((Object) completableEmitter, "");
        aSE g = abstractApplicationC1040Mh.i().g();
        if (g != null) {
            g.d(true);
            completableEmitter.onComplete();
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            c8242dgg.c(completableEmitter, new IllegalStateException("Null FalkorAgent in clearAllCaches"));
        }
    }

    private final void c(CompletableEmitter completableEmitter, Throwable th) {
        Map d;
        Map k;
        Throwable th2;
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b);
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
        completableEmitter.onError(th);
    }
}
