package androidx.compose.ui.unit;

import android.content.Context;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

/* loaded from: classes.dex */
public final class AndroidDensity_androidKt {
    public static final Density Density(Context context) {
        FontScaleConverter forScale;
        float f = context.getResources().getConfiguration().fontScale;
        if (FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
            forScale = new LinearFontScaleConverter(f);
        } else {
            forScale = FontScaleConverterFactory.INSTANCE.forScale(f);
            if (forScale == null) {
                forScale = new LinearFontScaleConverter(f);
            }
        }
        return new DensityWithConverter(context.getResources().getDisplayMetrics().density, f, forScale);
    }
}
