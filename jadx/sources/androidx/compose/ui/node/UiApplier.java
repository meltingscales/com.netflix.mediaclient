package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;

/* loaded from: classes.dex */
public final class UiApplier extends AbstractApplier<LayoutNode> {
    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i, LayoutNode layoutNode) {
    }

    public UiApplier(LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i, LayoutNode layoutNode) {
        getCurrent().insertAt$ui_release(i, layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i, int i2) {
        getCurrent().removeAt$ui_release(i, i2);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i, int i2, int i3) {
        getCurrent().move$ui_release(i, i2, i3);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        getRoot().removeAll$ui_release();
    }

    @Override // androidx.compose.runtime.Applier
    public void onEndChanges() {
        super.onEndChanges();
        Owner owner$ui_release = getRoot().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onEndApplyChanges();
        }
    }
}
