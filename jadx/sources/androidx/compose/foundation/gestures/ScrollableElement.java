package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollableElement extends ModifierNodeElement<ScrollableNode> {
    private final BringIntoViewSpec bringIntoViewSpec;
    private final boolean enabled;
    private final FlingBehavior flingBehavior;
    private final MutableInteractionSource interactionSource;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;
    private final ScrollableState state;

    public ScrollableElement(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = z;
        this.reverseDirection = z2;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ScrollableNode create() {
        return new ScrollableNode(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ScrollableNode scrollableNode) {
        scrollableNode.update(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.state.hashCode();
        int hashCode2 = this.orientation.hashCode();
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        int hashCode3 = overscrollEffect != null ? overscrollEffect.hashCode() : 0;
        int hashCode4 = Boolean.hashCode(this.enabled);
        int hashCode5 = Boolean.hashCode(this.reverseDirection);
        FlingBehavior flingBehavior = this.flingBehavior;
        int hashCode6 = flingBehavior != null ? flingBehavior.hashCode() : 0;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31) + this.bringIntoViewSpec.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScrollableElement) {
            ScrollableElement scrollableElement = (ScrollableElement) obj;
            return C8632dsu.c(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && C8632dsu.c(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && C8632dsu.c(this.flingBehavior, scrollableElement.flingBehavior) && C8632dsu.c(this.interactionSource, scrollableElement.interactionSource) && C8632dsu.c(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec);
        }
        return false;
    }
}
