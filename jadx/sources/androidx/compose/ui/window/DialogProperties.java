package androidx.compose.ui.window;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class DialogProperties {
    private final boolean decorFitsSystemWindows;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    public DialogProperties() {
        this(false, false, null, false, false, 31, null);
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4) {
        this.dismissOnBackPress = z;
        this.dismissOnClickOutside = z2;
        this.securePolicy = secureFlagPolicy;
        this.usePlatformDefaultWidth = z3;
        this.decorFitsSystemWindows = z4;
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    public DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy) {
        this(z, z2, secureFlagPolicy, true, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialogProperties) {
            DialogProperties dialogProperties = (DialogProperties) obj;
            return this.dismissOnBackPress == dialogProperties.dismissOnBackPress && this.dismissOnClickOutside == dialogProperties.dismissOnClickOutside && this.securePolicy == dialogProperties.securePolicy && this.usePlatformDefaultWidth == dialogProperties.usePlatformDefaultWidth && this.decorFitsSystemWindows == dialogProperties.decorFitsSystemWindows;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.dismissOnBackPress);
        int hashCode2 = Boolean.hashCode(this.dismissOnClickOutside);
        int hashCode3 = this.securePolicy.hashCode();
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth)) * 31) + Boolean.hashCode(this.decorFitsSystemWindows);
    }
}
