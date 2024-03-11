package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M  reason: not valid java name */
    public static final boolean m477canReuse7_7YC6M(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (!textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() && C8632dsu.c(layoutInput.getText(), annotatedString) && layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) && C8632dsu.c(layoutInput.getPlaceholders(), list) && layoutInput.getMaxLines() == i && layoutInput.getSoftWrap() == z && TextOverflow.m2453equalsimpl0(layoutInput.m2139getOverflowgIe3tQ8(), i2) && C8632dsu.c(layoutInput.getDensity(), density) && layoutInput.getLayoutDirection() == layoutDirection && C8632dsu.c(layoutInput.getFontFamilyResolver(), resolver) && Constraints.m2475getMinWidthimpl(j) == Constraints.m2475getMinWidthimpl(layoutInput.m2138getConstraintsmsEJaDk())) {
            if (z || TextOverflow.m2453equalsimpl0(i2, TextOverflow.Companion.m2458getEllipsisgIe3tQ8())) {
                return Constraints.m2473getMaxWidthimpl(j) == Constraints.m2473getMaxWidthimpl(layoutInput.m2138getConstraintsmsEJaDk()) && Constraints.m2472getMaxHeightimpl(j) == Constraints.m2472getMaxHeightimpl(layoutInput.m2138getConstraintsmsEJaDk());
            }
            return true;
        }
        return false;
    }
}
