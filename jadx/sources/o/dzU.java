package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes5.dex */
public interface dzU<T> extends dyS<T> {
    dyS<T> a(dqZ dqz, int i, BufferOverflow bufferOverflow);

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ dyS e(dzU dzu, dqZ dqz, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    dqz = EmptyCoroutineContext.e;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    bufferOverflow = BufferOverflow.SUSPEND;
                }
                return dzu.a(dqz, i, bufferOverflow);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }
}
