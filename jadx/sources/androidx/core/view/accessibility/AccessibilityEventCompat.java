package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes2.dex */
public final class AccessibilityEventCompat {
    public static void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
        Api19Impl.setContentChangeTypes(accessibilityEvent, i);
    }

    public static int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
        return Api19Impl.getContentChangeTypes(accessibilityEvent);
    }

    /* loaded from: classes2.dex */
    static class Api19Impl {
        static void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }

        static int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }
    }
}
