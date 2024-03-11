package androidx.compose.ui.platform;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class WrapperRenderNodeLayerHelperMethods {
    public static final WrapperRenderNodeLayerHelperMethods INSTANCE = new WrapperRenderNodeLayerHelperMethods();

    private WrapperRenderNodeLayerHelperMethods() {
    }

    public final void onDescendantInvalidated(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
