package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SafePublicationLazyImpl;
import kotlin.SynchronizedLazyImpl;
import kotlin.UnsafeLazyImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class dpB {

    /* loaded from: classes5.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
        }
    }

    public static <T> InterfaceC8554dpx<T> b(drO<? extends T> dro) {
        C8632dsu.c((Object) dro, "");
        return new SynchronizedLazyImpl(dro, null, 2, null);
    }

    public static <T> InterfaceC8554dpx<T> b(LazyThreadSafetyMode lazyThreadSafetyMode, drO<? extends T> dro) {
        C8632dsu.c((Object) lazyThreadSafetyMode, "");
        C8632dsu.c((Object) dro, "");
        int i = e.d[lazyThreadSafetyMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new UnsafeLazyImpl(dro);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new SafePublicationLazyImpl(dro);
        }
        return new SynchronizedLazyImpl(dro, null, 2, null);
    }
}
