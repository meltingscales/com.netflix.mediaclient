package androidx.compose.material;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes5.dex */
public final class FabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Start = m597constructorimpl(0);
    private static final int Center = m597constructorimpl(1);
    private static final int End = m597constructorimpl(2);

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m597constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m598equalsimpl(int i, Object obj) {
        return (obj instanceof FabPosition) && i == ((FabPosition) obj).m602unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m599equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m600hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m598equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m600hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m602unboximpl() {
        return this.value;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getStart-5ygKITE  reason: not valid java name */
        public final int m604getStart5ygKITE() {
            return FabPosition.Start;
        }

        /* renamed from: getEnd-5ygKITE  reason: not valid java name */
        public final int m603getEnd5ygKITE() {
            return FabPosition.End;
        }
    }

    public String toString() {
        return m601toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m601toStringimpl(int i) {
        return m599equalsimpl0(i, Start) ? "FabPosition.Start" : m599equalsimpl0(i, Center) ? "FabPosition.Center" : "FabPosition.End";
    }
}
