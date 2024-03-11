package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class AndroidAccessibilityManager implements AccessibilityManager {
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidAccessibilityManager(Context context) {
        Object systemService = context.getSystemService("accessibility");
        C8632dsu.d(systemService);
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.AccessibilityManager
    public long calculateRecommendedTimeoutMillis(long j, boolean z, boolean z2, boolean z3) {
        int i = z;
        if (j >= 2147483647L) {
            return j;
        }
        if (z2) {
            i = (z ? 1 : 0) | true;
        }
        if (z3) {
            i = (i == true ? 1 : 0) | 4;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int recommendedTimeoutMillis = Api29Impl.INSTANCE.getRecommendedTimeoutMillis(this.accessibilityManager, (int) j, i);
            if (recommendedTimeoutMillis != Integer.MAX_VALUE) {
                return recommendedTimeoutMillis;
            }
        } else if (!z3 || !this.accessibilityManager.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
