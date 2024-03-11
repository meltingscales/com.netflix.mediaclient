package androidx.compose.ui.unit;

import o.C8626dso;
import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class Velocity {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = VelocityKt.Velocity(0.0f, 0.0f);
    private final long packedValue;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Velocity m2580boximpl(long j) {
        return new Velocity(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2581constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2584equalsimpl(long j, Object obj) {
        return (obj instanceof Velocity) && j == ((Velocity) obj).m2593unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2585equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2588hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2584equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2588hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2593unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ Velocity(long j) {
        this.packedValue = j;
    }

    /* renamed from: copy-OhffZ5M  reason: not valid java name */
    public static final long m2582copyOhffZ5M(long j, float f, float f2) {
        return VelocityKt.Velocity(f, f2);
    }

    /* renamed from: copy-OhffZ5M$default  reason: not valid java name */
    public static /* synthetic */ long m2583copyOhffZ5M$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m2586getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m2587getYimpl(j);
        }
        return m2582copyOhffZ5M(j, f, f2);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-9UxMQ8M  reason: not valid java name */
        public final long m2594getZero9UxMQ8M() {
            return Velocity.Zero;
        }
    }

    /* renamed from: minus-AH228Gc  reason: not valid java name */
    public static final long m2589minusAH228Gc(long j, long j2) {
        return VelocityKt.Velocity(m2586getXimpl(j) - m2586getXimpl(j2), m2587getYimpl(j) - m2587getYimpl(j2));
    }

    /* renamed from: plus-AH228Gc  reason: not valid java name */
    public static final long m2590plusAH228Gc(long j, long j2) {
        return VelocityKt.Velocity(m2586getXimpl(j) + m2586getXimpl(j2), m2587getYimpl(j) + m2587getYimpl(j2));
    }

    /* renamed from: times-adjELrA  reason: not valid java name */
    public static final long m2591timesadjELrA(long j, float f) {
        return VelocityKt.Velocity(m2586getXimpl(j) * f, m2587getYimpl(j) * f);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2592toStringimpl(long j) {
        return '(' + m2586getXimpl(j) + ", " + m2587getYimpl(j) + ") px/sec";
    }

    public String toString() {
        return m2592toStringimpl(this.packedValue);
    }

    /* renamed from: getX-impl  reason: not valid java name */
    public static final float m2586getXimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl  reason: not valid java name */
    public static final float m2587getYimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
