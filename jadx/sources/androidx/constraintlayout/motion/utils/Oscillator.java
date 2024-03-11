package androidx.constraintlayout.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class Oscillator {
    double[] mArea;
    int mType;
    float[] mPeriod = new float[0];
    double[] mPosition = new double[0];
    double PI2 = 6.283185307179586d;
    private boolean mNormalized = false;

    public void setType(int i) {
        this.mType = i;
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }

    public void addPoint(double d, float f) {
        int length = this.mPeriod.length + 1;
        int binarySearch = Arrays.binarySearch(this.mPosition, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.mPosition[binarySearch] = d;
        this.mPeriod[binarySearch] = f;
        this.mNormalized = false;
    }

    public void normalize() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i;
        double d = 0.0d;
        int i2 = 0;
        while (true) {
            if (i2 >= this.mPeriod.length) {
                break;
            }
            d += fArr[i2];
            i2++;
        }
        double d2 = 0.0d;
        int i3 = 1;
        while (true) {
            if (i3 >= this.mPeriod.length) {
                break;
            }
            double[] dArr = this.mPosition;
            d2 += (dArr[i3] - dArr[i3 - 1]) * ((fArr2[i] + fArr2[i3]) / 2.0f);
            i3++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr4 = this.mPeriod;
            if (i4 >= fArr4.length) {
                break;
            }
            fArr4[i4] = (float) (fArr4[i4] * (d / d2));
            i4++;
        }
        this.mArea[0] = 0.0d;
        int i5 = 1;
        while (true) {
            if (i5 >= this.mPeriod.length) {
                this.mNormalized = true;
                return;
            }
            int i6 = i5 - 1;
            double[] dArr2 = this.mPosition;
            double d3 = dArr2[i5];
            double d4 = dArr2[i6];
            double[] dArr3 = this.mArea;
            dArr3[i5] = dArr3[i6] + ((d3 - d4) * ((fArr3[i6] + fArr3[i5]) / 2.0f));
            i5++;
        }
    }

    double getP(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch != 0) {
            int i = -binarySearch;
            int i2 = i - 1;
            float[] fArr = this.mPeriod;
            float f = fArr[i2];
            int i3 = i - 2;
            float f2 = fArr[i3];
            double[] dArr = this.mPosition;
            double d2 = dArr[i2];
            double d3 = dArr[i3];
            double d4 = (f - f2) / (d2 - d3);
            return this.mArea[i3] + ((f2 - (d4 * d3)) * (d - d3)) + ((d4 * ((d * d) - (d3 * d3))) / 2.0d);
        }
        return 0.0d;
    }

    public double getValue(double d) {
        double abs;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (getP(d) % 1.0d));
            case 2:
                abs = Math.abs((((getP(d) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((getP(d) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((getP(d) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.PI2 * getP(d));
            case 6:
                double abs2 = 1.0d - Math.abs(((getP(d) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            default:
                return Math.sin(this.PI2 * getP(d));
        }
        return 1.0d - abs;
    }
}
