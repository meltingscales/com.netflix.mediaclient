package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import o.C8627dsp;
import o.C8657dts;

/* loaded from: classes.dex */
public final class Oklab extends ColorSpace {
    public static final Companion Companion = new Companion(null);
    private static final float[] InverseM1;
    private static final float[] InverseM2;
    private static final float[] M1;
    private static final float[] M2;

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    public Oklab(String str, int i) {
        super(str, ColorModel.Companion.m1489getLabxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        float a;
        float a2;
        float a3;
        a = C8657dts.a(fArr[0], 0.0f, 1.0f);
        fArr[0] = a;
        a2 = C8657dts.a(fArr[1], -0.5f, 0.5f);
        fArr[1] = a2;
        a3 = C8657dts.a(fArr[2], -0.5f, 0.5f);
        fArr[2] = a3;
        ColorSpaceKt.mul3x3Float3(InverseM2, fArr);
        float f = fArr[0];
        fArr[0] = f * f * f;
        float f2 = fArr[1];
        fArr[1] = f2 * f2 * f2;
        float f3 = fArr[2];
        fArr[2] = f3 * f3 * f3;
        ColorSpaceKt.mul3x3Float3(InverseM1, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float a;
        float a2;
        float a3;
        a = C8657dts.a(f, 0.0f, 1.0f);
        a2 = C8657dts.a(f2, -0.5f, 0.5f);
        a3 = C8657dts.a(f3, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, a, a2, a3);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, a, a2, a3);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, a, a2, a3);
        float f4 = mul3x3Float3_0 * mul3x3Float3_0 * mul3x3Float3_0;
        float f5 = mul3x3Float3_1 * mul3x3Float3_1 * mul3x3Float3_1;
        float f6 = mul3x3Float3_2 * mul3x3Float3_2 * mul3x3Float3_2;
        float[] fArr2 = InverseM1;
        return (Float.floatToRawIntBits(ColorSpaceKt.mul3x3Float3_0(fArr2, f4, f5, f6)) << 32) | (Float.floatToRawIntBits(ColorSpaceKt.mul3x3Float3_1(fArr2, f4, f5, f6)) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        float a;
        float a2;
        float a3;
        a = C8657dts.a(f, 0.0f, 1.0f);
        a2 = C8657dts.a(f2, -0.5f, 0.5f);
        a3 = C8657dts.a(f3, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, a, a2, a3);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, a, a2, a3);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, a, a2, a3);
        return ColorSpaceKt.mul3x3Float3_2(InverseM1, mul3x3Float3_0 * mul3x3Float3_0 * mul3x3Float3_0, mul3x3Float3_1 * mul3x3Float3_1 * mul3x3Float3_1, mul3x3Float3_2 * mul3x3Float3_2 * mul3x3Float3_2);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo1493xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float[] fArr = M1;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, f, f2, f3);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, f, f2, f3);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, f, f2, f3);
        double d = 0.33333334f;
        float signum = Math.signum(mul3x3Float3_0) * ((float) Math.pow(Math.abs(mul3x3Float3_0), d));
        float signum2 = Math.signum(mul3x3Float3_1) * ((float) Math.pow(Math.abs(mul3x3Float3_1), d));
        float signum3 = Math.signum(mul3x3Float3_2) * ((float) Math.pow(Math.abs(mul3x3Float3_2), d));
        float[] fArr2 = M2;
        return ColorKt.Color(ColorSpaceKt.mul3x3Float3_0(fArr2, signum, signum2, signum3), ColorSpaceKt.mul3x3Float3_1(fArr2, signum, signum2, signum3), ColorSpaceKt.mul3x3Float3_2(fArr2, signum, signum2, signum3), f4, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        ColorSpaceKt.mul3x3Float3(M1, fArr);
        double d = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d));
        ColorSpaceKt.mul3x3Float3(M2, fArr);
        return fArr;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    static {
        float[] transform$ui_graphics_release = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
        Illuminant illuminant = Illuminant.INSTANCE;
        float[] mul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release, illuminant.getD50().toXyz$ui_graphics_release(), illuminant.getD65().toXyz$ui_graphics_release()));
        M1 = mul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(mul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }
}
