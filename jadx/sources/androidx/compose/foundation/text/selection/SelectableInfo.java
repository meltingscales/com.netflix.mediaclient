package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* loaded from: classes.dex */
public final class SelectableInfo {
    public static final int $stable = TextLayoutResult.$stable;
    private final int rawEndHandleOffset;
    private final int rawPreviousHandleOffset;
    private final int rawStartHandleOffset;
    private final long selectableId;
    private final int slot;
    private final TextLayoutResult textLayoutResult;

    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    public final long getSelectableId() {
        return this.selectableId;
    }

    public final int getSlot() {
        return this.slot;
    }

    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public SelectableInfo(long j, int i, int i2, int i3, int i4, TextLayoutResult textLayoutResult) {
        this.selectableId = j;
        this.slot = i;
        this.rawStartHandleOffset = i2;
        this.rawEndHandleOffset = i3;
        this.rawPreviousHandleOffset = i4;
        this.textLayoutResult = textLayoutResult;
    }

    public final String getInputText() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    public final int getTextLength() {
        return getInputText().length();
    }

    public final CrossStatus getRawCrossStatus() {
        int i = this.rawStartHandleOffset;
        int i2 = this.rawEndHandleOffset;
        if (i < i2) {
            return CrossStatus.NOT_CROSSED;
        }
        if (i > i2) {
            return CrossStatus.CROSSED;
        }
        return CrossStatus.COLLAPSED;
    }

    private final ResolvedTextDirection getStartRunDirection() {
        ResolvedTextDirection textDirectionForOffset;
        textDirectionForOffset = SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, this.rawStartHandleOffset);
        return textDirectionForOffset;
    }

    private final ResolvedTextDirection getEndRunDirection() {
        ResolvedTextDirection textDirectionForOffset;
        textDirectionForOffset = SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, this.rawEndHandleOffset);
        return textDirectionForOffset;
    }

    public final boolean shouldRecomputeSelection(SelectableInfo selectableInfo) {
        return (this.selectableId == selectableInfo.selectableId && this.rawStartHandleOffset == selectableInfo.rawStartHandleOffset && this.rawEndHandleOffset == selectableInfo.rawEndHandleOffset) ? false : true;
    }

    public final Selection.AnchorInfo anchorForOffset(int i) {
        ResolvedTextDirection textDirectionForOffset;
        textDirectionForOffset = SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, i);
        return new Selection.AnchorInfo(textDirectionForOffset, i, this.selectableId);
    }

    public String toString() {
        return "SelectionInfo(id=" + this.selectableId + ", range=(" + this.rawStartHandleOffset + '-' + getStartRunDirection() + ',' + this.rawEndHandleOffset + '-' + getEndRunDirection() + "), prevOffset=" + this.rawPreviousHandleOffset + ')';
    }
}
