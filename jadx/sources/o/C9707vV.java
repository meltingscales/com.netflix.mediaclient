package o;

import io.reactivex.SingleEmitter;
import java.lang.ref.WeakReference;

/* renamed from: o.vV  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9707vV<T> {
    private final WeakReference<SingleEmitter<T>> b;

    public C9707vV(SingleEmitter<T> singleEmitter) {
        C8632dsu.c((Object) singleEmitter, "");
        this.b = new WeakReference<>(singleEmitter);
    }

    public final void c(T t) {
        SingleEmitter<T> singleEmitter = this.b.get();
        if (singleEmitter != null) {
            if (t == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            singleEmitter.onSuccess(t);
        }
    }

    public final void d(Throwable th) {
        C8632dsu.c((Object) th, "");
        SingleEmitter<T> singleEmitter = this.b.get();
        if (singleEmitter != null) {
            singleEmitter.tryOnError(th);
        }
    }
}
