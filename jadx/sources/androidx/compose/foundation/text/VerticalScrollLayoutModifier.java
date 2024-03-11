package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;
import o.dsT;

/* loaded from: classes.dex */
final class VerticalScrollLayoutModifier implements LayoutModifier {
    private final int cursorOffset;
    private final TextFieldScrollerPosition scrollerPosition;
    private final drO<TextLayoutResultProxy> textLayoutResultProvider;
    private final TransformedText transformedText;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalScrollLayoutModifier) {
            VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
            return C8632dsu.c(this.scrollerPosition, verticalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == verticalScrollLayoutModifier.cursorOffset && C8632dsu.c(this.transformedText, verticalScrollLayoutModifier.transformedText) && C8632dsu.c(this.textLayoutResultProvider, verticalScrollLayoutModifier.textLayoutResultProvider);
        }
        return false;
    }

    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    public final TextFieldScrollerPosition getScrollerPosition() {
        return this.scrollerPosition;
    }

    public final drO<TextLayoutResultProxy> getTextLayoutResultProvider() {
        return this.textLayoutResultProvider;
    }

    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public int hashCode() {
        return (((((this.scrollerPosition.hashCode() * 31) + Integer.hashCode(this.cursorOffset)) * 31) + this.transformedText.hashCode()) * 31) + this.textLayoutResultProvider.hashCode();
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, drO<TextLayoutResultProxy> dro) {
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = dro;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo11measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int min = Math.min(mo1803measureBRTryo0.getHeight(), Constraints.m2472getMaxHeightimpl(j));
        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), min, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.text.VerticalScrollLayoutModifier$measure$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                int e;
                MeasureScope measureScope2 = MeasureScope.this;
                int cursorOffset = this.getCursorOffset();
                TransformedText transformedText = this.getTransformedText();
                TextLayoutResultProxy invoke = this.getTextLayoutResultProvider().invoke();
                this.getScrollerPosition().update(Orientation.Vertical, TextFieldScrollKt.access$getCursorRectInScroller(measureScope2, cursorOffset, transformedText, invoke != null ? invoke.getValue() : null, false, mo1803measureBRTryo0.getWidth()), min, mo1803measureBRTryo0.getHeight());
                Placeable placeable = mo1803measureBRTryo0;
                e = dsT.e(-this.getScrollerPosition().getOffset());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, e, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
