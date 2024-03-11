package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class DrawWithContentModifier extends Modifier.Node implements DrawModifierNode {
    private drM<? super ContentDrawScope, dpR> onDraw;

    public final void setOnDraw(drM<? super ContentDrawScope, dpR> drm) {
        this.onDraw = drm;
    }

    public DrawWithContentModifier(drM<? super ContentDrawScope, dpR> drm) {
        this.onDraw = drm;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.onDraw.invoke(contentDrawScope);
    }
}
