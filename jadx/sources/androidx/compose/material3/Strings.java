package androidx.compose.material3;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class Strings {
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m825constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m826equalsimpl(int i, Object obj) {
        return (obj instanceof Strings) && i == ((Strings) obj).m829unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m827hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m828toStringimpl(int i) {
        return "Strings(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m826equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m827hashCodeimpl(this.value);
    }

    public String toString() {
        return m828toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m829unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
