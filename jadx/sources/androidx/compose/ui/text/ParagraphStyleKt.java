package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m2564getUnspecifiedXSAIIZE();

    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f) {
        int m2416unboximpl = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m2410boximpl(paragraphStyle.m2097getTextAligne0LSkKk()), TextAlign.m2410boximpl(paragraphStyle2.m2097getTextAligne0LSkKk()), f)).m2416unboximpl();
        int m2430unboximpl = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m2424boximpl(paragraphStyle.m2098getTextDirections_7Xco()), TextDirection.m2424boximpl(paragraphStyle2.m2098getTextDirections_7Xco()), f)).m2430unboximpl();
        long m2137lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m2137lerpTextUnitInheritableC3pnCVY(paragraphStyle.m2096getLineHeightXSAIIZE(), paragraphStyle2.m2096getLineHeightXSAIIZE(), f);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(m2416unboximpl, m2430unboximpl, m2137lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m2351boximpl(paragraphStyle.m2095getLineBreakrAG3T2k()), LineBreak.m2351boximpl(paragraphStyle2.m2095getLineBreakrAG3T2k()), f)).m2360unboximpl(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m2341boximpl(paragraphStyle.m2094getHyphensvmbZdU8()), Hyphens.m2341boximpl(paragraphStyle2.m2094getHyphensvmbZdU8()), f)).m2347unboximpl(), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f), (C8627dsp) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) {
        int m2097getTextAligne0LSkKk = paragraphStyle.m2097getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        int m2422getStarte0LSkKk = TextAlign.m2413equalsimpl0(m2097getTextAligne0LSkKk, companion.m2423getUnspecifiede0LSkKk()) ? companion.m2422getStarte0LSkKk() : paragraphStyle.m2097getTextAligne0LSkKk();
        int m2180resolveTextDirectionIhaHGbI = TextStyleKt.m2180resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.m2098getTextDirections_7Xco());
        long m2096getLineHeightXSAIIZE = TextUnitKt.m2568isUnspecifiedR2X_6o(paragraphStyle.m2096getLineHeightXSAIIZE()) ? DefaultLineHeight : paragraphStyle.m2096getLineHeightXSAIIZE();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int m2095getLineBreakrAG3T2k = paragraphStyle.m2095getLineBreakrAG3T2k();
        LineBreak.Companion companion2 = LineBreak.Companion;
        int m2361getSimplerAG3T2k = LineBreak.m2354equalsimpl0(m2095getLineBreakrAG3T2k, companion2.m2362getUnspecifiedrAG3T2k()) ? companion2.m2361getSimplerAG3T2k() : paragraphStyle.m2095getLineBreakrAG3T2k();
        int m2094getHyphensvmbZdU8 = paragraphStyle.m2094getHyphensvmbZdU8();
        Hyphens.Companion companion3 = Hyphens.Companion;
        int m2349getNonevmbZdU8 = Hyphens.m2344equalsimpl0(m2094getHyphensvmbZdU8, companion3.m2350getUnspecifiedvmbZdU8()) ? companion3.m2349getNonevmbZdU8() : paragraphStyle.m2094getHyphensvmbZdU8();
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(m2422getStarte0LSkKk, m2180resolveTextDirectionIhaHGbI, m2096getLineHeightXSAIIZE, textIndent2, platformStyle, lineHeightStyle, m2361getSimplerAG3T2k, m2349getNonevmbZdU8, textMotion, (C8627dsp) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (androidx.compose.ui.unit.TextUnit.m2557equalsimpl0(r11, r23.m2096getLineHeightXSAIIZE()) != false) goto L42;
     */
    /* renamed from: fastMerge-j5T8yCg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.text.ParagraphStyle m2099fastMergej5T8yCg(androidx.compose.ui.text.ParagraphStyle r23, int r24, int r25, long r26, androidx.compose.ui.text.style.TextIndent r28, androidx.compose.ui.text.PlatformParagraphStyle r29, androidx.compose.ui.text.style.LineHeightStyle r30, int r31, int r32, androidx.compose.ui.text.style.TextMotion r33) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.ParagraphStyleKt.m2099fastMergej5T8yCg(androidx.compose.ui.text.ParagraphStyle, int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion):androidx.compose.ui.text.ParagraphStyle");
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        if (platformParagraphStyle == null) {
            return paragraphStyle.getPlatformStyle();
        }
        return paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }
}
