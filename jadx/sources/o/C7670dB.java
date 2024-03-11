package o;

import java.util.Arrays;

/* renamed from: o.dB  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7670dB {
    private final float[] c;
    private final int[] d;

    public float[] c() {
        return this.c;
    }

    public int[] e() {
        return this.d;
    }

    public C7670dB(float[] fArr, int[] iArr) {
        this.c = fArr;
        this.d = iArr;
    }

    public int a() {
        return this.d.length;
    }

    public void e(C7670dB c7670dB, C7670dB c7670dB2, float f) {
        if (c7670dB.d.length != c7670dB2.d.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c7670dB.d.length + " vs " + c7670dB2.d.length + ")");
        }
        for (int i = 0; i < c7670dB.d.length; i++) {
            this.c[i] = C8853eZ.b(c7670dB.c[i], c7670dB2.c[i], f);
            this.d[i] = C8851eX.c(f, c7670dB.d[i], c7670dB2.d[i]);
        }
    }

    public C7670dB a(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = d(fArr[i]);
        }
        return new C7670dB(fArr, iArr);
    }

    private int d(float f) {
        int binarySearch = Arrays.binarySearch(this.c, f);
        if (binarySearch >= 0) {
            return this.d[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.d[0];
        }
        int[] iArr = this.d;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.c;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return C8851eX.c((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
