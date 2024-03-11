package o;

import com.netflix.mediaclient.service.api.core.ModuleInstallState;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.subjects.PublishSubject;
import java.util.Collection;
import java.util.Locale;
import o.aMN;

/* loaded from: classes.dex */
public abstract class bXA {
    public final aMN d;

    protected abstract void c(Throwable th);

    protected abstract void c(aMN.e eVar);

    public bXA(aMN amn) {
        this.d = amn;
    }

    public void d(PublishSubject<dpR> publishSubject, aMN.d dVar) {
        this.d.a(dVar).takeUntil(publishSubject).subscribe(new Observer<aMN.e>() { // from class: o.bXA.1
            @Override // io.reactivex.Observer
            public void onSubscribe(Disposable disposable) {
            }

            @Override // io.reactivex.Observer
            /* renamed from: e */
            public void onNext(aMN.e eVar) {
                bXA.this.c(eVar);
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                bXA.this.c(th);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                C1044Mm.a("ModuleInstall", "onComplete");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(Collection<Locale> collection, CompositeDisposable compositeDisposable) {
        compositeDisposable.clear();
        compositeDisposable.add((Disposable) this.d.c(collection).subscribeWith(new DisposableObserver<aMN.e>() { // from class: o.bXA.4
            @Override // io.reactivex.Observer
            /* renamed from: b */
            public void onNext(aMN.e eVar) {
                bXA.this.c(eVar);
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                bXA.this.c(th);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                C1044Mm.a("ModuleInstall", "LanguageInstall onComplete");
            }
        }));
    }

    public String b(Throwable th) {
        C1044Mm.e("ModuleInstall", "getErrorMessageFrom onError ", th);
        String localizedMessage = th.getLocalizedMessage();
        return localizedMessage != null ? localizedMessage.substring(0, Math.min(localizedMessage.length(), 50)) : "";
    }

    public String a(aMN.e eVar) {
        return ModuleInstallState.a(eVar.d());
    }
}
