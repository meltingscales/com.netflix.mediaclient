package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* loaded from: classes.dex */
final class AccessibilityNodeInfoVerificationHelperMethods {
    public static final AccessibilityNodeInfoVerificationHelperMethods INSTANCE = new AccessibilityNodeInfoVerificationHelperMethods();

    private AccessibilityNodeInfoVerificationHelperMethods() {
    }

    public final void setAvailableExtraData(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
