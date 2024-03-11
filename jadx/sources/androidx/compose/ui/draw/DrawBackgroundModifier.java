package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class DrawBackgroundModifier extends Modifier.Node implements DrawModifierNode {
    private drM<? super DrawScope, dpR> onDraw;

    public final void setOnDraw(drM<? super DrawScope, dpR> drm) {
        this.onDraw = drm;
    }

    public DrawBackgroundModifier(drM<? super DrawScope, dpR> drm) {
        this.onDraw = drm;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.onDraw.invoke(contentDrawScope);
        contentDrawScope.drawContent();
    }
}
