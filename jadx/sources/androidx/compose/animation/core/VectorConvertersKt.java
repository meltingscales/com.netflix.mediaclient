package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import o.C8626dso;
import o.C8634dsw;
import o.drM;
import o.dsT;

/* loaded from: classes.dex */
public final class VectorConvertersKt {
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(new drM<Float, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        public final AnimationVector1D invoke(float f) {
            return new AnimationVector1D(f);
        }

        @Override // o.drM
        public /* synthetic */ AnimationVector1D invoke(Float f) {
            return invoke(f.floatValue());
        }
    }, new drM<AnimationVector1D, Float>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // o.drM
        public final Float invoke(AnimationVector1D animationVector1D) {
            return Float.valueOf(animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(new drM<Integer, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        public final AnimationVector1D invoke(int i) {
            return new AnimationVector1D(i);
        }

        @Override // o.drM
        public /* synthetic */ AnimationVector1D invoke(Integer num) {
            return invoke(num.intValue());
        }
    }, new drM<AnimationVector1D, Integer>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // o.drM
        public final Integer invoke(AnimationVector1D animationVector1D) {
            return Integer.valueOf((int) animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<Dp, AnimationVector1D> DpToVector = TwoWayConverter(new drM<Dp, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // o.drM
        public /* synthetic */ AnimationVector1D invoke(Dp dp) {
            return m81invoke0680j_4(dp.m2498unboximpl());
        }

        /* renamed from: invoke-0680j_4  reason: not valid java name */
        public final AnimationVector1D m81invoke0680j_4(float f) {
            return new AnimationVector1D(f);
        }
    }, new drM<AnimationVector1D, Dp>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // o.drM
        public /* synthetic */ Dp invoke(AnimationVector1D animationVector1D) {
            return Dp.m2490boximpl(m82invokeu2uoSUM(animationVector1D));
        }

        /* renamed from: invoke-u2uoSUM  reason: not valid java name */
        public final float m82invokeu2uoSUM(AnimationVector1D animationVector1D) {
            return Dp.m2492constructorimpl(animationVector1D.getValue());
        }
    });
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(new drM<DpOffset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // o.drM
        public /* synthetic */ AnimationVector2D invoke(DpOffset dpOffset) {
            return m79invokejoFl9I(dpOffset.m2512unboximpl());
        }

        /* renamed from: invoke-jo-Fl9I  reason: not valid java name */
        public final AnimationVector2D m79invokejoFl9I(long j) {
            return new AnimationVector2D(DpOffset.m2508getXD9Ej5fM(j), DpOffset.m2509getYD9Ej5fM(j));
        }
    }, new drM<AnimationVector2D, DpOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // o.drM
        public /* synthetic */ DpOffset invoke(AnimationVector2D animationVector2D) {
            return DpOffset.m2505boximpl(m80invokegVRvYmI(animationVector2D));
        }

        /* renamed from: invoke-gVRvYmI  reason: not valid java name */
        public final long m80invokegVRvYmI(AnimationVector2D animationVector2D) {
            return DpKt.m2502DpOffsetYgX7TsA(Dp.m2492constructorimpl(animationVector2D.getV1()), Dp.m2492constructorimpl(animationVector2D.getV2()));
        }
    });
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(new drM<Size, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // o.drM
        public /* synthetic */ AnimationVector2D invoke(Size size) {
            return m89invokeuvyYCjk(size.m1180unboximpl());
        }

        /* renamed from: invoke-uvyYCjk  reason: not valid java name */
        public final AnimationVector2D m89invokeuvyYCjk(long j) {
            return new AnimationVector2D(Size.m1176getWidthimpl(j), Size.m1174getHeightimpl(j));
        }
    }, new drM<AnimationVector2D, Size>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // o.drM
        public /* synthetic */ Size invoke(AnimationVector2D animationVector2D) {
            return Size.m1170boximpl(m90invoke7Ah8Wj8(animationVector2D));
        }

        /* renamed from: invoke-7Ah8Wj8  reason: not valid java name */
        public final long m90invoke7Ah8Wj8(AnimationVector2D animationVector2D) {
            return SizeKt.Size(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(new drM<Offset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // o.drM
        public /* synthetic */ AnimationVector2D invoke(Offset offset) {
            return m87invokek4lQ0M(offset.m1146unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final AnimationVector2D m87invokek4lQ0M(long j) {
            return new AnimationVector2D(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j));
        }
    }, new drM<AnimationVector2D, Offset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // o.drM
        public /* synthetic */ Offset invoke(AnimationVector2D animationVector2D) {
            return Offset.m1126boximpl(m88invoketuRUvjQ(animationVector2D));
        }

        /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
        public final long m88invoketuRUvjQ(AnimationVector2D animationVector2D) {
            return OffsetKt.Offset(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(new drM<IntOffset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // o.drM
        public /* synthetic */ AnimationVector2D invoke(IntOffset intOffset) {
            return m83invokegyyYBs(intOffset.m2537unboximpl());
        }

        /* renamed from: invoke--gyyYBs  reason: not valid java name */
        public final AnimationVector2D m83invokegyyYBs(long j) {
            return new AnimationVector2D(IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(j));
        }
    }, new drM<AnimationVector2D, IntOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // o.drM
        public /* synthetic */ IntOffset invoke(AnimationVector2D animationVector2D) {
            return IntOffset.m2525boximpl(m84invokeBjo55l4(animationVector2D));
        }

        /* renamed from: invoke-Bjo55l4  reason: not valid java name */
        public final long m84invokeBjo55l4(AnimationVector2D animationVector2D) {
            int e;
            int e2;
            e = dsT.e(animationVector2D.getV1());
            e2 = dsT.e(animationVector2D.getV2());
            return IntOffsetKt.IntOffset(e, e2);
        }
    });
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(new drM<IntSize, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // o.drM
        public /* synthetic */ AnimationVector2D invoke(IntSize intSize) {
            return m85invokeozmzZPI(intSize.m2550unboximpl());
        }

        /* renamed from: invoke-ozmzZPI  reason: not valid java name */
        public final AnimationVector2D m85invokeozmzZPI(long j) {
            return new AnimationVector2D(IntSize.m2547getWidthimpl(j), IntSize.m2546getHeightimpl(j));
        }
    }, new drM<AnimationVector2D, IntSize>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // o.drM
        public /* synthetic */ IntSize invoke(AnimationVector2D animationVector2D) {
            return IntSize.m2542boximpl(m86invokeYEO4UFw(animationVector2D));
        }

        /* renamed from: invoke-YEO4UFw  reason: not valid java name */
        public final long m86invokeYEO4UFw(AnimationVector2D animationVector2D) {
            int e;
            int e2;
            e = dsT.e(animationVector2D.getV1());
            e2 = dsT.e(animationVector2D.getV2());
            return IntSizeKt.IntSize(e, e2);
        }
    });
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(new drM<Rect, AnimationVector4D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // o.drM
        public final AnimationVector4D invoke(Rect rect) {
            return new AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        }
    }, new drM<AnimationVector4D, Rect>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // o.drM
        public final Rect invoke(AnimationVector4D animationVector4D) {
            return new Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
        }
    });

    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(Offset.Companion companion) {
        return OffsetToVector;
    }

    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(Rect.Companion companion) {
        return RectToVector;
    }

    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(Size.Companion companion) {
        return SizeToVector;
    }

    public static final TwoWayConverter<Dp, AnimationVector1D> getVectorConverter(Dp.Companion companion) {
        return DpToVector;
    }

    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(DpOffset.Companion companion) {
        return DpOffsetToVector;
    }

    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(IntOffset.Companion companion) {
        return IntOffsetToVector;
    }

    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(IntSize.Companion companion) {
        return IntSizeToVector;
    }

    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(C8626dso c8626dso) {
        return FloatToVector;
    }

    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(C8634dsw c8634dsw) {
        return IntToVector;
    }

    public static final float lerp(float f, float f2, float f3) {
        return (f * (1 - f3)) + (f2 * f3);
    }

    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(drM<? super T, ? extends V> drm, drM<? super V, ? extends T> drm2) {
        return new TwoWayConverterImpl(drm, drm2);
    }
}
