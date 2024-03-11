package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.Arrays;
import o.C8627dsp;
import o.C8632dsu;
import o.C8681dup;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class Matrix {
    public static final Companion Companion = new Companion(null);
    private final float[] values;

    /* renamed from: box-impl */
    public static final /* synthetic */ Matrix m1368boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl */
    public static float[] m1369constructorimpl(float[] fArr) {
        return fArr;
    }

    /* renamed from: equals-impl */
    public static boolean m1371equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && C8632dsu.c(fArr, ((Matrix) obj).m1382unboximpl());
    }

    /* renamed from: hashCode-impl */
    public static int m1372hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public boolean equals(Object obj) {
        return m1371equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m1372hashCodeimpl(this.values);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ float[] m1382unboximpl() {
        return this.values;
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: constructor-impl$default */
    public static /* synthetic */ float[] m1370constructorimpl$default(float[] fArr, int i, C8627dsp c8627dsp) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m1369constructorimpl(fArr);
    }

    /* renamed from: map-MK-Hz9U */
    public static final long m1373mapMKHz9U(float[] fArr, long j) {
        float m1137getXimpl = Offset.m1137getXimpl(j);
        float m1138getYimpl = Offset.m1138getYimpl(j);
        float f = 1 / (((fArr[3] * m1137getXimpl) + (fArr[7] * m1138getYimpl)) + fArr[15]);
        f = (Float.isInfinite(f) || Float.isNaN(f)) ? 0.0f : 0.0f;
        return OffsetKt.Offset(((fArr[0] * m1137getXimpl) + (fArr[4] * m1138getYimpl) + fArr[12]) * f, f * ((fArr[1] * m1137getXimpl) + (fArr[5] * m1138getYimpl) + fArr[13]));
    }

    /* renamed from: map-impl */
    public static final void m1374mapimpl(float[] fArr, MutableRect mutableRect) {
        long m1373mapMKHz9U = m1373mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getTop()));
        long m1373mapMKHz9U2 = m1373mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getBottom()));
        long m1373mapMKHz9U3 = m1373mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getTop()));
        long m1373mapMKHz9U4 = m1373mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getBottom()));
        mutableRect.setLeft(Math.min(Math.min(Offset.m1137getXimpl(m1373mapMKHz9U), Offset.m1137getXimpl(m1373mapMKHz9U2)), Math.min(Offset.m1137getXimpl(m1373mapMKHz9U3), Offset.m1137getXimpl(m1373mapMKHz9U4))));
        mutableRect.setTop(Math.min(Math.min(Offset.m1138getYimpl(m1373mapMKHz9U), Offset.m1138getYimpl(m1373mapMKHz9U2)), Math.min(Offset.m1138getYimpl(m1373mapMKHz9U3), Offset.m1138getYimpl(m1373mapMKHz9U4))));
        mutableRect.setRight(Math.max(Math.max(Offset.m1137getXimpl(m1373mapMKHz9U), Offset.m1137getXimpl(m1373mapMKHz9U2)), Math.max(Offset.m1137getXimpl(m1373mapMKHz9U3), Offset.m1137getXimpl(m1373mapMKHz9U4))));
        mutableRect.setBottom(Math.max(Math.max(Offset.m1138getYimpl(m1373mapMKHz9U), Offset.m1138getYimpl(m1373mapMKHz9U2)), Math.max(Offset.m1138getYimpl(m1373mapMKHz9U3), Offset.m1138getYimpl(m1373mapMKHz9U4))));
    }

    /* renamed from: timesAssign-58bKbWc */
    public static final void m1378timesAssign58bKbWc(float[] fArr, float[] fArr2) {
        float m1384dotp89u6pk;
        float m1384dotp89u6pk2;
        float m1384dotp89u6pk3;
        float m1384dotp89u6pk4;
        float m1384dotp89u6pk5;
        float m1384dotp89u6pk6;
        float m1384dotp89u6pk7;
        float m1384dotp89u6pk8;
        float m1384dotp89u6pk9;
        float m1384dotp89u6pk10;
        float m1384dotp89u6pk11;
        float m1384dotp89u6pk12;
        float m1384dotp89u6pk13;
        float m1384dotp89u6pk14;
        float m1384dotp89u6pk15;
        float m1384dotp89u6pk16;
        m1384dotp89u6pk = MatrixKt.m1384dotp89u6pk(fArr, 0, fArr2, 0);
        m1384dotp89u6pk2 = MatrixKt.m1384dotp89u6pk(fArr, 0, fArr2, 1);
        m1384dotp89u6pk3 = MatrixKt.m1384dotp89u6pk(fArr, 0, fArr2, 2);
        m1384dotp89u6pk4 = MatrixKt.m1384dotp89u6pk(fArr, 0, fArr2, 3);
        m1384dotp89u6pk5 = MatrixKt.m1384dotp89u6pk(fArr, 1, fArr2, 0);
        m1384dotp89u6pk6 = MatrixKt.m1384dotp89u6pk(fArr, 1, fArr2, 1);
        m1384dotp89u6pk7 = MatrixKt.m1384dotp89u6pk(fArr, 1, fArr2, 2);
        m1384dotp89u6pk8 = MatrixKt.m1384dotp89u6pk(fArr, 1, fArr2, 3);
        m1384dotp89u6pk9 = MatrixKt.m1384dotp89u6pk(fArr, 2, fArr2, 0);
        m1384dotp89u6pk10 = MatrixKt.m1384dotp89u6pk(fArr, 2, fArr2, 1);
        m1384dotp89u6pk11 = MatrixKt.m1384dotp89u6pk(fArr, 2, fArr2, 2);
        m1384dotp89u6pk12 = MatrixKt.m1384dotp89u6pk(fArr, 2, fArr2, 3);
        m1384dotp89u6pk13 = MatrixKt.m1384dotp89u6pk(fArr, 3, fArr2, 0);
        m1384dotp89u6pk14 = MatrixKt.m1384dotp89u6pk(fArr, 3, fArr2, 1);
        m1384dotp89u6pk15 = MatrixKt.m1384dotp89u6pk(fArr, 3, fArr2, 2);
        m1384dotp89u6pk16 = MatrixKt.m1384dotp89u6pk(fArr, 3, fArr2, 3);
        fArr[0] = m1384dotp89u6pk;
        fArr[1] = m1384dotp89u6pk2;
        fArr[2] = m1384dotp89u6pk3;
        fArr[3] = m1384dotp89u6pk4;
        fArr[4] = m1384dotp89u6pk5;
        fArr[5] = m1384dotp89u6pk6;
        fArr[6] = m1384dotp89u6pk7;
        fArr[7] = m1384dotp89u6pk8;
        fArr[8] = m1384dotp89u6pk9;
        fArr[9] = m1384dotp89u6pk10;
        fArr[10] = m1384dotp89u6pk11;
        fArr[11] = m1384dotp89u6pk12;
        fArr[12] = m1384dotp89u6pk13;
        fArr[13] = m1384dotp89u6pk14;
        fArr[14] = m1384dotp89u6pk15;
        fArr[15] = m1384dotp89u6pk16;
    }

    public String toString() {
        return m1379toStringimpl(this.values);
    }

    /* renamed from: toString-impl */
    public static String m1379toStringimpl(float[] fArr) {
        String h;
        h = C8681dup.h("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
        return h;
    }

    /* renamed from: rotateZ-impl */
    public static final void m1376rotateZimpl(float[] fArr, float f) {
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = -sin;
        float f5 = fArr[1];
        float f6 = fArr[5];
        float f7 = fArr[2];
        float f8 = fArr[6];
        float f9 = fArr[3];
        float f10 = fArr[7];
        fArr[0] = (cos * f2) + (sin * f3);
        fArr[1] = (cos * f5) + (sin * f6);
        fArr[2] = (cos * f7) + (sin * f8);
        fArr[3] = (cos * f9) + (sin * f10);
        fArr[4] = (f2 * f4) + (f3 * cos);
        fArr[5] = (f5 * f4) + (f6 * cos);
        fArr[6] = (f7 * f4) + (f8 * cos);
        fArr[7] = (f4 * f9) + (cos * f10);
    }

    /* renamed from: translate-impl$default */
    public static /* synthetic */ void m1381translateimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m1380translateimpl(fArr, f, f2, f3);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: reset-impl */
    public static final void m1375resetimpl(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    /* renamed from: scale-impl */
    public static final void m1377scaleimpl(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* renamed from: translate-impl */
    public static final void m1380translateimpl(float[] fArr, float f, float f2, float f3) {
        float f4 = fArr[0];
        float f5 = fArr[4];
        float f6 = fArr[8];
        float f7 = fArr[12];
        float f8 = fArr[1];
        float f9 = fArr[5];
        float f10 = fArr[9];
        float f11 = fArr[13];
        float f12 = fArr[2];
        float f13 = fArr[6];
        float f14 = fArr[10];
        float f15 = fArr[14];
        float f16 = fArr[3];
        float f17 = fArr[7];
        float f18 = fArr[11];
        float f19 = fArr[15];
        fArr[12] = (f4 * f) + (f5 * f2) + (f6 * f3) + f7;
        fArr[13] = (f8 * f) + (f9 * f2) + (f10 * f3) + f11;
        fArr[14] = (f12 * f) + (f13 * f2) + (f14 * f3) + f15;
        fArr[15] = (f16 * f) + (f17 * f2) + (f18 * f3) + f19;
    }
}
