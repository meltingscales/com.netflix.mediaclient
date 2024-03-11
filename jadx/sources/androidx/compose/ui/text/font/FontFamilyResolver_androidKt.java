package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontFamily;

/* loaded from: classes.dex */
public final class FontFamilyResolver_androidKt {
    public static final FontFamily.Resolver createFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }
}
