package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import o.C8657dts;
import o.drM;

/* loaded from: classes.dex */
public final class ColorVectorConverterKt {
    private static final drM<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> ColorToVector = new drM<ColorSpace, TwoWayConverter<Color, AnimationVector4D>>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // o.drM
        public final TwoWayConverter<Color, AnimationVector4D> invoke(final ColorSpace colorSpace) {
            return VectorConvertersKt.TwoWayConverter(new drM<Color, AnimationVector4D>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @Override // o.drM
                public /* synthetic */ AnimationVector4D invoke(Color color) {
                    return m16invoke8_81llA(color.m1302unboximpl());
                }

                /* renamed from: invoke-8_81llA  reason: not valid java name */
                public final AnimationVector4D m16invoke8_81llA(long j) {
                    long m1290convertvNxB06k = Color.m1290convertvNxB06k(j, ColorSpaces.INSTANCE.getOklab());
                    return new AnimationVector4D(Color.m1288component4impl(m1290convertvNxB06k), Color.m1285component1impl(m1290convertvNxB06k), Color.m1286component2impl(m1290convertvNxB06k), Color.m1287component3impl(m1290convertvNxB06k));
                }
            }, new drM<AnimationVector4D, Color>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ Color invoke(AnimationVector4D animationVector4D) {
                    return Color.m1284boximpl(m17invokevNxB06k(animationVector4D));
                }

                /* renamed from: invoke-vNxB06k  reason: not valid java name */
                public final long m17invokevNxB06k(AnimationVector4D animationVector4D) {
                    float a;
                    float a2;
                    float a3;
                    float a4;
                    a = C8657dts.a(animationVector4D.getV2(), 0.0f, 1.0f);
                    a2 = C8657dts.a(animationVector4D.getV3(), -0.5f, 0.5f);
                    a3 = C8657dts.a(animationVector4D.getV4(), -0.5f, 0.5f);
                    a4 = C8657dts.a(animationVector4D.getV1(), 0.0f, 1.0f);
                    return Color.m1290convertvNxB06k(ColorKt.Color(a, a2, a3, a4, ColorSpaces.INSTANCE.getOklab()), ColorSpace.this);
                }
            });
        }
    };

    public static final drM<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> getVectorConverter(Color.Companion companion) {
        return ColorToVector;
    }
}
