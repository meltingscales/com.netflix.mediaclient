package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import java.util.function.DoubleUnaryOperator;
import o.C8632dsu;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ColorSpaceVerificationHelper {
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    public static final ColorSpace androidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace.Named named;
        ColorSpace colorSpace2;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb m;
        ColorSpace.Named named2;
        ColorSpace colorSpace3;
        ColorSpace.Named named3;
        ColorSpace colorSpace4;
        ColorSpace.Named named4;
        ColorSpace colorSpace5;
        ColorSpace.Named named5;
        ColorSpace colorSpace6;
        ColorSpace.Named named6;
        ColorSpace colorSpace7;
        ColorSpace.Named named7;
        ColorSpace colorSpace8;
        ColorSpace.Named named8;
        ColorSpace colorSpace9;
        ColorSpace.Named named9;
        ColorSpace colorSpace10;
        ColorSpace.Named named10;
        ColorSpace colorSpace11;
        ColorSpace.Named named11;
        ColorSpace colorSpace12;
        ColorSpace.Named named12;
        ColorSpace colorSpace13;
        ColorSpace.Named named13;
        ColorSpace colorSpace14;
        ColorSpace.Named named14;
        ColorSpace colorSpace15;
        ColorSpace.Named named15;
        ColorSpace colorSpace16;
        ColorSpace.Named named16;
        ColorSpace colorSpace17;
        ColorSpace.Named named17;
        ColorSpace colorSpace18;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (C8632dsu.c(colorSpace, colorSpaces.getSrgb())) {
            named17 = ColorSpace.Named.SRGB;
            colorSpace18 = ColorSpace.get(named17);
            return colorSpace18;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getAces())) {
            named16 = ColorSpace.Named.ACES;
            colorSpace17 = ColorSpace.get(named16);
            return colorSpace17;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getAcescg())) {
            named15 = ColorSpace.Named.ACESCG;
            colorSpace16 = ColorSpace.get(named15);
            return colorSpace16;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getAdobeRgb())) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            colorSpace15 = ColorSpace.get(named14);
            return colorSpace15;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getBt2020())) {
            named13 = ColorSpace.Named.BT2020;
            colorSpace14 = ColorSpace.get(named13);
            return colorSpace14;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getBt709())) {
            named12 = ColorSpace.Named.BT709;
            colorSpace13 = ColorSpace.get(named12);
            return colorSpace13;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getCieLab())) {
            named11 = ColorSpace.Named.CIE_LAB;
            colorSpace12 = ColorSpace.get(named11);
            return colorSpace12;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getCieXyz())) {
            named10 = ColorSpace.Named.CIE_XYZ;
            colorSpace11 = ColorSpace.get(named10);
            return colorSpace11;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getDciP3())) {
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace10 = ColorSpace.get(named9);
            return colorSpace10;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getDisplayP3())) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            colorSpace9 = ColorSpace.get(named8);
            return colorSpace9;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getExtendedSrgb())) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace8 = ColorSpace.get(named7);
            return colorSpace8;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace7 = ColorSpace.get(named6);
            return colorSpace7;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getLinearSrgb())) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace6 = ColorSpace.get(named5);
            return colorSpace6;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getNtsc1953())) {
            named4 = ColorSpace.Named.NTSC_1953;
            colorSpace5 = ColorSpace.get(named4);
            return colorSpace5;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getProPhotoRgb())) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace4 = ColorSpace.get(named3);
            return colorSpace4;
        } else if (C8632dsu.c(colorSpace, colorSpaces.getSmpteC())) {
            named2 = ColorSpace.Named.SMPTE_C;
            colorSpace3 = ColorSpace.get(named2);
            return colorSpace3;
        } else if (colorSpace instanceof Rgb) {
            Rgb rgb = (Rgb) colorSpace;
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            TransferParameters transferParameters2 = rgb.getTransferParameters();
            if (transferParameters2 != null) {
                ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline42.m();
                transferParameters = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline39.m(transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getE(), transferParameters2.getF(), transferParameters2.getGamma());
            } else {
                transferParameters = null;
            }
            if (transferParameters != null) {
                ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline43.m();
                m = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline40.m(colorSpace.getName(), rgb.getPrimaries$ui_graphics_release(), xyz$ui_graphics_release, transferParameters);
            } else {
                ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline43.m();
                String name = colorSpace.getName();
                float[] primaries$ui_graphics_release = rgb.getPrimaries$ui_graphics_release();
                final drM<Double, Double> oetf = rgb.getOetf();
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda44
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        double androidColorSpace$lambda$0;
                        androidColorSpace$lambda$0 = ColorSpaceVerificationHelper.androidColorSpace$lambda$0(drM.this, d);
                        return androidColorSpace$lambda$0;
                    }
                };
                final drM<Double, Double> eotf = rgb.getEotf();
                m = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline41.m(name, primaries$ui_graphics_release, xyz$ui_graphics_release, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda45
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        double androidColorSpace$lambda$1;
                        androidColorSpace$lambda$1 = ColorSpaceVerificationHelper.androidColorSpace$lambda$1(drM.this, d);
                        return androidColorSpace$lambda$1;
                    }
                }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0));
            }
            return ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline14.m(m);
        } else {
            named = ColorSpace.Named.SRGB;
            colorSpace2 = ColorSpace.get(named);
            return colorSpace2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(drM drm, double d) {
        return ((Number) drm.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(drM drm, double d) {
        return ((Number) drm.invoke(Double.valueOf(d))).doubleValue();
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace(final ColorSpace colorSpace) {
        int id;
        ColorSpace.Named named;
        int ordinal;
        ColorSpace.Named named2;
        int ordinal2;
        ColorSpace.Named named3;
        int ordinal3;
        ColorSpace.Named named4;
        int ordinal4;
        ColorSpace.Named named5;
        int ordinal5;
        ColorSpace.Named named6;
        int ordinal6;
        ColorSpace.Named named7;
        int ordinal7;
        ColorSpace.Named named8;
        int ordinal8;
        ColorSpace.Named named9;
        int ordinal9;
        ColorSpace.Named named10;
        int ordinal10;
        ColorSpace.Named named11;
        int ordinal11;
        ColorSpace.Named named12;
        int ordinal12;
        ColorSpace.Named named13;
        int ordinal13;
        ColorSpace.Named named14;
        int ordinal14;
        ColorSpace.Named named15;
        int ordinal15;
        ColorSpace.Named named16;
        int ordinal16;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] whitePoint;
        WhitePoint whitePoint2;
        float[] whitePoint3;
        float[] whitePoint4;
        TransferParameters transferParameters2;
        String name;
        float[] primaries;
        float[] transform;
        float minValue;
        float maxValue;
        int id2;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        float[] whitePoint5;
        float[] whitePoint6;
        float[] whitePoint7;
        id = colorSpace.getId();
        named = ColorSpace.Named.SRGB;
        ordinal = named.ordinal();
        if (id == ordinal) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        named2 = ColorSpace.Named.ACES;
        ordinal2 = named2.ordinal();
        if (id == ordinal2) {
            return ColorSpaces.INSTANCE.getAces();
        }
        named3 = ColorSpace.Named.ACESCG;
        ordinal3 = named3.ordinal();
        if (id == ordinal3) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        named4 = ColorSpace.Named.ADOBE_RGB;
        ordinal4 = named4.ordinal();
        if (id == ordinal4) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        named5 = ColorSpace.Named.BT2020;
        ordinal5 = named5.ordinal();
        if (id == ordinal5) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        named6 = ColorSpace.Named.BT709;
        ordinal6 = named6.ordinal();
        if (id == ordinal6) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        named7 = ColorSpace.Named.CIE_LAB;
        ordinal7 = named7.ordinal();
        if (id == ordinal7) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        named8 = ColorSpace.Named.CIE_XYZ;
        ordinal8 = named8.ordinal();
        if (id == ordinal8) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        named9 = ColorSpace.Named.DCI_P3;
        ordinal9 = named9.ordinal();
        if (id == ordinal9) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        named10 = ColorSpace.Named.DISPLAY_P3;
        ordinal10 = named10.ordinal();
        if (id == ordinal10) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        named11 = ColorSpace.Named.EXTENDED_SRGB;
        ordinal11 = named11.ordinal();
        if (id == ordinal11) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        ordinal12 = named12.ordinal();
        if (id == ordinal12) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        named13 = ColorSpace.Named.LINEAR_SRGB;
        ordinal13 = named13.ordinal();
        if (id == ordinal13) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        named14 = ColorSpace.Named.NTSC_1953;
        ordinal14 = named14.ordinal();
        if (id == ordinal14) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        named15 = ColorSpace.Named.PRO_PHOTO_RGB;
        ordinal15 = named15.ordinal();
        if (id == ordinal15) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        named16 = ColorSpace.Named.SMPTE_C;
        ordinal16 = named16.ordinal();
        if (id == ordinal16) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        if (ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline22.m(colorSpace)) {
            transferParameters = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getTransferParameters();
            whitePoint = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getWhitePoint();
            if (whitePoint.length == 3) {
                whitePoint5 = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getWhitePoint();
                float f = whitePoint5[0];
                whitePoint6 = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getWhitePoint();
                float f2 = whitePoint6[1];
                whitePoint7 = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getWhitePoint();
                whitePoint2 = new WhitePoint(f, f2, whitePoint7[2]);
            } else {
                whitePoint3 = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getWhitePoint();
                float f3 = whitePoint3[0];
                whitePoint4 = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getWhitePoint();
                whitePoint2 = new WhitePoint(f3, whitePoint4[1]);
            }
            WhitePoint whitePoint8 = whitePoint2;
            if (transferParameters != null) {
                d = transferParameters.g;
                d2 = transferParameters.a;
                d3 = transferParameters.b;
                d4 = transferParameters.c;
                d5 = transferParameters.d;
                d6 = transferParameters.e;
                d7 = transferParameters.f;
                transferParameters2 = new TransferParameters(d, d2, d3, d4, d5, d6, d7);
            } else {
                transferParameters2 = null;
            }
            TransferParameters transferParameters3 = transferParameters2;
            name = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getName();
            primaries = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getPrimaries();
            transform = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getTransform();
            DoubleFunction doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda46
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d8) {
                    double composeColorSpace$lambda$2;
                    composeColorSpace$lambda$2 = ColorSpaceVerificationHelper.composeColorSpace$lambda$2(colorSpace, d8);
                    return composeColorSpace$lambda$2;
                }
            };
            DoubleFunction doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda47
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d8) {
                    double composeColorSpace$lambda$3;
                    composeColorSpace$lambda$3 = ColorSpaceVerificationHelper.composeColorSpace$lambda$3(colorSpace, d8);
                    return composeColorSpace$lambda$3;
                }
            };
            minValue = colorSpace.getMinValue(0);
            maxValue = colorSpace.getMaxValue(0);
            id2 = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getId();
            return new Rgb(name, primaries, whitePoint8, transform, doubleFunction, doubleFunction2, minValue, maxValue, transferParameters3, id2);
        }
        return ColorSpaces.INSTANCE.getSrgb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$2(ColorSpace colorSpace, double d) {
        DoubleUnaryOperator oetf;
        oetf = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getOetf();
        return oetf.applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$3(ColorSpace colorSpace, double d) {
        DoubleUnaryOperator eotf;
        eotf = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline18.m(colorSpace).getEotf();
        return eotf.applyAsDouble(d);
    }
}
