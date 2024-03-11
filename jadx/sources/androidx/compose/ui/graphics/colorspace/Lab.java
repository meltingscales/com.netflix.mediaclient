package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import o.C8627dsp;
import o.C8657dts;

/* loaded from: classes.dex */
public final class Lab extends ColorSpace {
    public static final Companion Companion = new Companion(null);

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    public Lab(String str, int i) {
        super(str, ColorModel.Companion.m1489getLabxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        float a;
        float a2;
        float a3;
        a = C8657dts.a(fArr[0], 0.0f, 100.0f);
        fArr[0] = a;
        a2 = C8657dts.a(fArr[1], -128.0f, 128.0f);
        fArr[1] = a2;
        a3 = C8657dts.a(fArr[2], -128.0f, 128.0f);
        fArr[2] = a3;
        float f = (fArr[0] + 16.0f) / 116.0f;
        float f2 = (fArr[1] * 0.002f) + f;
        float f3 = f - (a3 * 0.005f);
        float f4 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f5 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        float f6 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        fArr[0] = f4 * illuminant.getD50Xyz$ui_graphics_release()[0];
        fArr[1] = f5 * illuminant.getD50Xyz$ui_graphics_release()[1];
        fArr[2] = f6 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float a;
        float a2;
        a = C8657dts.a(f, 0.0f, 100.0f);
        a2 = C8657dts.a(f2, -128.0f, 128.0f);
        float f4 = (a + 16.0f) / 116.0f;
        float f5 = (a2 * 0.002f) + f4;
        float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
        float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        return (Float.floatToRawIntBits(f7 * illuminant.getD50Xyz$ui_graphics_release()[1]) & 4294967295L) | (Float.floatToRawIntBits(f6 * illuminant.getD50Xyz$ui_graphics_release()[0]) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        float a;
        float a2;
        a = C8657dts.a(f, 0.0f, 100.0f);
        a2 = C8657dts.a(f3, -128.0f, 128.0f);
        float f4 = ((a + 16.0f) / 116.0f) - (a2 * 0.005f);
        return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo1493xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float a;
        float a2;
        float a3;
        Illuminant illuminant = Illuminant.INSTANCE;
        float f5 = f / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f6 = f2 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f7 = f3 / illuminant.getD50Xyz$ui_graphics_release()[2];
        float pow = f5 > 0.008856452f ? (float) Math.pow(f5, 0.33333334f) : (f5 * 7.787037f) + 0.13793103f;
        float pow2 = f6 > 0.008856452f ? (float) Math.pow(f6, 0.33333334f) : (f6 * 7.787037f) + 0.13793103f;
        float pow3 = f7 > 0.008856452f ? (float) Math.pow(f7, 0.33333334f) : (f7 * 7.787037f) + 0.13793103f;
        a = C8657dts.a((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        a2 = C8657dts.a((pow - pow2) * 500.0f, -128.0f, 128.0f);
        a3 = C8657dts.a((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return ColorKt.Color(a, a2, a3, f4, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        float a;
        float a2;
        float a3;
        float f = fArr[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f2 = f / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f3 = fArr[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f4 = fArr[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float pow = f2 > 0.008856452f ? (float) Math.pow(f2, 0.33333334f) : (f2 * 7.787037f) + 0.13793103f;
        float pow2 = f3 > 0.008856452f ? (float) Math.pow(f3, 0.33333334f) : (f3 * 7.787037f) + 0.13793103f;
        float pow3 = f4 > 0.008856452f ? (float) Math.pow(f4, 0.33333334f) : (f4 * 7.787037f) + 0.13793103f;
        a = C8657dts.a((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        fArr[0] = a;
        a2 = C8657dts.a((pow - pow2) * 500.0f, -128.0f, 128.0f);
        fArr[1] = a2;
        a3 = C8657dts.a((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        fArr[2] = a3;
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
}
