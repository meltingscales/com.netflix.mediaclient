package androidx.compose.ui.text.font;

import o.C8632dsu;

/* loaded from: classes.dex */
final class PlatformTypefacesApi implements PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo2239createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        return m2241createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo2240createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        android.graphics.Typeface m2242loadNamedFromTypefaceCacheOrNullRetOiIg = m2242loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i);
        return m2242loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m2241createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i) : m2242loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg  reason: not valid java name */
    private final android.graphics.Typeface m2242loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface m2241createAndroidTypefaceUsingTypefaceStyleRetOiIg = m2241createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
        if (C8632dsu.c(m2241createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m2190getAndroidTypefaceStyleFO1MlWM(fontWeight, i))) || C8632dsu.c(m2241createAndroidTypefaceUsingTypefaceStyleRetOiIg, m2241createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i))) {
            return null;
        }
        return m2241createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg  reason: not valid java name */
    private final android.graphics.Typeface m2241createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i) {
        if (FontStyle.m2217equalsimpl0(i, FontStyle.Companion.m2222getNormal_LCdwA()) && C8632dsu.c(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int m2190getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m2190getAndroidTypefaceStyleFO1MlWM(fontWeight, i);
        if (str == null || str.length() == 0) {
            return android.graphics.Typeface.defaultFromStyle(m2190getAndroidTypefaceStyleFO1MlWM);
        }
        return android.graphics.Typeface.create(str, m2190getAndroidTypefaceStyleFO1MlWM);
    }
}
