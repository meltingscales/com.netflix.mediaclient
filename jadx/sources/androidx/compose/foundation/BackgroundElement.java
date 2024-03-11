package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class BackgroundElement extends ModifierNodeElement<BackgroundNode> {
    private final float alpha;
    private final Brush brush;
    private final long color;
    private final drM<InspectorInfo, dpR> inspectorInfo;
    private final Shape shape;

    public /* synthetic */ BackgroundElement(long j, Brush brush, float f, Shape shape, drM drm, C8627dsp c8627dsp) {
        this(j, brush, f, shape, drm);
    }

    public /* synthetic */ BackgroundElement(long j, Brush brush, float f, Shape shape, drM drm, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j, (i & 2) != 0 ? null : brush, f, shape, drm, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j, Brush brush, float f, Shape shape, drM<? super InspectorInfo, dpR> drm) {
        this.color = j;
        this.brush = brush;
        this.alpha = f;
        this.shape = shape;
        this.inspectorInfo = drm;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BackgroundNode create() {
        return new BackgroundNode(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BackgroundNode backgroundNode) {
        backgroundNode.m111setColor8_81llA(this.color);
        backgroundNode.setBrush(this.brush);
        backgroundNode.setAlpha(this.alpha);
        backgroundNode.setShape(this.shape);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int m1300hashCodeimpl = Color.m1300hashCodeimpl(this.color);
        Brush brush = this.brush;
        return (((((m1300hashCodeimpl * 31) + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && Color.m1294equalsimpl0(this.color, backgroundElement.color) && C8632dsu.c(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && C8632dsu.c(this.shape, backgroundElement.shape);
    }
}
