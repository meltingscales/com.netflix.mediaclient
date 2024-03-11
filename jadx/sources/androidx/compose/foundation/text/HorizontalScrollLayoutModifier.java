package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;
import o.dsT;

/* loaded from: classes.dex */
final class HorizontalScrollLayoutModifier implements LayoutModifier {
    private final int cursorOffset;
    private final TextFieldScrollerPosition scrollerPosition;
    private final drO<TextLayoutResultProxy> textLayoutResultProvider;
    private final TransformedText transformedText;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalScrollLayoutModifier) {
            HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
            return C8632dsu.c(this.scrollerPosition, horizontalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == horizontalScrollLayoutModifier.cursorOffset && C8632dsu.c(this.transformedText, horizontalScrollLayoutModifier.transformedText) && C8632dsu.c(this.textLayoutResultProvider, horizontalScrollLayoutModifier.textLayoutResultProvider);
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
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, drO<TextLayoutResultProxy> dro) {
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = dro;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo11measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(measurable.maxIntrinsicWidth(Constraints.m2472getMaxHeightimpl(j)) < Constraints.m2473getMaxWidthimpl(j) ? j : Constraints.m2464copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int min = Math.min(mo1803measureBRTryo0.getWidth(), Constraints.m2473getMaxWidthimpl(j));
        return MeasureScope.layout$default(measureScope, min, mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.text.HorizontalScrollLayoutModifier$measure$1
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
                this.getScrollerPosition().update(Orientation.Horizontal, TextFieldScrollKt.access$getCursorRectInScroller(measureScope2, cursorOffset, transformedText, invoke != null ? invoke.getValue() : null, MeasureScope.this.getLayoutDirection() == LayoutDirection.Rtl, mo1803measureBRTryo0.getWidth()), min, mo1803measureBRTryo0.getWidth());
                Placeable placeable = mo1803measureBRTryo0;
                e = dsT.e(-this.getScrollerPosition().getOffset());
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, e, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
