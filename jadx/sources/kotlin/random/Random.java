package kotlin.random;

import java.io.Serializable;
import o.C8596drl;
import o.C8627dsp;
import o.dsY;

/* loaded from: classes.dex */
public abstract class Random {
    public static final Default a = new Default(null);
    private static final Random e = C8596drl.a.e();

    public abstract int b(int i);

    public int b() {
        return b(32);
    }

    public int e(int i) {
        return b(0, i);
    }

    public int b(int i, int i2) {
        int b;
        int i3;
        int i4;
        dsY.a(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = b(dsY.c(i5));
            } else {
                do {
                    b = b() >>> 1;
                    i3 = b % i5;
                } while ((b - i3) + (i5 - 1) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int b2 = b();
            if (i <= b2 && b2 < i2) {
                return b2;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class Default extends Random implements Serializable {
        public /* synthetic */ Default(C8627dsp c8627dsp) {
            this();
        }

        private Default() {
        }

        /* loaded from: classes6.dex */
        static final class Serialized implements Serializable {
            public static final Serialized b = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.a;
            }
        }

        private final Object writeReplace() {
            return Serialized.b;
        }

        @Override // kotlin.random.Random
        public int b(int i) {
            return Random.e.b(i);
        }

        @Override // kotlin.random.Random
        public int b() {
            return Random.e.b();
        }

        @Override // kotlin.random.Random
        public int e(int i) {
            return Random.e.e(i);
        }

        @Override // kotlin.random.Random
        public int b(int i, int i2) {
            return Random.e.b(i, i2);
        }
    }
}
