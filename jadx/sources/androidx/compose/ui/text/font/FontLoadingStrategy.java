package androidx.compose.ui.text.font;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class FontLoadingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = m2204constructorimpl(0);
    private static final int OptionalLocal = m2204constructorimpl(1);
    private static final int Async = m2204constructorimpl(2);

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m2204constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2205equalsimpl(int i, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i == ((FontLoadingStrategy) obj).m2209unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2206equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2207hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2205equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2207hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2209unboximpl() {
        return this.value;
    }

    public String toString() {
        return m2208toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2208toStringimpl(int i) {
        if (m2206equalsimpl0(i, Blocking)) {
            return "Blocking";
        }
        if (m2206equalsimpl0(i, OptionalLocal)) {
            return "Optional";
        }
        if (m2206equalsimpl0(i, Async)) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getBlocking-PKNRLFQ  reason: not valid java name */
        public final int m2211getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ  reason: not valid java name */
        public final int m2212getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }

        /* renamed from: getAsync-PKNRLFQ  reason: not valid java name */
        public final int m2210getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }
    }
}
