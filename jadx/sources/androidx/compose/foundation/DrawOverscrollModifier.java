package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class DrawOverscrollModifier extends InspectorValueInfo implements DrawModifier {
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public DrawOverscrollModifier(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, drM<? super InspectorInfo, dpR> drm) {
        super(drm);
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        this.overscrollEffect.drawOverscroll(contentDrawScope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawOverscrollModifier) {
            return C8632dsu.c(this.overscrollEffect, ((DrawOverscrollModifier) obj).overscrollEffect);
        }
        return false;
    }

    public int hashCode() {
        return this.overscrollEffect.hashCode();
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.overscrollEffect + ')';
    }
}
