package o;

import java.lang.ref.SoftReference;

/* loaded from: classes5.dex */
final class dDD<T> {
    public volatile SoftReference<T> c = new SoftReference<>(null);

    public final T c(drO<? extends T> dro) {
        synchronized (this) {
            C8632dsu.c((Object) dro, "");
            T t = this.c.get();
            if (t != null) {
                return t;
            }
            T invoke = dro.invoke();
            this.c = new SoftReference<>(invoke);
            return invoke;
        }
    }
}
