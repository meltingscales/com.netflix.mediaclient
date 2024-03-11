package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class LayoutNodeDrawScope implements ContentDrawScope {
    private final CanvasDrawScope canvasDrawScope;
    private DrawModifierNode drawNode;

    public LayoutNodeDrawScope() {
        this(null, 1, null);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo1521drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1521drawArcyD3GUKo(j, f, f2, z, j2, j3, f3, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo1522drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1522drawCircleVaOC9Bg(j, f, j2, f2, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo1523drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        this.canvasDrawScope.mo1523drawImageAZ2fEMs(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo1524drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1524drawImagegbVJVH8(imageBitmap, j, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo1525drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo1525drawLine1RTmtNc(brush, j, j2, f, i, pathEffect, f2, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo1526drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo1526drawLineNGM6Ib0(j, j2, j3, f, i, pathEffect, f2, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo1527drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1527drawOvalnJ9OG0(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo1528drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1528drawPathGBMwjPU(path, brush, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo1529drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1529drawPathLG529CI(path, j, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo1530drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        this.canvasDrawScope.mo1530drawPointsF8ZwMP8(list, i, j, f, i2, pathEffect, f2, colorFilter, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo1531drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1531drawRectAsUm42w(brush, j, j2, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo1532drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1532drawRectnJ9OG0(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo1533drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1533drawRoundRectZuiqVtQ(brush, j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo1534drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        this.canvasDrawScope.mo1534drawRoundRectuAw5IA(j, j2, j3, j4, drawStyle, f, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo1561getCenterF1C5BW0() {
        return this.canvasDrawScope.mo1561getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo1562getSizeNHjbRc() {
        return this.canvasDrawScope.mo1562getSizeNHjbRc();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo186roundToPxR2X_6o(long j) {
        return this.canvasDrawScope.mo186roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo187roundToPx0680j_4(float f) {
        return this.canvasDrawScope.mo187roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo188toDpGaN1DYA(long j) {
        return this.canvasDrawScope.mo188toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo189toDpu2uoSUM(float f) {
        return this.canvasDrawScope.mo189toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo190toDpu2uoSUM(int i) {
        return this.canvasDrawScope.mo190toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo191toDpSizekrfVVM(long j) {
        return this.canvasDrawScope.mo191toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo192toPxR2X_6o(long j) {
        return this.canvasDrawScope.mo192toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo193toPx0680j_4(float f) {
        return this.canvasDrawScope.mo193toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo194toSizeXkaWNTQ(long j) {
        return this.canvasDrawScope.mo194toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo195toSp0xMU5do(float f) {
        return this.canvasDrawScope.mo195toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo196toSpkPz2Gy4(float f) {
        return this.canvasDrawScope.mo196toSpkPz2Gy4(f);
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    /* renamed from: drawDirect-x_KDEd0$ui_release  reason: not valid java name */
    public final void m1880drawDirectx_KDEd0$ui_release(Canvas canvas, long j, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode) {
        DrawModifierNode drawModifierNode2 = this.drawNode;
        this.drawNode = drawModifierNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m1535component4NHjbRc = drawParams.m1535component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(nodeCoordinator);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m1537setSizeuvyYCjk(j);
        canvas.save();
        drawModifierNode.draw(this);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m1537setSizeuvyYCjk(m1535component4NHjbRc);
        this.drawNode = drawModifierNode2;
    }

    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Modifier.Node nextDrawNode;
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        C8632dsu.d(drawModifierNode);
        nextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (nextDrawNode == null) {
            NodeCoordinator m1853requireCoordinator64DMado = DelegatableNodeKt.m1853requireCoordinator64DMado(drawModifierNode, NodeKind.m1935constructorimpl(4));
            if (m1853requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                m1853requireCoordinator64DMado = m1853requireCoordinator64DMado.getWrapped$ui_release();
                C8632dsu.d(m1853requireCoordinator64DMado);
            }
            m1853requireCoordinator64DMado.performDraw(canvas);
            return;
        }
        int m1935constructorimpl = NodeKind.m1935constructorimpl(4);
        MutableVector mutableVector = null;
        while (nextDrawNode != null) {
            if (nextDrawNode instanceof DrawModifierNode) {
                performDraw((DrawModifierNode) nextDrawNode, canvas);
            } else if ((nextDrawNode.getKindSet$ui_release() & m1935constructorimpl) != 0 && (nextDrawNode instanceof DelegatingNode)) {
                int i = 0;
                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nextDrawNode).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            nextDrawNode = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (nextDrawNode != null) {
                                mutableVector.add(nextDrawNode);
                                nextDrawNode = null;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            nextDrawNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    public final void performDraw(DrawModifierNode drawModifierNode, Canvas canvas) {
        NodeCoordinator m1853requireCoordinator64DMado = DelegatableNodeKt.m1853requireCoordinator64DMado(drawModifierNode, NodeKind.m1935constructorimpl(4));
        m1853requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m1880drawDirectx_KDEd0$ui_release(canvas, IntSizeKt.m2553toSizeozmzZPI(m1853requireCoordinator64DMado.mo1809getSizeYbymL2g()), m1853requireCoordinator64DMado, drawModifierNode);
    }

    /* renamed from: draw-x_KDEd0$ui_release  reason: not valid java name */
    public final void m1879drawx_KDEd0$ui_release(Canvas canvas, long j, NodeCoordinator nodeCoordinator, Modifier.Node node) {
        int m1935constructorimpl = NodeKind.m1935constructorimpl(4);
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof DrawModifierNode) {
                m1880drawDirectx_KDEd0$ui_release(canvas, j, nodeCoordinator, (DrawModifierNode) node);
            } else if ((node.getKindSet$ui_release() & m1935constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                int i = 0;
                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m1935constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            node = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
    }
}
