package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntSize;
import o.C8657dts;
import o.drO;

/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegate implements Selectable {
    private int _previousLastVisibleOffset = -1;
    private TextLayoutResult _previousTextLayoutResult;
    private final drO<LayoutCoordinates> coordinatesCallback;
    private final drO<TextLayoutResult> layoutResultCallback;
    private final long selectableId;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j, drO<? extends LayoutCoordinates> dro, drO<TextLayoutResult> dro2) {
        this.selectableId = j;
        this.coordinatesCallback = dro;
        this.layoutResultCallback = dro2;
    }

    private final int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int i;
        int lineCount;
        int i2;
        synchronized (this) {
            if (this._previousTextLayoutResult != textLayoutResult) {
                if (textLayoutResult.getDidOverflowHeight() && !textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                    i2 = C8657dts.i(textLayoutResult.getLineForVerticalPosition(IntSize.m2546getHeightimpl(textLayoutResult.m2143getSizeYbymL2g())), textLayoutResult.getLineCount() - 1);
                    while (i2 >= 0 && textLayoutResult.getLineTop(i2) >= IntSize.m2546getHeightimpl(textLayoutResult.m2143getSizeYbymL2g())) {
                        i2--;
                    }
                    lineCount = C8657dts.b(i2, 0);
                    this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                    this._previousTextLayoutResult = textLayoutResult;
                }
                lineCount = textLayoutResult.getLineCount() - 1;
                this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                this._previousTextLayoutResult = textLayoutResult;
            }
            i = this._previousLastVisibleOffset;
        }
        return i;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return 0;
        }
        return getLastVisibleOffset(invoke);
    }
}
