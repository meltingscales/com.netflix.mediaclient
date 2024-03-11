package androidx.compose.ui.text.font;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class FontStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m2215constructorimpl(0);
    private static final int Italic = m2215constructorimpl(1);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FontStyle m2214boximpl(int i) {
        return new FontStyle(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m2215constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2216equalsimpl(int i, Object obj) {
        return (obj instanceof FontStyle) && i == ((FontStyle) obj).m2220unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2217equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2218hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2216equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2218hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2220unboximpl() {
        return this.value;
    }

    private /* synthetic */ FontStyle(int i) {
        this.value = i;
    }

    public String toString() {
        return m2219toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2219toStringimpl(int i) {
        return m2217equalsimpl0(i, Normal) ? "Normal" : m2217equalsimpl0(i, Italic) ? "Italic" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNormal-_-LCdwA  reason: not valid java name */
        public final int m2222getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        /* renamed from: getItalic-_-LCdwA  reason: not valid java name */
        public final int m2221getItalic_LCdwA() {
            return FontStyle.Italic;
        }
    }
}
