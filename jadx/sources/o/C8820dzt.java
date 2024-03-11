package o;

import kotlinx.coroutines.channels.BufferOverflow;

/* renamed from: o.dzt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8820dzt {
    public static final dAH e = new dAH("NO_VALUE");

    public static /* synthetic */ InterfaceC8810dzj b(int i, int i2, BufferOverflow bufferOverflow, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return d(i, i2, bufferOverflow);
    }

    public static final <T> InterfaceC8810dzj<T> d(int i, int i2, BufferOverflow bufferOverflow) {
        if (i < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
        } else if (i2 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        } else if (i <= 0 && i2 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        } else {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            return new C8818dzr(i, i3, bufferOverflow);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final <T> dyS<T> d(InterfaceC8814dzn<? extends T> interfaceC8814dzn, dqZ dqz, int i, BufferOverflow bufferOverflow) {
        return ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? interfaceC8814dzn : new dzM(interfaceC8814dzn, dqz, i, bufferOverflow);
    }
}
