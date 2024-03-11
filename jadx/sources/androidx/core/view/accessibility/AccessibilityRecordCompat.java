package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes2.dex */
public class AccessibilityRecordCompat {
    private final AccessibilityRecord mRecord;

    public static void setSource(AccessibilityRecord accessibilityRecord, View view, int i) {
        Api16Impl.setSource(accessibilityRecord, view, i);
    }

    public static void setMaxScrollX(AccessibilityRecord accessibilityRecord, int i) {
        Api15Impl.setMaxScrollX(accessibilityRecord, i);
    }

    public static void setMaxScrollY(AccessibilityRecord accessibilityRecord, int i) {
        Api15Impl.setMaxScrollY(accessibilityRecord, i);
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.mRecord;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityRecordCompat) {
            AccessibilityRecordCompat accessibilityRecordCompat = (AccessibilityRecordCompat) obj;
            AccessibilityRecord accessibilityRecord = this.mRecord;
            if (accessibilityRecord == null) {
                return accessibilityRecordCompat.mRecord == null;
            }
            return accessibilityRecord.equals(accessibilityRecordCompat.mRecord);
        }
        return false;
    }

    /* loaded from: classes2.dex */
    static class Api16Impl {
        static void setSource(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* loaded from: classes2.dex */
    static class Api15Impl {
        static int getMaxScrollX(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static void setMaxScrollX(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        static int getMaxScrollY(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void setMaxScrollY(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }
}
