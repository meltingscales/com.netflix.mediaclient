package androidx.compose.ui.text.style;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class Hyphens {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m2342constructorimpl(1);
    private static final int Auto = m2342constructorimpl(2);
    private static final int Unspecified = m2342constructorimpl(Integer.MIN_VALUE);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Hyphens m2341boximpl(int i) {
        return new Hyphens(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m2342constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2343equalsimpl(int i, Object obj) {
        return (obj instanceof Hyphens) && i == ((Hyphens) obj).m2347unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2344equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2345hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2343equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2345hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2347unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNone-vmbZdU8  reason: not valid java name */
        public final int m2349getNonevmbZdU8() {
            return Hyphens.None;
        }

        /* renamed from: getAuto-vmbZdU8  reason: not valid java name */
        public final int m2348getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* renamed from: getUnspecified-vmbZdU8  reason: not valid java name */
        public final int m2350getUnspecifiedvmbZdU8() {
            return Hyphens.Unspecified;
        }
    }

    private /* synthetic */ Hyphens(int i) {
        this.value = i;
    }

    public String toString() {
        return m2346toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2346toStringimpl(int i) {
        return m2344equalsimpl0(i, None) ? "Hyphens.None" : m2344equalsimpl0(i, Auto) ? "Hyphens.Auto" : m2344equalsimpl0(i, Unspecified) ? "Hyphens.Unspecified" : "Invalid";
    }
}
