package o;

import okio.SegmentedByteString;

/* loaded from: classes5.dex */
public final class dIO {
    public static final int b(int[] iArr, int i, int i2, int i3) {
        C8632dsu.c((Object) iArr, "");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int a(SegmentedByteString segmentedByteString, int i) {
        C8632dsu.c((Object) segmentedByteString, "");
        int b = b(segmentedByteString.l(), i + 1, 0, segmentedByteString.q().length);
        return b >= 0 ? b : ~b;
    }
}
