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
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8627dsp;
import o.C8632dsu;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class SpanStyle {
    private final long background;
    private final BaselineShift baselineShift;
    private final DrawStyle drawStyle;
    private final FontFamily fontFamily;
    private final String fontFeatureSettings;
    private final long fontSize;
    private final FontStyle fontStyle;
    private final FontSynthesis fontSynthesis;
    private final FontWeight fontWeight;
    private final long letterSpacing;
    private final LocaleList localeList;
    private final PlatformSpanStyle platformStyle;
    private final Shadow shadow;
    private final TextDecoration textDecoration;
    private final TextForegroundStyle textForegroundStyle;
    private final TextGeometricTransform textGeometricTransform;

    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, C8627dsp c8627dsp) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, C8627dsp c8627dsp) {
        this(textForegroundStyle, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m2129getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBaselineShift-5SSeXJ0  reason: not valid java name */
    public final BaselineShift m2130getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE  reason: not valid java name */
    public final long m2132getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    /* renamed from: getFontStyle-4Lr2A7w  reason: not valid java name */
    public final FontStyle m2133getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-ZQGJjVo  reason: not valid java name */
    public final FontSynthesis m2134getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE  reason: not valid java name */
    public final long m2135getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final TextForegroundStyle getTextForegroundStyle$ui_text_release() {
        return this.textForegroundStyle;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j2;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j3;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? TextUnit.Companion.m2564getUnspecifiedXSAIIZE() : j3, (i & JSONzip.end) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.Companion.m1309getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : platformSpanStyle, (i & Privacy.DEFAULT) != 0 ? null : drawStyle, (C8627dsp) null);
    }

    private SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.m2438from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (C8627dsp) null);
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m2131getColor0d7_KjU() {
        return this.textForegroundStyle.mo2340getColor0d7_KjU();
    }

    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    public final SpanStyle merge(SpanStyle spanStyle) {
        return spanStyle == null ? this : SpanStyleKt.m2136fastMergedSHsh3o(this, spanStyle.textForegroundStyle.mo2340getColor0d7_KjU(), spanStyle.textForegroundStyle.getBrush(), spanStyle.textForegroundStyle.getAlpha(), spanStyle.fontSize, spanStyle.fontWeight, spanStyle.fontStyle, spanStyle.fontSynthesis, spanStyle.fontFamily, spanStyle.fontFeatureSettings, spanStyle.letterSpacing, spanStyle.baselineShift, spanStyle.textGeometricTransform, spanStyle.localeList, spanStyle.background, spanStyle.textDecoration, spanStyle.shadow, spanStyle.platformStyle, spanStyle.drawStyle);
    }

    /* renamed from: copy-GSF8kmg  reason: not valid java name */
    public final SpanStyle m2128copyGSF8kmg(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        return new SpanStyle(Color.m1294equalsimpl0(j, m2131getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.Companion.m2438from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (C8627dsp) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SpanStyle) {
            SpanStyle spanStyle = (SpanStyle) obj;
            return hasSameLayoutAffectingAttributes$ui_text_release(spanStyle) && hasSameNonLayoutAttributes$ui_text_release(spanStyle);
        }
        return false;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        return TextUnit.m2557equalsimpl0(this.fontSize, spanStyle.fontSize) && C8632dsu.c(this.fontWeight, spanStyle.fontWeight) && C8632dsu.c(this.fontStyle, spanStyle.fontStyle) && C8632dsu.c(this.fontSynthesis, spanStyle.fontSynthesis) && C8632dsu.c(this.fontFamily, spanStyle.fontFamily) && C8632dsu.c((Object) this.fontFeatureSettings, (Object) spanStyle.fontFeatureSettings) && TextUnit.m2557equalsimpl0(this.letterSpacing, spanStyle.letterSpacing) && C8632dsu.c(this.baselineShift, spanStyle.baselineShift) && C8632dsu.c(this.textGeometricTransform, spanStyle.textGeometricTransform) && C8632dsu.c(this.localeList, spanStyle.localeList) && Color.m1294equalsimpl0(this.background, spanStyle.background) && C8632dsu.c(this.platformStyle, spanStyle.platformStyle);
    }

    public final boolean hasSameNonLayoutAttributes$ui_text_release(SpanStyle spanStyle) {
        return C8632dsu.c(this.textForegroundStyle, spanStyle.textForegroundStyle) && C8632dsu.c(this.textDecoration, spanStyle.textDecoration) && C8632dsu.c(this.shadow, spanStyle.shadow) && C8632dsu.c(this.drawStyle, spanStyle.drawStyle);
    }

    public int hashCode() {
        int i;
        int i2;
        int m1300hashCodeimpl = Color.m1300hashCodeimpl(m2131getColor0d7_KjU());
        Brush brush = getBrush();
        int hashCode = brush != null ? brush.hashCode() : 0;
        int hashCode2 = Float.hashCode(getAlpha());
        int m2561hashCodeimpl = TextUnit.m2561hashCodeimpl(this.fontSize);
        FontWeight fontWeight = this.fontWeight;
        int hashCode3 = fontWeight != null ? fontWeight.hashCode() : 0;
        FontStyle fontStyle = this.fontStyle;
        int m2218hashCodeimpl = fontStyle != null ? FontStyle.m2218hashCodeimpl(fontStyle.m2220unboximpl()) : 0;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int m2227hashCodeimpl = fontSynthesis != null ? FontSynthesis.m2227hashCodeimpl(fontSynthesis.m2231unboximpl()) : 0;
        FontFamily fontFamily = this.fontFamily;
        int hashCode4 = fontFamily != null ? fontFamily.hashCode() : 0;
        String str = this.fontFeatureSettings;
        int hashCode5 = str != null ? str.hashCode() : 0;
        int m2561hashCodeimpl2 = TextUnit.m2561hashCodeimpl(this.letterSpacing);
        BaselineShift baselineShift = this.baselineShift;
        int m2335hashCodeimpl = baselineShift != null ? BaselineShift.m2335hashCodeimpl(baselineShift.m2337unboximpl()) : 0;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int hashCode6 = textGeometricTransform != null ? textGeometricTransform.hashCode() : 0;
        LocaleList localeList = this.localeList;
        if (localeList != null) {
            i2 = localeList.hashCode();
            i = hashCode2;
        } else {
            i = hashCode2;
            i2 = 0;
        }
        int m1300hashCodeimpl2 = Color.m1300hashCodeimpl(this.background);
        TextDecoration textDecoration = this.textDecoration;
        int hashCode7 = textDecoration != null ? textDecoration.hashCode() : 0;
        Shadow shadow = this.shadow;
        int hashCode8 = shadow != null ? shadow.hashCode() : 0;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        int hashCode9 = platformSpanStyle != null ? platformSpanStyle.hashCode() : 0;
        DrawStyle drawStyle = this.drawStyle;
        return (((((((((((((((((((((((((((((((((m1300hashCodeimpl * 31) + hashCode) * 31) + i) * 31) + m2561hashCodeimpl) * 31) + hashCode3) * 31) + m2218hashCodeimpl) * 31) + m2227hashCodeimpl) * 31) + hashCode4) * 31) + hashCode5) * 31) + m2561hashCodeimpl2) * 31) + m2335hashCodeimpl) * 31) + hashCode6) * 31) + i2) * 31) + m1300hashCodeimpl2) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) Color.m1301toStringimpl(m2131getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m2562toStringimpl(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) TextUnit.m2562toStringimpl(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) Color.m1301toStringimpl(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + ')';
    }
}
