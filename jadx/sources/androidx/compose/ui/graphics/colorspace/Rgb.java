package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import o.C8564dqg;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.drM;

/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {
    public static final Companion Companion = new Companion(null);
    private static final DoubleFunction DoubleIdentity = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda10
        @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d) {
            double DoubleIdentity$lambda$12;
            DoubleIdentity$lambda$12 = Rgb.DoubleIdentity$lambda$12(d);
            return DoubleIdentity$lambda$12;
        }
    };
    private final drM<Double, Double> eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final drM<Double, Double> oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$12(double d) {
        return d;
    }

    public final drM<Double, Double> getEotf() {
        return this.eotf;
    }

    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.eotfFunc;
    }

    public final DoubleFunction getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return this.min;
    }

    public final drM<Double, Double> getOetf() {
        return this.oetf;
    }

    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.oetfFunc;
    }

    public final DoubleFunction getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, TransferParameters transferParameters, int i) {
        super(str, ColorModel.Companion.m1490getRgbxdoWZVw(), i, null);
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f2;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new drM<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Double invoke(Double d) {
                return invoke(d.doubleValue());
            }

            public final Double invoke(double d) {
                float f3;
                float f4;
                double e;
                double invoke = Rgb.this.getOetfOrig$ui_graphics_release().invoke(d);
                f3 = Rgb.this.min;
                double d2 = f3;
                f4 = Rgb.this.max;
                e = C8657dts.e(invoke, d2, f4);
                return Double.valueOf(e);
            }
        };
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda4
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double oetfFunc$lambda$0;
                oetfFunc$lambda$0 = Rgb.oetfFunc$lambda$0(Rgb.this, d);
                return oetfFunc$lambda$0;
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new drM<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Double invoke(Double d) {
                return invoke(d.doubleValue());
            }

            public final Double invoke(double d) {
                float f3;
                float f4;
                double e;
                DoubleFunction eotfOrig$ui_graphics_release = Rgb.this.getEotfOrig$ui_graphics_release();
                f3 = Rgb.this.min;
                double d2 = f3;
                f4 = Rgb.this.max;
                e = C8657dts.e(d, d2, f4);
                return Double.valueOf(eotfOrig$ui_graphics_release.invoke(e));
            }
        };
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda5
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double eotfFunc$lambda$1;
                eotfFunc$lambda$1 = Rgb.eotfFunc$lambda$1(Rgb.this, d);
                return eotfFunc$lambda$1;
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        Companion companion = Companion;
        float[] xyPrimaries = companion.xyPrimaries(fArr);
        this.primaries = xyPrimaries;
        if (fArr2 != null) {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        } else {
            this.transform = companion.computeXYZMatrix(xyPrimaries, whitePoint);
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(xyPrimaries, f, f2);
        this.isSrgb = companion.isSrgb(xyPrimaries, whitePoint, doubleFunction, doubleFunction2, f, f2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d) {
        double e;
        e = C8657dts.e(rgb.oetfOrig.invoke(d), rgb.min, rgb.max);
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d) {
        double e;
        DoubleFunction doubleFunction = rgb.eotfOrig;
        e = C8657dts.e(d, rgb.min, rgb.max);
        return doubleFunction.invoke(e);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final TransferParameters transferParameters, int i) {
        this(str, fArr, whitePoint, null, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda6
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double _init_$lambda$6;
                _init_$lambda$6 = Rgb._init_$lambda$6(TransferParameters.this, d);
                return _init_$lambda$6;
            }
        } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda7
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double _init_$lambda$7;
                _init_$lambda$7 = Rgb._init_$lambda$7(TransferParameters.this, d);
                return _init_$lambda$7;
            }
        }, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda8
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double _init_$lambda$8;
                _init_$lambda$8 = Rgb._init_$lambda$8(TransferParameters.this, d);
                return _init_$lambda$8;
            }
        } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda9
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double _init_$lambda$9;
                _init_$lambda$9 = Rgb._init_$lambda$9(TransferParameters.this, d);
                return _init_$lambda$9;
            }
        }, 0.0f, 1.0f, transferParameters, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(TransferParameters transferParameters, double d) {
        return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(TransferParameters transferParameters, double d) {
        return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$8(TransferParameters transferParameters, double d) {
        return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$9(TransferParameters transferParameters, double d) {
        return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(java.lang.String r21, float[] r22, androidx.compose.ui.graphics.colorspace.WhitePoint r23, final double r24, float r26, float r27, int r28) {
        /*
            r20 = this;
            r1 = r24
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Lb
            androidx.compose.ui.graphics.colorspace.DoubleFunction r3 = androidx.compose.ui.graphics.colorspace.Rgb.DoubleIdentity
            goto L10
        Lb:
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda11 r3 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda11
            r3.<init>()
        L10:
            r17 = r3
            if (r0 != 0) goto L17
            androidx.compose.ui.graphics.colorspace.DoubleFunction r0 = androidx.compose.ui.graphics.colorspace.Rgb.DoubleIdentity
            goto L1c
        L17:
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda12 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda12
            r0.<init>()
        L1c:
            r18 = r0
            androidx.compose.ui.graphics.colorspace.TransferParameters r19 = new androidx.compose.ui.graphics.colorspace.TransferParameters
            r0 = r19
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 96
            r16 = 0
            r1 = r24
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r8 = 0
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r9 = r17
            r10 = r18
            r11 = r26
            r12 = r27
            r13 = r19
            r14 = r28
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, double, float, float, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$10(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$11(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float invoke = (float) this.eotfFunc.invoke(f);
        float invoke2 = (float) this.eotfFunc.invoke(f2);
        float invoke3 = (float) this.eotfFunc.invoke(f3);
        return (Float.floatToRawIntBits(ColorSpaceKt.mul3x3Float3_0(this.transform, invoke, invoke2, invoke3)) << 32) | (Float.floatToRawIntBits(ColorSpaceKt.mul3x3Float3_1(this.transform, invoke, invoke2, invoke3)) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        return ColorSpaceKt.mul3x3Float3_2(this.transform, (float) this.eotfFunc.invoke(f), (float) this.eotfFunc.invoke(f2), (float) this.eotfFunc.invoke(f3));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo1493xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        return ColorKt.Color((float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_0(this.inverseTransform, f, f2, f3)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_1(this.inverseTransform, f, f2, f3)), (float) this.oetfFunc.invoke(ColorSpaceKt.mul3x3Float3_2(this.inverseTransform, f, f2, f3)), f4, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, fArr);
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Rgb.class == obj.getClass() && super.equals(obj)) {
            Rgb rgb = (Rgb) obj;
            if (Float.compare(rgb.min, this.min) == 0 && Float.compare(rgb.max, this.max) == 0 && C8632dsu.c(this.whitePoint, rgb.whitePoint) && Arrays.equals(this.primaries, rgb.primaries)) {
                TransferParameters transferParameters = this.transferParameters;
                if (transferParameters != null) {
                    return C8632dsu.c(transferParameters, rgb.transferParameters);
                }
                if (rgb.transferParameters == null) {
                    return true;
                }
                if (C8632dsu.c(this.oetfOrig, rgb.oetfOrig)) {
                    return C8632dsu.c(this.eotfOrig, rgb.eotfOrig);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int hashCode = super.hashCode();
        int hashCode2 = this.whitePoint.hashCode();
        int hashCode3 = Arrays.hashCode(this.primaries);
        float f = this.min;
        int floatToIntBits = f == 0.0f ? 0 : Float.floatToIntBits(f);
        float f2 = this.max;
        int floatToIntBits2 = f2 == 0.0f ? 0 : Float.floatToIntBits(f2);
        TransferParameters transferParameters = this.transferParameters;
        int hashCode4 = (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + floatToIntBits) * 31) + floatToIntBits2) * 31) + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (this.transferParameters == null) {
            return (((hashCode4 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode();
        }
        return hashCode4;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private final float cross(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, int i) {
            if (i == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release()) && ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) && f == 0.0f && f2 == 1.0f) {
                Rgb srgb = colorSpaces.getSrgb();
                for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (!compare(d, doubleFunction, srgb.getOetfOrig$ui_graphics_release()) || !compare(d, doubleFunction2, srgb.getEotfOrig$ui_graphics_release())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        private final boolean compare(double d, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            return Math.abs(doubleFunction.invoke(d) - doubleFunction2.invoke(d)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f, float f2) {
            float area = area(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            return (area / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release())) || (f < 0.0f && f2 > 1.0f);
        }

        private final float area(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = f - f2;
            float f4 = fArr[1];
            float f5 = fArr2[1];
            float f6 = f4 - f5;
            float f7 = fArr[4];
            float f8 = fArr2[4];
            float f9 = fArr[5];
            float f10 = fArr2[5];
            float[] fArr3 = {f3, f6, fArr[2] - fArr2[2], fArr[3] - fArr2[3], f7 - f8, f9 - f10};
            if (cross(f3, f6, f2 - f8, f5 - f10) >= 0.0f) {
                if (cross(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && cross(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f) {
                    if (cross(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && cross(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f) {
                        return cross(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            } else {
                C8564dqg.a(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = f / f2;
            float f10 = (f3 / f4) - f9;
            float f11 = (x / y) - f9;
            float f12 = ((f7 - f3) / f4) - f8;
            float f13 = (f5 / f6) - f9;
            float f14 = (((((f7 - x) / y) - f8) * f10) - (f11 * f12)) / (((((f7 - f5) / f6) - f8) * f10) - (f12 * f13));
            float f15 = (f11 - (f13 * f14)) / f10;
            float f16 = (1.0f - f15) - f14;
            float f17 = f16 / f2;
            float f18 = f15 / f4;
            float f19 = f14 / f6;
            return new float[]{f17 * f, f16, f17 * ((1.0f - f) - f2), f18 * f3, f15, f18 * ((1.0f - f3) - f4), f19 * f5, f14, f19 * ((1.0f - f5) - f6)};
        }
    }
}
