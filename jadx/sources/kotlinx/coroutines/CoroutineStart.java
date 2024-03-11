package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import o.InterfaceC8585dra;
import o.dAT;
import o.dAV;
import o.dqW;
import o.drX;

/* loaded from: classes5.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes5.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            d = iArr;
        }
    }

    public final boolean a() {
        return this == LAZY;
    }

    public final <R, T> void e(drX<? super R, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, R r, InterfaceC8585dra<? super T> interfaceC8585dra) {
        int i = c.d[ordinal()];
        if (i == 1) {
            dAT.c(drx, r, interfaceC8585dra, null, 4, null);
        } else if (i == 2) {
            dqW.e(drx, r, interfaceC8585dra);
        } else if (i == 3) {
            dAV.c(drx, r, interfaceC8585dra);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
