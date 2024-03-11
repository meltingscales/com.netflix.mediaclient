package androidx.compose.animation.core;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    /* renamed from: constructor-impl  reason: not valid java name */
    private static long m66constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m68equalsimpl(long j, Object obj) {
        return (obj instanceof StartOffset) && j == ((StartOffset) obj).m72unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m69equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m70hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m71toStringimpl(long j) {
        return "StartOffset(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m68equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m70hashCodeimpl(this.value);
    }

    public String toString() {
        return m71toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m72unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m65constructorimpl(int i, int i2) {
        return m66constructorimpl(i * i2);
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ long m67constructorimpl$default(int i, int i2, int i3, C8627dsp c8627dsp) {
        if ((i3 & 2) != 0) {
            i2 = StartOffsetType.Companion.m78getDelayEo1U57Q();
        }
        return m65constructorimpl(i, i2);
    }
}
