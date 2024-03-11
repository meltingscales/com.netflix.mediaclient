package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import o.C8657dts;

/* loaded from: classes.dex */
public final class Xyz extends ColorSpace {
    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return -2.0f;
    }

    public Xyz(String str, int i) {
        super(str, ColorModel.Companion.m1491getXyzxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        fArr[0] = clamp(fArr[0]);
        fArr[1] = clamp(fArr[1]);
        fArr[2] = clamp(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float clamp = clamp(f);
        return (Float.floatToRawIntBits(clamp(f2)) & 4294967295L) | (Float.floatToRawIntBits(clamp) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        return clamp(f3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo1493xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        return ColorKt.Color(clamp(f), clamp(f2), clamp(f3), f4, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        fArr[0] = clamp(fArr[0]);
        fArr[1] = clamp(fArr[1]);
        fArr[2] = clamp(fArr[2]);
        return fArr;
    }

    private final float clamp(float f) {
        float a;
        a = C8657dts.a(f, -2.0f, 2.0f);
        return a;
    }
}
