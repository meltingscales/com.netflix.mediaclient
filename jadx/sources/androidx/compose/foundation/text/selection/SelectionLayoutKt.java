package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.Ref;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class SelectionLayoutKt {
    /* renamed from: getTextFieldSelectionLayout-RcvT-LA  reason: not valid java name */
    public static final SelectionLayout m525getTextFieldSelectionLayoutRcvTLA(TextLayoutResult textLayoutResult, int i, int i2, int i3, long j, boolean z, boolean z2) {
        return new SingleSelectionLayout(z2, 1, 1, z ? null : new Selection(new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, TextRange.m2157getStartimpl(j)), TextRange.m2157getStartimpl(j), 1L), new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, TextRange.m2152getEndimpl(j)), TextRange.m2152getEndimpl(j), 1L), TextRange.m2156getReversedimpl(j)), new SelectableInfo(1L, 1, i, i2, i3, textLayoutResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvedTextDirection getTextDirectionForOffset(TextLayoutResult textLayoutResult, int i) {
        return isOffsetAnEmptyLine(textLayoutResult, i) ? textLayoutResult.getParagraphDirection(i) : textLayoutResult.getBidiRunDirection(i);
    }

    private static final boolean isOffsetAnEmptyLine(TextLayoutResult textLayoutResult, int i) {
        if (textLayoutResult.getLayoutInput().getText().length() == 0) {
            return true;
        }
        int lineForOffset = textLayoutResult.getLineForOffset(i);
        return (i == 0 || lineForOffset != textLayoutResult.getLineForOffset(i + (-1))) && (i == textLayoutResult.getLayoutInput().getText().length() || lineForOffset != textLayoutResult.getLineForOffset(i + 1));
    }

    public static final boolean isCollapsed(Selection selection, SelectionLayout selectionLayout) {
        if (selection == null || selectionLayout == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getStart().getOffset() == selection.getEnd().getOffset();
        }
        if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
            return false;
        }
        if (selectionLayout.getFirstInfo().getTextLength() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.a = true;
        selectionLayout.forEachMiddleInfo(new drM<SelectableInfo, dpR>() { // from class: androidx.compose.foundation.text.selection.SelectionLayoutKt$isCollapsed$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(SelectableInfo selectableInfo) {
                invoke2(selectableInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(SelectableInfo selectableInfo) {
                if (selectableInfo.getInputText().length() > 0) {
                    Ref.BooleanRef.this.a = false;
                }
            }
        });
        return booleanRef.a;
    }
}
