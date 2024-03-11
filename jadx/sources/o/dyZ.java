package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import o.dzU;

/* loaded from: classes5.dex */
public final /* synthetic */ class dyZ {
    public static /* synthetic */ dyS a(dyS dys, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return dyR.c(dys, i, bufferOverflow);
    }

    public static final <T> dyS<T> c(dyS<? extends T> dys, int i, BufferOverflow bufferOverflow) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        } else if (i != -1 || bufferOverflow == BufferOverflow.SUSPEND) {
            if (i == -1) {
                bufferOverflow = BufferOverflow.DROP_OLDEST;
                i = 0;
            }
            int i2 = i;
            BufferOverflow bufferOverflow2 = bufferOverflow;
            return dys instanceof dzU ? dzU.a.e((dzU) dys, null, i2, bufferOverflow2, 1, null) : new dzM(dys, null, i2, bufferOverflow2, 2, null);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> dyS<T> b(dyS<? extends T> dys, dqZ dqz) {
        c(dqz);
        return C8632dsu.c(dqz, EmptyCoroutineContext.e) ? dys : dys instanceof dzU ? dzU.a.e((dzU) dys, dqz, 0, null, 6, null) : new dzM(dys, dqz, 0, null, 12, null);
    }

    private static final void c(dqZ dqz) {
        if (dqz.get(dxD.b) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + dqz).toString());
    }
}
