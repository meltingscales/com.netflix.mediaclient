package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {
    private final Brush brush;
    private final Shape shape;
    private final float width;

    public /* synthetic */ BorderModifierNodeElement(float f, Brush brush, Shape shape, C8627dsp c8627dsp) {
        this(f, brush, shape);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BorderModifierNodeElement) {
            BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
            return Dp.m2494equalsimpl0(this.width, borderModifierNodeElement.width) && C8632dsu.c(this.brush, borderModifierNodeElement.brush) && C8632dsu.c(this.shape, borderModifierNodeElement.shape);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Dp.m2495hashCodeimpl(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) Dp.m2496toStringimpl(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    private BorderModifierNodeElement(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BorderModifierNode create() {
        return new BorderModifierNode(this.width, this.brush, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BorderModifierNode borderModifierNode) {
        borderModifierNode.m122setWidth0680j_4(this.width);
        borderModifierNode.setBrush(this.brush);
        borderModifierNode.setShape(this.shape);
    }
}
