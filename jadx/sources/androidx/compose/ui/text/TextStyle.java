package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8627dsp;
import o.C8632dsu;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class TextStyle {
    public static final Companion Companion = new Companion(null);
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777215, (C8627dsp) null);
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, C8627dsp c8627dsp) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, i, i2, j5, textIndent, platformTextStyle, lineHeightStyle, i3, i4, textMotion);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, C8627dsp c8627dsp) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, C8627dsp c8627dsp) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent);
    }

    public final ParagraphStyle getParagraphStyle$ui_text_release() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final SpanStyle getSpanStyle$ui_text_release() {
        return this.spanStyle;
    }

    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.access$createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j3, (i & JSONzip.end) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : textAlign, (i & Privacy.DEFAULT) != 0 ? null : textDirection, (i & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j5, (i & 131072) != 0 ? null : textIndent, null);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, (C8627dsp) null), new ParagraphStyle(textAlign != null ? textAlign.m2416unboximpl() : TextAlign.Companion.m2423getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m2430unboximpl() : TextDirection.Companion.m2436getUnspecifieds_7Xco(), j5, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m2362getUnspecifiedrAG3T2k(), Hyphens.Companion.m2350getUnspecifiedvmbZdU8(), (TextMotion) null, (C8627dsp) null), null);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j3, (i & JSONzip.end) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : drawStyle, (i & Privacy.DEFAULT) != 0 ? null : textAlign, (i & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? null : textDirection, (i & 131072) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j5, (i & 262144) != 0 ? null : textIndent, (i & 524288) != 0 ? null : platformTextStyle, (i & 1048576) != 0 ? null : lineHeightStyle, (i & 2097152) != 0 ? null : lineBreak, (i & 4194304) != 0 ? null : hyphens, (i & 8388608) != 0 ? null : textMotion, (C8627dsp) null);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (C8627dsp) null), new ParagraphStyle(textAlign != null ? textAlign.m2416unboximpl() : TextAlign.Companion.m2423getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m2430unboximpl() : TextDirection.Companion.m2436getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m2360unboximpl() : LineBreak.Companion.m2362getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m2347unboximpl() : Hyphens.Companion.m2350getUnspecifiedvmbZdU8(), textMotion, (C8627dsp) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, C8627dsp c8627dsp) {
        this((i5 & 1) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j, (i5 & 2) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j2, (i5 & 4) != 0 ? null : fontWeight, (i5 & 8) != 0 ? null : fontStyle, (i5 & 16) != 0 ? null : fontSynthesis, (i5 & 32) != 0 ? null : fontFamily, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j3, (i5 & JSONzip.end) != 0 ? null : baselineShift, (i5 & 512) != 0 ? null : textGeometricTransform, (i5 & 1024) != 0 ? null : localeList, (i5 & 2048) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j4, (i5 & 4096) != 0 ? null : textDecoration, (i5 & 8192) != 0 ? null : shadow, (i5 & 16384) != 0 ? null : drawStyle, (i5 & Privacy.DEFAULT) != 0 ? TextAlign.Companion.m2423getUnspecifiede0LSkKk() : i, (i5 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? TextDirection.Companion.m2436getUnspecifieds_7Xco() : i2, (i5 & 131072) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j5, (i5 & 262144) != 0 ? null : textIndent, (i5 & 524288) != 0 ? null : platformTextStyle, (i5 & 1048576) != 0 ? null : lineHeightStyle, (i5 & 2097152) != 0 ? LineBreak.Companion.m2362getUnspecifiedrAG3T2k() : i3, (i5 & 4194304) != 0 ? Hyphens.Companion.m2350getUnspecifiedvmbZdU8() : i4, (i5 & 8388608) != 0 ? null : textMotion, (C8627dsp) null);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (C8627dsp) null), new ParagraphStyle(i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (C8627dsp) null), platformTextStyle);
    }

    public final TextStyle merge(TextStyle textStyle) {
        return (textStyle == null || C8632dsu.c(textStyle, Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    /* renamed from: merge-dA7vx0o  reason: not valid java name */
    public final TextStyle m2179mergedA7vx0o(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i3, int i4, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle m2136fastMergedSHsh3o = SpanStyleKt.m2136fastMergedSHsh3o(this.spanStyle, j, null, Float.NaN, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle m2099fastMergej5T8yCg = ParagraphStyleKt.m2099fastMergej5T8yCg(this.paragraphStyle, i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion);
        return (this.spanStyle == m2136fastMergedSHsh3o && this.paragraphStyle == m2099fastMergej5T8yCg) ? this : new TextStyle(m2136fastMergedSHsh3o, m2099fastMergej5T8yCg);
    }

    public final TextStyle merge(ParagraphStyle paragraphStyle) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(paragraphStyle));
    }

    /* renamed from: copy-p1EtxEg  reason: not valid java name */
    public final TextStyle m2166copyp1EtxEg(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        TextForegroundStyle m2438from8_81llA;
        if (Color.m1294equalsimpl0(j, this.spanStyle.m2131getColor0d7_KjU())) {
            m2438from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            m2438from8_81llA = TextForegroundStyle.Companion.m2438from8_81llA(j);
        }
        return new TextStyle(new SpanStyle(m2438from8_81llA, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (C8627dsp) null), new ParagraphStyle(i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (C8627dsp) null), platformTextStyle);
    }

    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m2169getColor0d7_KjU() {
        return this.spanStyle.m2131getColor0d7_KjU();
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* renamed from: getFontSize-XSAIIZE  reason: not valid java name */
    public final long m2170getFontSizeXSAIIZE() {
        return this.spanStyle.m2132getFontSizeXSAIIZE();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* renamed from: getFontStyle-4Lr2A7w  reason: not valid java name */
    public final FontStyle m2171getFontStyle4Lr2A7w() {
        return this.spanStyle.m2133getFontStyle4Lr2A7w();
    }

    /* renamed from: getFontSynthesis-ZQGJjVo  reason: not valid java name */
    public final FontSynthesis m2172getFontSynthesisZQGJjVo() {
        return this.spanStyle.m2134getFontSynthesisZQGJjVo();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getLetterSpacing-XSAIIZE  reason: not valid java name */
    public final long m2174getLetterSpacingXSAIIZE() {
        return this.spanStyle.m2135getLetterSpacingXSAIIZE();
    }

    /* renamed from: getBaselineShift-5SSeXJ0  reason: not valid java name */
    public final BaselineShift m2168getBaselineShift5SSeXJ0() {
        return this.spanStyle.m2130getBaselineShift5SSeXJ0();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m2167getBackground0d7_KjU() {
        return this.spanStyle.m2129getBackground0d7_KjU();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    /* renamed from: getTextAlign-e0LSkKk  reason: not valid java name */
    public final int m2177getTextAligne0LSkKk() {
        return this.paragraphStyle.m2097getTextAligne0LSkKk();
    }

    /* renamed from: getTextDirection-s_7X-co  reason: not valid java name */
    public final int m2178getTextDirections_7Xco() {
        return this.paragraphStyle.m2098getTextDirections_7Xco();
    }

    /* renamed from: getLineHeight-XSAIIZE  reason: not valid java name */
    public final long m2176getLineHeightXSAIIZE() {
        return this.paragraphStyle.m2096getLineHeightXSAIIZE();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    /* renamed from: getHyphens-vmbZdU8  reason: not valid java name */
    public final int m2173getHyphensvmbZdU8() {
        return this.paragraphStyle.m2094getHyphensvmbZdU8();
    }

    /* renamed from: getLineBreak-rAG3T2k  reason: not valid java name */
    public final int m2175getLineBreakrAG3T2k() {
        return this.paragraphStyle.m2095getLineBreakrAG3T2k();
    }

    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextStyle) {
            TextStyle textStyle = (TextStyle) obj;
            return C8632dsu.c(this.spanStyle, textStyle.spanStyle) && C8632dsu.c(this.paragraphStyle, textStyle.paragraphStyle) && C8632dsu.c(this.platformStyle, textStyle.platformStyle);
        }
        return false;
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle textStyle) {
        return this == textStyle || (C8632dsu.c(this.paragraphStyle, textStyle.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(textStyle.spanStyle));
    }

    public final boolean hasSameDrawAffectingAttributes(TextStyle textStyle) {
        return this == textStyle || this.spanStyle.hasSameNonLayoutAttributes$ui_text_release(textStyle.spanStyle);
    }

    public int hashCode() {
        int hashCode = this.spanStyle.hashCode();
        int hashCode2 = this.paragraphStyle.hashCode();
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return (((hashCode * 31) + hashCode2) * 31) + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m1301toStringimpl(m2169getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m2562toStringimpl(m2170getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m2171getFontStyle4Lr2A7w() + ", fontSynthesis=" + m2172getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m2562toStringimpl(m2174getLetterSpacingXSAIIZE())) + ", baselineShift=" + m2168getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m1301toStringimpl(m2167getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + ((Object) TextAlign.m2415toStringimpl(m2177getTextAligne0LSkKk())) + ", textDirection=" + ((Object) TextDirection.m2429toStringimpl(m2178getTextDirections_7Xco())) + ", lineHeight=" + ((Object) TextUnit.m2562toStringimpl(m2176getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + ((Object) LineBreak.m2359toStringimpl(m2175getLineBreakrAG3T2k())) + ", hyphens=" + ((Object) Hyphens.m2346toStringimpl(m2173getHyphensvmbZdU8())) + ", textMotion=" + getTextMotion() + ')';
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }
    }
}
