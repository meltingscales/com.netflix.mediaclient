package androidx.compose.ui.text.input;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class ImeAction {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Default = m2254constructorimpl(1);
    private static final int None = m2254constructorimpl(0);
    private static final int Go = m2254constructorimpl(2);
    private static final int Search = m2254constructorimpl(3);
    private static final int Send = m2254constructorimpl(4);
    private static final int Previous = m2254constructorimpl(5);
    private static final int Next = m2254constructorimpl(6);
    private static final int Done = m2254constructorimpl(7);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ImeAction m2253boximpl(int i) {
        return new ImeAction(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m2254constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2255equalsimpl(int i, Object obj) {
        return (obj instanceof ImeAction) && i == ((ImeAction) obj).m2259unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2256equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2257hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m2255equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2257hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2259unboximpl() {
        return this.value;
    }

    private /* synthetic */ ImeAction(int i) {
        this.value = i;
    }

    public String toString() {
        return m2258toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2258toStringimpl(int i) {
        return m2256equalsimpl0(i, None) ? "None" : m2256equalsimpl0(i, Default) ? "Default" : m2256equalsimpl0(i, Go) ? "Go" : m2256equalsimpl0(i, Search) ? "Search" : m2256equalsimpl0(i, Send) ? "Send" : m2256equalsimpl0(i, Previous) ? "Previous" : m2256equalsimpl0(i, Next) ? "Next" : m2256equalsimpl0(i, Done) ? "Done" : "Invalid";
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getDefault-eUduSuo  reason: not valid java name */
        public final int m2260getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getNone-eUduSuo  reason: not valid java name */
        public final int m2264getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getGo-eUduSuo  reason: not valid java name */
        public final int m2262getGoeUduSuo() {
            return ImeAction.Go;
        }

        /* renamed from: getSearch-eUduSuo  reason: not valid java name */
        public final int m2266getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo  reason: not valid java name */
        public final int m2267getSendeUduSuo() {
            return ImeAction.Send;
        }

        /* renamed from: getPrevious-eUduSuo  reason: not valid java name */
        public final int m2265getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getNext-eUduSuo  reason: not valid java name */
        public final int m2263getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getDone-eUduSuo  reason: not valid java name */
        public final int m2261getDoneeUduSuo() {
            return ImeAction.Done;
        }
    }
}
