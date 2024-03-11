package androidx.compose.ui.node;

import java.util.Arrays;
import o.C8632dsu;
import o.drN;

@drN
/* loaded from: classes.dex */
final class Snake {
    private final int[] data;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int[] m1951constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1952equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && C8632dsu.c(iArr, ((Snake) obj).m1963unboximpl());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1960hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public boolean equals(Object obj) {
        return m1952equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m1960hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int[] m1963unboximpl() {
        return this.data;
    }

    /* renamed from: getStartX-impl  reason: not valid java name */
    public static final int m1958getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl  reason: not valid java name */
    public static final int m1959getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: getEndX-impl  reason: not valid java name */
    public static final int m1954getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl  reason: not valid java name */
    public static final int m1955getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getReverse-impl  reason: not valid java name */
    public static final boolean m1957getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* renamed from: getDiagonalSize-impl  reason: not valid java name */
    public static final int m1953getDiagonalSizeimpl(int[] iArr) {
        return Math.min(m1954getEndXimpl(iArr) - m1958getStartXimpl(iArr), m1955getEndYimpl(iArr) - m1959getStartYimpl(iArr));
    }

    /* renamed from: getHasAdditionOrRemoval-impl  reason: not valid java name */
    private static final boolean m1956getHasAdditionOrRemovalimpl(int[] iArr) {
        return m1955getEndYimpl(iArr) - m1959getStartYimpl(iArr) != m1954getEndXimpl(iArr) - m1958getStartXimpl(iArr);
    }

    /* renamed from: isAddition-impl  reason: not valid java name */
    private static final boolean m1961isAdditionimpl(int[] iArr) {
        return m1955getEndYimpl(iArr) - m1959getStartYimpl(iArr) > m1954getEndXimpl(iArr) - m1958getStartXimpl(iArr);
    }

    /* renamed from: addDiagonalToStack-impl  reason: not valid java name */
    public static final void m1950addDiagonalToStackimpl(int[] iArr, IntStack intStack) {
        if (m1956getHasAdditionOrRemovalimpl(iArr)) {
            if (m1957getReverseimpl(iArr)) {
                intStack.pushDiagonal(m1958getStartXimpl(iArr), m1959getStartYimpl(iArr), m1953getDiagonalSizeimpl(iArr));
                return;
            } else if (m1961isAdditionimpl(iArr)) {
                intStack.pushDiagonal(m1958getStartXimpl(iArr), m1959getStartYimpl(iArr) + 1, m1953getDiagonalSizeimpl(iArr));
                return;
            } else {
                intStack.pushDiagonal(m1958getStartXimpl(iArr) + 1, m1959getStartYimpl(iArr), m1953getDiagonalSizeimpl(iArr));
                return;
            }
        }
        intStack.pushDiagonal(m1958getStartXimpl(iArr), m1959getStartYimpl(iArr), m1954getEndXimpl(iArr) - m1958getStartXimpl(iArr));
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1962toStringimpl(int[] iArr) {
        return "Snake(" + m1958getStartXimpl(iArr) + ',' + m1959getStartYimpl(iArr) + ',' + m1954getEndXimpl(iArr) + ',' + m1955getEndYimpl(iArr) + ',' + m1957getReverseimpl(iArr) + ')';
    }

    public String toString() {
        return m1962toStringimpl(this.data);
    }
}
