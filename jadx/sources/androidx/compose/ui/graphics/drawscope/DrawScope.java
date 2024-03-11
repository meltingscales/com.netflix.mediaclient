package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.List;

/* loaded from: classes.dex */
public interface DrawScope extends Density {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: drawArc-yD3GUKo */
    void mo1521drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo1522drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawImage-gbVJVH8 */
    void mo1524drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawLine-1RTmtNc */
    void mo1525drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo1526drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2);

    /* renamed from: drawOval-n-J9OG0 */
    void mo1527drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPath-GBMwjPU */
    void mo1528drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPath-LG529CI */
    void mo1529drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo1530drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3);

    /* renamed from: drawRect-AsUm42w */
    void mo1531drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRect-n-J9OG0 */
    void mo1532drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo1533drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo1534drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i);

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
    default long mo1561getCenterF1C5BW0() {
        return SizeKt.m1183getCenteruvyYCjk(getDrawContext().mo1538getSizeNHjbRc());
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    default long mo1562getSizeNHjbRc() {
        return getDrawContext().mo1538getSizeNHjbRc();
    }

    /* renamed from: drawLine-1RTmtNc$default  reason: not valid java name */
    static /* synthetic */ void m1550drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo1525drawLine1RTmtNc(brush, j, j2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.Companion.m1568getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : colorFilter, (i3 & JSONzip.end) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i2);
    }

    /* renamed from: drawLine-NGM6Ib0$default  reason: not valid java name */
    static /* synthetic */ void m1551drawLineNGM6Ib0$default(DrawScope drawScope, long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo1526drawLineNGM6Ib0(j, j2, j3, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.Companion.m1568getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : colorFilter, (i3 & JSONzip.end) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i2);
    }

    /* renamed from: drawRect-AsUm42w$default  reason: not valid java name */
    static /* synthetic */ void m1556drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long m1149getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m1149getZeroF1C5BW0() : j;
        drawScope.mo1531drawRectAsUm42w(brush, m1149getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1560offsetSizePENXr5M(drawScope.mo1562getSizeNHjbRc(), m1149getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawRect-n-J9OG0$default  reason: not valid java name */
    static /* synthetic */ void m1557drawRectnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long m1149getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m1149getZeroF1C5BW0() : j2;
        drawScope.mo1532drawRectnJ9OG0(j, m1149getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1560offsetSizePENXr5M(drawScope.mo1562getSizeNHjbRc(), m1149getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawImage-gbVJVH8$default  reason: not valid java name */
    static /* synthetic */ void m1549drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo1524drawImagegbVJVH8(imageBitmap, (i2 & 2) != 0 ? Offset.Companion.m1149getZeroF1C5BW0() : j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawImage-AZ2fEMs$default  reason: not valid java name */
    static /* synthetic */ void m1548drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long m2538getZeronOccac = (i3 & 2) != 0 ? IntOffset.Companion.m2538getZeronOccac() : j;
        long IntSize = (i3 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
        drawScope.mo1523drawImageAZ2fEMs(imageBitmap, m2538getZeronOccac, IntSize, (i3 & 8) != 0 ? IntOffset.Companion.m2538getZeronOccac() : j3, (i3 & 16) != 0 ? IntSize : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 128) != 0 ? null : colorFilter, (i3 & JSONzip.end) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i, (i3 & 512) != 0 ? Companion.m1564getDefaultFilterQualityfv9h1I() : i2);
    }

    /* renamed from: drawImage-AZ2fEMs */
    default void mo1523drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        m1548drawImageAZ2fEMs$default(this, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, 0, 512, null);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default  reason: not valid java name */
    static /* synthetic */ void m1558drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long m1149getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m1149getZeroF1C5BW0() : j;
        drawScope.mo1533drawRoundRectZuiqVtQ(brush, m1149getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1560offsetSizePENXr5M(drawScope.mo1562getSizeNHjbRc(), m1149getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? CornerRadius.Companion.m1125getZerokKHJgLs() : j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 64) != 0 ? null : colorFilter, (i2 & 128) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default  reason: not valid java name */
    static /* synthetic */ void m1559drawRoundRectuAw5IA$default(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long m1149getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m1149getZeroF1C5BW0() : j2;
        drawScope.mo1534drawRoundRectuAw5IA(j, m1149getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1560offsetSizePENXr5M(drawScope.mo1562getSizeNHjbRc(), m1149getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? CornerRadius.Companion.m1125getZerokKHJgLs() : j4, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? null : colorFilter, (i2 & 128) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawCircle-VaOC9Bg$default  reason: not valid java name */
    static /* synthetic */ void m1547drawCircleVaOC9Bg$default(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        drawScope.mo1522drawCircleVaOC9Bg(j, (i2 & 2) != 0 ? Size.m1175getMinDimensionimpl(drawScope.mo1562getSizeNHjbRc()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.mo1561getCenterF1C5BW0() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawOval-n-J9OG0$default  reason: not valid java name */
    static /* synthetic */ void m1552drawOvalnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long m1149getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m1149getZeroF1C5BW0() : j2;
        drawScope.mo1527drawOvalnJ9OG0(j, m1149getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1560offsetSizePENXr5M(drawScope.mo1562getSizeNHjbRc(), m1149getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawArc-yD3GUKo$default  reason: not valid java name */
    static /* synthetic */ void m1546drawArcyD3GUKo$default(DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long m1149getZeroF1C5BW0 = (i2 & 16) != 0 ? Offset.Companion.m1149getZeroF1C5BW0() : j2;
        drawScope.mo1521drawArcyD3GUKo(j, f, f2, z, m1149getZeroF1C5BW0, (i2 & 32) != 0 ? drawScope.m1560offsetSizePENXr5M(drawScope.mo1562getSizeNHjbRc(), m1149getZeroF1C5BW0) : j3, (i2 & 64) != 0 ? 1.0f : f3, (i2 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i2 & JSONzip.end) != 0 ? null : colorFilter, (i2 & 512) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawPath-LG529CI$default  reason: not valid java name */
    static /* synthetic */ void m1554drawPathLG529CI$default(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        drawScope.mo1529drawPathLG529CI(path, j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawPath-GBMwjPU$default  reason: not valid java name */
    static /* synthetic */ void m1553drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = Companion.m1563getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo1528drawPathGBMwjPU(path, brush, f2, drawStyle2, colorFilter2, i);
    }

    /* renamed from: drawPoints-F8ZwMP8$default  reason: not valid java name */
    static /* synthetic */ void m1555drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo1530drawPointsF8ZwMP8(list, i, j, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? StrokeCap.Companion.m1448getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & 128) != 0 ? null : colorFilter, (i4 & JSONzip.end) != 0 ? Companion.m1563getDefaultBlendMode0nO6VwU() : i3);
    }

    /* renamed from: offsetSize-PENXr5M  reason: not valid java name */
    private default long m1560offsetSizePENXr5M(long j, long j2) {
        return SizeKt.Size(Size.m1176getWidthimpl(j) - Offset.m1137getXimpl(j2), Size.m1174getHeightimpl(j) - Offset.m1138getYimpl(j2));
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m1260getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m1333getLowfv9h1I();

        /* renamed from: getDefaultBlendMode-0nO6VwU  reason: not valid java name */
        public final int m1563getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I  reason: not valid java name */
        public final int m1564getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }

        private Companion() {
        }
    }
}
