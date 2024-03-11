package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import o.C8627dsp;
import o.drO;

/* loaded from: classes.dex */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m1308getTransparent0d7_KjU();
        DefaultColor = companion.m1303getBlack0d7_KjU();
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY  reason: not valid java name */
    public static final long m2137lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        if (TextUnitKt.m2568isUnspecifiedR2X_6o(j) || TextUnitKt.m2568isUnspecifiedR2X_6o(j2)) {
            return ((TextUnit) lerpDiscrete(TextUnit.m2554boximpl(j), TextUnit.m2554boximpl(j2), f)).m2563unboximpl();
        }
        return TextUnitKt.m2569lerpC3pnCVY(j, j2, f);
    }

    public static final SpanStyle lerp(SpanStyle spanStyle, SpanStyle spanStyle2, float f) {
        TextForegroundStyle lerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text_release(), spanStyle2.getTextForegroundStyle$ui_text_release(), f);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f);
        long m2137lerpTextUnitInheritableC3pnCVY = m2137lerpTextUnitInheritableC3pnCVY(spanStyle.m2132getFontSizeXSAIIZE(), spanStyle2.m2132getFontSizeXSAIIZE(), f);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m2133getFontStyle4Lr2A7w(), spanStyle2.m2133getFontStyle4Lr2A7w(), f);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m2134getFontSynthesisZQGJjVo(), spanStyle2.m2134getFontSynthesisZQGJjVo(), f);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f);
        long m2137lerpTextUnitInheritableC3pnCVY2 = m2137lerpTextUnitInheritableC3pnCVY(spanStyle.m2135getLetterSpacingXSAIIZE(), spanStyle2.m2135getLetterSpacingXSAIIZE(), f);
        BaselineShift m2130getBaselineShift5SSeXJ0 = spanStyle.m2130getBaselineShift5SSeXJ0();
        float m2337unboximpl = m2130getBaselineShift5SSeXJ0 != null ? m2130getBaselineShift5SSeXJ0.m2337unboximpl() : BaselineShift.m2332constructorimpl(0.0f);
        BaselineShift m2130getBaselineShift5SSeXJ02 = spanStyle2.m2130getBaselineShift5SSeXJ0();
        float m2339lerpjWV1Mfo = BaselineShiftKt.m2339lerpjWV1Mfo(m2337unboximpl, m2130getBaselineShift5SSeXJ02 != null ? m2130getBaselineShift5SSeXJ02.m2337unboximpl() : BaselineShift.m2332constructorimpl(0.0f), f);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform lerp3 = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f);
        LocaleList localeList = (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f);
        long m1315lerpjxsXWHM = ColorKt.m1315lerpjxsXWHM(spanStyle.m2129getBackground0d7_KjU(), spanStyle2.m2129getBackground0d7_KjU(), f);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(lerp, m2137lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m2137lerpTextUnitInheritableC3pnCVY2, BaselineShift.m2331boximpl(m2339lerpjWV1Mfo), lerp3, localeList, m1315lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f), (C8627dsp) null);
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle spanStyle) {
        TextForegroundStyle takeOrElse = spanStyle.getTextForegroundStyle$ui_text_release().takeOrElse(new drO<TextForegroundStyle>() { // from class: androidx.compose.ui.text.SpanStyleKt$resolveSpanStyleDefaults$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final TextForegroundStyle invoke() {
                long j;
                TextForegroundStyle.Companion companion = TextForegroundStyle.Companion;
                j = SpanStyleKt.DefaultColor;
                return companion.m2438from8_81llA(j);
            }
        });
        long m2132getFontSizeXSAIIZE = TextUnitKt.m2568isUnspecifiedR2X_6o(spanStyle.m2132getFontSizeXSAIIZE()) ? DefaultFontSize : spanStyle.m2132getFontSizeXSAIIZE();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle m2133getFontStyle4Lr2A7w = spanStyle.m2133getFontStyle4Lr2A7w();
        FontStyle m2214boximpl = FontStyle.m2214boximpl(m2133getFontStyle4Lr2A7w != null ? m2133getFontStyle4Lr2A7w.m2220unboximpl() : FontStyle.Companion.m2222getNormal_LCdwA());
        FontSynthesis m2134getFontSynthesisZQGJjVo = spanStyle.m2134getFontSynthesisZQGJjVo();
        FontSynthesis m2223boximpl = FontSynthesis.m2223boximpl(m2134getFontSynthesisZQGJjVo != null ? m2134getFontSynthesisZQGJjVo.m2231unboximpl() : FontSynthesis.Companion.m2232getAllGVVA2EU());
        FontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long m2135getLetterSpacingXSAIIZE = TextUnitKt.m2568isUnspecifiedR2X_6o(spanStyle.m2135getLetterSpacingXSAIIZE()) ? DefaultLetterSpacing : spanStyle.m2135getLetterSpacingXSAIIZE();
        BaselineShift m2130getBaselineShift5SSeXJ0 = spanStyle.m2130getBaselineShift5SSeXJ0();
        BaselineShift m2331boximpl = BaselineShift.m2331boximpl(m2130getBaselineShift5SSeXJ0 != null ? m2130getBaselineShift5SSeXJ0.m2337unboximpl() : BaselineShift.Companion.m2338getNoney9eOQZs());
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long m2129getBackground0d7_KjU = spanStyle.m2129getBackground0d7_KjU();
        if (m2129getBackground0d7_KjU == Color.Companion.m1309getUnspecified0d7_KjU()) {
            m2129getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j = m2129getBackground0d7_KjU;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(takeOrElse, m2132getFontSizeXSAIIZE, fontWeight2, m2214boximpl, m2223boximpl, fontFamily2, str, m2135getLetterSpacingXSAIIZE, m2331boximpl, textGeometricTransform2, localeList2, j, textDecoration2, shadow2, platformStyle, drawStyle, (C8627dsp) null);
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return spanStyle.getPlatformStyle();
        }
        return spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (androidx.compose.ui.graphics.Color.m1294equalsimpl0(r22, r21.getTextForegroundStyle$ui_text_release().mo2340getColor0d7_KjU()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (o.C8632dsu.c(r6, r21.m2133getFontStyle4Lr2A7w()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        if (o.C8632dsu.c(r5, r21.getFontWeight()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r31 != r21.getFontFamily()) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (androidx.compose.ui.unit.TextUnit.m2557equalsimpl0(r33, r21.m2135getLetterSpacingXSAIIZE()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (androidx.compose.ui.unit.TextUnit.m2557equalsimpl0(r26, r21.m2132getFontSizeXSAIIZE()) == false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018b  */
    /* renamed from: fastMerge-dSHsh3o  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.text.SpanStyle m2136fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle r21, long r22, androidx.compose.ui.graphics.Brush r24, float r25, long r26, androidx.compose.ui.text.font.FontWeight r28, androidx.compose.ui.text.font.FontStyle r29, androidx.compose.ui.text.font.FontSynthesis r30, androidx.compose.ui.text.font.FontFamily r31, java.lang.String r32, long r33, androidx.compose.ui.text.style.BaselineShift r35, androidx.compose.ui.text.style.TextGeometricTransform r36, androidx.compose.ui.text.intl.LocaleList r37, long r38, androidx.compose.ui.text.style.TextDecoration r40, androidx.compose.ui.graphics.Shadow r41, androidx.compose.ui.text.PlatformSpanStyle r42, androidx.compose.ui.graphics.drawscope.DrawStyle r43) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyleKt.m2136fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle, long, androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle):androidx.compose.ui.text.SpanStyle");
    }
}
