package o;

import io.reactivex.functions.Cancellable;
import o.dxD;

/* loaded from: classes5.dex */
public final class dAW implements Cancellable {
    private final dxD a;

    public dAW(dxD dxd) {
        this.a = dxd;
    }

    @Override // io.reactivex.functions.Cancellable
    public void cancel() {
        dxD.b.b(this.a, null, 1, null);
    }
}
