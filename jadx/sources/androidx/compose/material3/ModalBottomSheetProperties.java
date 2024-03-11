package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;

/* loaded from: classes.dex */
public final class ModalBottomSheetProperties {
    private final boolean isFocusable;
    private final SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public final boolean isFocusable() {
        return this.isFocusable;
    }

    public ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2) {
        this.securePolicy = secureFlagPolicy;
        this.isFocusable = z;
        this.shouldDismissOnBackPress = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ModalBottomSheetProperties) {
            ModalBottomSheetProperties modalBottomSheetProperties = (ModalBottomSheetProperties) obj;
            return this.securePolicy == modalBottomSheetProperties.securePolicy && this.isFocusable == modalBottomSheetProperties.isFocusable && this.shouldDismissOnBackPress == modalBottomSheetProperties.shouldDismissOnBackPress;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.securePolicy.hashCode();
        return (((hashCode * 31) + Boolean.hashCode(this.isFocusable)) * 31) + Boolean.hashCode(this.shouldDismissOnBackPress);
    }
}
