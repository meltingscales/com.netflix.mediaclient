package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class MultiParagraphLayoutCache {
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private TextLayoutResult layoutCache;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, List list, C8627dsp c8627dsp) {
        this(annotatedString, textStyle, resolver, i, z, i2, i3, list);
    }

    private final void markDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final TextLayoutResult getLayoutOrNull() {
        return this.layoutCache;
    }

    private MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.lastDensity = InlineDensity.Companion.m496getUnspecifiedL26CHvs();
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public final void setDensity$foundation_release(Density density) {
        Density density2 = this.density;
        long m488constructorimpl = density != null ? InlineDensity.m488constructorimpl(density) : InlineDensity.Companion.m496getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = m488constructorimpl;
        } else if (density == null || !InlineDensity.m490equalsimpl0(this.lastDensity, m488constructorimpl)) {
            this.density = density;
            this.lastDensity = m488constructorimpl;
            markDirty();
        }
    }

    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    /* renamed from: layoutWithConstraints-K40F9xA  reason: not valid java name */
    public final boolean m504layoutWithConstraintsK40F9xA(long j, LayoutDirection layoutDirection) {
        if (this.minLines > 1) {
            MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
            MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
            TextStyle textStyle = this.style;
            Density density = this.density;
            C8632dsu.d(density);
            MinLinesConstrainer from = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
            this.mMinLinesConstrainer = from;
            j = from.m500coerceMinLinesOh53vG4$foundation_release(j, this.minLines);
        }
        if (!m502newLayoutWillBeDifferentVKLhPVY(this.layoutCache, j, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.layoutCache;
            C8632dsu.d(textLayoutResult);
            if (Constraints.m2466equalsimpl0(j, textLayoutResult.getLayoutInput().m2138getConstraintsmsEJaDk())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.layoutCache;
            C8632dsu.d(textLayoutResult2);
            this.layoutCache = m503textLayoutResultVKLhPVY(layoutDirection, j, textLayoutResult2.getMultiParagraph());
            return true;
        }
        this.layoutCache = m503textLayoutResultVKLhPVY(layoutDirection, j, m501layoutTextK40F9xA(j, layoutDirection));
        return true;
    }

    /* renamed from: textLayoutResult-VKLhPVY  reason: not valid java name */
    private final TextLayoutResult m503textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long j, MultiParagraph multiParagraph) {
        float min = Math.min(multiParagraph.getIntrinsics().getMaxIntrinsicWidth(), multiParagraph.getWidth());
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        if (list == null) {
            list = C8569dql.i();
        }
        int i = this.maxLines;
        boolean z = this.softWrap;
        int i2 = this.overflow;
        Density density = this.density;
        C8632dsu.d(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, this.fontFamilyResolver, j, (C8627dsp) null), multiParagraph, ConstraintsKt.m2483constrain4WqzIAM(j, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(min), TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()))), null);
    }

    public final int intrinsicHeight(int i, LayoutDirection layoutDirection) {
        int i2 = this.cachedIntrinsicHeightInputWidth;
        int i3 = this.cachedIntrinsicHeight;
        if (i != i2 || i2 == -1) {
            int ceilToIntPx = TextDelegateKt.ceilToIntPx(m501layoutTextK40F9xA(ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
            this.cachedIntrinsicHeightInputWidth = i;
            this.cachedIntrinsicHeight = ceilToIntPx;
            return ceilToIntPx;
        }
        return i3;
    }

    /* renamed from: update-ZNqEYIc  reason: not valid java name */
    public final void m505updateZNqEYIc(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        markDirty();
    }

    private final MultiParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            C8632dsu.d(density);
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
            if (list == null) {
                list = C8569dql.i();
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, resolveDefaults, list, density, resolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    /* renamed from: layoutText-K40F9xA  reason: not valid java name */
    private final MultiParagraph m501layoutTextK40F9xA(long j, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return new MultiParagraph(layoutDirection2, LayoutUtilsKt.m497finalConstraintstfFHcEY(j, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m498finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), TextOverflow.m2453equalsimpl0(this.overflow, TextOverflow.Companion.m2458getEllipsisgIe3tQ8()), null);
    }

    /* renamed from: newLayoutWillBeDifferent-VKLhPVY  reason: not valid java name */
    private final boolean m502newLayoutWillBeDifferentVKLhPVY(TextLayoutResult textLayoutResult, long j, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (Constraints.m2466equalsimpl0(j, textLayoutResult.getLayoutInput().m2138getConstraintsmsEJaDk())) {
            return false;
        }
        return Constraints.m2473getMaxWidthimpl(j) != Constraints.m2473getMaxWidthimpl(textLayoutResult.getLayoutInput().m2138getConstraintsmsEJaDk()) || ((float) Constraints.m2472getMaxHeightimpl(j)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }
}
