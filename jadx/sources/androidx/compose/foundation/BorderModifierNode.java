package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Dp;
import kotlin.NoWhenBranchMatchedException;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, C8627dsp c8627dsp) {
        this(f, brush, shape);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m121getWidthD9Ej5fM() {
        return this.width;
    }

    private BorderModifierNode(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new drM<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                DrawResult drawContentWithoutBorder;
                DrawResult m117drawRectBorderNsqcLGU;
                DrawResult m120drawRoundRectBorderJqoCqck;
                DrawResult drawGenericBorder;
                if (cacheDrawScope.mo193toPx0680j_4(BorderModifierNode.this.m121getWidthD9Ej5fM()) < 0.0f || Size.m1175getMinDimensionimpl(cacheDrawScope.m1067getSizeNHjbRc()) <= 0.0f) {
                    drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(cacheDrawScope);
                    return drawContentWithoutBorder;
                }
                float f2 = 2;
                float min = Math.min(Dp.m2494equalsimpl0(BorderModifierNode.this.m121getWidthD9Ej5fM(), Dp.Companion.m2499getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo193toPx0680j_4(BorderModifierNode.this.m121getWidthD9Ej5fM())), (float) Math.ceil(Size.m1175getMinDimensionimpl(cacheDrawScope.m1067getSizeNHjbRc()) / f2));
                float f3 = min / f2;
                long Offset = OffsetKt.Offset(f3, f3);
                long Size = SizeKt.Size(Size.m1176getWidthimpl(cacheDrawScope.m1067getSizeNHjbRc()) - min, Size.m1174getHeightimpl(cacheDrawScope.m1067getSizeNHjbRc()) - min);
                boolean z = f2 * min > Size.m1175getMinDimensionimpl(cacheDrawScope.m1067getSizeNHjbRc());
                Outline mo139createOutlinePq9zytI = BorderModifierNode.this.getShape().mo139createOutlinePq9zytI(cacheDrawScope.m1067getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (mo139createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = BorderModifierNode.this;
                    drawGenericBorder = borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) mo139createOutlinePq9zytI, z, min);
                    return drawGenericBorder;
                } else if (mo139createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = BorderModifierNode.this;
                    m120drawRoundRectBorderJqoCqck = borderModifierNode2.m120drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) mo139createOutlinePq9zytI, Offset, Size, z, min);
                    return m120drawRoundRectBorderJqoCqck;
                } else if (mo139createOutlinePq9zytI instanceof Outline.Rectangle) {
                    m117drawRectBorderNsqcLGU = BorderKt.m117drawRectBorderNsqcLGU(cacheDrawScope, BorderModifierNode.this.getBrush(), Offset, Size, z, min);
                    return m117drawRectBorderNsqcLGU;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }));
    }

    /* renamed from: setWidth-0680j_4  reason: not valid java name */
    public final void m122setWidth0680j_4(float f) {
        if (Dp.m2494equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final void setBrush(Brush brush) {
        if (C8632dsu.c(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final void setShape(Shape shape) {
        if (C8632dsu.c(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope r46, final androidx.compose.ui.graphics.Brush r47, final androidx.compose.ui.graphics.Outline.Generic r48, boolean r49, float r50) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck  reason: not valid java name */
    public final DrawResult m120drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        final Path createRoundRectPath;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long m1165getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m1165getTopLeftCornerRadiuskKHJgLs();
            final float f2 = f / 2;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new drM<ContentDrawScope, dpR>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) {
                    long m118shrinkKibmq7A;
                    contentDrawScope.drawContent();
                    if (z) {
                        DrawScope.m1558drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, m1165getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float m1120getXimpl = CornerRadius.m1120getXimpl(m1165getTopLeftCornerRadiuskKHJgLs);
                    float f3 = f2;
                    if (m1120getXimpl >= f3) {
                        Brush brush2 = brush;
                        long j3 = j;
                        long j4 = j2;
                        m118shrinkKibmq7A = BorderKt.m118shrinkKibmq7A(m1165getTopLeftCornerRadiuskKHJgLs, f3);
                        DrawScope.m1558drawRoundRectZuiqVtQ$default(contentDrawScope, brush2, j3, j4, m118shrinkKibmq7A, 0.0f, stroke, null, 0, 208, null);
                        return;
                    }
                    float f4 = f;
                    float m1176getWidthimpl = Size.m1176getWidthimpl(contentDrawScope.mo1562getSizeNHjbRc());
                    float f5 = f;
                    float m1174getHeightimpl = Size.m1174getHeightimpl(contentDrawScope.mo1562getSizeNHjbRc());
                    float f6 = f;
                    int m1282getDifferencertfAjoo = ClipOp.Companion.m1282getDifferencertfAjoo();
                    Brush brush3 = brush;
                    long j5 = m1165getTopLeftCornerRadiuskKHJgLs;
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long mo1538getSizeNHjbRc = drawContext.mo1538getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    drawContext.getTransform().mo1541clipRectN_I0leg(f4, f4, m1176getWidthimpl - f5, m1174getHeightimpl - f6, m1282getDifferencertfAjoo);
                    DrawScope.m1558drawRoundRectZuiqVtQ$default(contentDrawScope, brush3, 0L, 0L, j5, 0.0f, null, null, 0, 246, null);
                    drawContext.getCanvas().restore();
                    drawContext.mo1539setSizeuvyYCjk(mo1538getSizeNHjbRc);
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        C8632dsu.d(borderCache);
        createRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new drM<ContentDrawScope, dpR>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m1553drawPathGBMwjPU$default(contentDrawScope, Path.this, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }
}
