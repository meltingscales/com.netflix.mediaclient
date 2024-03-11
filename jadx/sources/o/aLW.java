package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.aLL;
import o.aLW;
import o.aLZ;
import o.dpR;
import o.dqE;

@SuppressLint({"CheckResult"})
/* loaded from: classes3.dex */
public final class aLW implements aLP {
    private final CompositeDisposable c;
    private final C6004cQk d;

    public aLW(Observable<dpR> observable) {
        C8632dsu.c((Object) observable, "");
        this.c = new CompositeDisposable();
        this.d = new C6004cQk();
        SubscribersKt.subscribeBy$default(observable, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.repository.impl.FalcorRepositoryImpl$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                Map d;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String str = "Error subscribing to destroyObservable in FalcorRepository " + th;
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
                aLW.this.a();
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.repository.impl.FalcorRepositoryImpl$2
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }

            public final void a() {
                aLW.this.a();
            }
        }, (drM) null, 4, (Object) null);
    }

    @Override // o.aLP
    public <T> Observable<T> e(final InterfaceC0989Ki<T> interfaceC0989Ki) {
        C8632dsu.c((Object) interfaceC0989Ki, "");
        Observable<T> create = Observable.create(new ObservableOnSubscribe() { // from class: o.aLV
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                aLW.c(aLW.this, interfaceC0989Ki, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(aLW alw, InterfaceC0989Ki interfaceC0989Ki, final ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) alw, "");
        C8632dsu.c((Object) interfaceC0989Ki, "");
        C8632dsu.c((Object) observableEmitter, "");
        DisposableKt.plusAssign(alw.c, SubscribersKt.subscribeBy$default(alw.d.d(interfaceC0989Ki), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.repository.impl.FalcorRepositoryImpl$fetchTask$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }

            public final void d(Throwable th) {
                C8632dsu.c((Object) th, "");
                observableEmitter.tryOnError(th);
            }
        }, (drO) null, new drM<T, dpR>() { // from class: com.netflix.mediaclient.repository.impl.FalcorRepositoryImpl$fetchTask$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drM
            public /* synthetic */ dpR invoke(Object obj) {
                e(obj);
                return dpR.c;
            }

            public final void e(T t) {
                C8632dsu.c((Object) t, "");
                observableEmitter.onNext(t);
                observableEmitter.onComplete();
            }
        }, 2, (Object) null));
    }

    @Override // o.aLP
    public <T> void b(InterfaceC0989Ki<T> interfaceC0989Ki, final drM<? super aLO<? extends T>, dpR> drm) {
        C8632dsu.c((Object) interfaceC0989Ki, "");
        C8632dsu.c((Object) drm, "");
        DisposableKt.plusAssign(this.c, SubscribersKt.subscribeBy$default(this.d.d(interfaceC0989Ki), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.repository.impl.FalcorRepositoryImpl$fetchTask$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                drm.invoke(new aLL(th));
            }
        }, (drO) null, new drM<T, dpR>() { // from class: com.netflix.mediaclient.repository.impl.FalcorRepositoryImpl$fetchTask$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.drM
            public /* synthetic */ dpR invoke(Object obj) {
                d(obj);
                return dpR.c;
            }

            public final void d(T t) {
                C8632dsu.c((Object) t, "");
                drm.invoke(new aLZ(t));
            }
        }, 2, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        this.c.clear();
    }
}
