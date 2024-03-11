package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.LazyThreadSafetyMode;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo updateSelectionBoundary(final SelectionLayout selectionLayout, final SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        final InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        final int rawStartHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if ((selectionLayout.isStartHandle() ? selectionLayout.getStartSlot() : selectionLayout.getEndSlot()) != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        b = dpB.b(lazyThreadSafetyMode, new drO<Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Integer invoke() {
                return Integer.valueOf(SelectableInfo.this.getTextLayoutResult().getLineForOffset(rawStartHandleOffset));
            }
        });
        final int rawEndHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawEndHandleOffset() : selectableInfo.getRawStartHandleOffset();
        final int i = rawStartHandleOffset;
        b2 = dpB.b(lazyThreadSafetyMode, new drO<Selection.AnchorInfo>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Selection.AnchorInfo invoke() {
                int updateSelectionBoundary$lambda$0;
                Selection.AnchorInfo snapToWordBoundary;
                SelectableInfo selectableInfo2 = SelectableInfo.this;
                updateSelectionBoundary$lambda$0 = SelectionAdjustmentKt.updateSelectionBoundary$lambda$0(b);
                snapToWordBoundary = SelectionAdjustmentKt.snapToWordBoundary(selectableInfo2, updateSelectionBoundary$lambda$0, i, rawEndHandleOffset, selectionLayout.isStartHandle(), selectionLayout.getCrossStatus() == CrossStatus.CROSSED);
                return snapToWordBoundary;
            }
        });
        if (selectableInfo.getSelectableId() != anchorInfo.getSelectableId()) {
            return updateSelectionBoundary$lambda$1(b2);
        }
        int rawPreviousHandleOffset = selectableInfo.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (updateSelectionBoundary$lambda$0(b) != selectableInfo.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset)) {
            return updateSelectionBoundary$lambda$1(b2);
        }
        int offset = anchorInfo.getOffset();
        long m2144getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m2144getWordBoundaryjx7JFs(offset);
        if (!isExpanding(selectableInfo, rawStartHandleOffset, selectionLayout.isStartHandle())) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        if (offset == TextRange.m2157getStartimpl(m2144getWordBoundaryjx7JFs) || offset == TextRange.m2152getEndimpl(m2144getWordBoundaryjx7JFs)) {
            return updateSelectionBoundary$lambda$1(b2);
        }
        return selectableInfo.anchorForOffset(rawStartHandleOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateSelectionBoundary$lambda$0(InterfaceC8554dpx<Integer> interfaceC8554dpx) {
        return interfaceC8554dpx.getValue().intValue();
    }

    private static final Selection.AnchorInfo updateSelectionBoundary$lambda$1(InterfaceC8554dpx<Selection.AnchorInfo> interfaceC8554dpx) {
        return interfaceC8554dpx.getValue();
    }

    private static final boolean isExpanding(SelectableInfo selectableInfo, int i, boolean z) {
        if (selectableInfo.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i == selectableInfo.getRawPreviousHandleOffset()) {
            return false;
        }
        if (z ^ (selectableInfo.getRawCrossStatus() == CrossStatus.CROSSED)) {
            if (i < selectableInfo.getRawPreviousHandleOffset()) {
                return true;
            }
        } else if (i > selectableInfo.getRawPreviousHandleOffset()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo snapToWordBoundary(SelectableInfo selectableInfo, int i, int i2, int i3, boolean z, boolean z2) {
        int lineStart;
        int lineEnd$default;
        long m2144getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m2144getWordBoundaryjx7JFs(i2);
        if (selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m2157getStartimpl(m2144getWordBoundaryjx7JFs)) == i) {
            lineStart = TextRange.m2157getStartimpl(m2144getWordBoundaryjx7JFs);
        } else if (i >= selectableInfo.getTextLayoutResult().getLineCount()) {
            lineStart = selectableInfo.getTextLayoutResult().getLineStart(selectableInfo.getTextLayoutResult().getLineCount() - 1);
        } else {
            lineStart = selectableInfo.getTextLayoutResult().getLineStart(i);
        }
        if (selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m2152getEndimpl(m2144getWordBoundaryjx7JFs)) == i) {
            lineEnd$default = TextRange.m2152getEndimpl(m2144getWordBoundaryjx7JFs);
        } else if (i >= selectableInfo.getTextLayoutResult().getLineCount()) {
            lineEnd$default = TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), selectableInfo.getTextLayoutResult().getLineCount() - 1, false, 2, null);
        } else {
            lineEnd$default = TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), i, false, 2, null);
        }
        if (lineStart == i3) {
            return selectableInfo.anchorForOffset(lineEnd$default);
        }
        if (lineEnd$default == i3) {
            return selectableInfo.anchorForOffset(lineStart);
        }
        if (!(z ^ z2) ? i2 >= lineStart : i2 > lineEnd$default) {
            lineStart = lineEnd$default;
        }
        return selectableInfo.anchorForOffset(lineStart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection adjustToBoundaries(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z = selectionLayout.getCrossStatus() == CrossStatus.CROSSED;
        return new Selection(anchorOnBoundary(selectionLayout.getStartInfo(), z, true, selectionLayout.getStartSlot(), boundaryFunction), anchorOnBoundary(selectionLayout.getEndInfo(), z, false, selectionLayout.getEndSlot(), boundaryFunction), z);
    }

    private static final Selection.AnchorInfo anchorOnBoundary(SelectableInfo selectableInfo, boolean z, boolean z2, int i, BoundaryFunction boundaryFunction) {
        int rawStartHandleOffset = z2 ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if (i != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        long mo520getBoundaryfzxv0v0 = boundaryFunction.mo520getBoundaryfzxv0v0(selectableInfo, rawStartHandleOffset);
        return selectableInfo.anchorForOffset(z ^ z2 ? TextRange.m2157getStartimpl(mo520getBoundaryfzxv0v0) : TextRange.m2152getEndimpl(mo520getBoundaryfzxv0v0));
    }

    public static final Selection ensureAtLeastOneChar(Selection selection, SelectionLayout selectionLayout) {
        if (SelectionLayoutKt.isCollapsed(selection, selectionLayout)) {
            return (selectionLayout.getSize() > 1 || selectionLayout.getPreviousSelection() == null || selectionLayout.getCurrentInfo().getInputText().length() == 0) ? selection : expandOneChar(selection, selectionLayout);
        }
        return selection;
    }

    private static final Selection expandOneChar(Selection selection, SelectionLayout selectionLayout) {
        int findFollowingBreak;
        SelectableInfo currentInfo = selectionLayout.getCurrentInfo();
        String inputText = currentInfo.getInputText();
        int rawStartHandleOffset = currentInfo.getRawStartHandleOffset();
        int length = inputText.length();
        if (rawStartHandleOffset == 0) {
            int findFollowingBreak2 = StringHelpers_androidKt.findFollowingBreak(inputText, 0);
            if (selectionLayout.isStartHandle()) {
                return Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findFollowingBreak2), null, true, 2, null);
            }
            return Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findFollowingBreak2), false, 1, null);
        } else if (rawStartHandleOffset == length) {
            int findPrecedingBreak = StringHelpers_androidKt.findPrecedingBreak(inputText, length);
            if (selectionLayout.isStartHandle()) {
                return Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findPrecedingBreak), null, false, 2, null);
            }
            return Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findPrecedingBreak), true, 1, null);
        } else {
            Selection previousSelection = selectionLayout.getPreviousSelection();
            boolean z = previousSelection != null && previousSelection.getHandlesCrossed();
            if (selectionLayout.isStartHandle() ^ z) {
                findFollowingBreak = StringHelpers_androidKt.findPrecedingBreak(inputText, rawStartHandleOffset);
            } else {
                findFollowingBreak = StringHelpers_androidKt.findFollowingBreak(inputText, rawStartHandleOffset);
            }
            if (selectionLayout.isStartHandle()) {
                return Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findFollowingBreak), null, z, 2, null);
            }
            return Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findFollowingBreak), z, 1, null);
        }
    }

    private static final Selection.AnchorInfo changeOffset(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i) {
        return Selection.AnchorInfo.copy$default(anchorInfo, selectableInfo.getTextLayoutResult().getBidiRunDirection(i), i, 0L, 4, null);
    }
}
