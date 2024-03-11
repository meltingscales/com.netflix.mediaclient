package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes.dex */
public final class ParagraphLayoutCache {
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private boolean didOverflow;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private Paragraph paragraph;
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;
    private TextStyle style;
    private String text;

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, C8627dsp c8627dsp) {
        this(str, textStyle, resolver, i, z, i2, i3);
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final boolean getDidOverflow$foundation_release() {
        return this.didOverflow;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation_release  reason: not valid java name */
    public final long m508getLayoutSizeYbymL2g$foundation_release() {
        return this.layoutSize;
    }

    public final Paragraph getParagraph$foundation_release() {
        return this.paragraph;
    }

    private ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.lastDensity = InlineDensity.Companion.m496getUnspecifiedL26CHvs();
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.prevConstraints = Constraints.Companion.m2480fixedJhjzzOo(0, 0);
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

    public final dpR getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return dpR.c;
    }

    /* renamed from: layoutWithConstraints-K40F9xA  reason: not valid java name */
    public final boolean m509layoutWithConstraintsK40F9xA(long j, LayoutDirection layoutDirection) {
        long m2483constrain4WqzIAM;
        long m2483constrain4WqzIAM2;
        boolean z = true;
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
        boolean z2 = false;
        if (!m507newLayoutWillBeDifferentK40F9xA(j, layoutDirection)) {
            if (!Constraints.m2466equalsimpl0(j, this.prevConstraints)) {
                Paragraph paragraph = this.paragraph;
                C8632dsu.d(paragraph);
                this.layoutSize = ConstraintsKt.m2483constrain4WqzIAM(j, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())), TextDelegateKt.ceilToIntPx(paragraph.getHeight())));
                if (TextOverflow.m2453equalsimpl0(this.overflow, TextOverflow.Companion.m2459getVisiblegIe3tQ8()) || (IntSize.m2547getWidthimpl(m2483constrain4WqzIAM2) >= paragraph.getWidth() && IntSize.m2546getHeightimpl(m2483constrain4WqzIAM2) >= paragraph.getHeight())) {
                    z = false;
                }
                this.didOverflow = z;
                this.prevConstraints = j;
            }
            return false;
        }
        Paragraph m506layoutTextK40F9xA = m506layoutTextK40F9xA(j, layoutDirection);
        this.prevConstraints = j;
        this.layoutSize = ConstraintsKt.m2483constrain4WqzIAM(j, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(m506layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(m506layoutTextK40F9xA.getHeight())));
        if (!TextOverflow.m2453equalsimpl0(this.overflow, TextOverflow.Companion.m2459getVisiblegIe3tQ8()) && (IntSize.m2547getWidthimpl(m2483constrain4WqzIAM) < m506layoutTextK40F9xA.getWidth() || IntSize.m2546getHeightimpl(m2483constrain4WqzIAM) < m506layoutTextK40F9xA.getHeight())) {
            z2 = true;
        }
        this.didOverflow = z2;
        this.paragraph = m506layoutTextK40F9xA;
        return true;
    }

    public final int intrinsicHeight(int i, LayoutDirection layoutDirection) {
        int i2 = this.cachedIntrinsicHeightInputWidth;
        int i3 = this.cachedIntrinsicHeight;
        if (i != i2 || i2 == -1) {
            int ceilToIntPx = TextDelegateKt.ceilToIntPx(m506layoutTextK40F9xA(ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
            this.cachedIntrinsicHeightInputWidth = i;
            this.cachedIntrinsicHeight = ceilToIntPx;
            return ceilToIntPx;
        }
        return i3;
    }

    /* renamed from: update-L6sJoHM  reason: not valid java name */
    public final void m510updateL6sJoHM(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        markDirty();
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || paragraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            C8632dsu.d(density);
            paragraphIntrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, resolveDefaults, null, null, density, this.fontFamilyResolver, 12, null);
        }
        this.paragraphIntrinsics = paragraphIntrinsics;
        return paragraphIntrinsics;
    }

    /* renamed from: layoutText-K40F9xA  reason: not valid java name */
    private final Paragraph m506layoutTextK40F9xA(long j, LayoutDirection layoutDirection) {
        ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return ParagraphKt.m2091Paragraph_EkL_Y(layoutDirection2, LayoutUtilsKt.m497finalConstraintstfFHcEY(j, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m498finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), TextOverflow.m2453equalsimpl0(this.overflow, TextOverflow.Companion.m2458getEllipsisgIe3tQ8()));
    }

    /* renamed from: newLayoutWillBeDifferent-K40F9xA  reason: not valid java name */
    private final boolean m507newLayoutWillBeDifferentK40F9xA(long j, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.m2466equalsimpl0(j, this.prevConstraints)) {
            return false;
        }
        return Constraints.m2473getMaxWidthimpl(j) != Constraints.m2473getMaxWidthimpl(this.prevConstraints) || ((float) Constraints.m2472getMaxHeightimpl(j)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.Companion.m2480fixedJhjzzOo(0, 0);
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.didOverflow = false;
    }

    public final TextLayoutResult slowCreateTextLayoutResultOrNull(TextStyle textStyle) {
        Density density;
        List i;
        List i2;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, null, 6, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long m2464copyZbe2FdA$default = Constraints.m2464copyZbe2FdA$default(this.prevConstraints, 0, 0, 0, 0, 10, null);
        i = C8569dql.i();
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, i, this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, m2464copyZbe2FdA$default, (C8627dsp) null);
        i2 = C8569dql.i();
        return new TextLayoutResult(textLayoutInput, new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, textStyle, i2, density, this.fontFamilyResolver), m2464copyZbe2FdA$default, this.maxLines, TextOverflow.m2453equalsimpl0(this.overflow, TextOverflow.Companion.m2458getEllipsisgIe3tQ8()), null), this.layoutSize, null);
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }
}
