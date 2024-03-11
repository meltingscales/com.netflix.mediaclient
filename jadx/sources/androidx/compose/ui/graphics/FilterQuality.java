package androidx.compose.ui.graphics;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class FilterQuality {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m1327constructorimpl(0);
    private static final int Low = m1327constructorimpl(1);
    private static final int Medium = m1327constructorimpl(2);
    private static final int High = m1327constructorimpl(3);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1327constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1328equalsimpl(int i, Object obj) {
        return (obj instanceof FilterQuality) && i == ((FilterQuality) obj).m1332unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1329equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1330hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1328equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1330hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1332unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNone-f-v9h1I  reason: not valid java name */
        public final int m1334getNonefv9h1I() {
            return FilterQuality.None;
        }

        /* renamed from: getLow-f-v9h1I  reason: not valid java name */
        public final int m1333getLowfv9h1I() {
            return FilterQuality.Low;
        }
    }

    public String toString() {
        return m1331toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1331toStringimpl(int i) {
        return m1329equalsimpl0(i, None) ? "None" : m1329equalsimpl0(i, Low) ? "Low" : m1329equalsimpl0(i, Medium) ? "Medium" : m1329equalsimpl0(i, High) ? "High" : "Unknown";
    }
}
