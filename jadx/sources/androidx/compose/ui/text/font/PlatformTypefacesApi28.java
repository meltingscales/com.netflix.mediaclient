package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontStyle;
import o.C8632dsu;

/* loaded from: classes.dex */
final class PlatformTypefacesApi28 implements PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo2239createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        return m2243createAndroidTypefaceApi28RetOiIg(null, fontWeight, i);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo2240createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        return m2243createAndroidTypefaceApi28RetOiIg(genericFontFamily.getName(), fontWeight, i);
    }

    /* renamed from: createAndroidTypefaceApi28-RetOiIg  reason: not valid java name */
    private final android.graphics.Typeface m2243createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i) {
        android.graphics.Typeface create;
        android.graphics.Typeface create2;
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m2217equalsimpl0(i, companion.m2222getNormal_LCdwA()) && C8632dsu.c(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        if (str == null) {
            create = android.graphics.Typeface.DEFAULT;
        } else {
            create = android.graphics.Typeface.create(str, 0);
        }
        create2 = android.graphics.Typeface.create(create, fontWeight.getWeight(), FontStyle.m2217equalsimpl0(i, companion.m2221getItalic_LCdwA()));
        return create2;
    }
}
