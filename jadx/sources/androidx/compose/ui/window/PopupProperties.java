package androidx.compose.ui.window;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class PopupProperties {
    private final boolean clippingEnabled;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final boolean focusable;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    public PopupProperties() {
        this(false, false, false, null, false, false, false, 127, null);
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final boolean getFocusable() {
        return this.focusable;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6) {
        this.focusable = z;
        this.dismissOnBackPress = z2;
        this.dismissOnClickOutside = z3;
        this.securePolicy = secureFlagPolicy;
        this.excludeFromSystemGesture = z4;
        this.clippingEnabled = z5;
        this.usePlatformDefaultWidth = z6;
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true, (i & 64) != 0 ? false : z6);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true);
    }

    public PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5) {
        this(z, z2, z3, secureFlagPolicy, z4, z5, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PopupProperties) {
            PopupProperties popupProperties = (PopupProperties) obj;
            return this.focusable == popupProperties.focusable && this.dismissOnBackPress == popupProperties.dismissOnBackPress && this.dismissOnClickOutside == popupProperties.dismissOnClickOutside && this.securePolicy == popupProperties.securePolicy && this.excludeFromSystemGesture == popupProperties.excludeFromSystemGesture && this.clippingEnabled == popupProperties.clippingEnabled && this.usePlatformDefaultWidth == popupProperties.usePlatformDefaultWidth;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.dismissOnBackPress);
        int hashCode2 = Boolean.hashCode(this.focusable);
        int hashCode3 = Boolean.hashCode(this.dismissOnBackPress);
        int hashCode4 = Boolean.hashCode(this.dismissOnClickOutside);
        int hashCode5 = this.securePolicy.hashCode();
        int hashCode6 = Boolean.hashCode(this.excludeFromSystemGesture);
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth);
    }
}
