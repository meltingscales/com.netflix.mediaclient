package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes.dex */
public abstract class bDM<T> implements Observer<T> {
    private final String logMsg;

    @Override // io.reactivex.Observer
    public void onComplete() {
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        C8632dsu.c((Object) disposable, "");
    }

    public bDM(String str) {
        C8632dsu.c((Object) str, "");
        this.logMsg = str;
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        Map d;
        Map k;
        Throwable th2;
        C8632dsu.c((Object) th, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        String str = this.logMsg;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd(str, th, null, true, k, false, false, 96, null);
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
    }
}
