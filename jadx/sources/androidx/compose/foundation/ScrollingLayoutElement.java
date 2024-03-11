package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends ModifierNodeElement<ScrollingLayoutNode> {
    private final boolean isReversed;
    private final boolean isVertical;
    private final ScrollState scrollState;

    public ScrollingLayoutElement(ScrollState scrollState, boolean z, boolean z2) {
        this.scrollState = scrollState;
        this.isReversed = z;
        this.isVertical = z2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ScrollingLayoutNode create() {
        return new ScrollingLayoutNode(this.scrollState, this.isReversed, this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ScrollingLayoutNode scrollingLayoutNode) {
        scrollingLayoutNode.setScrollerState(this.scrollState);
        scrollingLayoutNode.setReversed(this.isReversed);
        scrollingLayoutNode.setVertical(this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.scrollState.hashCode();
        return (((hashCode * 31) + Boolean.hashCode(this.isReversed)) * 31) + Boolean.hashCode(this.isVertical);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
            return C8632dsu.c(this.scrollState, scrollingLayoutElement.scrollState) && this.isReversed == scrollingLayoutElement.isReversed && this.isVertical == scrollingLayoutElement.isVertical;
        }
        return false;
    }
}
