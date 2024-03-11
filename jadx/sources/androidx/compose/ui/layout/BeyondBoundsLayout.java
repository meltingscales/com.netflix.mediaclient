package androidx.compose.ui.layout;

import o.C8627dsp;
import o.drM;
import o.drN;

/* loaded from: classes.dex */
public interface BeyondBoundsLayout {

    /* loaded from: classes.dex */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    /* renamed from: layout-o7g1Pn8 */
    <T> T mo372layouto7g1Pn8(int i, drM<? super BeyondBoundsScope, ? extends T> drm);

    @drN
    /* loaded from: classes.dex */
    public static final class LayoutDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Before = m1781constructorimpl(1);
        private static final int After = m1781constructorimpl(2);
        private static final int Left = m1781constructorimpl(3);
        private static final int Right = m1781constructorimpl(4);
        private static final int Above = m1781constructorimpl(5);
        private static final int Below = m1781constructorimpl(6);

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m1781constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m1782equalsimpl(int i, Object obj) {
            return (obj instanceof LayoutDirection) && i == ((LayoutDirection) obj).m1786unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m1783equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m1784hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        public boolean equals(Object obj) {
            return m1782equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m1784hashCodeimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m1786unboximpl() {
            return this.value;
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getBefore-hoxUOeE  reason: not valid java name */
            public final int m1789getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getAfter-hoxUOeE  reason: not valid java name */
            public final int m1788getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getLeft-hoxUOeE  reason: not valid java name */
            public final int m1791getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE  reason: not valid java name */
            public final int m1792getRighthoxUOeE() {
                return LayoutDirection.Right;
            }

            /* renamed from: getAbove-hoxUOeE  reason: not valid java name */
            public final int m1787getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getBelow-hoxUOeE  reason: not valid java name */
            public final int m1790getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }
        }

        public String toString() {
            return m1785toStringimpl(this.value);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m1785toStringimpl(int i) {
            return m1783equalsimpl0(i, Before) ? "Before" : m1783equalsimpl0(i, After) ? "After" : m1783equalsimpl0(i, Left) ? "Left" : m1783equalsimpl0(i, Right) ? "Right" : m1783equalsimpl0(i, Above) ? "Above" : m1783equalsimpl0(i, Below) ? "Below" : "invalid LayoutDirection";
        }
    }
}
