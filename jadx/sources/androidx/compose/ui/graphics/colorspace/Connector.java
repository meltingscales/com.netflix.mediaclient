package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.RenderIntent;
import java.util.Arrays;
import o.C8626dso;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public class Connector {
    public static final Companion Companion;
    private static final Connector OklabToSrgbPerceptual;
    private static final Connector SrgbIdentity;
    private static final Connector SrgbToOklabPerceptual;
    private final ColorSpace destination;
    private final int renderIntent;
    private final ColorSpace source;
    private final float[] transform;
    private final ColorSpace transformDestination;
    private final ColorSpace transformSource;

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i, C8627dsp c8627dsp) {
        this(colorSpace, colorSpace2, i);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i, float[] fArr, C8627dsp c8627dsp) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i, fArr);
    }

    public final ColorSpace getDestination() {
        return this.destination;
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Connector(androidx.compose.ui.graphics.colorspace.ColorSpace r13, androidx.compose.ui.graphics.colorspace.ColorSpace r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.m1492getModelxdoWZVw()
            androidx.compose.ui.graphics.colorspace.ColorModel$Companion r2 = androidx.compose.ui.graphics.colorspace.ColorModel.Companion
            long r3 = r2.m1490getRgbxdoWZVw()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.m1484equalsimpl0(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L1e
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(r13, r0, r3, r1, r3)
            r7 = r0
            goto L1f
        L1e:
            r7 = r13
        L1f:
            long r4 = r14.m1492getModelxdoWZVw()
            long r8 = r2.m1490getRgbxdoWZVw()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.m1484equalsimpl0(r4, r8)
            if (r0 == 0) goto L39
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(r14, r0, r3, r1, r3)
            r8 = r0
            goto L3a
        L39:
            r8 = r14
        L3a:
            androidx.compose.ui.graphics.colorspace.Connector$Companion r0 = androidx.compose.ui.graphics.colorspace.Connector.Companion
            float[] r10 = androidx.compose.ui.graphics.colorspace.Connector.Companion.m1497access$computeTransformYBCOT_4(r0, r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Connector.<init>(androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace, int):void");
    }

    /* renamed from: transformToColor-wmQWz5c$ui_graphics_release  reason: not valid java name */
    public long mo1496transformToColorwmQWz5c$ui_graphics_release(float f, float f2, float f3, float f4) {
        long xy$ui_graphics_release = this.transformSource.toXy$ui_graphics_release(f, f2, f3);
        C8626dso c8626dso = C8626dso.e;
        float intBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics_release & 4294967295L));
        float z$ui_graphics_release = this.transformSource.toZ$ui_graphics_release(f, f2, f3);
        float[] fArr = this.transform;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f5 = intBitsToFloat2;
        float f6 = intBitsToFloat;
        return this.transformDestination.mo1493xyzaToColorJlNiLsg$ui_graphics_release(f6, f5, z$ui_graphics_release, f4, this.destination);
    }

    /* loaded from: classes.dex */
    public static final class RgbConnector extends Connector {
        private final Rgb mDestination;
        private final Rgb mSource;
        private final float[] mTransform;

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i, C8627dsp c8627dsp) {
            this(rgb, rgb2, i);
        }

        private RgbConnector(Rgb rgb, Rgb rgb2, int i) {
            super(rgb, rgb2, rgb, rgb2, i, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m1499computeTransformYBCOT_4(rgb, rgb2, i);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* renamed from: transformToColor-wmQWz5c$ui_graphics_release */
        public long mo1496transformToColorwmQWz5c$ui_graphics_release(float f, float f2, float f3, float f4) {
            float invoke = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(f);
            float invoke2 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(f2);
            float invoke3 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(f3);
            return ColorKt.Color((float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_0(this.mTransform, invoke, invoke2, invoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_1(this.mTransform, invoke, invoke2, invoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_2(this.mTransform, invoke, invoke2, invoke3)), f4, this.mDestination);
        }

        /* renamed from: computeTransform-YBCOT_4  reason: not valid java name */
        private final float[] m1499computeTransformYBCOT_4(Rgb rgb, Rgb rgb2, int i) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics_release(), rgb.getTransform$ui_graphics_release());
            }
            float[] transform$ui_graphics_release = rgb.getTransform$ui_graphics_release();
            float[] inverseTransform$ui_graphics_release = rgb2.getInverseTransform$ui_graphics_release();
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = rgb2.getWhitePoint().toXyz$ui_graphics_release();
            WhitePoint whitePoint = rgb.getWhitePoint();
            Illuminant illuminant = Illuminant.INSTANCE;
            if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                float[] transform$ui_graphics_release2 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf = Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                C8632dsu.a(copyOf, "");
                transform$ui_graphics_release = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release2, xyz$ui_graphics_release, copyOf), rgb.getTransform$ui_graphics_release());
            }
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), illuminant.getD50())) {
                float[] transform$ui_graphics_release3 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release2 = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf2 = Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                C8632dsu.a(copyOf2, "");
                inverseTransform$ui_graphics_release = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release3, xyz$ui_graphics_release2, copyOf2), rgb2.getTransform$ui_graphics_release()));
            }
            if (RenderIntent.m1502equalsimpl0(i, RenderIntent.Companion.m1506getAbsoluteuksYyKA())) {
                transform$ui_graphics_release = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform$ui_graphics_release);
            }
            return ColorSpaceKt.mul3x3(inverseTransform$ui_graphics_release, transform$ui_graphics_release);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: computeTransform-YBCOT_4  reason: not valid java name */
        public final float[] m1498computeTransformYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
            if (RenderIntent.m1502equalsimpl0(i, RenderIntent.Companion.m1506getAbsoluteuksYyKA())) {
                long m1492getModelxdoWZVw = colorSpace.m1492getModelxdoWZVw();
                ColorModel.Companion companion = ColorModel.Companion;
                boolean m1484equalsimpl0 = ColorModel.m1484equalsimpl0(m1492getModelxdoWZVw, companion.m1490getRgbxdoWZVw());
                boolean m1484equalsimpl02 = ColorModel.m1484equalsimpl0(colorSpace2.m1492getModelxdoWZVw(), companion.m1490getRgbxdoWZVw());
                if (m1484equalsimpl0 && m1484equalsimpl02) {
                    return null;
                }
                if (m1484equalsimpl0 || m1484equalsimpl02) {
                    if (!m1484equalsimpl0) {
                        colorSpace = colorSpace2;
                    }
                    C8632dsu.d(colorSpace);
                    Rgb rgb = (Rgb) colorSpace;
                    float[] xyz$ui_graphics_release = m1484equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                    float[] xyz$ui_graphics_release2 = m1484equalsimpl02 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                    return new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]};
                }
                return null;
            }
            return null;
        }

        public final Connector identity$ui_graphics_release(final ColorSpace colorSpace) {
            final int m1508getRelativeuksYyKA = RenderIntent.Companion.m1508getRelativeuksYyKA();
            return new Connector(colorSpace, m1508getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(colorSpace, colorSpace, m1508getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* renamed from: transformToColor-wmQWz5c$ui_graphics_release */
                public long mo1496transformToColorwmQWz5c$ui_graphics_release(float f, float f2, float f3, float f4) {
                    return ColorKt.Color(f, f2, f3, f4, getDestination());
                }
            };
        }

        public final Connector getSrgbIdentity$ui_graphics_release() {
            return Connector.SrgbIdentity;
        }

        public final Connector getSrgbToOklabPerceptual$ui_graphics_release() {
            return Connector.SrgbToOklabPerceptual;
        }

        public final Connector getOklabToSrgbPerceptual$ui_graphics_release() {
            return Connector.OklabToSrgbPerceptual;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        SrgbIdentity = companion.identity$ui_graphics_release(colorSpaces.getSrgb());
        Rgb srgb = colorSpaces.getSrgb();
        ColorSpace oklab = colorSpaces.getOklab();
        RenderIntent.Companion companion2 = RenderIntent.Companion;
        SrgbToOklabPerceptual = new Connector(srgb, oklab, companion2.m1507getPerceptualuksYyKA(), null);
        OklabToSrgbPerceptual = new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion2.m1507getPerceptualuksYyKA(), null);
    }
}
