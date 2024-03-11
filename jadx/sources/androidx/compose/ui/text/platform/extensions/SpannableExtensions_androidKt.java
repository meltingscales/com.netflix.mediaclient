package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import o.C8563dqf;
import o.C8564dqg;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.dpR;
import o.dsT;
import o.duB;

/* loaded from: classes.dex */
public final class SpannableExtensions_androidKt {
    public static final void setSpan(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f, Density density) {
        float m2560getValueimpl;
        if (textIndent != null) {
            if ((TextUnit.m2557equalsimpl0(textIndent.m2439getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) && TextUnit.m2557equalsimpl0(textIndent.m2440getRestLineXSAIIZE(), TextUnitKt.getSp(0))) || TextUnitKt.m2568isUnspecifiedR2X_6o(textIndent.m2439getFirstLineXSAIIZE()) || TextUnitKt.m2568isUnspecifiedR2X_6o(textIndent.m2440getRestLineXSAIIZE())) {
                return;
            }
            long m2559getTypeUIouoOA = TextUnit.m2559getTypeUIouoOA(textIndent.m2439getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            float f2 = 0.0f;
            if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2578getSpUIouoOA())) {
                m2560getValueimpl = density.mo192toPxR2X_6o(textIndent.m2439getFirstLineXSAIIZE());
            } else {
                m2560getValueimpl = TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2577getEmUIouoOA()) ? TextUnit.m2560getValueimpl(textIndent.m2439getFirstLineXSAIIZE()) * f : 0.0f;
            }
            long m2559getTypeUIouoOA2 = TextUnit.m2559getTypeUIouoOA(textIndent.m2440getRestLineXSAIIZE());
            if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA2, companion.m2578getSpUIouoOA())) {
                f2 = density.mo192toPxR2X_6o(textIndent.m2440getRestLineXSAIIZE());
            } else if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA2, companion.m2577getEmUIouoOA())) {
                f2 = TextUnit.m2560getValueimpl(textIndent.m2440getRestLineXSAIIZE()) * f;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(m2560getValueimpl), (int) Math.ceil(f2)), 0, spannable.length());
        }
    }

    /* renamed from: setLineHeight-KmRG4DE  reason: not valid java name */
    public static final void m2324setLineHeightKmRG4DE(Spannable spannable, long j, float f, Density density, LineHeightStyle lineHeightStyle) {
        int length;
        char t;
        float m2319resolveLineHeightInPxo2QH7mI = m2319resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(m2319resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        if (spannable.length() != 0) {
            t = duB.t(spannable);
            if (t != '\n') {
                length = spannable.length();
                setSpan(spannable, new LineHeightStyleSpan(m2319resolveLineHeightInPxo2QH7mI, 0, length, LineHeightStyle.Trim.m2404isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m2391getTrimEVpEnUU()), LineHeightStyle.Trim.m2405isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m2391getTrimEVpEnUU()), lineHeightStyle.m2390getAlignmentPIaL0Z0()), 0, spannable.length());
            }
        }
        length = spannable.length() + 1;
        setSpan(spannable, new LineHeightStyleSpan(m2319resolveLineHeightInPxo2QH7mI, 0, length, LineHeightStyle.Trim.m2404isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m2391getTrimEVpEnUU()), LineHeightStyle.Trim.m2405isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m2391getTrimEVpEnUU()), lineHeightStyle.m2390getAlignmentPIaL0Z0()), 0, spannable.length());
    }

    /* renamed from: setLineHeight-r9BaKPg  reason: not valid java name */
    public static final void m2325setLineHeightr9BaKPg(Spannable spannable, long j, float f, Density density) {
        float m2319resolveLineHeightInPxo2QH7mI = m2319resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(m2319resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(m2319resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI  reason: not valid java name */
    private static final float m2319resolveLineHeightInPxo2QH7mI(long j, float f, Density density) {
        float m2560getValueimpl;
        long m2559getTypeUIouoOA = TextUnit.m2559getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2578getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo192toPxR2X_6o(j);
            }
            m2560getValueimpl = TextUnit.m2560getValueimpl(j) / TextUnit.m2560getValueimpl(density.mo196toSpkPz2Gy4(f));
        } else if (!TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2577getEmUIouoOA())) {
            return Float.NaN;
        } else {
            m2560getValueimpl = TextUnit.m2560getValueimpl(j);
        }
        return m2560getValueimpl * f;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, Density density, InterfaceC8613dsb<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> interfaceC8613dsb) {
        MetricAffectingSpan m2318createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, interfaceC8613dsb);
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density);
                if (getNeedsLetterSpacingSpan(range.getItem())) {
                    z = true;
                }
            }
        }
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotatedString.Range<SpanStyle> range2 = list.get(i2);
                int start2 = range2.getStart();
                int end2 = range2.getEnd();
                SpanStyle item = range2.getItem();
                if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (m2318createLetterSpacingSpaneAf_CNQ = m2318createLetterSpacingSpaneAf_CNQ(item.m2135getLetterSpacingXSAIIZE(), density)) != null) {
                    setSpan(spannable, m2318createLetterSpacingSpaneAf_CNQ, start2, end2);
                }
            }
        }
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m2321setBaselineShift0ocSgnM(spannable, item.m2130getBaselineShift5SSeXJ0(), start, end);
        m2322setColorRPmYEkk(spannable, item.m2131getColor0d7_KjU(), start, end);
        setBrush(spannable, item.getBrush(), item.getAlpha(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m2323setFontSizeKmRG4DE(spannable, item.m2132getFontSizeXSAIIZE(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m2320setBackgroundRPmYEkk(spannable, item.m2129getBackground0d7_KjU(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        setDrawStyle(spannable, item.getDrawStyle(), start, end);
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, InterfaceC8612dsa<? super SpanStyle, ? super Integer, ? super Integer, dpR> interfaceC8612dsa) {
        Object x;
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                interfaceC8612dsa.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = list.size();
        int i = size * 2;
        Integer[] numArr = new Integer[i];
        for (int i2 = 0; i2 < i; i2++) {
            numArr[i2] = 0;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i3);
            numArr[i3] = Integer.valueOf(range.getStart());
            numArr[i3 + size] = Integer.valueOf(range.getEnd());
        }
        C8564dqg.r(numArr);
        x = C8563dqf.x(numArr);
        int intValue = ((Number) x).intValue();
        for (int i4 = 0; i4 < i; i4++) {
            int intValue2 = numArr[i4].intValue();
            if (intValue2 != intValue) {
                int size3 = list.size();
                SpanStyle spanStyle2 = spanStyle;
                for (int i5 = 0; i5 < size3; i5++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i5);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(intValue, intValue2, range2.getStart(), range2.getEnd())) {
                        spanStyle2 = merge(spanStyle2, range2.getItem());
                    }
                }
                if (spanStyle2 != null) {
                    interfaceC8612dsa.invoke(spanStyle2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
                intValue = intValue2;
            }
        }
    }

    /* renamed from: createLetterSpacingSpan-eAf_CNQ  reason: not valid java name */
    private static final MetricAffectingSpan m2318createLetterSpacingSpaneAf_CNQ(long j, Density density) {
        long m2559getTypeUIouoOA = TextUnit.m2559getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2578getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo192toPxR2X_6o(j));
        }
        if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2577getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m2560getValueimpl(j));
        }
        return null;
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long m2559getTypeUIouoOA = TextUnit.m2559getTypeUIouoOA(spanStyle.m2135getLetterSpacingXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        return TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2578getSpUIouoOA()) || TextUnitType.m2573equalsimpl0(TextUnit.m2559getTypeUIouoOA(spanStyle.m2135getLetterSpacingXSAIIZE()), companion.m2577getEmUIouoOA());
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i, int i2) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m1317toArgb8_81llA(shadow.m1431getColor0d7_KjU()), Offset.m1137getXimpl(shadow.m1432getOffsetF1C5BW0()), Offset.m1138getYimpl(shadow.m1432getOffsetF1C5BW0()), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i, i2);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i, int i2) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i, i2);
        }
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i, int i2) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i, i2);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i, int i2) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i, i2);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i, i2);
        }
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i, i2);
        }
    }

    /* renamed from: setFontSize-KmRG4DE  reason: not valid java name */
    public static final void m2323setFontSizeKmRG4DE(Spannable spannable, long j, Density density, int i, int i2) {
        int e;
        long m2559getTypeUIouoOA = TextUnit.m2559getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2578getSpUIouoOA())) {
            e = dsT.e(density.mo192toPxR2X_6o(j));
            setSpan(spannable, new AbsoluteSizeSpan(e, false), i, i2);
        } else if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2577getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m2560getValueimpl(j)), i, i2);
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i, int i2) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.Companion;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i, i2);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM  reason: not valid java name */
    private static final void m2321setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i, int i2) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m2337unboximpl()), i, i2);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f, int i, int i2) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m2322setColorRPmYEkk(spannable, ((SolidColor) brush).m1441getValue0d7_KjU(), i, i2);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f), i, i2);
            }
        }
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m2172getFontSynthesisZQGJjVo() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, final InterfaceC8613dsb<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> interfaceC8613dsb) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().m2134getFontSynthesisZQGJjVo() != null) {
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m2171getFontStyle4Lr2A7w(), textStyle.m2172getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null) : null, arrayList, new InterfaceC8612dsa<SpanStyle, Integer, Integer, dpR>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(SpanStyle spanStyle, Integer num, Integer num2) {
                invoke(spanStyle, num.intValue(), num2.intValue());
                return dpR.c;
            }

            public final void invoke(SpanStyle spanStyle, int i2, int i3) {
                Spannable spannable2 = spannable;
                InterfaceC8613dsb<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> interfaceC8613dsb2 = interfaceC8613dsb;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.Companion.getNormal();
                }
                FontStyle m2133getFontStyle4Lr2A7w = spanStyle.m2133getFontStyle4Lr2A7w();
                FontStyle m2214boximpl = FontStyle.m2214boximpl(m2133getFontStyle4Lr2A7w != null ? m2133getFontStyle4Lr2A7w.m2220unboximpl() : FontStyle.Companion.m2222getNormal_LCdwA());
                FontSynthesis m2134getFontSynthesisZQGJjVo = spanStyle.m2134getFontSynthesisZQGJjVo();
                spannable2.setSpan(new TypefaceSpan(interfaceC8613dsb2.invoke(fontFamily, fontWeight, m2214boximpl, FontSynthesis.m2223boximpl(m2134getFontSynthesisZQGJjVo != null ? m2134getFontSynthesisZQGJjVo.m2231unboximpl() : FontSynthesis.Companion.m2232getAllGVVA2EU()))), i2, i3, 33);
            }
        });
    }

    /* renamed from: setBackground-RPmYEkk  reason: not valid java name */
    public static final void m2320setBackgroundRPmYEkk(Spannable spannable, long j, int i, int i2) {
        if (j != Color.Companion.m1309getUnspecified0d7_KjU()) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m1317toArgb8_81llA(j)), i, i2);
        }
    }

    /* renamed from: setColor-RPmYEkk  reason: not valid java name */
    public static final void m2322setColorRPmYEkk(Spannable spannable, long j, int i, int i2) {
        if (j != Color.Companion.m1309getUnspecified0d7_KjU()) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m1317toArgb8_81llA(j)), i, i2);
        }
    }
}
