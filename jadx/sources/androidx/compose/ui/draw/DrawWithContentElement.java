package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class DrawWithContentElement extends ModifierNodeElement<DrawWithContentModifier> {
    private final drM<ContentDrawScope, dpR> onDraw;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && C8632dsu.c(this.onDraw, ((DrawWithContentElement) obj).onDraw);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onDraw.hashCode();
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.onDraw + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(drM<? super ContentDrawScope, dpR> drm) {
        this.onDraw = drm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DrawWithContentModifier create() {
        return new DrawWithContentModifier(this.onDraw);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DrawWithContentModifier drawWithContentModifier) {
        drawWithContentModifier.setOnDraw(this.onDraw);
    }
}
