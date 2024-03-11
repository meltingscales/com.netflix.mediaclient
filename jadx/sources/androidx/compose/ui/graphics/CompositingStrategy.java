package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class CompositingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Auto = m1318constructorimpl(0);
    private static final int Offscreen = m1318constructorimpl(1);
    private static final int ModulateAlpha = m1318constructorimpl(2);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1318constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1319equalsimpl(int i, Object obj) {
        return (obj instanceof CompositingStrategy) && i == ((CompositingStrategy) obj).m1323unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1320equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1321hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1322toStringimpl(int i) {
        return "CompositingStrategy(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m1319equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1321hashCodeimpl(this.value);
    }

    public String toString() {
        return m1322toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1323unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getAuto--NrFUSI  reason: not valid java name */
        public final int m1324getAutoNrFUSI() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getOffscreen--NrFUSI  reason: not valid java name */
        public final int m1326getOffscreenNrFUSI() {
            return CompositingStrategy.Offscreen;
        }

        /* renamed from: getModulateAlpha--NrFUSI  reason: not valid java name */
        public final int m1325getModulateAlphaNrFUSI() {
            return CompositingStrategy.ModulateAlpha;
        }
    }
}
