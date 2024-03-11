package androidx.compose.ui.node;

/* loaded from: classes.dex */
public final class DepthSortedSetsForDifferentPasses {
    private final DepthSortedSet lookaheadSet;
    private final DepthSortedSet set;

    public DepthSortedSetsForDifferentPasses(boolean z) {
        this.lookaheadSet = new DepthSortedSet(z);
        this.set = new DepthSortedSet(z);
    }

    public final boolean contains(LayoutNode layoutNode, boolean z) {
        boolean contains = this.lookaheadSet.contains(layoutNode);
        return z ? contains : contains || this.set.contains(layoutNode);
    }

    public final boolean contains(LayoutNode layoutNode) {
        return this.lookaheadSet.contains(layoutNode) || this.set.contains(layoutNode);
    }

    public final void add(LayoutNode layoutNode, boolean z) {
        if (z) {
            this.lookaheadSet.add(layoutNode);
        } else if (this.lookaheadSet.contains(layoutNode)) {
        } else {
            this.set.add(layoutNode);
        }
    }

    public final boolean remove(LayoutNode layoutNode) {
        return this.set.remove(layoutNode) || this.lookaheadSet.remove(layoutNode);
    }

    public final boolean isEmpty() {
        return this.set.isEmpty() && this.lookaheadSet.isEmpty();
    }

    public final boolean isEmpty(boolean z) {
        return (z ? this.lookaheadSet : this.set).isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }
}
