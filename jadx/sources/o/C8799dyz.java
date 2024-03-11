package o;

import kotlinx.coroutines.channels.BufferOverflow;

/* renamed from: o.dyz */
/* loaded from: classes5.dex */
public final class C8799dyz {
    public static /* synthetic */ InterfaceC8792dys e(int i, BufferOverflow bufferOverflow, drM drm, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            drm = null;
        }
        return b(i, bufferOverflow, drm);
    }

    public static final <E> InterfaceC8792dys<E> b(int i, BufferOverflow bufferOverflow, drM<? super E, dpR> drm) {
        InterfaceC8792dys<E> c8793dyt;
        if (i == -2) {
            c8793dyt = bufferOverflow == BufferOverflow.SUSPEND ? new C8793dyt<>(InterfaceC8792dys.a.d(), drm) : new dyC<>(1, bufferOverflow, drm);
        } else if (i == -1) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            return new dyC(1, BufferOverflow.DROP_OLDEST, drm);
        } else if (i != 0) {
            if (i != Integer.MAX_VALUE) {
                return bufferOverflow == BufferOverflow.SUSPEND ? new C8793dyt(i, drm) : new dyC(i, bufferOverflow, drm);
            }
            return new C8793dyt(Integer.MAX_VALUE, drm);
        } else if (bufferOverflow == BufferOverflow.SUSPEND) {
            c8793dyt = new C8793dyt<>(0, drm);
        } else {
            c8793dyt = new dyC<>(1, bufferOverflow, drm);
        }
        return c8793dyt;
    }
}
