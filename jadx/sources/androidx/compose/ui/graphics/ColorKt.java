package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import o.C8632dsu;
import o.dpL;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes.dex */
public final class ColorKt {
    private static final float saturate(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = 1.0f;
            if (f < 1.0f) {
                return f;
            }
        }
        return f2;
    }

    public static final long Color(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float minValue = colorSpace.getMinValue(0);
        if (f <= colorSpace.getMaxValue(0) && minValue <= f) {
            float minValue2 = colorSpace.getMinValue(1);
            if (f2 <= colorSpace.getMaxValue(1) && minValue2 <= f2) {
                float minValue3 = colorSpace.getMinValue(2);
                if (f3 <= colorSpace.getMaxValue(2) && minValue3 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (colorSpace.isSrgb()) {
                        return Color.m1289constructorimpl(dpL.b(dpL.b(dpL.b((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    }
                    if (colorSpace.getComponentCount() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
                    }
                    int id$ui_graphics_release = colorSpace.getId$ui_graphics_release();
                    if (id$ui_graphics_release == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
                    }
                    short m1336constructorimpl = Float16.m1336constructorimpl(f);
                    short m1336constructorimpl2 = Float16.m1336constructorimpl(f2);
                    short m1336constructorimpl3 = Float16.m1336constructorimpl(f3);
                    return Color.m1289constructorimpl(dpL.b(dpL.b(dpL.b(dpL.b(dpL.b(dpL.b(dpL.b(m1336constructorimpl2) & 65535) << 32) | dpL.b(dpL.b(dpL.b(m1336constructorimpl) & 65535) << 48)) | dpL.b(dpL.b(dpL.b(m1336constructorimpl3) & 65535) << 16)) | dpL.b(dpL.b(dpL.b((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | dpL.b(dpL.b(id$ui_graphics_release) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + colorSpace).toString());
    }

    public static final long Color(int i) {
        return Color.m1289constructorimpl(dpL.b(dpL.b(i) << 32));
    }

    public static final long Color(long j) {
        return Color.m1289constructorimpl(dpL.b(dpL.b(dpL.b(j) & 4294967295L) << 32));
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = PrivateKeyType.INVALID;
        }
        return Color(i, i2, i3, i4);
    }

    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & PrivateKeyType.INVALID) << 16) | ((i4 & PrivateKeyType.INVALID) << 24) | ((i2 & PrivateKeyType.INVALID) << 8) | (i3 & PrivateKeyType.INVALID));
    }

    /* renamed from: lerp-jxsXWHM  reason: not valid java name */
    public static final long m1315lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m1290convertvNxB06k = Color.m1290convertvNxB06k(j, oklab);
        long m1290convertvNxB06k2 = Color.m1290convertvNxB06k(j2, oklab);
        float m1295getAlphaimpl = Color.m1295getAlphaimpl(m1290convertvNxB06k);
        float m1299getRedimpl = Color.m1299getRedimpl(m1290convertvNxB06k);
        float m1298getGreenimpl = Color.m1298getGreenimpl(m1290convertvNxB06k);
        float m1296getBlueimpl = Color.m1296getBlueimpl(m1290convertvNxB06k);
        float m1295getAlphaimpl2 = Color.m1295getAlphaimpl(m1290convertvNxB06k2);
        float m1299getRedimpl2 = Color.m1299getRedimpl(m1290convertvNxB06k2);
        float m1298getGreenimpl2 = Color.m1298getGreenimpl(m1290convertvNxB06k2);
        float m1296getBlueimpl2 = Color.m1296getBlueimpl(m1290convertvNxB06k2);
        return Color.m1290convertvNxB06k(Color(MathHelpersKt.lerp(m1299getRedimpl, m1299getRedimpl2, f), MathHelpersKt.lerp(m1298getGreenimpl, m1298getGreenimpl2, f), MathHelpersKt.lerp(m1296getBlueimpl, m1296getBlueimpl2, f), MathHelpersKt.lerp(m1295getAlphaimpl, m1295getAlphaimpl2, f), oklab), Color.m1297getColorSpaceimpl(j2));
    }

    /* renamed from: compositeOver--OWjLjI  reason: not valid java name */
    public static final long m1314compositeOverOWjLjI(long j, long j2) {
        long m1290convertvNxB06k = Color.m1290convertvNxB06k(j, Color.m1297getColorSpaceimpl(j2));
        float m1295getAlphaimpl = Color.m1295getAlphaimpl(j2);
        float m1295getAlphaimpl2 = Color.m1295getAlphaimpl(m1290convertvNxB06k);
        float f = 1.0f - m1295getAlphaimpl2;
        float f2 = (m1295getAlphaimpl * f) + m1295getAlphaimpl2;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        return Color(i == 0 ? 0.0f : ((Color.m1299getRedimpl(m1290convertvNxB06k) * m1295getAlphaimpl2) + ((Color.m1299getRedimpl(j2) * m1295getAlphaimpl) * f)) / f2, i == 0 ? 0.0f : ((Color.m1298getGreenimpl(m1290convertvNxB06k) * m1295getAlphaimpl2) + ((Color.m1298getGreenimpl(j2) * m1295getAlphaimpl) * f)) / f2, i != 0 ? ((Color.m1296getBlueimpl(m1290convertvNxB06k) * m1295getAlphaimpl2) + ((Color.m1296getBlueimpl(j2) * m1295getAlphaimpl) * f)) / f2 : 0.0f, f2, Color.m1297getColorSpaceimpl(j2));
    }

    /* renamed from: luminance-8_81llA  reason: not valid java name */
    public static final float m1316luminance8_81llA(long j) {
        ColorSpace m1297getColorSpaceimpl = Color.m1297getColorSpaceimpl(j);
        if (!ColorModel.m1484equalsimpl0(m1297getColorSpaceimpl.m1492getModelxdoWZVw(), ColorModel.Companion.m1490getRgbxdoWZVw())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m1487toStringimpl(m1297getColorSpaceimpl.m1492getModelxdoWZVw()))).toString());
        }
        C8632dsu.d(m1297getColorSpaceimpl);
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) m1297getColorSpaceimpl).getEotfFunc$ui_graphics_release();
        return saturate((float) ((eotfFunc$ui_graphics_release.invoke(Color.m1299getRedimpl(j)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m1298getGreenimpl(j)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m1296getBlueimpl(j)) * 0.0722d)));
    }

    /* renamed from: toArgb-8_81llA  reason: not valid java name */
    public static final int m1317toArgb8_81llA(long j) {
        return (int) dpL.b(Color.m1290convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }
}
