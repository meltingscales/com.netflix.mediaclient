package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.Density;
import o.C8626dso;
import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class InlineDensity {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m486constructorimpl(Float.NaN, Float.NaN);
    private final long packedValue;

    /* renamed from: constructor-impl  reason: not valid java name */
    private static long m487constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m489equalsimpl(long j, Object obj) {
        return (obj instanceof InlineDensity) && j == ((InlineDensity) obj).m495unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m490equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m493hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m489equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m493hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m495unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m488constructorimpl(Density density) {
        return m486constructorimpl(density.getDensity(), density.getFontScale());
    }

    public String toString() {
        return m494toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m494toStringimpl(long j) {
        return "InlineDensity(density=" + m491getDensityimpl(j) + ", fontScale=" + m492getFontScaleimpl(j) + ')';
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-L26CHvs  reason: not valid java name */
        public final long m496getUnspecifiedL26CHvs() {
            return InlineDensity.Unspecified;
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m486constructorimpl(float f, float f2) {
        return m487constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getDensity-impl  reason: not valid java name */
    public static final float m491getDensityimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getFontScale-impl  reason: not valid java name */
    public static final float m492getFontScaleimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
