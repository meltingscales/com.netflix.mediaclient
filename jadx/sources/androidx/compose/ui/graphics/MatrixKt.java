package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class MatrixKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dot-p89u6pk  reason: not valid java name */
    public static final float m1384dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[i2 + 4]) + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }

    /* renamed from: isIdentity-58bKbWc  reason: not valid java name */
    public static final boolean m1385isIdentity58bKbWc(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                if (fArr[(i * 4) + i2] != (i == i2 ? 1.0f : 0.0f)) {
                    return false;
                }
                i2++;
            }
            i++;
        }
        return true;
    }
}
