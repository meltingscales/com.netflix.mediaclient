package androidx.compose.ui.unit;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class TextUnitType {
    private final long type;
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m2571constructorimpl(0);
    private static final long Sp = m2571constructorimpl(4294967296L);
    private static final long Em = m2571constructorimpl(8589934592L);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextUnitType m2570boximpl(long j) {
        return new TextUnitType(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2571constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2572equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnitType) && j == ((TextUnitType) obj).m2576unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2573equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2574hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2572equalsimpl(this.type, obj);
    }

    public int hashCode() {
        return m2574hashCodeimpl(this.type);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2576unboximpl() {
        return this.type;
    }

    private /* synthetic */ TextUnitType(long j) {
        this.type = j;
    }

    public String toString() {
        return m2575toStringimpl(this.type);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2575toStringimpl(long j) {
        return m2573equalsimpl0(j, Unspecified) ? "Unspecified" : m2573equalsimpl0(j, Sp) ? "Sp" : m2573equalsimpl0(j, Em) ? "Em" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-UIouoOA  reason: not valid java name */
        public final long m2579getUnspecifiedUIouoOA() {
            return TextUnitType.Unspecified;
        }

        /* renamed from: getSp-UIouoOA  reason: not valid java name */
        public final long m2578getSpUIouoOA() {
            return TextUnitType.Sp;
        }

        /* renamed from: getEm-UIouoOA  reason: not valid java name */
        public final long m2577getEmUIouoOA() {
            return TextUnitType.Em;
        }
    }
}
