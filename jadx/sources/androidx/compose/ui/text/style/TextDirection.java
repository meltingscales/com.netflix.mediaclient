package androidx.compose.ui.text.style;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class TextDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Ltr = m2425constructorimpl(1);
    private static final int Rtl = m2425constructorimpl(2);
    private static final int Content = m2425constructorimpl(3);
    private static final int ContentOrLtr = m2425constructorimpl(4);
    private static final int ContentOrRtl = m2425constructorimpl(5);
    private static final int Unspecified = m2425constructorimpl(Integer.MIN_VALUE);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextDirection m2424boximpl(int i) {
        return new TextDirection(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m2425constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2426equalsimpl(int i, Object obj) {
        return (obj instanceof TextDirection) && i == ((TextDirection) obj).m2430unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2427equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2428hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2426equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2428hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2430unboximpl() {
        return this.value;
    }

    private /* synthetic */ TextDirection(int i) {
        this.value = i;
    }

    public String toString() {
        return m2429toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2429toStringimpl(int i) {
        return m2427equalsimpl0(i, Ltr) ? "Ltr" : m2427equalsimpl0(i, Rtl) ? "Rtl" : m2427equalsimpl0(i, Content) ? "Content" : m2427equalsimpl0(i, ContentOrLtr) ? "ContentOrLtr" : m2427equalsimpl0(i, ContentOrRtl) ? "ContentOrRtl" : m2427equalsimpl0(i, Unspecified) ? "Unspecified" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getLtr-s_7X-co  reason: not valid java name */
        public final int m2434getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co  reason: not valid java name */
        public final int m2435getRtls_7Xco() {
            return TextDirection.Rtl;
        }

        /* renamed from: getContent-s_7X-co  reason: not valid java name */
        public final int m2431getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co  reason: not valid java name */
        public final int m2432getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co  reason: not valid java name */
        public final int m2433getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getUnspecified-s_7X-co  reason: not valid java name */
        public final int m2436getUnspecifieds_7Xco() {
            return TextDirection.Unspecified;
        }
    }
}
