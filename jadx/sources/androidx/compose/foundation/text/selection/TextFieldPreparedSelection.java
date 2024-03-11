package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import o.C8566dqi;
import o.C8569dql;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    private final TextFieldValue currentValue;
    private final TextLayoutResultProxy layoutResultProxy;

    public TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState) {
        super(textFieldValue.getAnnotatedString(), textFieldValue.m2302getSelectiond9O1mEE(), textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, offsetMapping, textPreparedSelectionState, null);
        this.currentValue = textFieldValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }

    public final TextFieldValue getValue() {
        return TextFieldValue.m2297copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), m519getSelectiond9O1mEE(), (TextRange) null, 4, (Object) null);
    }

    public final List<EditCommand> deleteIfSelectedOr(drM<? super TextFieldPreparedSelection, ? extends EditCommand> drm) {
        List<EditCommand> j;
        List<EditCommand> e;
        if (TextRange.m2151getCollapsedimpl(m519getSelectiond9O1mEE())) {
            EditCommand invoke = drm.invoke(this);
            if (invoke != null) {
                e = C8566dqi.e(invoke);
                return e;
            }
            return null;
        }
        j = C8569dql.j(new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m2155getMinimpl(m519getSelectiond9O1mEE()), TextRange.m2155getMinimpl(m519getSelectiond9O1mEE())));
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy r6, int r7) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r6.getInnerTextFieldCoordinates()
            if (r0 == 0) goto L15
            androidx.compose.ui.layout.LayoutCoordinates r1 = r6.getDecorationBoxCoordinates()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1b:
            androidx.compose.ui.text.input.OffsetMapping r0 = r5.getOffsetMapping()
            androidx.compose.ui.text.input.TextFieldValue r1 = r5.currentValue
            long r3 = r1.m2302getSelectiond9O1mEE()
            int r1 = androidx.compose.ui.text.TextRange.m2152getEndimpl(r3)
            int r0 = r0.originalToTransformed(r1)
            androidx.compose.ui.text.TextLayoutResult r1 = r6.getValue()
            androidx.compose.ui.geometry.Rect r0 = r1.getCursorRect(r0)
            float r1 = r0.getLeft()
            float r0 = r0.getTop()
            long r2 = r2.m1157getSizeNHjbRc()
            float r2 = androidx.compose.ui.geometry.Size.m1174getHeightimpl(r2)
            float r7 = (float) r7
            androidx.compose.ui.text.input.OffsetMapping r3 = r5.getOffsetMapping()
            androidx.compose.ui.text.TextLayoutResult r6 = r6.getValue()
            float r2 = r2 * r7
            float r0 = r0 + r2
            long r0 = androidx.compose.ui.geometry.OffsetKt.Offset(r1, r0)
            int r6 = r6.m2142getOffsetForPositionk4lQ0M(r0)
            int r6 = r3.transformedToOriginal(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldPreparedSelection.jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy, int):int");
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, -1));
        }
        C8632dsu.d(this);
        return this;
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, 1));
        }
        C8632dsu.d(this);
        return this;
    }
}
