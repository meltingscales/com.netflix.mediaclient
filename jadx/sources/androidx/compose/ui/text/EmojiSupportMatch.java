package androidx.compose.ui.text;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class EmojiSupportMatch {
    public static final Companion Companion = new Companion(null);
    private static final int Default = m2069constructorimpl(0);
    private static final int None = m2069constructorimpl(1);
    private final int value;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m2068boximpl(int i) {
        return new EmojiSupportMatch(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m2069constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2070equalsimpl(int i, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i == ((EmojiSupportMatch) obj).m2074unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2071equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2072hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2070equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2072hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2074unboximpl() {
        return this.value;
    }

    private /* synthetic */ EmojiSupportMatch(int i) {
        this.value = i;
    }

    public String toString() {
        return m2073toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2073toStringimpl(int i) {
        if (i == Default) {
            return "EmojiSupportMatch.Default";
        }
        if (i == None) {
            return "EmojiSupportMatch.None";
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

        /* renamed from: getDefault-_3YsG6Y  reason: not valid java name */
        public final int m2075getDefault_3YsG6Y() {
            return EmojiSupportMatch.Default;
        }

        /* renamed from: getNone-_3YsG6Y  reason: not valid java name */
        public final int m2076getNone_3YsG6Y() {
            return EmojiSupportMatch.None;
        }
    }
}
