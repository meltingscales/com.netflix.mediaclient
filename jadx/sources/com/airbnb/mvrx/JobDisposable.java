package com.airbnb.mvrx;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.dxD;

/* loaded from: classes2.dex */
public final class JobDisposable extends AtomicReference<dxD> implements Disposable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobDisposable(dxD dxd) {
        super(dxd);
        C8632dsu.c((Object) dxd, "");
        dxd.e(new drM<Throwable, dpR>() { // from class: com.airbnb.mvrx.JobDisposable.1
            {
                super(1);
            }

            public final void a(Throwable th) {
                JobDisposable.this.set(null);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }
        });
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        dxD andSet = getAndSet(null);
        if (andSet != null) {
            dxD.b.b(andSet, null, 1, null);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        dxD dxd = get();
        return dxd == null || !dxd.cu_();
    }
}
