package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import o.C8632dsu;
import o.InterfaceC8613dsb;

/* loaded from: classes.dex */
public final class TextPaintExtensions_androidKt {
    public static final float correctBlurRadius(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, InterfaceC8613dsb<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> interfaceC8613dsb, Density density, boolean z) {
        long m2559getTypeUIouoOA = TextUnit.m2559getTypeUIouoOA(spanStyle.m2132getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2578getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo192toPxR2X_6o(spanStyle.m2132getFontSizeXSAIIZE()));
        } else if (TextUnitType.m2573equalsimpl0(m2559getTypeUIouoOA, companion.m2577getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m2560getValueimpl(spanStyle.m2132getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m2133getFontStyle4Lr2A7w = spanStyle.m2133getFontStyle4Lr2A7w();
            FontStyle m2214boximpl = FontStyle.m2214boximpl(m2133getFontStyle4Lr2A7w != null ? m2133getFontStyle4Lr2A7w.m2220unboximpl() : FontStyle.Companion.m2222getNormal_LCdwA());
            FontSynthesis m2134getFontSynthesisZQGJjVo = spanStyle.m2134getFontSynthesisZQGJjVo();
            androidTextPaint.setTypeface(interfaceC8613dsb.invoke(fontFamily, fontWeight, m2214boximpl, FontSynthesis.m2223boximpl(m2134getFontSynthesisZQGJjVo != null ? m2134getFontSynthesisZQGJjVo.m2231unboximpl() : FontSynthesis.Companion.m2232getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !C8632dsu.c(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !C8632dsu.c((Object) spanStyle.getFontFeatureSettings(), (Object) "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !C8632dsu.c(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m2314setColor8_81llA(spanStyle.m2131getColor0d7_KjU());
        androidTextPaint.m2313setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m1181getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m2573equalsimpl0(TextUnit.m2559getTypeUIouoOA(spanStyle.m2135getLetterSpacingXSAIIZE()), companion.m2578getSpUIouoOA()) && TextUnit.m2560getValueimpl(spanStyle.m2135getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float mo192toPxR2X_6o = density.mo192toPxR2X_6o(spanStyle.m2135getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(mo192toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m2573equalsimpl0(TextUnit.m2559getTypeUIouoOA(spanStyle.m2135getLetterSpacingXSAIIZE()), companion.m2577getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m2560getValueimpl(spanStyle.m2135getLetterSpacingXSAIIZE()));
        }
        return m2326generateFallbackSpanStyle62GTOB8(spanStyle.m2135getLetterSpacingXSAIIZE(), z, spanStyle.m2129getBackground0d7_KjU(), spanStyle.m2130getBaselineShift5SSeXJ0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (androidx.compose.ui.text.style.BaselineShift.m2334equalsimpl0(r37.m2337unboximpl(), androidx.compose.ui.text.style.BaselineShift.Companion.m2338getNoney9eOQZs()) == false) goto L16;
     */
    /* renamed from: generateFallbackSpanStyle-62GTOB8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final androidx.compose.ui.text.SpanStyle m2326generateFallbackSpanStyle62GTOB8(long r32, boolean r34, long r35, androidx.compose.ui.text.style.BaselineShift r37) {
        /*
            r0 = r35
            r2 = 1
            r3 = 0
            if (r34 == 0) goto L22
            long r4 = androidx.compose.ui.unit.TextUnit.m2559getTypeUIouoOA(r32)
            androidx.compose.ui.unit.TextUnitType$Companion r6 = androidx.compose.ui.unit.TextUnitType.Companion
            long r6 = r6.m2578getSpUIouoOA()
            boolean r4 = androidx.compose.ui.unit.TextUnitType.m2573equalsimpl0(r4, r6)
            if (r4 == 0) goto L22
            float r4 = androidx.compose.ui.unit.TextUnit.m2560getValueimpl(r32)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L20
            goto L22
        L20:
            r4 = r2
            goto L23
        L22:
            r4 = r3
        L23:
            androidx.compose.ui.graphics.Color$Companion r5 = androidx.compose.ui.graphics.Color.Companion
            long r6 = r5.m1309getUnspecified0d7_KjU()
            boolean r6 = androidx.compose.ui.graphics.Color.m1294equalsimpl0(r0, r6)
            if (r6 != 0) goto L3b
            long r6 = r5.m1308getTransparent0d7_KjU()
            boolean r6 = androidx.compose.ui.graphics.Color.m1294equalsimpl0(r0, r6)
            if (r6 != 0) goto L3b
            r6 = r2
            goto L3c
        L3b:
            r6 = r3
        L3c:
            if (r37 == 0) goto L4f
            androidx.compose.ui.text.style.BaselineShift$Companion r7 = androidx.compose.ui.text.style.BaselineShift.Companion
            float r7 = r7.m2338getNoney9eOQZs()
            float r8 = r37.m2337unboximpl()
            boolean r7 = androidx.compose.ui.text.style.BaselineShift.m2334equalsimpl0(r8, r7)
            if (r7 != 0) goto L4f
            goto L50
        L4f:
            r2 = r3
        L50:
            r3 = 0
            if (r4 != 0) goto L58
            if (r6 != 0) goto L58
            if (r2 != 0) goto L58
            goto L99
        L58:
            if (r4 == 0) goto L5d
            r19 = r32
            goto L65
        L5d:
            androidx.compose.ui.unit.TextUnit$Companion r4 = androidx.compose.ui.unit.TextUnit.Companion
            long r7 = r4.m2564getUnspecifiedXSAIIZE()
            r19 = r7
        L65:
            if (r6 == 0) goto L6a
        L67:
            r24 = r0
            goto L6f
        L6a:
            long r0 = r5.m1309getUnspecified0d7_KjU()
            goto L67
        L6f:
            if (r2 == 0) goto L74
            r21 = r37
            goto L76
        L74:
            r21 = r3
        L76:
            androidx.compose.ui.text.SpanStyle r3 = new androidx.compose.ui.text.SpanStyle
            r9 = r3
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 63103(0xf67f, float:8.8426E-41)
            r31 = 0
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31)
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt.m2326generateFallbackSpanStyle62GTOB8(long, boolean, long, androidx.compose.ui.text.style.BaselineShift):androidx.compose.ui.text.SpanStyle");
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        int flags;
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        if (textMotion.getSubpixelTextPositioning$ui_text_release()) {
            flags = androidTextPaint.getFlags() | 128;
        } else {
            flags = androidTextPaint.getFlags() & (-129);
        }
        androidTextPaint.setFlags(flags);
        int m2441getLinearity4e0Vf04$ui_text_release = textMotion.m2441getLinearity4e0Vf04$ui_text_release();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m2444equalsimpl0(m2441getLinearity4e0Vf04$ui_text_release, companion.m2449getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m2444equalsimpl0(m2441getLinearity4e0Vf04$ui_text_release, companion.m2448getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (TextMotion.Linearity.m2444equalsimpl0(m2441getLinearity4e0Vf04$ui_text_release, companion.m2450getNone4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.m2133getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }
}
