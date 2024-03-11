package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;

/* loaded from: classes.dex */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f) {
        return new TextIndent(SpanStyleKt.m2137lerpTextUnitInheritableC3pnCVY(textIndent.m2439getFirstLineXSAIIZE(), textIndent2.m2439getFirstLineXSAIIZE(), f), SpanStyleKt.m2137lerpTextUnitInheritableC3pnCVY(textIndent.m2440getRestLineXSAIIZE(), textIndent2.m2440getRestLineXSAIIZE(), f), null);
    }
}
