package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class AndroidFontResolveInterceptor_androidKt {
    public static final AndroidFontResolveInterceptor AndroidFontResolveInterceptor(Context context) {
        return new AndroidFontResolveInterceptor(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
