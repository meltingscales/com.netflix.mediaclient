package o;

/* renamed from: o.sj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9598sj {
    static final int[] a = {2, 1, 4};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] a(int i) {
        int[] iArr;
        int[] iArr2 = a;
        int length = iArr2.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr2[i3];
            i2 += (i & i4) == i4 ? 1 : 0;
        }
        int[] iArr3 = new int[i2];
        int i5 = 0;
        for (int i6 : a) {
            if ((i & i6) == i6) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        return iArr3;
    }
}
