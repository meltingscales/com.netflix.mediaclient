package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.dxv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8768dxv {
    public static final CancellationException e(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
