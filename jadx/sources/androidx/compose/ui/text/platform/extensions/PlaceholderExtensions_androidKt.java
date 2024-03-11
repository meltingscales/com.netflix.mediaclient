package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaceholderExtensions_androidKt {
    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i, int i2, Density density) {
        for (Object obj : spannable.getSpans(i, i2, EmojiSpan.class)) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m2560getValueimpl(placeholder.m2102getWidthXSAIIZE()), m2316getSpanUnitR2X_6o(placeholder.m2102getWidthXSAIIZE()), TextUnit.m2560getValueimpl(placeholder.m2100getHeightXSAIIZE()), m2316getSpanUnitR2X_6o(placeholder.m2100getHeightXSAIIZE()), density.getFontScale() * density.getDensity(), m2317getSpanVerticalAligndo9XGg(placeholder.m2101getPlaceholderVerticalAlignJ6kI3mc())), i, i2);
    }

    /* renamed from: getSpanUnit--R2X_6o  reason: not valid java name */
    private static final int m2316getSpanUnitR2X_6o(long j) {
        long m2559getTypeUIouoOA = TextUnit.m2559getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2578getSpUIouoOA())) {
            return 0;
        }
        return TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2577getEmUIouoOA()) ? 1 : 2;
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg  reason: not valid java name */
    private static final int m2317getSpanVerticalAligndo9XGg(int i) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.Companion;
        if (PlaceholderVerticalAlign.m2105equalsimpl0(i, companion.m2109getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m2105equalsimpl0(i, companion.m2115getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m2105equalsimpl0(i, companion.m2110getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m2105equalsimpl0(i, companion.m2111getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m2105equalsimpl0(i, companion.m2114getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m2105equalsimpl0(i, companion.m2112getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m2105equalsimpl0(i, companion.m2113getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    public static final void setPlaceholders(Spannable spannable, List<AnnotatedString.Range<Placeholder>> list, Density density) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<Placeholder> range = list.get(i);
            setPlaceholder(spannable, range.component1(), range.component2(), range.component3(), density);
        }
    }
}
