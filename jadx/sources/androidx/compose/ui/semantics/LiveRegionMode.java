package androidx.compose.ui.semantics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class LiveRegionMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Polite = m2021constructorimpl(0);
    private static final int Assertive = m2021constructorimpl(1);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m2020boximpl(int i) {
        return new LiveRegionMode(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m2021constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2022equalsimpl(int i, Object obj) {
        return (obj instanceof LiveRegionMode) && i == ((LiveRegionMode) obj).m2026unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2023equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2024hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2022equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2024hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2026unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getPolite-0phEisY  reason: not valid java name */
        public final int m2028getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }

        /* renamed from: getAssertive-0phEisY  reason: not valid java name */
        public final int m2027getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }
    }

    private /* synthetic */ LiveRegionMode(int i) {
        this.value = i;
    }

    public String toString() {
        return m2025toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2025toStringimpl(int i) {
        return m2023equalsimpl0(i, Polite) ? "Polite" : m2023equalsimpl0(i, Assertive) ? "Assertive" : "Unknown";
    }
}
