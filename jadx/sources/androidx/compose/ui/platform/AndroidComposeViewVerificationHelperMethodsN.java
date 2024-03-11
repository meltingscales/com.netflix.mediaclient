package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import androidx.compose.ui.input.pointer.PointerIcon;
import o.C8632dsu;

/* loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsN {
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    public final void setPointerIcon(View view, PointerIcon pointerIcon) {
        android.view.PointerIcon systemIcon;
        if (pointerIcon instanceof AndroidPointerIcon) {
            systemIcon = ((AndroidPointerIcon) pointerIcon).getPointerIcon();
        } else if (pointerIcon instanceof AndroidPointerIconType) {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), ((AndroidPointerIconType) pointerIcon).getType());
        } else {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (C8632dsu.c(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
