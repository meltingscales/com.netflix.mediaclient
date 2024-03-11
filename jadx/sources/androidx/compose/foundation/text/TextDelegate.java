package androidx.compose.foundation.text;

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
import o.C8627dsp;
import o.C8657dts;

/* loaded from: classes.dex */
public final class TextDelegate {
    public static final Companion Companion = new Companion(null);
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density, FontFamily.Resolver resolver, List list, C8627dsp c8627dsp) {
        this(annotatedString, textStyle, i, i2, z, i3, density, resolver, list);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinLines() {
        return this.minLines;
    }

    /* renamed from: getOverflow-gIe3tQ8  reason: not valid java name */
    public final int m447getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i;
        this.minLines = i2;
        this.softWrap = z;
        this.overflow = i3;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        if (i <= 0) {
            throw new IllegalArgumentException("no maxLines".toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("no minLines".toString());
        }
        if (i2 > i) {
            throw new IllegalArgumentException("minLines greater than maxLines".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TextDelegate(androidx.compose.ui.text.AnnotatedString r14, androidx.compose.ui.text.TextStyle r15, int r16, int r17, boolean r18, int r19, androidx.compose.ui.unit.Density r20, androidx.compose.ui.text.font.FontFamily.Resolver r21, java.util.List r22, int r23, o.C8627dsp r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            if (r1 == 0) goto Lb
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = r1
            goto Ld
        Lb:
            r5 = r16
        Ld:
            r1 = r0 & 8
            r2 = 1
            if (r1 == 0) goto L14
            r6 = r2
            goto L16
        L14:
            r6 = r17
        L16:
            r1 = r0 & 16
            if (r1 == 0) goto L1c
            r7 = r2
            goto L1e
        L1c:
            r7 = r18
        L1e:
            r1 = r0 & 32
            if (r1 == 0) goto L2a
            androidx.compose.ui.text.style.TextOverflow$Companion r1 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r1 = r1.m2457getClipgIe3tQ8()
            r8 = r1
            goto L2c
        L2a:
            r8 = r19
        L2c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L36
            java.util.List r0 = o.C8570dqm.c()
            r11 = r0
            goto L38
        L36:
            r11 = r22
        L38:
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextDelegate.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, int, int, boolean, int, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, java.util.List, int, o.dsp):void");
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final void layoutIntrinsics(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    /* renamed from: layoutText-K40F9xA  reason: not valid java name */
    private final MultiParagraph m446layoutTextK40F9xA(long j, LayoutDirection layoutDirection) {
        layoutIntrinsics(layoutDirection);
        int m2475getMinWidthimpl = Constraints.m2475getMinWidthimpl(j);
        int m2473getMaxWidthimpl = ((this.softWrap || TextOverflow.m2453equalsimpl0(this.overflow, TextOverflow.Companion.m2458getEllipsisgIe3tQ8())) && Constraints.m2469getHasBoundedWidthimpl(j)) ? Constraints.m2473getMaxWidthimpl(j) : Integer.MAX_VALUE;
        int i = (this.softWrap || !TextOverflow.m2453equalsimpl0(this.overflow, TextOverflow.Companion.m2458getEllipsisgIe3tQ8())) ? this.maxLines : 1;
        if (m2475getMinWidthimpl != m2473getMaxWidthimpl) {
            m2473getMaxWidthimpl = C8657dts.c(getMaxIntrinsicWidth(), m2475getMinWidthimpl, m2473getMaxWidthimpl);
        }
        return new MultiParagraph(getNonNullIntrinsics(), ConstraintsKt.Constraints$default(0, m2473getMaxWidthimpl, 0, Constraints.m2472getMaxHeightimpl(j), 5, null), i, TextOverflow.m2453equalsimpl0(this.overflow, TextOverflow.Companion.m2458getEllipsisgIe3tQ8()), null);
    }

    /* renamed from: layout-NN6Ew-U  reason: not valid java name */
    public final TextLayoutResult m448layoutNN6EwU(long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
        if (textLayoutResult != null && TextLayoutHelperKt.m477canReuse7_7YC6M(textLayoutResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j)) {
            return textLayoutResult.m2141copyO0kMr_c(new TextLayoutInput(textLayoutResult.getLayoutInput().getText(), this.style, textLayoutResult.getLayoutInput().getPlaceholders(), textLayoutResult.getLayoutInput().getMaxLines(), textLayoutResult.getLayoutInput().getSoftWrap(), textLayoutResult.getLayoutInput().m2139getOverflowgIe3tQ8(), textLayoutResult.getLayoutInput().getDensity(), textLayoutResult.getLayoutInput().getLayoutDirection(), textLayoutResult.getLayoutInput().getFontFamilyResolver(), j, (C8627dsp) null), ConstraintsKt.m2483constrain4WqzIAM(j, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getWidth()), TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        MultiParagraph m446layoutTextK40F9xA = m446layoutTextK40F9xA(j, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j, (C8627dsp) null), m446layoutTextK40F9xA, ConstraintsKt.m2483constrain4WqzIAM(j, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(m446layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(m446layoutTextK40F9xA.getHeight()))), null);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
