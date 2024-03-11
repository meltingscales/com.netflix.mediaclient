package androidx.compose.ui.text.caches;

/* loaded from: classes.dex */
public final class ContainerHelpersKt {
    public static final int[] EMPTY_INTS = new int[0];
    public static final Object[] EMPTY_OBJECTS = new Object[0];

    public static final int binarySearchInternal(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
