package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.LineHeightStyle;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import o.drO;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class TypographyKt {
    private static final LineHeightStyle DefaultLineHeightStyle;
    private static final TextStyle DefaultTextStyle;
    private static final ProvidableCompositionLocal<Typography> LocalTypography;

    public static final /* synthetic */ TextStyle access$withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        return withDefaultFontFamily(textStyle, fontFamily);
    }

    public static final TextStyle getDefaultTextStyle() {
        return DefaultTextStyle;
    }

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }

    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        TextStyle m2166copyp1EtxEg;
        if (textStyle.getFontFamily() != null) {
            return textStyle;
        }
        m2166copyp1EtxEg = textStyle.m2166copyp1EtxEg((r48 & 1) != 0 ? textStyle.spanStyle.m2131getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? textStyle.spanStyle.m2132getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? textStyle.spanStyle.m2133getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? textStyle.spanStyle.m2134getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (r48 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? textStyle.spanStyle.m2135getLetterSpacingXSAIIZE() : 0L, (r48 & JSONzip.end) != 0 ? textStyle.spanStyle.m2130getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? textStyle.spanStyle.m2129getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (r48 & Privacy.DEFAULT) != 0 ? textStyle.paragraphStyle.m2097getTextAligne0LSkKk() : 0, (r48 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? textStyle.paragraphStyle.m2098getTextDirections_7Xco() : 0, (r48 & 131072) != 0 ? textStyle.paragraphStyle.m2096getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? textStyle.platformStyle : null, (r48 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? textStyle.paragraphStyle.m2095getLineBreakrAG3T2k() : 0, (r48 & 4194304) != 0 ? textStyle.paragraphStyle.m2094getHyphensvmbZdU8() : 0, (r48 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
        return m2166copyp1EtxEg;
    }

    static {
        TextStyle m2166copyp1EtxEg;
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.Companion.m2398getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m2409getNoneEVpEnUU(), null);
        DefaultLineHeightStyle = lineHeightStyle;
        m2166copyp1EtxEg = r2.m2166copyp1EtxEg((r48 & 1) != 0 ? r2.spanStyle.m2131getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r2.spanStyle.m2132getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r2.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r2.spanStyle.m2133getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r2.spanStyle.m2134getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r2.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r2.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r2.spanStyle.m2135getLetterSpacingXSAIIZE() : 0L, (r48 & JSONzip.end) != 0 ? r2.spanStyle.m2130getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r2.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r2.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r2.spanStyle.m2129getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r2.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r2.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r2.spanStyle.getDrawStyle() : null, (r48 & Privacy.DEFAULT) != 0 ? r2.paragraphStyle.m2097getTextAligne0LSkKk() : 0, (r48 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? r2.paragraphStyle.m2098getTextDirections_7Xco() : 0, (r48 & 131072) != 0 ? r2.paragraphStyle.m2096getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r2.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r2.platformStyle : DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), (r48 & 1048576) != 0 ? r2.paragraphStyle.getLineHeightStyle() : lineHeightStyle, (r48 & 2097152) != 0 ? r2.paragraphStyle.m2095getLineBreakrAG3T2k() : 0, (r48 & 4194304) != 0 ? r2.paragraphStyle.m2094getHyphensvmbZdU8() : 0, (r48 & 8388608) != 0 ? TextStyle.Companion.getDefault().paragraphStyle.getTextMotion() : null);
        DefaultTextStyle = m2166copyp1EtxEg;
        LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new drO<Typography>() { // from class: androidx.compose.material.TypographyKt$LocalTypography$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Typography invoke() {
                return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }
        });
    }
}
