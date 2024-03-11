package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import o.dxD;

/* loaded from: classes5.dex */
public final class TimeoutCancellationException extends CancellationException {
    public final transient dxD b;

    public TimeoutCancellationException(String str, dxD dxd) {
        super(str);
        this.b = dxd;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}
