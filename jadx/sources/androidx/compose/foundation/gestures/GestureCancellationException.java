package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class GestureCancellationException extends CancellationException {
    public GestureCancellationException() {
        this(null, 1, null);
    }

    public GestureCancellationException(String str) {
        super(str);
    }

    public /* synthetic */ GestureCancellationException(String str, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str);
    }
}
