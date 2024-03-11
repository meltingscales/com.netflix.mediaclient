package o;

import android.os.Looper;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposables;

/* renamed from: o.tL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9617tL {
    public static final boolean c(Observer<?> observer) {
        C8632dsu.d(observer, "");
        if (!C8632dsu.c(Looper.myLooper(), Looper.getMainLooper())) {
            observer.onSubscribe(Disposables.empty());
            StringBuilder sb = new StringBuilder();
            sb.append("Expected to be called on the main thread but was ");
            Thread currentThread = Thread.currentThread();
            C8632dsu.b(currentThread, "");
            sb.append(currentThread.getName());
            observer.onError(new IllegalStateException(sb.toString()));
            return false;
        }
        return true;
    }
}
