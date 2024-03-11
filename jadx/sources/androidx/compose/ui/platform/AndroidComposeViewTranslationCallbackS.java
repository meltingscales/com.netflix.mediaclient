package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* loaded from: classes.dex */
public final class AndroidComposeViewTranslationCallbackS {
    public static final AndroidComposeViewTranslationCallbackS INSTANCE = new AndroidComposeViewTranslationCallbackS();

    private AndroidComposeViewTranslationCallbackS() {
    }

    public final void setViewTranslationCallback(View view, ViewTranslationCallback viewTranslationCallback) {
        view.setViewTranslationCallback(viewTranslationCallback);
    }

    public final void clearViewTranslationCallback(View view) {
        view.clearViewTranslationCallback();
    }
}
