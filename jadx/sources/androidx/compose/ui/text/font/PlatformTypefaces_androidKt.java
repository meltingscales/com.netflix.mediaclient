package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.text.font.FontVariation;

/* loaded from: classes.dex */
public final class PlatformTypefaces_androidKt {
    public static final PlatformTypefaces PlatformTypefaces() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PlatformTypefacesApi28();
        }
        return new PlatformTypefacesApi();
    }

    public static final android.graphics.Typeface setFontVariationSettings(android.graphics.Typeface typeface, FontVariation.Settings settings, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? TypefaceCompatApi26.INSTANCE.setFontVariationSettings(typeface, settings, context) : typeface;
    }

    public static final String getWeightSuffixForFallbackFamilyName(String str, FontWeight fontWeight) {
        int weight = fontWeight.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            return str + "-thin";
        } else if (2 <= weight && weight < 4) {
            return str + "-light";
        } else if (weight == 4) {
            return str;
        } else {
            if (weight == 5) {
                return str + "-medium";
            } else if ((6 > weight || weight >= 8) && 8 <= weight && weight < 11) {
                return str + "-black";
            } else {
                return str;
            }
        }
    }
}
