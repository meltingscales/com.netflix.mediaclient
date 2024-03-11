package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.List;
import o.C8632dsu;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, FontFamily.Resolver resolver, URLSpanCache uRLSpanCache) {
        SpanStyle m2128copyGSF8kmg;
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        if (spanStylesOrNull$ui_text_release != null) {
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i);
                int component2 = range.component2();
                int component3 = range.component3();
                m2128copyGSF8kmg = r12.m2128copyGSF8kmg((r38 & 1) != 0 ? r12.m2131getColor0d7_KjU() : 0L, (r38 & 2) != 0 ? r12.fontSize : 0L, (r38 & 4) != 0 ? r12.fontWeight : null, (r38 & 8) != 0 ? r12.fontStyle : null, (r38 & 16) != 0 ? r12.fontSynthesis : null, (r38 & 32) != 0 ? r12.fontFamily : null, (r38 & 64) != 0 ? r12.fontFeatureSettings : null, (r38 & 128) != 0 ? r12.letterSpacing : 0L, (r38 & JSONzip.end) != 0 ? r12.baselineShift : null, (r38 & 512) != 0 ? r12.textGeometricTransform : null, (r38 & 1024) != 0 ? r12.localeList : null, (r38 & 2048) != 0 ? r12.background : 0L, (r38 & 4096) != 0 ? r12.textDecoration : null, (r38 & 8192) != 0 ? r12.shadow : null, (r38 & 16384) != 0 ? r12.platformStyle : null, (r38 & Privacy.DEFAULT) != 0 ? range.component1().drawStyle : null);
                setSpanStyle(spannableString, m2128copyGSF8kmg, component2, component3, density, resolver);
            }
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnnotatedString.Range<TtsAnnotation> range2 = ttsAnnotations.get(i2);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(range2.component1()), range2.component2(), range2.component3(), 33);
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i3 = 0; i3 < size3; i3++) {
            AnnotatedString.Range<UrlAnnotation> range3 = urlAnnotations.get(i3);
            spannableString.setSpan(uRLSpanCache.toURLSpan(range3.component1()), range3.component2(), range3.component3(), 33);
        }
        return spannableString;
    }

    private static final void setSpanStyle(SpannableString spannableString, SpanStyle spanStyle, int i, int i2, Density density, FontFamily.Resolver resolver) {
        SpannableExtensions_androidKt.m2322setColorRPmYEkk(spannableString, spanStyle.m2131getColor0d7_KjU(), i, i2);
        SpannableExtensions_androidKt.m2323setFontSizeKmRG4DE(spannableString, spanStyle.m2132getFontSizeXSAIIZE(), density, i, i2);
        if (spanStyle.getFontWeight() != null || spanStyle.m2133getFontStyle4Lr2A7w() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m2133getFontStyle4Lr2A7w = spanStyle.m2133getFontStyle4Lr2A7w();
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m2190getAndroidTypefaceStyleFO1MlWM(fontWeight, m2133getFontStyle4Lr2A7w != null ? m2133getFontStyle4Lr2A7w.m2220unboximpl() : FontStyle.Companion.m2222getNormal_LCdwA())), i, i2, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis m2134getFontSynthesisZQGJjVo = spanStyle.m2134getFontSynthesisZQGJjVo();
                Object value = FontFamily.Resolver.m2200resolveDPcqOEQ$default(resolver, fontFamily, null, 0, m2134getFontSynthesisZQGJjVo != null ? m2134getFontSynthesisZQGJjVo.m2231unboximpl() : FontSynthesis.Companion.m2232getAllGVVA2EU(), 6, null).getValue();
                C8632dsu.d(value);
                spannableString.setSpan(Api28Impl.INSTANCE.createTypefaceSpan((Typeface) value), i, i2, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.Companion;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i, i2, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i, i2);
        SpannableExtensions_androidKt.m2320setBackgroundRPmYEkk(spannableString, spanStyle.m2129getBackground0d7_KjU(), i, i2);
    }
}
