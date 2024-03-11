package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.dsT;

/* loaded from: classes.dex */
public final class MinLinesConstrainer {
    private static MinLinesConstrainer last;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final TextStyle inputTextStyle;
    private final LayoutDirection layoutDirection;
    private float lineHeightCache;
    private float oneLineHeightCache;
    private final TextStyle resolvedStyle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver, C8627dsp c8627dsp) {
        this(layoutDirection, textStyle, density, resolver);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    private MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
        this.lineHeightCache = Float.NaN;
        this.oneLineHeightCache = Float.NaN;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final MinLinesConstrainer from(MinLinesConstrainer minLinesConstrainer, LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.getLayoutDirection() && C8632dsu.c(textStyle, minLinesConstrainer.getInputTextStyle()) && density.getDensity() == minLinesConstrainer.getDensity().getDensity() && resolver == minLinesConstrainer.getFontFamilyResolver()) {
                return minLinesConstrainer;
            }
            MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.last;
            if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.getLayoutDirection() && C8632dsu.c(textStyle, minLinesConstrainer2.getInputTextStyle()) && density.getDensity() == minLinesConstrainer2.getDensity().getDensity() && resolver == minLinesConstrainer2.getFontFamilyResolver()) {
                return minLinesConstrainer2;
            }
            MinLinesConstrainer minLinesConstrainer3 = new MinLinesConstrainer(layoutDirection, TextStyleKt.resolveDefaults(textStyle, layoutDirection), density, resolver, null);
            Companion companion = MinLinesConstrainer.Companion;
            MinLinesConstrainer.last = minLinesConstrainer3;
            return minLinesConstrainer3;
        }
    }

    /* renamed from: coerceMinLines-Oh53vG4$foundation_release  reason: not valid java name */
    public final long m500coerceMinLinesOh53vG4$foundation_release(long j, int i) {
        String str;
        String str2;
        int m2474getMinHeightimpl;
        int e;
        int b;
        float f = this.oneLineHeightCache;
        float f2 = this.lineHeightCache;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            str = MinLinesConstrainerKt.EmptyTextReplacement;
            f = ParagraphKt.m2090ParagraphUdtVg6A$default(str, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, null, null, 1, false, 96, null).getHeight();
            str2 = MinLinesConstrainerKt.TwoLineTextReplacement;
            f2 = ParagraphKt.m2090ParagraphUdtVg6A$default(str2, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, null, null, 2, false, 96, null).getHeight() - f;
            this.oneLineHeightCache = f;
            this.lineHeightCache = f2;
        }
        if (i != 1) {
            e = dsT.e(f + (f2 * (i - 1)));
            b = C8657dts.b(e, 0);
            m2474getMinHeightimpl = C8657dts.i(b, Constraints.m2472getMaxHeightimpl(j));
        } else {
            m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
        }
        return ConstraintsKt.Constraints(Constraints.m2475getMinWidthimpl(j), Constraints.m2473getMaxWidthimpl(j), m2474getMinHeightimpl, Constraints.m2472getMaxHeightimpl(j));
    }
}
