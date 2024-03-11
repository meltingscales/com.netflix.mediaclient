package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* renamed from: o.cxB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7485cxB {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = 0;
        if (accessibilityManager != null && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(17)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                i |= accessibilityServiceInfo.feedbackType;
            }
        }
        return i;
    }
}
