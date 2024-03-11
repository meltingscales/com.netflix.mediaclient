package androidx.compose.animation.core;

import o.C8626dso;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m57constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m58equalsimpl(long j, Object obj) {
        return (obj instanceof Motion) && j == ((Motion) obj).m63unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m61hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m62toStringimpl(long j) {
        return "Motion(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m58equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m61hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m62toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m63unboximpl() {
        return this.packedValue;
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    public static final float m59getValueimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getVelocity-impl  reason: not valid java name */
    public static final float m60getVelocityimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
