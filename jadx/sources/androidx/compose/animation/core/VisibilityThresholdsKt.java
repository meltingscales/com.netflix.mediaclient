package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.Pair;
import o.C8626dso;
import o.C8634dsw;
import o.dpD;
import o.dqE;

/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final Rect rectVisibilityThreshold;
    private static final Map<TwoWayConverter<?, ?>, Float> visibilityThresholdMap;

    public static final int getVisibilityThreshold(C8634dsw c8634dsw) {
        return 1;
    }

    public static final Rect getVisibilityThreshold(Rect.Companion companion) {
        return rectVisibilityThreshold;
    }

    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return visibilityThresholdMap;
    }

    public static final long getVisibilityThreshold(IntOffset.Companion companion) {
        return IntOffsetKt.IntOffset(1, 1);
    }

    public static final long getVisibilityThreshold(Offset.Companion companion) {
        return OffsetKt.Offset(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(Size.Companion companion) {
        return SizeKt.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(IntSize.Companion companion) {
        return IntSizeKt.IntSize(1, 1);
    }

    static {
        Map<TwoWayConverter<?, ?>, Float> c;
        Float valueOf = Float.valueOf(0.5f);
        rectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C8634dsw.d);
        Float valueOf2 = Float.valueOf(1.0f);
        Pair a = dpD.a(vectorConverter, valueOf2);
        Pair a2 = dpD.a(VectorConvertersKt.getVectorConverter(IntSize.Companion), valueOf2);
        Pair a3 = dpD.a(VectorConvertersKt.getVectorConverter(IntOffset.Companion), valueOf2);
        Pair a4 = dpD.a(VectorConvertersKt.getVectorConverter(C8626dso.e), Float.valueOf(0.01f));
        Pair a5 = dpD.a(VectorConvertersKt.getVectorConverter(Rect.Companion), valueOf);
        Pair a6 = dpD.a(VectorConvertersKt.getVectorConverter(Size.Companion), valueOf);
        Pair a7 = dpD.a(VectorConvertersKt.getVectorConverter(Offset.Companion), valueOf);
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(Dp.Companion);
        Float valueOf3 = Float.valueOf(0.1f);
        c = dqE.c(a, a2, a3, a4, a5, a6, a7, dpD.a(vectorConverter2, valueOf3), dpD.a(VectorConvertersKt.getVectorConverter(DpOffset.Companion), valueOf3));
        visibilityThresholdMap = c;
    }

    public static final float getVisibilityThreshold(Dp.Companion companion) {
        return Dp.m2492constructorimpl(0.1f);
    }
}
