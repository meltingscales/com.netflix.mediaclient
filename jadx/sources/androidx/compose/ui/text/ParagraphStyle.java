package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ParagraphStyle {
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    public /* synthetic */ ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, C8627dsp c8627dsp) {
        this(i, i2, j, textIndent, platformParagraphStyle, lineHeightStyle, i3, i4, textMotion);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, C8627dsp c8627dsp) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    /* renamed from: getHyphens-vmbZdU8  reason: not valid java name */
    public final int m2094getHyphensvmbZdU8() {
        return this.hyphens;
    }

    /* renamed from: getLineBreak-rAG3T2k  reason: not valid java name */
    public final int m2095getLineBreakrAG3T2k() {
        return this.lineBreak;
    }

    /* renamed from: getLineHeight-XSAIIZE  reason: not valid java name */
    public final long m2096getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: getTextAlign-e0LSkKk  reason: not valid java name */
    public final int m2097getTextAligne0LSkKk() {
        return this.textAlign;
    }

    /* renamed from: getTextDirection-s_7X-co  reason: not valid java name */
    public final int m2098getTextDirections_7Xco() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    private ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this.textAlign = i;
        this.textDirection = i2;
        this.lineHeight = j;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i3;
        this.hyphens = i4;
        this.textMotion = textMotion;
        if (TextUnit.m2557equalsimpl0(j, TextUnit.Companion.m2564getUnspecifiedXSAIIZE()) || TextUnit.m2560getValueimpl(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m2560getValueimpl(j) + ')').toString());
    }

    public /* synthetic */ ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, C8627dsp c8627dsp) {
        this((i5 & 1) != 0 ? TextAlign.Companion.m2423getUnspecifiede0LSkKk() : i, (i5 & 2) != 0 ? TextDirection.Companion.m2436getUnspecifieds_7Xco() : i2, (i5 & 4) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j, (i5 & 8) != 0 ? null : textIndent, (i5 & 16) != 0 ? null : platformParagraphStyle, (i5 & 32) != 0 ? null : lineHeightStyle, (i5 & 64) != 0 ? LineBreak.Companion.m2362getUnspecifiedrAG3T2k() : i3, (i5 & 128) != 0 ? Hyphens.Companion.m2350getUnspecifiedvmbZdU8() : i4, (i5 & JSONzip.end) == 0 ? textMotion : null, (C8627dsp) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, (i & 64) != 0 ? null : lineBreak, (i & 128) != 0 ? null : hyphens, (i & JSONzip.end) == 0 ? textMotion : null, (C8627dsp) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(textAlign != null ? textAlign.m2416unboximpl() : TextAlign.Companion.m2423getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m2430unboximpl() : TextDirection.Companion.m2436getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m2360unboximpl() : LineBreak.Companion.m2362getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m2347unboximpl() : Hyphens.Companion.m2350getUnspecifiedvmbZdU8(), textMotion, (C8627dsp) null);
    }

    public final ParagraphStyle merge(ParagraphStyle paragraphStyle) {
        return paragraphStyle == null ? this : ParagraphStyleKt.m2099fastMergej5T8yCg(this, paragraphStyle.textAlign, paragraphStyle.textDirection, paragraphStyle.lineHeight, paragraphStyle.textIndent, paragraphStyle.platformStyle, paragraphStyle.lineHeightStyle, paragraphStyle.lineBreak, paragraphStyle.hyphens, paragraphStyle.textMotion);
    }

    /* renamed from: copy-ykzQM6k  reason: not valid java name */
    public final ParagraphStyle m2093copyykzQM6k(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        return new ParagraphStyle(i, i2, j, textIndent, platformParagraphStyle, lineHeightStyle, i3, i4, textMotion, (C8627dsp) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParagraphStyle) {
            ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
            return TextAlign.m2413equalsimpl0(this.textAlign, paragraphStyle.textAlign) && TextDirection.m2427equalsimpl0(this.textDirection, paragraphStyle.textDirection) && TextUnit.m2557equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && C8632dsu.c(this.textIndent, paragraphStyle.textIndent) && C8632dsu.c(this.platformStyle, paragraphStyle.platformStyle) && C8632dsu.c(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && LineBreak.m2354equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && Hyphens.m2344equalsimpl0(this.hyphens, paragraphStyle.hyphens) && C8632dsu.c(this.textMotion, paragraphStyle.textMotion);
        }
        return false;
    }

    public int hashCode() {
        int m2414hashCodeimpl = TextAlign.m2414hashCodeimpl(this.textAlign);
        int m2428hashCodeimpl = TextDirection.m2428hashCodeimpl(this.textDirection);
        int m2561hashCodeimpl = TextUnit.m2561hashCodeimpl(this.lineHeight);
        TextIndent textIndent = this.textIndent;
        int hashCode = textIndent != null ? textIndent.hashCode() : 0;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int hashCode2 = platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int hashCode3 = lineHeightStyle != null ? lineHeightStyle.hashCode() : 0;
        int m2358hashCodeimpl = LineBreak.m2358hashCodeimpl(this.lineBreak);
        int m2345hashCodeimpl = Hyphens.m2345hashCodeimpl(this.hyphens);
        TextMotion textMotion = this.textMotion;
        return (((((((((((((((m2414hashCodeimpl * 31) + m2428hashCodeimpl) * 31) + m2561hashCodeimpl) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + m2358hashCodeimpl) * 31) + m2345hashCodeimpl) * 31) + (textMotion != null ? textMotion.hashCode() : 0);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m2415toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m2429toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m2562toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m2359toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m2346toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }
}
