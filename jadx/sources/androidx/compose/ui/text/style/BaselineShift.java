package androidx.compose.ui.text.style;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class BaselineShift {
    private final float multiplier;
    public static final Companion Companion = new Companion(null);
    private static final float Superscript = m2332constructorimpl(0.5f);
    private static final float Subscript = m2332constructorimpl(-0.5f);
    private static final float None = m2332constructorimpl(0.0f);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ BaselineShift m2331boximpl(float f) {
        return new BaselineShift(f);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static float m2332constructorimpl(float f) {
        return f;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2333equalsimpl(float f, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f, ((BaselineShift) obj).m2337unboximpl()) == 0;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2334equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2335hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2336toStringimpl(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return m2333equalsimpl(this.multiplier, obj);
    }

    public int hashCode() {
        return m2335hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m2336toStringimpl(this.multiplier);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float m2337unboximpl() {
        return this.multiplier;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNone-y9eOQZs  reason: not valid java name */
        public final float m2338getNoney9eOQZs() {
            return BaselineShift.None;
        }
    }

    private /* synthetic */ BaselineShift(float f) {
        this.multiplier = f;
    }
}
