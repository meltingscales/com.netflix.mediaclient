package androidx.compose.foundation.text.selection;

import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public interface SelectionLayout {
    void forEachMiddleInfo(drM<? super SelectableInfo, dpR> drm);

    CrossStatus getCrossStatus();

    SelectableInfo getCurrentInfo();

    SelectableInfo getEndInfo();

    int getEndSlot();

    SelectableInfo getFirstInfo();

    Selection getPreviousSelection();

    int getSize();

    SelectableInfo getStartInfo();

    int getStartSlot();

    boolean isStartHandle();

    boolean shouldRecomputeSelection(SelectionLayout selectionLayout);
}
