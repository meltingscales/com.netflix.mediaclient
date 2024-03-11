package o;

import io.reactivex.CompletableEmitter;

/* renamed from: o.dBa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C7671dBa extends AbstractC8730dwk<dpR> {
    private final CompletableEmitter c;

    public C7671dBa(dqZ dqz, CompletableEmitter completableEmitter) {
        super(dqz, false, true);
        this.c = completableEmitter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC8730dwk
    /* renamed from: e */
    public void a(dpR dpr) {
        try {
            this.c.onComplete();
        } catch (Throwable th) {
            dAX.e(th, getContext());
        }
    }

    @Override // o.AbstractC8730dwk
    public void b(Throwable th, boolean z) {
        try {
            if (this.c.tryOnError(th)) {
                return;
            }
        } catch (Throwable th2) {
            C8553dpw.c(th, th2);
        }
        dAX.e(th, getContext());
    }
}
