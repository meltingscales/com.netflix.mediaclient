package androidx.compose.ui.unit;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class Dp implements Comparable<Dp> {
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m2492constructorimpl(0.0f);
    private static final float Infinity = m2492constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m2492constructorimpl(Float.NaN);
    private final float value;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Dp m2490boximpl(float f) {
        return new Dp(f);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static float m2492constructorimpl(float f) {
        return f;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2493equalsimpl(float f, Object obj) {
        return (obj instanceof Dp) && Float.compare(f, ((Dp) obj).m2498unboximpl()) == 0;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2494equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2495hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    public boolean equals(Object obj) {
        return m2493equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2495hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float m2498unboximpl() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Dp dp) {
        return m2497compareTo0680j_4(dp.m2498unboximpl());
    }

    private /* synthetic */ Dp(float f) {
        this.value = f;
    }

    /* renamed from: compareTo-0680j_4  reason: not valid java name */
    public static int m2491compareTo0680j_4(float f, float f2) {
        return Float.compare(f, f2);
    }

    /* renamed from: compareTo-0680j_4  reason: not valid java name */
    public int m2497compareTo0680j_4(float f) {
        return m2491compareTo0680j_4(this.value, f);
    }

    public String toString() {
        return m2496toStringimpl(this.value);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getHairline-D9Ej5fM  reason: not valid java name */
        public final float m2499getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM  reason: not valid java name */
        public final float m2500getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM  reason: not valid java name */
        public final float m2501getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2496toStringimpl(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }
}
