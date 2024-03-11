package androidx.compose.runtime.snapshots;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class ReaderKind {
    public static final Companion Companion = new Companion(null);
    private final int mask;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m1049constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1050equalsimpl(int i, Object obj) {
        return (obj instanceof ReaderKind) && i == ((ReaderKind) obj).m1053unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1051hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1052toStringimpl(int i) {
        return "ReaderKind(mask=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m1050equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m1051hashCodeimpl(this.mask);
    }

    public String toString() {
        return m1052toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m1053unboximpl() {
        return this.mask;
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
