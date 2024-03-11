package androidx.compose.ui.unit;

import androidx.compose.ui.unit.TextUnitType;
import o.C8626dso;
import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class TextUnit {
    public static final Companion Companion = new Companion(null);
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextUnit m2554boximpl(long j) {
        return new TextUnit(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2555constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2556equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnit) && j == ((TextUnit) obj).m2563unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2557equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getRawType-impl  reason: not valid java name */
    public static final long m2558getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2561hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2556equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2561hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2563unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    public String toString() {
        return m2562toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2562toStringimpl(long j) {
        long m2559getTypeUIouoOA = m2559getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2579getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2578getSpUIouoOA())) {
            return m2560getValueimpl(j) + ".sp";
        } else if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2577getEmUIouoOA())) {
            return m2560getValueimpl(j) + ".em";
        } else {
            return "Invalid";
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-XSAIIZE  reason: not valid java name */
        public final long m2564getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m2570boximpl(companion.m2579getUnspecifiedUIouoOA()), TextUnitType.m2570boximpl(companion.m2578getSpUIouoOA()), TextUnitType.m2570boximpl(companion.m2577getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    /* renamed from: getType-UIouoOA  reason: not valid java name */
    public static final long m2559getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m2558getRawTypeimpl(j) >>> 32)].m2576unboximpl();
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    public static final float m2560getValueimpl(long j) {
        C8626dso c8626dso = C8626dso.e;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
