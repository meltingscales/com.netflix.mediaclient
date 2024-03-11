package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class dAX {
    public static final void e(Throwable th, dqZ dqz) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            RxJavaPlugins.onError(th);
        } catch (Throwable th2) {
            C8553dpw.c(th, th2);
            dwS.a(dqz, th);
        }
    }
}
