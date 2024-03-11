package o;

import io.reactivex.SingleEmitter;

/* renamed from: o.dBk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C7681dBk<T> extends AbstractC8730dwk<T> {
    private final SingleEmitter<T> a;

    public C7681dBk(dqZ dqz, SingleEmitter<T> singleEmitter) {
        super(dqz, false, true);
        this.a = singleEmitter;
    }

    @Override // o.AbstractC8730dwk
    public void a(T t) {
        try {
            this.a.onSuccess(t);
        } catch (Throwable th) {
            dAX.e(th, getContext());
        }
    }

    @Override // o.AbstractC8730dwk
    public void b(Throwable th, boolean z) {
        try {
            if (this.a.tryOnError(th)) {
                return;
            }
        } catch (Throwable th2) {
            C8553dpw.c(th, th2);
        }
        dAX.e(th, getContext());
    }
}
