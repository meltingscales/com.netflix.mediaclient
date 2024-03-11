package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

/* loaded from: classes.dex */
public interface FontScaling {
    float getFontScale();

    /* renamed from: toSp-0xMU5do */
    default long mo195toSp0xMU5do(float f) {
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale()) || FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
            return TextUnitKt.getSp(f / getFontScale());
        }
        FontScaleConverter forScale = fontScaleConverterFactory.forScale(getFontScale());
        return TextUnitKt.getSp(forScale != null ? forScale.convertDpToSp(f) : f / getFontScale());
    }

    /* renamed from: toDp-GaN1DYA */
    default float mo188toDpGaN1DYA(long j) {
        if (!TextUnitType.m2573equalsimpl0(TextUnit.m2559getTypeUIouoOA(j), TextUnitType.Companion.m2578getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale()) || FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
            return Dp.m2492constructorimpl(TextUnit.m2560getValueimpl(j) * getFontScale());
        }
        FontScaleConverter forScale = fontScaleConverterFactory.forScale(getFontScale());
        float m2560getValueimpl = TextUnit.m2560getValueimpl(j);
        return Dp.m2492constructorimpl(forScale == null ? m2560getValueimpl * getFontScale() : forScale.convertSpToDp(m2560getValueimpl));
    }
}
