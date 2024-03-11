package androidx.compose.ui.platform;

/* loaded from: classes5.dex */
public final class Api29Impl {
    public static final Api29Impl INSTANCE = new Api29Impl();

    private Api29Impl() {
    }

    public final int getRecommendedTimeoutMillis(android.view.accessibility.AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }
}
