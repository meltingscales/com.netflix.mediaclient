package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.ui.text.font.Font;

/* loaded from: classes.dex */
public final class AndroidFontResourceLoader implements Font.ResourceLoader {
    private final Context context;

    public AndroidFontResourceLoader(Context context) {
        this.context = context;
    }
}
