package androidx.compose.ui.text.style;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class TextOverflow {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clip = m2451constructorimpl(1);
    private static final int Ellipsis = m2451constructorimpl(2);
    private static final int Visible = m2451constructorimpl(3);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m2451constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2452equalsimpl(int i, Object obj) {
        return (obj instanceof TextOverflow) && i == ((TextOverflow) obj).m2456unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2453equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2454hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2452equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2454hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2456unboximpl() {
        return this.value;
    }

    public String toString() {
        return m2455toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2455toStringimpl(int i) {
        return m2453equalsimpl0(i, Clip) ? "Clip" : m2453equalsimpl0(i, Ellipsis) ? "Ellipsis" : m2453equalsimpl0(i, Visible) ? "Visible" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getClip-gIe3tQ8  reason: not valid java name */
        public final int m2457getClipgIe3tQ8() {
            return TextOverflow.Clip;
        }

        /* renamed from: getEllipsis-gIe3tQ8  reason: not valid java name */
        public final int m2458getEllipsisgIe3tQ8() {
            return TextOverflow.Ellipsis;
        }

        /* renamed from: getVisible-gIe3tQ8  reason: not valid java name */
        public final int m2459getVisiblegIe3tQ8() {
            return TextOverflow.Visible;
        }
    }
}
