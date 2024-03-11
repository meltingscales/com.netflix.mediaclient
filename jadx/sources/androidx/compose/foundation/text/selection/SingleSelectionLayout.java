package androidx.compose.foundation.text.selection;

import o.C8627dsp;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SingleSelectionLayout implements SelectionLayout {
    public static final Companion Companion = new Companion(null);
    private final int endSlot;
    private final SelectableInfo info;
    private final boolean isStartHandle;
    private final Selection previousSelection;
    private final int startSlot;

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(drM<? super SelectableInfo, dpR> drm) {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getCurrentInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getEndInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getFirstInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public SelectableInfo getStartInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean isStartHandle() {
        return this.isStartHandle;
    }

    public SingleSelectionLayout(boolean z, int i, int i2, Selection selection, SelectableInfo selectableInfo) {
        this.isStartHandle = z;
        this.startSlot = i;
        this.endSlot = i2;
        this.previousSelection = selection;
        this.info = selectableInfo;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public CrossStatus getCrossStatus() {
        return this.info.getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(SelectionLayout selectionLayout) {
        if (getPreviousSelection() != null && selectionLayout != null && (selectionLayout instanceof SingleSelectionLayout)) {
            SingleSelectionLayout singleSelectionLayout = (SingleSelectionLayout) selectionLayout;
            if (isStartHandle() == singleSelectionLayout.isStartHandle() && !this.info.shouldRecomputeSelection(singleSelectionLayout.info)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + isStartHandle() + ", crossed=" + getCrossStatus() + ", info=\n\t" + this.info + ')';
    }
}
