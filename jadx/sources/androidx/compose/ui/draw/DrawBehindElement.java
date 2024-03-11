package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class DrawBehindElement extends ModifierNodeElement<DrawBackgroundModifier> {
    private final drM<DrawScope, dpR> onDraw;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && C8632dsu.c(this.onDraw, ((DrawBehindElement) obj).onDraw);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onDraw.hashCode();
    }

    public String toString() {
        return "DrawBehindElement(onDraw=" + this.onDraw + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(drM<? super DrawScope, dpR> drm) {
        this.onDraw = drm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DrawBackgroundModifier create() {
        return new DrawBackgroundModifier(this.onDraw);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DrawBackgroundModifier drawBackgroundModifier) {
        drawBackgroundModifier.setOnDraw(this.onDraw);
    }
}
