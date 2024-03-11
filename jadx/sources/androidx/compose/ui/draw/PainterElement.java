package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;

/* loaded from: classes.dex */
final class PainterElement extends ModifierNodeElement<PainterNode> {
    private final Alignment alignment;
    private final float alpha;
    private final ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PainterElement) {
            PainterElement painterElement = (PainterElement) obj;
            return C8632dsu.c(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && C8632dsu.c(this.alignment, painterElement.alignment) && C8632dsu.c(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && C8632dsu.c(this.colorFilter, painterElement.colorFilter);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.painter.hashCode();
        int hashCode2 = Boolean.hashCode(this.sizeToIntrinsics);
        int hashCode3 = this.alignment.hashCode();
        int hashCode4 = this.contentScale.hashCode();
        int hashCode5 = Float.hashCode(this.alpha);
        ColorFilter colorFilter = this.colorFilter;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterElement(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PainterNode create() {
        return new PainterNode(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PainterNode painterNode) {
        boolean sizeToIntrinsics = painterNode.getSizeToIntrinsics();
        boolean z = this.sizeToIntrinsics;
        boolean z2 = sizeToIntrinsics != z || (z && !Size.m1173equalsimpl0(painterNode.getPainter().mo1570getIntrinsicSizeNHjbRc(), this.painter.mo1570getIntrinsicSizeNHjbRc()));
        painterNode.setPainter(this.painter);
        painterNode.setSizeToIntrinsics(this.sizeToIntrinsics);
        painterNode.setAlignment(this.alignment);
        painterNode.setContentScale(this.contentScale);
        painterNode.setAlpha(this.alpha);
        painterNode.setColorFilter(this.colorFilter);
        if (z2) {
            LayoutModifierNodeKt.invalidateMeasurement(painterNode);
        }
        DrawModifierNodeKt.invalidateDraw(painterNode);
    }
}
