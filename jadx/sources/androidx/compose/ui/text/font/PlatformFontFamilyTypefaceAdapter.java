package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.AndroidTypeface;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class PlatformFontFamilyTypefaceAdapter {
    private final PlatformTypefaces platformTypefaceResolver = PlatformTypefaces_androidKt.PlatformTypefaces();

    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, drM<? super TypefaceResult.Immutable, dpR> drm, drM<? super TypefaceRequest, ? extends Object> drm2) {
        android.graphics.Typeface mo2239createDefaultFO1MlWM;
        FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null || (fontFamily instanceof DefaultFontFamily)) {
            mo2239createDefaultFO1MlWM = this.platformTypefaceResolver.mo2239createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m2246getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            mo2239createDefaultFO1MlWM = this.platformTypefaceResolver.mo2240createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m2246getFontStyle_LCdwA());
        } else if (!(fontFamily instanceof LoadedFontFamily)) {
            return null;
        } else {
            Typeface typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            C8632dsu.d(typeface);
            mo2239createDefaultFO1MlWM = ((AndroidTypeface) typeface).m2315getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m2246getFontStyle_LCdwA(), typefaceRequest.m2247getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(mo2239createDefaultFO1MlWM, false, 2, null);
    }
}
