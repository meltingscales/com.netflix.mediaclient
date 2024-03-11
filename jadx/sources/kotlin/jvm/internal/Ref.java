package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Ref {

    /* loaded from: classes5.dex */
    public static final class ObjectRef<T> implements Serializable {
        public T d;

        public String toString() {
            return String.valueOf(this.d);
        }
    }

    /* loaded from: classes5.dex */
    public static final class IntRef implements Serializable {
        public int b;

        public String toString() {
            return String.valueOf(this.b);
        }
    }

    /* loaded from: classes5.dex */
    public static final class LongRef implements Serializable {
        public long a;

        public String toString() {
            return String.valueOf(this.a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class FloatRef implements Serializable {
        public float d;

        public String toString() {
            return String.valueOf(this.d);
        }
    }

    /* loaded from: classes6.dex */
    public static final class DoubleRef implements Serializable {
        public double c;

        public String toString() {
            return String.valueOf(this.c);
        }
    }

    /* loaded from: classes5.dex */
    public static final class BooleanRef implements Serializable {
        public boolean a;

        public String toString() {
            return String.valueOf(this.a);
        }
    }
}
