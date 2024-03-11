package androidx.compose.ui.node;

import java.util.Arrays;
import o.C8632dsu;
import o.drN;

@drN
/* loaded from: classes.dex */
final class CenteredArray {
    private final int[] data;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int[] m1844constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1845equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && C8632dsu.c(iArr, ((CenteredArray) obj).m1851unboximpl());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1848hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1850toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m1845equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m1848hashCodeimpl(this.data);
    }

    public String toString() {
        return m1850toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int[] m1851unboximpl() {
        return this.data;
    }

    /* renamed from: getMid-impl  reason: not valid java name */
    private static final int m1847getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: get-impl  reason: not valid java name */
    public static final int m1846getimpl(int[] iArr, int i) {
        return iArr[i + m1847getMidimpl(iArr)];
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m1849setimpl(int[] iArr, int i, int i2) {
        iArr[i + m1847getMidimpl(iArr)] = i2;
    }
}
