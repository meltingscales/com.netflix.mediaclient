package androidx.compose.ui.text.input;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class KeyboardCapitalization {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m2272constructorimpl(0);
    private static final int Characters = m2272constructorimpl(1);
    private static final int Words = m2272constructorimpl(2);
    private static final int Sentences = m2272constructorimpl(3);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m2272constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2273equalsimpl(int i, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i == ((KeyboardCapitalization) obj).m2277unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2274equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2275hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2273equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2275hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2277unboximpl() {
        return this.value;
    }

    public String toString() {
        return m2276toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2276toStringimpl(int i) {
        return m2274equalsimpl0(i, None) ? "None" : m2274equalsimpl0(i, Characters) ? "Characters" : m2274equalsimpl0(i, Words) ? "Words" : m2274equalsimpl0(i, Sentences) ? "Sentences" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNone-IUNYP9k  reason: not valid java name */
        public final int m2279getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* renamed from: getCharacters-IUNYP9k  reason: not valid java name */
        public final int m2278getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* renamed from: getWords-IUNYP9k  reason: not valid java name */
        public final int m2281getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }

        /* renamed from: getSentences-IUNYP9k  reason: not valid java name */
        public final int m2280getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }
    }
}
