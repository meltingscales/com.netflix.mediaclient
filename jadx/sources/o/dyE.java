package o;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
final /* synthetic */ class dyE {
    public static final void a(dyJ<?> dyj, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = C8768dxv.e("Channel was consumed, consumer had failed", th);
            }
        }
        dyj.e(r0);
    }
}
